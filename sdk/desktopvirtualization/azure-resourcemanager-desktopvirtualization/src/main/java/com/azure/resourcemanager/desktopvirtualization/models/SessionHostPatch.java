// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostPatchProperties;
import java.io.IOException;

/**
 * SessionHost properties that can be patched.
 */
@Fluent
public final class SessionHostPatch extends ProxyResource {
    /*
     * Detailed properties for SessionHost
     */
    private SessionHostPatchProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SessionHostPatch class.
     */
    public SessionHostPatch() {
    }

    /**
     * Get the innerProperties property: Detailed properties for SessionHost.
     * 
     * @return the innerProperties value.
     */
    private SessionHostPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the allowNewSession property: Allow a new session.
     * 
     * @return the allowNewSession value.
     */
    public Boolean allowNewSession() {
        return this.innerProperties() == null ? null : this.innerProperties().allowNewSession();
    }

    /**
     * Set the allowNewSession property: Allow a new session.
     * 
     * @param allowNewSession the allowNewSession value to set.
     * @return the SessionHostPatch object itself.
     */
    public SessionHostPatch withAllowNewSession(Boolean allowNewSession) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionHostPatchProperties();
        }
        this.innerProperties().withAllowNewSession(allowNewSession);
        return this;
    }

    /**
     * Get the assignedUser property: User assigned to SessionHost.
     * 
     * @return the assignedUser value.
     */
    public String assignedUser() {
        return this.innerProperties() == null ? null : this.innerProperties().assignedUser();
    }

    /**
     * Set the assignedUser property: User assigned to SessionHost.
     * 
     * @param assignedUser the assignedUser value to set.
     * @return the SessionHostPatch object itself.
     */
    public SessionHostPatch withAssignedUser(String assignedUser) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionHostPatchProperties();
        }
        this.innerProperties().withAssignedUser(assignedUser);
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of SessionHost.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Set the friendlyName property: Friendly name of SessionHost.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the SessionHostPatch object itself.
     */
    public SessionHostPatch withFriendlyName(String friendlyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionHostPatchProperties();
        }
        this.innerProperties().withFriendlyName(friendlyName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SessionHostPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SessionHostPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SessionHostPatch.
     */
    public static SessionHostPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SessionHostPatch deserializedSessionHostPatch = new SessionHostPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSessionHostPatch.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSessionHostPatch.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSessionHostPatch.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSessionHostPatch.innerProperties = SessionHostPatchProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSessionHostPatch.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSessionHostPatch;
        });
    }
}
