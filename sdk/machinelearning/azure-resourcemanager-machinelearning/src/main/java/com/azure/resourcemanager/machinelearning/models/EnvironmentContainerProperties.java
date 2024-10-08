// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Container for environment specification versions.
 */
@Fluent
public final class EnvironmentContainerProperties extends AssetContainer {
    /*
     * Provisioning state for the environment container.
     */
    private AssetProvisioningState provisioningState;

    /*
     * The latest version inside this container.
     */
    private String latestVersion;

    /*
     * The next auto incremental version
     */
    private String nextVersion;

    /**
     * Creates an instance of EnvironmentContainerProperties class.
     */
    public EnvironmentContainerProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state for the environment container.
     * 
     * @return the provisioningState value.
     */
    public AssetProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the latestVersion property: The latest version inside this container.
     * 
     * @return the latestVersion value.
     */
    @Override
    public String latestVersion() {
        return this.latestVersion;
    }

    /**
     * Get the nextVersion property: The next auto incremental version.
     * 
     * @return the nextVersion value.
     */
    @Override
    public String nextVersion() {
        return this.nextVersion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnvironmentContainerProperties withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnvironmentContainerProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnvironmentContainerProperties withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnvironmentContainerProperties withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("properties", properties(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("isArchived", isArchived());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EnvironmentContainerProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnvironmentContainerProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EnvironmentContainerProperties.
     */
    public static EnvironmentContainerProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnvironmentContainerProperties deserializedEnvironmentContainerProperties
                = new EnvironmentContainerProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedEnvironmentContainerProperties.withDescription(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedEnvironmentContainerProperties.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedEnvironmentContainerProperties.withProperties(properties);
                } else if ("isArchived".equals(fieldName)) {
                    deserializedEnvironmentContainerProperties
                        .withIsArchived(reader.getNullable(JsonReader::getBoolean));
                } else if ("latestVersion".equals(fieldName)) {
                    deserializedEnvironmentContainerProperties.latestVersion = reader.getString();
                } else if ("nextVersion".equals(fieldName)) {
                    deserializedEnvironmentContainerProperties.nextVersion = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedEnvironmentContainerProperties.provisioningState
                        = AssetProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnvironmentContainerProperties;
        });
    }
}
