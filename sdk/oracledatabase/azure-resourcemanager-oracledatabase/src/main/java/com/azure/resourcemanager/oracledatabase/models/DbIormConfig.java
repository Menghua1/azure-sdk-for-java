// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * DbIormConfig for cloud vm cluster.
 */
@Fluent
public final class DbIormConfig implements JsonSerializable<DbIormConfig> {
    /*
     * The database name. For the default DbPlan, the dbName is default.
     */
    private String dbName;

    /*
     * The flash cache limit for this database. This value is internally configured based on the share value assigned to
     * the database.
     */
    private String flashCacheLimit;

    /*
     * The relative priority of this database.
     */
    private Integer share;

    /**
     * Creates an instance of DbIormConfig class.
     */
    public DbIormConfig() {
    }

    /**
     * Get the dbName property: The database name. For the default DbPlan, the dbName is default.
     * 
     * @return the dbName value.
     */
    public String dbName() {
        return this.dbName;
    }

    /**
     * Set the dbName property: The database name. For the default DbPlan, the dbName is default.
     * 
     * @param dbName the dbName value to set.
     * @return the DbIormConfig object itself.
     */
    public DbIormConfig withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * Get the flashCacheLimit property: The flash cache limit for this database. This value is internally configured
     * based on the share value assigned to the database.
     * 
     * @return the flashCacheLimit value.
     */
    public String flashCacheLimit() {
        return this.flashCacheLimit;
    }

    /**
     * Set the flashCacheLimit property: The flash cache limit for this database. This value is internally configured
     * based on the share value assigned to the database.
     * 
     * @param flashCacheLimit the flashCacheLimit value to set.
     * @return the DbIormConfig object itself.
     */
    public DbIormConfig withFlashCacheLimit(String flashCacheLimit) {
        this.flashCacheLimit = flashCacheLimit;
        return this;
    }

    /**
     * Get the share property: The relative priority of this database.
     * 
     * @return the share value.
     */
    public Integer share() {
        return this.share;
    }

    /**
     * Set the share property: The relative priority of this database.
     * 
     * @param share the share value to set.
     * @return the DbIormConfig object itself.
     */
    public DbIormConfig withShare(Integer share) {
        this.share = share;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dbName", this.dbName);
        jsonWriter.writeStringField("flashCacheLimit", this.flashCacheLimit);
        jsonWriter.writeNumberField("share", this.share);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DbIormConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DbIormConfig if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DbIormConfig.
     */
    public static DbIormConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DbIormConfig deserializedDbIormConfig = new DbIormConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dbName".equals(fieldName)) {
                    deserializedDbIormConfig.dbName = reader.getString();
                } else if ("flashCacheLimit".equals(fieldName)) {
                    deserializedDbIormConfig.flashCacheLimit = reader.getString();
                } else if ("share".equals(fieldName)) {
                    deserializedDbIormConfig.share = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDbIormConfig;
        });
    }
}
