// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Definition of the endpoint used for accessing configuration.
 */
@Immutable
public class ConfigurationAccessEndpointSpec implements JsonSerializable<ConfigurationAccessEndpointSpec> {
    /*
     * The endpoint. This property is READ-ONLY.
     */
    private String endpoint;

    /**
     * Creates an instance of ConfigurationAccessEndpointSpec class.
     */
    public ConfigurationAccessEndpointSpec() {
    }

    /**
     * Get the endpoint property: The endpoint. This property is READ-ONLY.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint. This property is READ-ONLY.
     * 
     * @param endpoint the endpoint value to set.
     * @return the ConfigurationAccessEndpointSpec object itself.
     */
    ConfigurationAccessEndpointSpec withEndpoint(String endpoint) {
        this.endpoint = endpoint;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationAccessEndpointSpec from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationAccessEndpointSpec if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationAccessEndpointSpec.
     */
    public static ConfigurationAccessEndpointSpec fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationAccessEndpointSpec deserializedConfigurationAccessEndpointSpec
                = new ConfigurationAccessEndpointSpec();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpoint".equals(fieldName)) {
                    deserializedConfigurationAccessEndpointSpec.endpoint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationAccessEndpointSpec;
        });
    }
}
