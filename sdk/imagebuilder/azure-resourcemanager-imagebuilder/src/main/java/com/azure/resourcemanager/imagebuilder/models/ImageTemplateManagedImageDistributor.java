// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Distribute as a Managed Disk Image.
 */
@Fluent
public final class ImageTemplateManagedImageDistributor extends ImageTemplateDistributor {
    /*
     * Type of distribution.
     */
    private String type = "ManagedImage";

    /*
     * Resource Id of the Managed Disk Image
     */
    private String imageId;

    /*
     * Azure location for the image, should match if image already exists
     */
    private String location;

    /**
     * Creates an instance of ImageTemplateManagedImageDistributor class.
     */
    public ImageTemplateManagedImageDistributor() {
    }

    /**
     * Get the type property: Type of distribution.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the imageId property: Resource Id of the Managed Disk Image.
     * 
     * @return the imageId value.
     */
    public String imageId() {
        return this.imageId;
    }

    /**
     * Set the imageId property: Resource Id of the Managed Disk Image.
     * 
     * @param imageId the imageId value to set.
     * @return the ImageTemplateManagedImageDistributor object itself.
     */
    public ImageTemplateManagedImageDistributor withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * Get the location property: Azure location for the image, should match if image already exists.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Azure location for the image, should match if image already exists.
     * 
     * @param location the location value to set.
     * @return the ImageTemplateManagedImageDistributor object itself.
     */
    public ImageTemplateManagedImageDistributor withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageTemplateManagedImageDistributor withRunOutputName(String runOutputName) {
        super.withRunOutputName(runOutputName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageTemplateManagedImageDistributor withArtifactTags(Map<String, String> artifactTags) {
        super.withArtifactTags(artifactTags);
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
        if (imageId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property imageId in model ImageTemplateManagedImageDistributor"));
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model ImageTemplateManagedImageDistributor"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageTemplateManagedImageDistributor.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("runOutputName", runOutputName());
        jsonWriter.writeMapField("artifactTags", artifactTags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("imageId", this.imageId);
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageTemplateManagedImageDistributor from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageTemplateManagedImageDistributor if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ImageTemplateManagedImageDistributor.
     */
    public static ImageTemplateManagedImageDistributor fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageTemplateManagedImageDistributor deserializedImageTemplateManagedImageDistributor
                = new ImageTemplateManagedImageDistributor();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("runOutputName".equals(fieldName)) {
                    deserializedImageTemplateManagedImageDistributor.withRunOutputName(reader.getString());
                } else if ("artifactTags".equals(fieldName)) {
                    Map<String, String> artifactTags = reader.readMap(reader1 -> reader1.getString());
                    deserializedImageTemplateManagedImageDistributor.withArtifactTags(artifactTags);
                } else if ("imageId".equals(fieldName)) {
                    deserializedImageTemplateManagedImageDistributor.imageId = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedImageTemplateManagedImageDistributor.location = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedImageTemplateManagedImageDistributor.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageTemplateManagedImageDistributor;
        });
    }
}
