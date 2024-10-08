// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.implementation;

import reactor.core.publisher.Flux;

import java.nio.ByteBuffer;

/**
 * This type is to support the implementation of buffered upload only. It is mandatory that the caller has broken the
 * source into ByteBuffers that are no greater than the size of a chunk and therefore a buffer in the pool. This is
 * necessary because it upper bounds the number of buffers we need for a given call to write() to 2. If the size of
 * ByteBuffer passed into write() were unbounded, the pool could stall as it would run out of buffers before it is able
 * to return a result, and if it is unable to return, no data can be uploaded and therefore no pools returned.
 *
 * It is incumbent upon the caller to return the buffers after an upload is completed. It is also the caller's
 * responsibility to signal to the pool when the stream is empty and call flush to return any data still sitting in the
 * pool.
 *
 * Broadly, the workflow of this operation is to chunk the source into reasonable sized pieces. On each piece, one
 * thread will call write on the pool. The pool will grab a buffer from the queue to write to, possibly waiting for one
 * to be available, and either store the incomplete buffer to be filled on the next write or return the filled buffer to
 * be sent. Filled buffers can be uploaded in parallel and should return buffers to the pool after the upload completes.
 * Once the source terminates, it should call flush.
 *
 * {@link BufferAggregator} is used to store {@link ByteBuffer}s in order to handle situations when chunk size
 * exceeds single {@link ByteBuffer} capacity.
 *
 * RESERVED FOR INTERNAL USE ONLY
 */
public final class BufferStagingArea {

    private final long buffSize;

    private BufferAggregator currentBuf;

    /**
     * Creates a new instance of UploadBufferPool
     * @param buffSize The size of the buffers
     * @param maxBuffSize The max size of the buffers
     */
    public BufferStagingArea(final long buffSize, long maxBuffSize) {
        // These buffers will be used in calls to stageBlock, so they must be no greater than block size.
        StorageImplUtils.assertInBounds("buffSize", buffSize, 1, maxBuffSize);
        this.buffSize = buffSize;
    }

    /*
    Note that the upload method will be calling write sequentially as there is only one worker reading from the source
    and calling write. This means operations like currentBuf.remaining() will not result in race conditions.
     */

    /**
     * Writes ByteBuffers to a {@code Flux<BufferAggregator>}
     * @param buf The buffer to write
     * @return The {@code Flux<BufferAggregator>}
     */
    public Flux<BufferAggregator> write(ByteBuffer buf) {

        // Check if there's a buffer holding any data from a previous call to write. If not, get a new one.
        if (this.currentBuf == null) {
            this.currentBuf = new BufferAggregator(this.buffSize);
        }

        Flux<BufferAggregator> result;
        // We can fit this whole write in the buffer we currently have.
        if (this.currentBuf.remainingCapacity() >= buf.remaining()) {
            this.currentBuf.append(buf);
            if (this.currentBuf.remainingCapacity() == 0) {
                result = Flux.just(this.currentBuf);
                // This will force us to get a new buffer next time we try to write.
                this.currentBuf = null;
            } else {
                /*
                We are still filling the current buffer, so we have no data to return. We will return the buffer once it
                is filled
                 */
                result = Flux.empty();
            }
        } else {
            // When the incoming buffer size exceeds the remaining capacity of the current buffer,
            // we need to handle overflow by creating new BufferAggregators.

            // Duplicate the buffer to manipulate its position and limit without affecting the original buffer.
            ByteBuffer duplicate = buf.duplicate();
            // Calculate the new limit for the duplicate buffer to exactly fill up the current buffer.
            int newLimit = buf.position() + (int) this.currentBuf.remainingCapacity();
            duplicate.limit(newLimit);
            this.currentBuf.append(duplicate);
            // Adjust the window of original buffer to represent remaining part.
            buf.position(newLimit);
            // Add the current buffer to the result as it is now full.
            result = Flux.just(this.currentBuf);

            // Calculate the number of complete chunks that can be formed from the remaining data.
            int remainingChunks = buf.remaining() / (int) this.buffSize;
            if (remainingChunks >= 1) {
                // If there are complete chunks to be processed, create new BufferAggregators for each.
                BufferAggregator[] aggregators = new BufferAggregator[remainingChunks];
                for (int i = 0; i < remainingChunks; i++) {
                    BufferAggregator aggregator = new BufferAggregator(this.buffSize);
                    ByteBuffer overflowDup = buf.duplicate();
                    // Determine the limit for this chunk's buffer.
                    int overflowLimit = buf.position() + (int) this.buffSize;
                    overflowDup.limit(overflowLimit);
                    // Append the chunk to the new buffer aggregator.
                    aggregator.append(overflowDup);
                    // Update the original buffer's position to the end of this chunk.
                    buf.position(overflowLimit);
                    // Store the new buffer aggregator.
                    aggregators[i] = aggregator;
                }
                // Concatenate the new aggregators to the result Flux.
                result = result.concatWith(Flux.fromArray(aggregators));
            }

            // If there is remaining data that does not form a complete chunk, store it in a new current buffer.
            if (buf.remaining() > 0) {
                this.currentBuf = new BufferAggregator(this.buffSize);
                this.currentBuf.append(buf);
            } else {
                // Clear the current buffer if all data has been assigned.
                this.currentBuf = null;
            }
        }

        return result;
    }

    /**
     * Flushes the current buffer
     * @return the flushed buffer
     */
    public Flux<BufferAggregator> flush() {
        /*
        Prep and return any data left in the pool. It is important to set the limit so that we don't read beyond the
        actual data as this buffer may have been used before and therefore may have some garbage at the end.
         */
        if (this.currentBuf != null) {
            BufferAggregator last = this.currentBuf;
            // If there is an accidental duplicate call to flush, this prevents sending the last buffer twice
            this.currentBuf = null;
            return Flux.just(last);
        }
        return Flux.empty();
    }
}
