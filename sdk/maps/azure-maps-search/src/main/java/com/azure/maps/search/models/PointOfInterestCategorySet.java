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
 * POI category.
 */
@Immutable
public final class PointOfInterestCategorySet implements JsonSerializable<PointOfInterestCategorySet> {
    /*
     * Category ID
     */
    private Integer id;

    /**
     * Creates an instance of PointOfInterestCategorySet class.
     */
    public PointOfInterestCategorySet() {
    }

    /**
     * Get the id property: Category ID.
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
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
     * Reads an instance of PointOfInterestCategorySet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PointOfInterestCategorySet if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PointOfInterestCategorySet.
     */
    public static PointOfInterestCategorySet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PointOfInterestCategorySet deserializedPointOfInterestCategorySet = new PointOfInterestCategorySet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPointOfInterestCategorySet.id = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPointOfInterestCategorySet;
        });
    }
}
