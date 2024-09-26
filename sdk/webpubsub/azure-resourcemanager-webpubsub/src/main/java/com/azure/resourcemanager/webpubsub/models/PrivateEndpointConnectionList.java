// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateEndpointConnectionInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of private endpoint connections.
 */
@Fluent
public final class PrivateEndpointConnectionList implements JsonSerializable<PrivateEndpointConnectionList> {
    /*
     * The list of the private endpoint connections
     */
    private List<PrivateEndpointConnectionInner> value;

    /*
     * Request URL that can be used to query next page of private endpoint connections. Returned when the total number
     * of requested private endpoint connections exceed maximum page size.
     */
    private String nextLink;

    /**
     * Creates an instance of PrivateEndpointConnectionList class.
     */
    public PrivateEndpointConnectionList() {
    }

    /**
     * Get the value property: The list of the private endpoint connections.
     * 
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of the private endpoint connections.
     * 
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionList object itself.
     */
    public PrivateEndpointConnectionList withValue(List<PrivateEndpointConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of private endpoint connections.
     * Returned when the total number of requested private endpoint connections exceed maximum page size.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Request URL that can be used to query next page of private endpoint connections.
     * Returned when the total number of requested private endpoint connections exceed maximum page size.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PrivateEndpointConnectionList object itself.
     */
    public PrivateEndpointConnectionList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointConnectionList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionList if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionList.
     */
    public static PrivateEndpointConnectionList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionList deserializedPrivateEndpointConnectionList
                = new PrivateEndpointConnectionList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> value
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedPrivateEndpointConnectionList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionList;
        });
    }
}
