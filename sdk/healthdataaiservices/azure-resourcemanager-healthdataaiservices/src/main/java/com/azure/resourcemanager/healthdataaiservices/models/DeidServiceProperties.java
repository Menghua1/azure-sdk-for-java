// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Details of the HealthDataAIServices DeidService.
 */
@Fluent
public final class DeidServiceProperties implements JsonSerializable<DeidServiceProperties> {
    /*
     * The status of the last operation.
     */
    private ProvisioningState provisioningState;

    /*
     * Deid service url.
     */
    private String serviceUrl;

    /*
     * List of private endpoint connections.
     */
    private List<PrivateEndpointConnection> privateEndpointConnections;

    /*
     * Gets or sets allow or disallow public network access to resource
     */
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Creates an instance of DeidServiceProperties class.
     */
    public DeidServiceProperties() {
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
     * Get the serviceUrl property: Deid service url.
     * 
     * @return the serviceUrl value.
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnection> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the publicNetworkAccess property: Gets or sets allow or disallow public network access to resource.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Gets or sets allow or disallow public network access to resource.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DeidServiceProperties object itself.
     */
    public DeidServiceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeidServiceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeidServiceProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeidServiceProperties.
     */
    public static DeidServiceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeidServiceProperties deserializedDeidServiceProperties = new DeidServiceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedDeidServiceProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("serviceUrl".equals(fieldName)) {
                    deserializedDeidServiceProperties.serviceUrl = reader.getString();
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnection> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnection.fromJson(reader1));
                    deserializedDeidServiceProperties.privateEndpointConnections = privateEndpointConnections;
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedDeidServiceProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeidServiceProperties;
        });
    }
}
