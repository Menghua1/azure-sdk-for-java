// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Trino worker.
 */
@Fluent
public final class TrinoWorker implements JsonSerializable<TrinoWorker> {
    /*
     * Trino debug configuration.
     */
    private TrinoDebugConfig debug;

    /**
     * Creates an instance of TrinoWorker class.
     */
    public TrinoWorker() {
    }

    /**
     * Get the debug property: Trino debug configuration.
     * 
     * @return the debug value.
     */
    public TrinoDebugConfig debug() {
        return this.debug;
    }

    /**
     * Set the debug property: Trino debug configuration.
     * 
     * @param debug the debug value to set.
     * @return the TrinoWorker object itself.
     */
    public TrinoWorker withDebug(TrinoDebugConfig debug) {
        this.debug = debug;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (debug() != null) {
            debug().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("debug", this.debug);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrinoWorker from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrinoWorker if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrinoWorker.
     */
    public static TrinoWorker fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrinoWorker deserializedTrinoWorker = new TrinoWorker();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("debug".equals(fieldName)) {
                    deserializedTrinoWorker.debug = TrinoDebugConfig.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrinoWorker;
        });
    }
}
