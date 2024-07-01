// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A result containing a document found by a suggestion query, plus associated metadata.
 */
@Fluent
public final class SuggestResult implements JsonSerializable<SuggestResult> {
    /*
     * The text of the suggestion result.
     */
    private final String text;

    /*
     * A result containing a document found by a suggestion query, plus associated metadata.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of SuggestResult class.
     * 
     * @param text the text value to set.
     */
    public SuggestResult(String text) {
        this.text = text;
    }

    /**
     * Get the text property: The text of the suggestion result.
     * 
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the additionalProperties property: A result containing a document found by a suggestion query, plus
     * associated metadata.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A result containing a document found by a suggestion query, plus
     * associated metadata.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the SuggestResult object itself.
     */
    public SuggestResult setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SuggestResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SuggestResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SuggestResult.
     */
    public static SuggestResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean textFound = false;
            String text = null;
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@search.text".equals(fieldName)) {
                    text = reader.getString();
                    textFound = true;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            if (textFound) {
                SuggestResult deserializedSuggestResult = new SuggestResult(text);
                deserializedSuggestResult.additionalProperties = additionalProperties;

                return deserializedSuggestResult;
            }
            throw new IllegalStateException("Missing required property: @search.text");
        });
    }
}
