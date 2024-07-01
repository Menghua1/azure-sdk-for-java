// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Private endpoint details.
 */
@Immutable
public final class PrivateEndpoint implements JsonSerializable<PrivateEndpoint> {
    /*
     * Resource id of the private endpoint.
     */
    private String id;

    /**
     * Creates an instance of PrivateEndpoint class.
     */
    public PrivateEndpoint() {
    }

    /**
     * Get the id property: Resource id of the private endpoint.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
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
     * Reads an instance of PrivateEndpoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpoint if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpoint.
     */
    public static PrivateEndpoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpoint deserializedPrivateEndpoint = new PrivateEndpoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateEndpoint.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpoint;
        });
    }
}
