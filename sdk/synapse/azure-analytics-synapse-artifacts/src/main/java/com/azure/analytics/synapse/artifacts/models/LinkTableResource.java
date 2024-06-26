// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The LinkTableResource model.
 */
@Fluent
public final class LinkTableResource implements JsonSerializable<LinkTableResource> {
    /*
     * Link table id
     */
    private String id;

    /*
     * Link table name
     */
    private String name;

    /*
     * Source table properties for link table request
     */
    private LinkTableRequestSource source;

    /*
     * Target table properties for link table request
     */
    private LinkTableRequestTarget target;

    /**
     * Creates an instance of LinkTableResource class.
     */
    public LinkTableResource() {
    }

    /**
     * Get the id property: Link table id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Link table id.
     * 
     * @param id the id value to set.
     * @return the LinkTableResource object itself.
     */
    public LinkTableResource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Link table name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Link table name.
     * 
     * @param name the name value to set.
     * @return the LinkTableResource object itself.
     */
    public LinkTableResource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source property: Source table properties for link table request.
     * 
     * @return the source value.
     */
    public LinkTableRequestSource getSource() {
        return this.source;
    }

    /**
     * Set the source property: Source table properties for link table request.
     * 
     * @param source the source value to set.
     * @return the LinkTableResource object itself.
     */
    public LinkTableResource setSource(LinkTableRequestSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the target property: Target table properties for link table request.
     * 
     * @return the target value.
     */
    public LinkTableRequestTarget getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Target table properties for link table request.
     * 
     * @param target the target value to set.
     * @return the LinkTableResource object itself.
     */
    public LinkTableResource setTarget(LinkTableRequestTarget target) {
        this.target = target;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("source", this.source);
        jsonWriter.writeJsonField("target", this.target);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkTableResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkTableResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinkTableResource.
     */
    public static LinkTableResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinkTableResource deserializedLinkTableResource = new LinkTableResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedLinkTableResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedLinkTableResource.name = reader.getString();
                } else if ("source".equals(fieldName)) {
                    deserializedLinkTableResource.source = LinkTableRequestSource.fromJson(reader);
                } else if ("target".equals(fieldName)) {
                    deserializedLinkTableResource.target = LinkTableRequestTarget.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinkTableResource;
        });
    }
}
