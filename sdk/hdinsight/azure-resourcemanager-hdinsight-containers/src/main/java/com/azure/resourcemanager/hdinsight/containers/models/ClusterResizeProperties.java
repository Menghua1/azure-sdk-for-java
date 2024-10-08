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
 * The properties for resizing a cluster.
 */
@Fluent
public final class ClusterResizeProperties implements JsonSerializable<ClusterResizeProperties> {
    /*
     * Target node count of worker node.
     */
    private int targetWorkerNodeCount;

    /**
     * Creates an instance of ClusterResizeProperties class.
     */
    public ClusterResizeProperties() {
    }

    /**
     * Get the targetWorkerNodeCount property: Target node count of worker node.
     * 
     * @return the targetWorkerNodeCount value.
     */
    public int targetWorkerNodeCount() {
        return this.targetWorkerNodeCount;
    }

    /**
     * Set the targetWorkerNodeCount property: Target node count of worker node.
     * 
     * @param targetWorkerNodeCount the targetWorkerNodeCount value to set.
     * @return the ClusterResizeProperties object itself.
     */
    public ClusterResizeProperties withTargetWorkerNodeCount(int targetWorkerNodeCount) {
        this.targetWorkerNodeCount = targetWorkerNodeCount;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("targetWorkerNodeCount", this.targetWorkerNodeCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterResizeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterResizeProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterResizeProperties.
     */
    public static ClusterResizeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterResizeProperties deserializedClusterResizeProperties = new ClusterResizeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetWorkerNodeCount".equals(fieldName)) {
                    deserializedClusterResizeProperties.targetWorkerNodeCount = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterResizeProperties;
        });
    }
}
