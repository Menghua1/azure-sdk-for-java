// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Azure PostgreSQL source.
 */
@Fluent
public final class AzurePostgreSqlSource extends TabularSource {
    /*
     * Copy source type.
     */
    private String type = "AzurePostgreSqlSource";

    /*
     * A query to retrieve data from source. Type: string (or Expression with resultType string).
     */
    private Object query;

    /**
     * Creates an instance of AzurePostgreSqlSource class.
     */
    public AzurePostgreSqlSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @param query the query value to set.
     * @return the AzurePostgreSqlSource object itself.
     */
    public AzurePostgreSqlSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzurePostgreSqlSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("sourceRetryCount", getSourceRetryCount());
        jsonWriter.writeUntypedField("sourceRetryWait", getSourceRetryWait());
        jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        jsonWriter.writeUntypedField("queryTimeout", getQueryTimeout());
        jsonWriter.writeUntypedField("additionalColumns", getAdditionalColumns());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("query", this.query);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzurePostgreSqlSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzurePostgreSqlSource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzurePostgreSqlSource.
     */
    public static AzurePostgreSqlSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzurePostgreSqlSource deserializedAzurePostgreSqlSource = new AzurePostgreSqlSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedAzurePostgreSqlSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedAzurePostgreSqlSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedAzurePostgreSqlSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedAzurePostgreSqlSource.setQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedAzurePostgreSqlSource.setAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedAzurePostgreSqlSource.type = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedAzurePostgreSqlSource.query = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzurePostgreSqlSource.setAdditionalProperties(additionalProperties);

            return deserializedAzurePostgreSqlSource;
        });
    }
}
