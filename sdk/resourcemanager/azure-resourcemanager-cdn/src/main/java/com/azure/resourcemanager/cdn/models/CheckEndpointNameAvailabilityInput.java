// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Input of CheckNameAvailability API.
 */
@Fluent
public final class CheckEndpointNameAvailabilityInput implements JsonSerializable<CheckEndpointNameAvailabilityInput> {
    /*
     * The resource name to validate.
     */
    private String name;

    /*
     * The type of the resource whose name is to be validated.
     */
    private ResourceType type;

    /*
     * Indicates the endpoint name reuse scope. The default value is TenantReuse.
     */
    private AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope;

    /**
     * Creates an instance of CheckEndpointNameAvailabilityInput class.
     */
    public CheckEndpointNameAvailabilityInput() {
    }

    /**
     * Get the name property: The resource name to validate.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource name to validate.
     * 
     * @param name the name value to set.
     * @return the CheckEndpointNameAvailabilityInput object itself.
     */
    public CheckEndpointNameAvailabilityInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the resource whose name is to be validated.
     * 
     * @return the type value.
     */
    public ResourceType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource whose name is to be validated.
     * 
     * @param type the type value to set.
     * @return the CheckEndpointNameAvailabilityInput object itself.
     */
    public CheckEndpointNameAvailabilityInput withType(ResourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the autoGeneratedDomainNameLabelScope property: Indicates the endpoint name reuse scope. The default value is
     * TenantReuse.
     * 
     * @return the autoGeneratedDomainNameLabelScope value.
     */
    public AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope() {
        return this.autoGeneratedDomainNameLabelScope;
    }

    /**
     * Set the autoGeneratedDomainNameLabelScope property: Indicates the endpoint name reuse scope. The default value is
     * TenantReuse.
     * 
     * @param autoGeneratedDomainNameLabelScope the autoGeneratedDomainNameLabelScope value to set.
     * @return the CheckEndpointNameAvailabilityInput object itself.
     */
    public CheckEndpointNameAvailabilityInput
        withAutoGeneratedDomainNameLabelScope(AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope) {
        this.autoGeneratedDomainNameLabelScope = autoGeneratedDomainNameLabelScope;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model CheckEndpointNameAvailabilityInput"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property type in model CheckEndpointNameAvailabilityInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckEndpointNameAvailabilityInput.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("autoGeneratedDomainNameLabelScope",
            this.autoGeneratedDomainNameLabelScope == null ? null : this.autoGeneratedDomainNameLabelScope.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckEndpointNameAvailabilityInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckEndpointNameAvailabilityInput if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CheckEndpointNameAvailabilityInput.
     */
    public static CheckEndpointNameAvailabilityInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckEndpointNameAvailabilityInput deserializedCheckEndpointNameAvailabilityInput
                = new CheckEndpointNameAvailabilityInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCheckEndpointNameAvailabilityInput.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCheckEndpointNameAvailabilityInput.type = ResourceType.fromString(reader.getString());
                } else if ("autoGeneratedDomainNameLabelScope".equals(fieldName)) {
                    deserializedCheckEndpointNameAvailabilityInput.autoGeneratedDomainNameLabelScope
                        = AutoGeneratedDomainNameLabelScope.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckEndpointNameAvailabilityInput;
        });
    }
}
