// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The brand associated with the POI.
 */
@Immutable
public final class Brand implements JsonSerializable<Brand> {
    /*
     * Name of the brand
     */
    private String name;

    /**
     * Creates an instance of Brand class.
     */
    public Brand() {
    }

    /**
     * Get the name property: Name of the brand.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
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
     * Reads an instance of Brand from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Brand if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Brand.
     */
    public static Brand fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Brand deserializedBrand = new Brand();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedBrand.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBrand;
        });
    }
}
