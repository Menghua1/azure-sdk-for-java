// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A valid `GeoJSON Point` geometry type. Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1.2)
 * for details.
 */
@Fluent
public final class GeoJsonPoint extends GeoJsonGeometry {
    /*
     * Specifies the `GeoJSON` type. Must be one of the nine valid GeoJSON object types - Point, MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon, GeometryCollection, Feature and FeatureCollection.
     */
    private GeoJsonObjectType type = GeoJsonObjectType.GEO_JSON_POINT;

    /*
     * A `Position` is an array of numbers with two or more elements. The first two elements are _longitude_ and _latitude_, precisely in that order. _Altitude/Elevation_ is an optional third element. Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1.1) for details.
     */
    private List<Double> coordinates;

    /**
     * Creates an instance of GeoJsonPoint class.
     */
    public GeoJsonPoint() {
    }

    /**
     * Get the type property: Specifies the `GeoJSON` type. Must be one of the nine valid GeoJSON object types - Point,
     * MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon, GeometryCollection, Feature and
     * FeatureCollection.
     * 
     * @return the type value.
     */
    @Override
    public GeoJsonObjectType getType() {
        return this.type;
    }

    /**
     * Get the coordinates property: A `Position` is an array of numbers with two or more elements. The first two
     * elements are _longitude_ and _latitude_, precisely in that order. _Altitude/Elevation_ is an optional third
     * element. Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1.1) for details.
     * 
     * @return the coordinates value.
     */
    public List<Double> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: A `Position` is an array of numbers with two or more elements. The first two
     * elements are _longitude_ and _latitude_, precisely in that order. _Altitude/Elevation_ is an optional third
     * element. Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1.1) for details.
     * 
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonPoint object itself.
     */
    public GeoJsonPoint setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("coordinates", this.coordinates, (writer, element) -> writer.writeDouble(element));
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeoJsonPoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeoJsonPoint if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GeoJsonPoint.
     */
    public static GeoJsonPoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeoJsonPoint deserializedGeoJsonPoint = new GeoJsonPoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("coordinates".equals(fieldName)) {
                    List<Double> coordinates = reader.readArray(reader1 -> reader1.getDouble());
                    deserializedGeoJsonPoint.coordinates = coordinates;
                } else if ("type".equals(fieldName)) {
                    deserializedGeoJsonPoint.type = GeoJsonObjectType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeoJsonPoint;
        });
    }
}
