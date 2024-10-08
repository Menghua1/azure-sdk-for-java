// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.OriginProvisioningState;
import com.azure.resourcemanager.cdn.models.OriginResourceState;
import com.azure.resourcemanager.cdn.models.PrivateEndpointStatus;
import java.io.IOException;

/**
 * The JSON object that contains the properties of the origin.
 */
@Fluent
public final class OriginProperties extends OriginUpdatePropertiesParameters {
    /*
     * Resource status of the origin.
     */
    private OriginResourceState resourceState;

    /*
     * Provisioning status of the origin.
     */
    private OriginProvisioningState provisioningState;

    /*
     * The approval status for the connection to the Private Link
     */
    private PrivateEndpointStatus privateEndpointStatus;

    /**
     * Creates an instance of OriginProperties class.
     */
    public OriginProperties() {
    }

    /**
     * Get the resourceState property: Resource status of the origin.
     * 
     * @return the resourceState value.
     */
    public OriginResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning status of the origin.
     * 
     * @return the provisioningState value.
     */
    public OriginProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpointStatus property: The approval status for the connection to the Private Link.
     * 
     * @return the privateEndpointStatus value.
     */
    public PrivateEndpointStatus privateEndpointStatus() {
        return this.privateEndpointStatus;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withHostname(String hostname) {
        super.withHostname(hostname);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withHttpPort(Integer httpPort) {
        super.withHttpPort(httpPort);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withHttpsPort(Integer httpsPort) {
        super.withHttpsPort(httpsPort);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withOriginHostHeader(String originHostHeader) {
        super.withOriginHostHeader(originHostHeader);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withPriority(Integer priority) {
        super.withPriority(priority);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withWeight(Integer weight) {
        super.withWeight(weight);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withPrivateLinkAlias(String privateLinkAlias) {
        super.withPrivateLinkAlias(privateLinkAlias);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withPrivateLinkResourceId(String privateLinkResourceId) {
        super.withPrivateLinkResourceId(privateLinkResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withPrivateLinkLocation(String privateLinkLocation) {
        super.withPrivateLinkLocation(privateLinkLocation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OriginProperties withPrivateLinkApprovalMessage(String privateLinkApprovalMessage) {
        super.withPrivateLinkApprovalMessage(privateLinkApprovalMessage);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hostName", hostname());
        jsonWriter.writeNumberField("httpPort", httpPort());
        jsonWriter.writeNumberField("httpsPort", httpsPort());
        jsonWriter.writeStringField("originHostHeader", originHostHeader());
        jsonWriter.writeNumberField("priority", priority());
        jsonWriter.writeNumberField("weight", weight());
        jsonWriter.writeBooleanField("enabled", enabled());
        jsonWriter.writeStringField("privateLinkAlias", privateLinkAlias());
        jsonWriter.writeStringField("privateLinkResourceId", privateLinkResourceId());
        jsonWriter.writeStringField("privateLinkLocation", privateLinkLocation());
        jsonWriter.writeStringField("privateLinkApprovalMessage", privateLinkApprovalMessage());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OriginProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OriginProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OriginProperties.
     */
    public static OriginProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OriginProperties deserializedOriginProperties = new OriginProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hostName".equals(fieldName)) {
                    deserializedOriginProperties.withHostname(reader.getString());
                } else if ("httpPort".equals(fieldName)) {
                    deserializedOriginProperties.withHttpPort(reader.getNullable(JsonReader::getInt));
                } else if ("httpsPort".equals(fieldName)) {
                    deserializedOriginProperties.withHttpsPort(reader.getNullable(JsonReader::getInt));
                } else if ("originHostHeader".equals(fieldName)) {
                    deserializedOriginProperties.withOriginHostHeader(reader.getString());
                } else if ("priority".equals(fieldName)) {
                    deserializedOriginProperties.withPriority(reader.getNullable(JsonReader::getInt));
                } else if ("weight".equals(fieldName)) {
                    deserializedOriginProperties.withWeight(reader.getNullable(JsonReader::getInt));
                } else if ("enabled".equals(fieldName)) {
                    deserializedOriginProperties.withEnabled(reader.getNullable(JsonReader::getBoolean));
                } else if ("privateLinkAlias".equals(fieldName)) {
                    deserializedOriginProperties.withPrivateLinkAlias(reader.getString());
                } else if ("privateLinkResourceId".equals(fieldName)) {
                    deserializedOriginProperties.withPrivateLinkResourceId(reader.getString());
                } else if ("privateLinkLocation".equals(fieldName)) {
                    deserializedOriginProperties.withPrivateLinkLocation(reader.getString());
                } else if ("privateLinkApprovalMessage".equals(fieldName)) {
                    deserializedOriginProperties.withPrivateLinkApprovalMessage(reader.getString());
                } else if ("resourceState".equals(fieldName)) {
                    deserializedOriginProperties.resourceState = OriginResourceState.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedOriginProperties.provisioningState
                        = OriginProvisioningState.fromString(reader.getString());
                } else if ("privateEndpointStatus".equals(fieldName)) {
                    deserializedOriginProperties.privateEndpointStatus
                        = PrivateEndpointStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOriginProperties;
        });
    }
}
