// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.maps.route.models.RouteMatrix;
import com.azure.maps.route.models.RouteMatrixSummary;
import java.io.IOException;
import java.util.List;

/**
 * This object is returned from a successful Route Matrix call. For ex, if 2 origins and 3 destinations are provided,
 * there are going to 2 arrays with 3 elements in each. Each element's content depends on the options provided in the
 * query.
 */
@Immutable
public final class RouteMatrixResultPrivate implements JsonSerializable<RouteMatrixResultPrivate> {
    /*
     * Format Version property
     */
    private String formatVersion;

    /*
     * Results as a 2 dimensional array of route summaries.
     */
    private List<List<RouteMatrix>> matrix;

    /*
     * Summary object
     */
    private RouteMatrixSummary summary;

    /**
     * Creates an instance of RouteMatrixResultPrivate class.
     */
    public RouteMatrixResultPrivate() {
    }

    /**
     * Get the formatVersion property: Format Version property.
     * 
     * @return the formatVersion value.
     */
    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * Get the matrix property: Results as a 2 dimensional array of route summaries.
     * 
     * @return the matrix value.
     */
    public List<List<RouteMatrix>> getMatrix() {
        return this.matrix;
    }

    /**
     * Get the summary property: Summary object.
     * 
     * @return the summary value.
     */
    public RouteMatrixSummary getSummary() {
        return this.summary;
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
     * Reads an instance of RouteMatrixResultPrivate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouteMatrixResultPrivate if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RouteMatrixResultPrivate.
     */
    public static RouteMatrixResultPrivate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouteMatrixResultPrivate deserializedRouteMatrixResultPrivate = new RouteMatrixResultPrivate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("formatVersion".equals(fieldName)) {
                    deserializedRouteMatrixResultPrivate.formatVersion = reader.getString();
                } else if ("matrix".equals(fieldName)) {
                    List<List<RouteMatrix>> matrix
                        = reader.readArray(reader1 -> reader1.readArray(reader2 -> RouteMatrix.fromJson(reader2)));
                    deserializedRouteMatrixResultPrivate.matrix = matrix;
                } else if ("summary".equals(fieldName)) {
                    deserializedRouteMatrixResultPrivate.summary = RouteMatrixSummary.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRouteMatrixResultPrivate;
        });
    }
}
