// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Identity properties of the workspace resource.
 */
@Fluent
public final class WorkspaceIdentity implements JsonSerializable<WorkspaceIdentity> {
    /*
     * The identity type. Currently the only supported type is 'SystemAssigned'.
     */
    private String type = "SystemAssigned";

    /*
     * The principal id of the identity.
     */
    private String principalId;

    /*
     * The client tenant id of the identity.
     */
    private String tenantId;

    /**
     * Creates an instance of WorkspaceIdentity class.
     */
    public WorkspaceIdentity() {
    }

    /**
     * Get the type property: The identity type. Currently the only supported type is 'SystemAssigned'.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The identity type. Currently the only supported type is 'SystemAssigned'.
     * 
     * @param type the type value to set.
     * @return the WorkspaceIdentity object itself.
     */
    public WorkspaceIdentity setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: The principal id of the identity.
     * 
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The client tenant id of the identity.
     * 
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspaceIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspaceIdentity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkspaceIdentity.
     */
    public static WorkspaceIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspaceIdentity deserializedWorkspaceIdentity = new WorkspaceIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedWorkspaceIdentity.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedWorkspaceIdentity.tenantId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspaceIdentity;
        });
    }
}
