// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Information about an Azure Batch subtask.
 */
@Immutable
public final class BatchSubtask implements JsonSerializable<BatchSubtask> {

    /*
     * The ID of the subtask.
     */
    @Generated
    private Integer id;

    /*
     * Information about the Compute Node on which the subtask ran.
     */
    @Generated
    private BatchNodeInfo nodeInfo;

    /*
     * The time at which the subtask started running. If the subtask has been restarted or retried, this is the most
     * recent time at which the subtask started running.
     */
    @Generated
    private OffsetDateTime startTime;

    /*
     * The time at which the subtask completed. This property is set only if the subtask is in the Completed state.
     */
    @Generated
    private OffsetDateTime endTime;

    /*
     * The exit code of the program specified on the subtask command line. This property is set only if the subtask is
     * in the completed state. In general, the exit code for a process reflects the specific convention implemented by
     * the application developer for that process. If you use the exit code value to make decisions in your code, be
     * sure that you know the exit code convention used by the application process. However, if the Batch service
     * terminates the subtask (due to timeout, or user termination via the API) you may see an operating system-defined
     * exit code.
     */
    @Generated
    private Integer exitCode;

    /*
     * Information about the container under which the Task is executing. This property is set only if the Task runs in
     * a container context.
     */
    @Generated
    private BatchTaskContainerExecutionInfo containerInfo;

    /*
     * Information describing the Task failure, if any. This property is set only if the Task is in the completed state
     * and encountered a failure.
     */
    @Generated
    private BatchTaskFailureInfo failureInfo;

    /*
     * The current state of the subtask.
     */
    @Generated
    private BatchSubtaskState state;

    /*
     * The time at which the subtask entered its current state.
     */
    @Generated
    private OffsetDateTime stateTransitionTime;

    /*
     * The previous state of the subtask. This property is not set if the subtask is in its initial running state.
     */
    @Generated
    private BatchSubtaskState previousState;

    /*
     * The time at which the subtask entered its previous state. This property is not set if the subtask is in its
     * initial running state.
     */
    @Generated
    private OffsetDateTime previousStateTransitionTime;

    /*
     * The result of the Task execution. If the value is 'failed', then the details of the failure can be found in the
     * failureInfo property.
     */
    @Generated
    private BatchTaskExecutionResult result;

    /**
     * Creates an instance of BatchSubtask class.
     */
    @Generated
    private BatchSubtask() {
    }

    /**
     * Get the id property: The ID of the subtask.
     *
     * @return the id value.
     */
    @Generated
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the nodeInfo property: Information about the Compute Node on which the subtask ran.
     *
     * @return the nodeInfo value.
     */
    @Generated
    public BatchNodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    /**
     * Get the startTime property: The time at which the subtask started running. If the subtask has been restarted or
     * retried, this is the most recent time at which the subtask started running.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The time at which the subtask completed. This property is set only if the subtask is in
     * the Completed state.
     *
     * @return the endTime value.
     */
    @Generated
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the exitCode property: The exit code of the program specified on the subtask command line. This property is
     * set only if the subtask is in the completed state. In general, the exit code for a process reflects the specific
     * convention implemented by the application developer for that process. If you use the exit code value to make
     * decisions in your code, be sure that you know the exit code convention used by the application process. However,
     * if the Batch service terminates the subtask (due to timeout, or user termination via the API) you may see an
     * operating system-defined exit code.
     *
     * @return the exitCode value.
     */
    @Generated
    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * Get the containerInfo property: Information about the container under which the Task is executing. This property
     * is set only if the Task runs in a container context.
     *
     * @return the containerInfo value.
     */
    @Generated
    public BatchTaskContainerExecutionInfo getContainerInfo() {
        return this.containerInfo;
    }

    /**
     * Get the failureInfo property: Information describing the Task failure, if any. This property is set only if the
     * Task is in the completed state and encountered a failure.
     *
     * @return the failureInfo value.
     */
    @Generated
    public BatchTaskFailureInfo getFailureInfo() {
        return this.failureInfo;
    }

    /**
     * Get the state property: The current state of the subtask.
     *
     * @return the state value.
     */
    @Generated
    public BatchSubtaskState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the subtask entered its current state.
     *
     * @return the stateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the previousState property: The previous state of the subtask. This property is not set if the subtask is in
     * its initial running state.
     *
     * @return the previousState value.
     */
    @Generated
    public BatchSubtaskState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: The time at which the subtask entered its previous state. This
     * property is not set if the subtask is in its initial running state.
     *
     * @return the previousStateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getPreviousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Get the result property: The result of the Task execution. If the value is 'failed', then the details of the
     * failure can be found in the failureInfo property.
     *
     * @return the result value.
     */
    @Generated
    public BatchTaskExecutionResult getResult() {
        return this.result;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("id", this.id);
        jsonWriter.writeJsonField("nodeInfo", this.nodeInfo);
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeNumberField("exitCode", this.exitCode);
        jsonWriter.writeJsonField("containerInfo", this.containerInfo);
        jsonWriter.writeJsonField("failureInfo", this.failureInfo);
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeStringField("stateTransitionTime",
            this.stateTransitionTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.stateTransitionTime));
        jsonWriter.writeStringField("previousState", this.previousState == null ? null : this.previousState.toString());
        jsonWriter.writeStringField("previousStateTransitionTime",
            this.previousStateTransitionTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.previousStateTransitionTime));
        jsonWriter.writeStringField("result", this.result == null ? null : this.result.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchSubtask from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchSubtask if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchSubtask.
     */
    @Generated
    public static BatchSubtask fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchSubtask deserializedBatchSubtask = new BatchSubtask();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedBatchSubtask.id = reader.getNullable(JsonReader::getInt);
                } else if ("nodeInfo".equals(fieldName)) {
                    deserializedBatchSubtask.nodeInfo = BatchNodeInfo.fromJson(reader);
                } else if ("startTime".equals(fieldName)) {
                    deserializedBatchSubtask.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedBatchSubtask.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("exitCode".equals(fieldName)) {
                    deserializedBatchSubtask.exitCode = reader.getNullable(JsonReader::getInt);
                } else if ("containerInfo".equals(fieldName)) {
                    deserializedBatchSubtask.containerInfo = BatchTaskContainerExecutionInfo.fromJson(reader);
                } else if ("failureInfo".equals(fieldName)) {
                    deserializedBatchSubtask.failureInfo = BatchTaskFailureInfo.fromJson(reader);
                } else if ("state".equals(fieldName)) {
                    deserializedBatchSubtask.state = BatchSubtaskState.fromString(reader.getString());
                } else if ("stateTransitionTime".equals(fieldName)) {
                    deserializedBatchSubtask.stateTransitionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("previousState".equals(fieldName)) {
                    deserializedBatchSubtask.previousState = BatchSubtaskState.fromString(reader.getString());
                } else if ("previousStateTransitionTime".equals(fieldName)) {
                    deserializedBatchSubtask.previousStateTransitionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("result".equals(fieldName)) {
                    deserializedBatchSubtask.result = BatchTaskExecutionResult.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBatchSubtask;
        });
    }
}
