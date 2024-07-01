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
 * A copy activity source for a MongoDB Atlas database.
 */
@Fluent
public final class MongoDbAtlasSource extends CopySource {
    /*
     * Copy source type.
     */
    private String type = "MongoDbAtlasSource";

    /*
     * Specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     */
    private Object filter;

    /*
     * Cursor methods for Mongodb query
     */
    private MongoDbCursorMethodsProperties cursorMethods;

    /*
     * Specifies the number of documents to return in each batch of the response from MongoDB Atlas instance. In most cases, modifying the batch size will not affect the user or the application. This property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     */
    private Object batchSize;

    /*
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    private Object queryTimeout;

    /*
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     */
    private Object additionalColumns;

    /**
     * Creates an instance of MongoDbAtlasSource class.
     */
    public MongoDbAtlasSource() {
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
     * Get the filter property: Specifies selection filter using query operators. To return all documents in a
     * collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType
     * string).
     * 
     * @return the filter value.
     */
    public Object getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: Specifies selection filter using query operators. To return all documents in a
     * collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType
     * string).
     * 
     * @param filter the filter value to set.
     * @return the MongoDbAtlasSource object itself.
     */
    public MongoDbAtlasSource setFilter(Object filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the cursorMethods property: Cursor methods for Mongodb query.
     * 
     * @return the cursorMethods value.
     */
    public MongoDbCursorMethodsProperties getCursorMethods() {
        return this.cursorMethods;
    }

    /**
     * Set the cursorMethods property: Cursor methods for Mongodb query.
     * 
     * @param cursorMethods the cursorMethods value to set.
     * @return the MongoDbAtlasSource object itself.
     */
    public MongoDbAtlasSource setCursorMethods(MongoDbCursorMethodsProperties cursorMethods) {
        this.cursorMethods = cursorMethods;
        return this;
    }

    /**
     * Get the batchSize property: Specifies the number of documents to return in each batch of the response from
     * MongoDB Atlas instance. In most cases, modifying the batch size will not affect the user or the application. This
     * property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with
     * resultType integer).
     * 
     * @return the batchSize value.
     */
    public Object getBatchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize property: Specifies the number of documents to return in each batch of the response from
     * MongoDB Atlas instance. In most cases, modifying the batch size will not affect the user or the application. This
     * property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with
     * resultType integer).
     * 
     * @param batchSize the batchSize value to set.
     * @return the MongoDbAtlasSource object itself.
     */
    public MongoDbAtlasSource setBatchSize(Object batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the queryTimeout value.
     */
    public Object getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param queryTimeout the queryTimeout value to set.
     * @return the MongoDbAtlasSource object itself.
     */
    public MongoDbAtlasSource setQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @return the additionalColumns value.
     */
    public Object getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @param additionalColumns the additionalColumns value to set.
     * @return the MongoDbAtlasSource object itself.
     */
    public MongoDbAtlasSource setAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbAtlasSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbAtlasSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbAtlasSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
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
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("filter", this.filter);
        jsonWriter.writeJsonField("cursorMethods", this.cursorMethods);
        jsonWriter.writeUntypedField("batchSize", this.batchSize);
        jsonWriter.writeUntypedField("queryTimeout", this.queryTimeout);
        jsonWriter.writeUntypedField("additionalColumns", this.additionalColumns);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MongoDbAtlasSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoDbAtlasSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MongoDbAtlasSource.
     */
    public static MongoDbAtlasSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoDbAtlasSource deserializedMongoDbAtlasSource = new MongoDbAtlasSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.type = reader.getString();
                } else if ("filter".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.filter = reader.readUntyped();
                } else if ("cursorMethods".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.cursorMethods = MongoDbCursorMethodsProperties.fromJson(reader);
                } else if ("batchSize".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.batchSize = reader.readUntyped();
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.queryTimeout = reader.readUntyped();
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedMongoDbAtlasSource.additionalColumns = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMongoDbAtlasSource.setAdditionalProperties(additionalProperties);

            return deserializedMongoDbAtlasSource;
        });
    }
}
