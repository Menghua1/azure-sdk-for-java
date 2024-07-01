// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.fluent.models.ClusterInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a Cluster list operation.
 */
@Fluent
public final class ClusterList implements JsonSerializable<ClusterList> {
    /*
     * The Cluster items on this page
     */
    private List<ClusterInner> value;

    /*
     * The link to the next page of items
     */
    private String nextLink;

    /**
     * Creates an instance of ClusterList class.
     */
    public ClusterList() {
    }

    /**
     * Get the value property: The Cluster items on this page.
     * 
     * @return the value value.
     */
    public List<ClusterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The Cluster items on this page.
     * 
     * @param value the value value to set.
     * @return the ClusterList object itself.
     */
    public ClusterList withValue(List<ClusterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ClusterList object itself.
     */
    public ClusterList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model ClusterList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterList.class);

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
     * Reads an instance of ClusterList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterList.
     */
    public static ClusterList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterList deserializedClusterList = new ClusterList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ClusterInner> value = reader.readArray(reader1 -> ClusterInner.fromJson(reader1));
                    deserializedClusterList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedClusterList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterList;
        });
    }
}
