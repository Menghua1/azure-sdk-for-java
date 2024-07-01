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
import java.util.List;
import java.util.Map;

/**
 * The PostgreSQLV2 table dataset.
 */
@Fluent
public class PostgreSqlV2TableDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "PostgreSqlV2Table";

    /*
     * The PostgreSQL table name. Type: string (or Expression with resultType string).
     */
    private Object table;

    /*
     * The PostgreSQL schema name. Type: string (or Expression with resultType string).
     */
    private Object schemaTypePropertiesSchema;

    /**
     * Creates an instance of PostgreSqlV2TableDataset class.
     */
    public PostgreSqlV2TableDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the table property: The PostgreSQL table name. Type: string (or Expression with resultType string).
     * 
     * @return the table value.
     */
    public Object getTable() {
        return this.table;
    }

    /**
     * Set the table property: The PostgreSQL table name. Type: string (or Expression with resultType string).
     * 
     * @param table the table value to set.
     * @return the PostgreSqlV2TableDataset object itself.
     */
    public PostgreSqlV2TableDataset setTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the schemaTypePropertiesSchema property: The PostgreSQL schema name. Type: string (or Expression with
     * resultType string).
     * 
     * @return the schemaTypePropertiesSchema value.
     */
    public Object getSchemaTypePropertiesSchema() {
        return this.schemaTypePropertiesSchema;
    }

    /**
     * Set the schemaTypePropertiesSchema property: The PostgreSQL schema name. Type: string (or Expression with
     * resultType string).
     * 
     * @param schemaTypePropertiesSchema the schemaTypePropertiesSchema value to set.
     * @return the PostgreSqlV2TableDataset object itself.
     */
    public PostgreSqlV2TableDataset setSchemaTypePropertiesSchema(Object schemaTypePropertiesSchema) {
        this.schemaTypePropertiesSchema = schemaTypePropertiesSchema;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlV2TableDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlV2TableDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlV2TableDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlV2TableDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlV2TableDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlV2TableDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlV2TableDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", getLinkedServiceName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeUntypedField("structure", getStructure());
        jsonWriter.writeUntypedField("schema", getSchema());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", getFolder());
        jsonWriter.writeStringField("type", this.type);
        if (table != null || schemaTypePropertiesSchema != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("table", this.table);
            jsonWriter.writeUntypedField("schema", this.schemaTypePropertiesSchema);
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PostgreSqlV2TableDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PostgreSqlV2TableDataset if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PostgreSqlV2TableDataset.
     */
    public static PostgreSqlV2TableDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PostgreSqlV2TableDataset deserializedPostgreSqlV2TableDataset = new PostgreSqlV2TableDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedPostgreSqlV2TableDataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedPostgreSqlV2TableDataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedPostgreSqlV2TableDataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedPostgreSqlV2TableDataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedPostgreSqlV2TableDataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedPostgreSqlV2TableDataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedPostgreSqlV2TableDataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedPostgreSqlV2TableDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("table".equals(fieldName)) {
                            deserializedPostgreSqlV2TableDataset.table = reader.readUntyped();
                        } else if ("schema".equals(fieldName)) {
                            deserializedPostgreSqlV2TableDataset.schemaTypePropertiesSchema = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedPostgreSqlV2TableDataset.setAdditionalProperties(additionalProperties);

            return deserializedPostgreSqlV2TableDataset;
        });
    }
}
