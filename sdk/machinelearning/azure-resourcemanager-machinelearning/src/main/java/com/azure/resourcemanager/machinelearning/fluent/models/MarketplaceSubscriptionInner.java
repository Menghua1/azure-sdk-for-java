// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.MarketplaceSubscriptionProperties;
import java.io.IOException;

/**
 * Azure Resource Manager resource envelope.
 */
@Fluent
public final class MarketplaceSubscriptionInner extends ProxyResource {
    /*
     * [Required] Additional attributes of the entity.
     */
    private MarketplaceSubscriptionProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of MarketplaceSubscriptionInner class.
     */
    public MarketplaceSubscriptionInner() {
    }

    /**
     * Get the properties property: [Required] Additional attributes of the entity.
     * 
     * @return the properties value.
     */
    public MarketplaceSubscriptionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: [Required] Additional attributes of the entity.
     * 
     * @param properties the properties value to set.
     * @return the MarketplaceSubscriptionInner object itself.
     */
    public MarketplaceSubscriptionInner withProperties(MarketplaceSubscriptionProperties properties) {
        this.properties = properties;
        return this;
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
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
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
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model MarketplaceSubscriptionInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MarketplaceSubscriptionInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MarketplaceSubscriptionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MarketplaceSubscriptionInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MarketplaceSubscriptionInner.
     */
    public static MarketplaceSubscriptionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MarketplaceSubscriptionInner deserializedMarketplaceSubscriptionInner = new MarketplaceSubscriptionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMarketplaceSubscriptionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMarketplaceSubscriptionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMarketplaceSubscriptionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedMarketplaceSubscriptionInner.properties
                        = MarketplaceSubscriptionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedMarketplaceSubscriptionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMarketplaceSubscriptionInner;
        });
    }
}
