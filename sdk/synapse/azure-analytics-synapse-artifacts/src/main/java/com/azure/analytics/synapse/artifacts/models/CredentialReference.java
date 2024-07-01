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
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Credential reference type.
 */
@Fluent
public final class CredentialReference implements JsonSerializable<CredentialReference> {
    /*
     * Credential reference type.
     */
    private CredentialReferenceType type;

    /*
     * Reference credential name.
     */
    private String referenceName;

    /*
     * Credential reference type.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of CredentialReference class.
     */
    public CredentialReference() {
    }

    /**
     * Get the type property: Credential reference type.
     * 
     * @return the type value.
     */
    public CredentialReferenceType getType() {
        return this.type;
    }

    /**
     * Set the type property: Credential reference type.
     * 
     * @param type the type value to set.
     * @return the CredentialReference object itself.
     */
    public CredentialReference setType(CredentialReferenceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference credential name.
     * 
     * @return the referenceName value.
     */
    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference credential name.
     * 
     * @param referenceName the referenceName value to set.
     * @return the CredentialReference object itself.
     */
    public CredentialReference setReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the additionalProperties property: Credential reference type.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Credential reference type.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the CredentialReference object itself.
     */
    public CredentialReference setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("referenceName", this.referenceName);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CredentialReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CredentialReference if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CredentialReference.
     */
    public static CredentialReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CredentialReference deserializedCredentialReference = new CredentialReference();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedCredentialReference.type = CredentialReferenceType.fromString(reader.getString());
                } else if ("referenceName".equals(fieldName)) {
                    deserializedCredentialReference.referenceName = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedCredentialReference.additionalProperties = additionalProperties;

            return deserializedCredentialReference;
        });
    }
}
