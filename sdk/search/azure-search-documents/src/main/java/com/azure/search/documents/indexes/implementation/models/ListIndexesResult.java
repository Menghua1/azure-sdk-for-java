// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.models.SearchIndex;
import java.io.IOException;
import java.util.List;

/**
 * Response from a List Indexes request. If successful, it includes the full definitions of all indexes.
 */
@Immutable
public final class ListIndexesResult implements JsonSerializable<ListIndexesResult> {
    /*
     * The indexes in the Search service.
     */
    private final List<SearchIndex> indexes;

    /**
     * Creates an instance of ListIndexesResult class.
     * 
     * @param indexes the indexes value to set.
     */
    public ListIndexesResult(List<SearchIndex> indexes) {
        this.indexes = indexes;
    }

    /**
     * Get the indexes property: The indexes in the Search service.
     * 
     * @return the indexes value.
     */
    public List<SearchIndex> getIndexes() {
        return this.indexes;
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
     * Reads an instance of ListIndexesResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListIndexesResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ListIndexesResult.
     */
    public static ListIndexesResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean indexesFound = false;
            List<SearchIndex> indexes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    indexes = reader.readArray(reader1 -> SearchIndex.fromJson(reader1));
                    indexesFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (indexesFound) {
                return new ListIndexesResult(indexes);
            }
            throw new IllegalStateException("Missing required property: value");
        });
    }
}
