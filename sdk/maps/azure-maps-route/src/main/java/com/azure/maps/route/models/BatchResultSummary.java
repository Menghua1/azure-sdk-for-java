// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Summary of the results for the batch request.
 */
@Immutable
public final class BatchResultSummary implements JsonSerializable<BatchResultSummary> {
    /*
     * Number of successful requests in the batch
     */
    private Integer successfulRequests;

    /*
     * Total number of requests in the batch
     */
    private Integer totalRequests;

    /**
     * Creates an instance of BatchResultSummary class.
     */
    public BatchResultSummary() {
    }

    /**
     * Get the successfulRequests property: Number of successful requests in the batch.
     * 
     * @return the successfulRequests value.
     */
    public Integer getSuccessfulRequests() {
        return this.successfulRequests;
    }

    /**
     * Get the totalRequests property: Total number of requests in the batch.
     * 
     * @return the totalRequests value.
     */
    public Integer getTotalRequests() {
        return this.totalRequests;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchResultSummary from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchResultSummary if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchResultSummary.
     */
    public static BatchResultSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchResultSummary deserializedBatchResultSummary = new BatchResultSummary();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("successfulRequests".equals(fieldName)) {
                    deserializedBatchResultSummary.successfulRequests = reader.getNullable(JsonReader::getInt);
                } else if ("totalRequests".equals(fieldName)) {
                    deserializedBatchResultSummary.totalRequests = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBatchResultSummary;
        });
    }
}
