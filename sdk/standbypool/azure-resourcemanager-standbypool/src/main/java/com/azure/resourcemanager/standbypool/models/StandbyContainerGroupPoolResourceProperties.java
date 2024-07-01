// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of the StandbyContainerGroupPool.
 */
@Fluent
public final class StandbyContainerGroupPoolResourceProperties
    implements JsonSerializable<StandbyContainerGroupPoolResourceProperties> {
    /*
     * Specifies elasticity profile of standby container group pools.
     */
    private StandbyContainerGroupPoolElasticityProfile elasticityProfile;

    /*
     * Specifies container group properties of standby container group pools.
     */
    private ContainerGroupProperties containerGroupProperties;

    /*
     * The status of the last operation.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of StandbyContainerGroupPoolResourceProperties class.
     */
    public StandbyContainerGroupPoolResourceProperties() {
    }

    /**
     * Get the elasticityProfile property: Specifies elasticity profile of standby container group pools.
     * 
     * @return the elasticityProfile value.
     */
    public StandbyContainerGroupPoolElasticityProfile elasticityProfile() {
        return this.elasticityProfile;
    }

    /**
     * Set the elasticityProfile property: Specifies elasticity profile of standby container group pools.
     * 
     * @param elasticityProfile the elasticityProfile value to set.
     * @return the StandbyContainerGroupPoolResourceProperties object itself.
     */
    public StandbyContainerGroupPoolResourceProperties
        withElasticityProfile(StandbyContainerGroupPoolElasticityProfile elasticityProfile) {
        this.elasticityProfile = elasticityProfile;
        return this;
    }

    /**
     * Get the containerGroupProperties property: Specifies container group properties of standby container group pools.
     * 
     * @return the containerGroupProperties value.
     */
    public ContainerGroupProperties containerGroupProperties() {
        return this.containerGroupProperties;
    }

    /**
     * Set the containerGroupProperties property: Specifies container group properties of standby container group pools.
     * 
     * @param containerGroupProperties the containerGroupProperties value to set.
     * @return the StandbyContainerGroupPoolResourceProperties object itself.
     */
    public StandbyContainerGroupPoolResourceProperties
        withContainerGroupProperties(ContainerGroupProperties containerGroupProperties) {
        this.containerGroupProperties = containerGroupProperties;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (elasticityProfile() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property elasticityProfile in model StandbyContainerGroupPoolResourceProperties"));
        } else {
            elasticityProfile().validate();
        }
        if (containerGroupProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property containerGroupProperties in model StandbyContainerGroupPoolResourceProperties"));
        } else {
            containerGroupProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StandbyContainerGroupPoolResourceProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("elasticityProfile", this.elasticityProfile);
        jsonWriter.writeJsonField("containerGroupProperties", this.containerGroupProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StandbyContainerGroupPoolResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StandbyContainerGroupPoolResourceProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StandbyContainerGroupPoolResourceProperties.
     */
    public static StandbyContainerGroupPoolResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StandbyContainerGroupPoolResourceProperties deserializedStandbyContainerGroupPoolResourceProperties
                = new StandbyContainerGroupPoolResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("elasticityProfile".equals(fieldName)) {
                    deserializedStandbyContainerGroupPoolResourceProperties.elasticityProfile
                        = StandbyContainerGroupPoolElasticityProfile.fromJson(reader);
                } else if ("containerGroupProperties".equals(fieldName)) {
                    deserializedStandbyContainerGroupPoolResourceProperties.containerGroupProperties
                        = ContainerGroupProperties.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedStandbyContainerGroupPoolResourceProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStandbyContainerGroupPoolResourceProperties;
        });
    }
}
