// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.fluent.models.ScheduledQueryRuleResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Represents a collection of scheduled query rule resources.
 */
@Fluent
public final class ScheduledQueryRuleResourceCollection
    implements JsonSerializable<ScheduledQueryRuleResourceCollection> {
    /*
     * The values for the scheduled query rule resources.
     */
    private List<ScheduledQueryRuleResourceInner> value;

    /*
     * Provides the link to retrieve the next set of elements.
     */
    private String nextLink;

    /**
     * Creates an instance of ScheduledQueryRuleResourceCollection class.
     */
    public ScheduledQueryRuleResourceCollection() {
    }

    /**
     * Get the value property: The values for the scheduled query rule resources.
     * 
     * @return the value value.
     */
    public List<ScheduledQueryRuleResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The values for the scheduled query rule resources.
     * 
     * @param value the value value to set.
     * @return the ScheduledQueryRuleResourceCollection object itself.
     */
    public ScheduledQueryRuleResourceCollection withValue(List<ScheduledQueryRuleResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Provides the link to retrieve the next set of elements.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScheduledQueryRuleResourceCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduledQueryRuleResourceCollection if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ScheduledQueryRuleResourceCollection.
     */
    public static ScheduledQueryRuleResourceCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduledQueryRuleResourceCollection deserializedScheduledQueryRuleResourceCollection
                = new ScheduledQueryRuleResourceCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ScheduledQueryRuleResourceInner> value
                        = reader.readArray(reader1 -> ScheduledQueryRuleResourceInner.fromJson(reader1));
                    deserializedScheduledQueryRuleResourceCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedScheduledQueryRuleResourceCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScheduledQueryRuleResourceCollection;
        });
    }
}
