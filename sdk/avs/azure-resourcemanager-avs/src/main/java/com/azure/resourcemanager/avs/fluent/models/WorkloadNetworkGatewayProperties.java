// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.WorkloadNetworkProvisioningState;
import java.io.IOException;

/**
 * Properties of a NSX Gateway.
 */
@Fluent
public final class WorkloadNetworkGatewayProperties implements JsonSerializable<WorkloadNetworkGatewayProperties> {
    /*
     * The provisioning state of the resource.
     */
    private WorkloadNetworkProvisioningState provisioningState;

    /*
     * Display name of the DHCP entity.
     */
    private String displayName;

    /*
     * NSX Gateway Path.
     */
    private String path;

    /**
     * Creates an instance of WorkloadNetworkGatewayProperties class.
     */
    public WorkloadNetworkGatewayProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public WorkloadNetworkProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayName property: Display name of the DHCP entity.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the DHCP entity.
     * 
     * @param displayName the displayName value to set.
     * @return the WorkloadNetworkGatewayProperties object itself.
     */
    public WorkloadNetworkGatewayProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the path property: NSX Gateway Path.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
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
        jsonWriter.writeStringField("displayName", this.displayName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadNetworkGatewayProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadNetworkGatewayProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkloadNetworkGatewayProperties.
     */
    public static WorkloadNetworkGatewayProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadNetworkGatewayProperties deserializedWorkloadNetworkGatewayProperties
                = new WorkloadNetworkGatewayProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedWorkloadNetworkGatewayProperties.provisioningState
                        = WorkloadNetworkProvisioningState.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedWorkloadNetworkGatewayProperties.displayName = reader.getString();
                } else if ("path".equals(fieldName)) {
                    deserializedWorkloadNetworkGatewayProperties.path = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadNetworkGatewayProperties;
        });
    }
}
