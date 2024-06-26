// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines the resource properties.
 */
@Fluent
public final class Checkpoint implements JsonSerializable<Checkpoint> {
    /*
     * Gets ID of parent of the checkpoint.
     */
    private String parentCheckpointId;

    /*
     * Gets ID of the checkpoint.
     */
    private String checkpointId;

    /*
     * Gets name of the checkpoint.
     */
    private String name;

    /*
     * Gets description of the checkpoint.
     */
    private String description;

    /**
     * Creates an instance of Checkpoint class.
     */
    public Checkpoint() {
    }

    /**
     * Get the parentCheckpointId property: Gets ID of parent of the checkpoint.
     * 
     * @return the parentCheckpointId value.
     */
    public String parentCheckpointId() {
        return this.parentCheckpointId;
    }

    /**
     * Set the parentCheckpointId property: Gets ID of parent of the checkpoint.
     * 
     * @param parentCheckpointId the parentCheckpointId value to set.
     * @return the Checkpoint object itself.
     */
    public Checkpoint withParentCheckpointId(String parentCheckpointId) {
        this.parentCheckpointId = parentCheckpointId;
        return this;
    }

    /**
     * Get the checkpointId property: Gets ID of the checkpoint.
     * 
     * @return the checkpointId value.
     */
    public String checkpointId() {
        return this.checkpointId;
    }

    /**
     * Set the checkpointId property: Gets ID of the checkpoint.
     * 
     * @param checkpointId the checkpointId value to set.
     * @return the Checkpoint object itself.
     */
    public Checkpoint withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    /**
     * Get the name property: Gets name of the checkpoint.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the checkpoint.
     * 
     * @param name the name value to set.
     * @return the Checkpoint object itself.
     */
    public Checkpoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Gets description of the checkpoint.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets description of the checkpoint.
     * 
     * @param description the description value to set.
     * @return the Checkpoint object itself.
     */
    public Checkpoint withDescription(String description) {
        this.description = description;
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
        jsonWriter.writeStringField("parentCheckpointID", this.parentCheckpointId);
        jsonWriter.writeStringField("checkpointID", this.checkpointId);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Checkpoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Checkpoint if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Checkpoint.
     */
    public static Checkpoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Checkpoint deserializedCheckpoint = new Checkpoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("parentCheckpointID".equals(fieldName)) {
                    deserializedCheckpoint.parentCheckpointId = reader.getString();
                } else if ("checkpointID".equals(fieldName)) {
                    deserializedCheckpoint.checkpointId = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCheckpoint.name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedCheckpoint.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckpoint;
        });
    }
}
