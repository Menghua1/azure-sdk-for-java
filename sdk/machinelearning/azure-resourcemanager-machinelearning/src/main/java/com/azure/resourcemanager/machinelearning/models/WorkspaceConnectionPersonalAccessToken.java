// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The WorkspaceConnectionPersonalAccessToken model.
 */
@Fluent
public final class WorkspaceConnectionPersonalAccessToken
    implements JsonSerializable<WorkspaceConnectionPersonalAccessToken> {
    /*
     * The pat property.
     */
    private String pat;

    /**
     * Creates an instance of WorkspaceConnectionPersonalAccessToken class.
     */
    public WorkspaceConnectionPersonalAccessToken() {
    }

    /**
     * Get the pat property: The pat property.
     * 
     * @return the pat value.
     */
    public String pat() {
        return this.pat;
    }

    /**
     * Set the pat property: The pat property.
     * 
     * @param pat the pat value to set.
     * @return the WorkspaceConnectionPersonalAccessToken object itself.
     */
    public WorkspaceConnectionPersonalAccessToken withPat(String pat) {
        this.pat = pat;
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
        jsonWriter.writeStringField("pat", this.pat);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspaceConnectionPersonalAccessToken from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspaceConnectionPersonalAccessToken if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkspaceConnectionPersonalAccessToken.
     */
    public static WorkspaceConnectionPersonalAccessToken fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspaceConnectionPersonalAccessToken deserializedWorkspaceConnectionPersonalAccessToken
                = new WorkspaceConnectionPersonalAccessToken();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("pat".equals(fieldName)) {
                    deserializedWorkspaceConnectionPersonalAccessToken.pat = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspaceConnectionPersonalAccessToken;
        });
    }
}
