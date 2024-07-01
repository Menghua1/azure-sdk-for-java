// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Proxy Resource
 * 
 * The resource model definition for a Azure Resource Manager proxy resource. It will not have tags and a location.
 */
@Immutable
public class ProxyResource extends Resource {
    /**
     * Creates an instance of ProxyResource class.
     */
    public ProxyResource() {
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
     * Reads an instance of ProxyResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProxyResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProxyResource.
     */
    public static ProxyResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProxyResource deserializedProxyResource = new ProxyResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedProxyResource.setId(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedProxyResource.setName(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedProxyResource.setType(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProxyResource;
        });
    }
}
