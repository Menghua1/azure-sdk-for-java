// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Response containing suggestion query results from an index.
 */
@Immutable
public final class SuggestDocumentsResult implements JsonSerializable<SuggestDocumentsResult> {
    /*
     * The sequence of results returned by the query.
     */
    private final List<SuggestResult> results;

    /*
     * A value indicating the percentage of the index that was included in the query, or null if minimumCoverage was not
     * set in the request.
     */
    private Double coverage;

    /**
     * Creates an instance of SuggestDocumentsResult class.
     * 
     * @param results the results value to set.
     */
    public SuggestDocumentsResult(List<SuggestResult> results) {
        this.results = results;
    }

    /**
     * Get the results property: The sequence of results returned by the query.
     * 
     * @return the results value.
     */
    public List<SuggestResult> getResults() {
        return this.results;
    }

    /**
     * Get the coverage property: A value indicating the percentage of the index that was included in the query, or null
     * if minimumCoverage was not set in the request.
     * 
     * @return the coverage value.
     */
    public Double getCoverage() {
        return this.coverage;
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
     * Reads an instance of SuggestDocumentsResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SuggestDocumentsResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SuggestDocumentsResult.
     */
    public static SuggestDocumentsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean resultsFound = false;
            List<SuggestResult> results = null;
            Double coverage = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    results = reader.readArray(reader1 -> SuggestResult.fromJson(reader1));
                    resultsFound = true;
                } else if ("@search.coverage".equals(fieldName)) {
                    coverage = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }
            if (resultsFound) {
                SuggestDocumentsResult deserializedSuggestDocumentsResult = new SuggestDocumentsResult(results);
                deserializedSuggestDocumentsResult.coverage = coverage;

                return deserializedSuggestDocumentsResult;
            }
            throw new IllegalStateException("Missing required property: value");
        });
    }
}
