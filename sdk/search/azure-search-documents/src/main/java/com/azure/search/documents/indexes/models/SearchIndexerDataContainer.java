// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents information about the entity (such as Azure SQL table or CosmosDB collection) that will be indexed.
 */
@Fluent
public final class SearchIndexerDataContainer implements JsonSerializable<SearchIndexerDataContainer> {
    /*
     * The name of the table or view (for Azure SQL data source) or collection (for CosmosDB data source) that will be
     * indexed.
     */
    private final String name;

    /*
     * A query that is applied to this data container. The syntax and meaning of this parameter is datasource-specific.
     * Not supported by Azure SQL datasources.
     */
    private String query;

    /**
     * Creates an instance of SearchIndexerDataContainer class.
     * 
     * @param name the name value to set.
     */
    public SearchIndexerDataContainer(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the table or view (for Azure SQL data source) or collection (for CosmosDB data
     * source) that will be indexed.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the query property: A query that is applied to this data container. The syntax and meaning of this parameter
     * is datasource-specific. Not supported by Azure SQL datasources.
     * 
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: A query that is applied to this data container. The syntax and meaning of this parameter
     * is datasource-specific. Not supported by Azure SQL datasources.
     * 
     * @param query the query value to set.
     * @return the SearchIndexerDataContainer object itself.
     */
    public SearchIndexerDataContainer setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("query", this.query);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerDataContainer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerDataContainer if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchIndexerDataContainer.
     */
    public static SearchIndexerDataContainer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            String query = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("query".equals(fieldName)) {
                    query = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                SearchIndexerDataContainer deserializedSearchIndexerDataContainer
                    = new SearchIndexerDataContainer(name);
                deserializedSearchIndexerDataContainer.query = query;

                return deserializedSearchIndexerDataContainer;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
