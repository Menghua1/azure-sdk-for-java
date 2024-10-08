// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The MarketplacePlan model.
 */
@Immutable
public final class MarketplacePlan implements JsonSerializable<MarketplacePlan> {
    /*
     * The identifying name of the Publisher of the Marketplace Plan.
     */
    private String publisherId;

    /*
     * The identifying name of the Offer of the Marketplace Plan.
     */
    private String offerId;

    /*
     * The identifying name of the Plan of the Marketplace Plan.
     */
    private String planId;

    /**
     * Creates an instance of MarketplacePlan class.
     */
    public MarketplacePlan() {
    }

    /**
     * Get the publisherId property: The identifying name of the Publisher of the Marketplace Plan.
     * 
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Get the offerId property: The identifying name of the Offer of the Marketplace Plan.
     * 
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Get the planId property: The identifying name of the Plan of the Marketplace Plan.
     * 
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
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
     * Reads an instance of MarketplacePlan from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MarketplacePlan if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MarketplacePlan.
     */
    public static MarketplacePlan fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MarketplacePlan deserializedMarketplacePlan = new MarketplacePlan();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publisherId".equals(fieldName)) {
                    deserializedMarketplacePlan.publisherId = reader.getString();
                } else if ("offerId".equals(fieldName)) {
                    deserializedMarketplacePlan.offerId = reader.getString();
                } else if ("planId".equals(fieldName)) {
                    deserializedMarketplacePlan.planId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMarketplacePlan;
        });
    }
}
