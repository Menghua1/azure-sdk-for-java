// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Optional settings to control how fields are processed when using a configured Elasticsearch® resource.
 */
@Fluent
public final class ElasticsearchIndexFieldMappingOptions
    implements JsonSerializable<ElasticsearchIndexFieldMappingOptions> {

    /*
     * The name of the index field to use as a title.
     */
    @Generated
    private String titleField;

    /*
     * The name of the index field to use as a URL.
     */
    @Generated
    private String urlField;

    /*
     * The name of the index field to use as a filepath.
     */
    @Generated
    private String filepathField;

    /*
     * The names of index fields that should be treated as content.
     */
    @Generated
    private List<String> contentFields;

    /*
     * The separator pattern that content fields should use.
     */
    @Generated
    private String contentFieldsSeparator;

    /*
     * The names of fields that represent vector data.
     */
    @Generated
    private List<String> vectorFields;

    /**
     * Creates an instance of ElasticsearchIndexFieldMappingOptions class.
     */
    @Generated
    public ElasticsearchIndexFieldMappingOptions() {
    }

    /**
     * Get the titleField property: The name of the index field to use as a title.
     *
     * @return the titleField value.
     */
    @Generated
    public String getTitleField() {
        return this.titleField;
    }

    /**
     * Set the titleField property: The name of the index field to use as a title.
     *
     * @param titleField the titleField value to set.
     * @return the ElasticsearchIndexFieldMappingOptions object itself.
     */
    @Generated
    public ElasticsearchIndexFieldMappingOptions setTitleField(String titleField) {
        this.titleField = titleField;
        return this;
    }

    /**
     * Get the urlField property: The name of the index field to use as a URL.
     *
     * @return the urlField value.
     */
    @Generated
    public String getUrlField() {
        return this.urlField;
    }

    /**
     * Set the urlField property: The name of the index field to use as a URL.
     *
     * @param urlField the urlField value to set.
     * @return the ElasticsearchIndexFieldMappingOptions object itself.
     */
    @Generated
    public ElasticsearchIndexFieldMappingOptions setUrlField(String urlField) {
        this.urlField = urlField;
        return this;
    }

    /**
     * Get the filepathField property: The name of the index field to use as a filepath.
     *
     * @return the filepathField value.
     */
    @Generated
    public String getFilepathField() {
        return this.filepathField;
    }

    /**
     * Set the filepathField property: The name of the index field to use as a filepath.
     *
     * @param filepathField the filepathField value to set.
     * @return the ElasticsearchIndexFieldMappingOptions object itself.
     */
    @Generated
    public ElasticsearchIndexFieldMappingOptions setFilepathField(String filepathField) {
        this.filepathField = filepathField;
        return this;
    }

    /**
     * Get the contentFields property: The names of index fields that should be treated as content.
     *
     * @return the contentFields value.
     */
    @Generated
    public List<String> getContentFields() {
        return this.contentFields;
    }

    /**
     * Set the contentFields property: The names of index fields that should be treated as content.
     *
     * @param contentFields the contentFields value to set.
     * @return the ElasticsearchIndexFieldMappingOptions object itself.
     */
    @Generated
    public ElasticsearchIndexFieldMappingOptions setContentFields(List<String> contentFields) {
        this.contentFields = contentFields;
        return this;
    }

    /**
     * Get the contentFieldsSeparator property: The separator pattern that content fields should use.
     *
     * @return the contentFieldsSeparator value.
     */
    @Generated
    public String getContentFieldsSeparator() {
        return this.contentFieldsSeparator;
    }

    /**
     * Set the contentFieldsSeparator property: The separator pattern that content fields should use.
     *
     * @param contentFieldsSeparator the contentFieldsSeparator value to set.
     * @return the ElasticsearchIndexFieldMappingOptions object itself.
     */
    @Generated
    public ElasticsearchIndexFieldMappingOptions setContentFieldsSeparator(String contentFieldsSeparator) {
        this.contentFieldsSeparator = contentFieldsSeparator;
        return this;
    }

    /**
     * Get the vectorFields property: The names of fields that represent vector data.
     *
     * @return the vectorFields value.
     */
    @Generated
    public List<String> getVectorFields() {
        return this.vectorFields;
    }

    /**
     * Set the vectorFields property: The names of fields that represent vector data.
     *
     * @param vectorFields the vectorFields value to set.
     * @return the ElasticsearchIndexFieldMappingOptions object itself.
     */
    @Generated
    public ElasticsearchIndexFieldMappingOptions setVectorFields(List<String> vectorFields) {
        this.vectorFields = vectorFields;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("title_field", this.titleField);
        jsonWriter.writeStringField("url_field", this.urlField);
        jsonWriter.writeStringField("filepath_field", this.filepathField);
        jsonWriter.writeArrayField("content_fields", this.contentFields,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("content_fields_separator", this.contentFieldsSeparator);
        jsonWriter.writeArrayField("vector_fields", this.vectorFields,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ElasticsearchIndexFieldMappingOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ElasticsearchIndexFieldMappingOptions if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ElasticsearchIndexFieldMappingOptions.
     */
    @Generated
    public static ElasticsearchIndexFieldMappingOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ElasticsearchIndexFieldMappingOptions deserializedElasticsearchIndexFieldMappingOptions
                = new ElasticsearchIndexFieldMappingOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("title_field".equals(fieldName)) {
                    deserializedElasticsearchIndexFieldMappingOptions.titleField = reader.getString();
                } else if ("url_field".equals(fieldName)) {
                    deserializedElasticsearchIndexFieldMappingOptions.urlField = reader.getString();
                } else if ("filepath_field".equals(fieldName)) {
                    deserializedElasticsearchIndexFieldMappingOptions.filepathField = reader.getString();
                } else if ("content_fields".equals(fieldName)) {
                    List<String> contentFields = reader.readArray(reader1 -> reader1.getString());
                    deserializedElasticsearchIndexFieldMappingOptions.contentFields = contentFields;
                } else if ("content_fields_separator".equals(fieldName)) {
                    deserializedElasticsearchIndexFieldMappingOptions.contentFieldsSeparator = reader.getString();
                } else if ("vector_fields".equals(fieldName)) {
                    List<String> vectorFields = reader.readArray(reader1 -> reader1.getString());
                    deserializedElasticsearchIndexFieldMappingOptions.vectorFields = vectorFields;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedElasticsearchIndexFieldMappingOptions;
        });
    }
}
