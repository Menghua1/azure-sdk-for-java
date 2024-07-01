// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The LinkTableRequestTargetDistributionOptions model.
 */
@Fluent
public final class LinkTableRequestTargetDistributionOptions
    implements JsonSerializable<LinkTableRequestTargetDistributionOptions> {
    /*
     * Target table distribution type
     */
    private String type;

    /*
     * Target table distribution column
     */
    private String distributionColumn;

    /**
     * Creates an instance of LinkTableRequestTargetDistributionOptions class.
     */
    public LinkTableRequestTargetDistributionOptions() {
    }

    /**
     * Get the type property: Target table distribution type.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Target table distribution type.
     * 
     * @param type the type value to set.
     * @return the LinkTableRequestTargetDistributionOptions object itself.
     */
    public LinkTableRequestTargetDistributionOptions setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the distributionColumn property: Target table distribution column.
     * 
     * @return the distributionColumn value.
     */
    public String getDistributionColumn() {
        return this.distributionColumn;
    }

    /**
     * Set the distributionColumn property: Target table distribution column.
     * 
     * @param distributionColumn the distributionColumn value to set.
     * @return the LinkTableRequestTargetDistributionOptions object itself.
     */
    public LinkTableRequestTargetDistributionOptions setDistributionColumn(String distributionColumn) {
        this.distributionColumn = distributionColumn;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("distributionColumn", this.distributionColumn);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkTableRequestTargetDistributionOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkTableRequestTargetDistributionOptions if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinkTableRequestTargetDistributionOptions.
     */
    public static LinkTableRequestTargetDistributionOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinkTableRequestTargetDistributionOptions deserializedLinkTableRequestTargetDistributionOptions
                = new LinkTableRequestTargetDistributionOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedLinkTableRequestTargetDistributionOptions.type = reader.getString();
                } else if ("distributionColumn".equals(fieldName)) {
                    deserializedLinkTableRequestTargetDistributionOptions.distributionColumn = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinkTableRequestTargetDistributionOptions;
        });
    }
}
