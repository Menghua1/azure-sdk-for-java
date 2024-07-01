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
 * A copy activity Azure MySQL source.
 */
@Fluent
public final class AzureMySqlSource extends TabularSource {
    /*
     * Copy source type.
     */
    private String type = "AzureMySqlSource";

    /*
     * Database query. Type: string (or Expression with resultType string).
     */
    private Object query;

    /**
     * Creates an instance of AzureMySqlSource class.
     */
    public AzureMySqlSource() {
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
     * Get the query property: Database query. Type: string (or Expression with resultType string).
     * 
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Type: string (or Expression with resultType string).
     * 
     * @param query the query value to set.
     * @return the AzureMySqlSource object itself.
     */
    public AzureMySqlSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMySqlSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
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
     * Reads an instance of AzureMySqlSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureMySqlSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureMySqlSource.
     */
    public static AzureMySqlSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureMySqlSource deserializedAzureMySqlSource = new AzureMySqlSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedAzureMySqlSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedAzureMySqlSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedAzureMySqlSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedAzureMySqlSource.setQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedAzureMySqlSource.setAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedAzureMySqlSource.type = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedAzureMySqlSource.query = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureMySqlSource.setAdditionalProperties(additionalProperties);

            return deserializedAzureMySqlSource;
        });
    }
}
