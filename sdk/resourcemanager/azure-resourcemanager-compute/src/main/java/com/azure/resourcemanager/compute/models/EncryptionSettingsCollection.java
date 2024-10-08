// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Encryption settings for disk or snapshot.
 */
@Fluent
public final class EncryptionSettingsCollection implements JsonSerializable<EncryptionSettingsCollection> {
    /*
     * Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this
     * flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is
     * null in the request object, the existing settings remain unchanged.
     */
    private boolean enabled;

    /*
     * A collection of encryption settings, one for each disk volume.
     */
    private List<EncryptionSettingsElement> encryptionSettings;

    /*
     * Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. '1.0'
     * corresponds to Azure Disk Encryption with AAD app.'1.1' corresponds to Azure Disk Encryption.
     */
    private String encryptionSettingsVersion;

    /**
     * Creates an instance of EncryptionSettingsCollection class.
     */
    public EncryptionSettingsCollection() {
    }

    /**
     * Get the enabled property: Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to
     * enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable
     * encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to
     * enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable
     * encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     * 
     * @param enabled the enabled value to set.
     * @return the EncryptionSettingsCollection object itself.
     */
    public EncryptionSettingsCollection withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the encryptionSettings property: A collection of encryption settings, one for each disk volume.
     * 
     * @return the encryptionSettings value.
     */
    public List<EncryptionSettingsElement> encryptionSettings() {
        return this.encryptionSettings;
    }

    /**
     * Set the encryptionSettings property: A collection of encryption settings, one for each disk volume.
     * 
     * @param encryptionSettings the encryptionSettings value to set.
     * @return the EncryptionSettingsCollection object itself.
     */
    public EncryptionSettingsCollection withEncryptionSettings(List<EncryptionSettingsElement> encryptionSettings) {
        this.encryptionSettings = encryptionSettings;
        return this;
    }

    /**
     * Get the encryptionSettingsVersion property: Describes what type of encryption is used for the disks. Once this
     * field is set, it cannot be overwritten. '1.0' corresponds to Azure Disk Encryption with AAD app.'1.1' corresponds
     * to Azure Disk Encryption.
     * 
     * @return the encryptionSettingsVersion value.
     */
    public String encryptionSettingsVersion() {
        return this.encryptionSettingsVersion;
    }

    /**
     * Set the encryptionSettingsVersion property: Describes what type of encryption is used for the disks. Once this
     * field is set, it cannot be overwritten. '1.0' corresponds to Azure Disk Encryption with AAD app.'1.1' corresponds
     * to Azure Disk Encryption.
     * 
     * @param encryptionSettingsVersion the encryptionSettingsVersion value to set.
     * @return the EncryptionSettingsCollection object itself.
     */
    public EncryptionSettingsCollection withEncryptionSettingsVersion(String encryptionSettingsVersion) {
        this.encryptionSettingsVersion = encryptionSettingsVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptionSettings() != null) {
            encryptionSettings().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeArrayField("encryptionSettings", this.encryptionSettings,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("encryptionSettingsVersion", this.encryptionSettingsVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionSettingsCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionSettingsCollection if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EncryptionSettingsCollection.
     */
    public static EncryptionSettingsCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionSettingsCollection deserializedEncryptionSettingsCollection = new EncryptionSettingsCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedEncryptionSettingsCollection.enabled = reader.getBoolean();
                } else if ("encryptionSettings".equals(fieldName)) {
                    List<EncryptionSettingsElement> encryptionSettings
                        = reader.readArray(reader1 -> EncryptionSettingsElement.fromJson(reader1));
                    deserializedEncryptionSettingsCollection.encryptionSettings = encryptionSettings;
                } else if ("encryptionSettingsVersion".equals(fieldName)) {
                    deserializedEncryptionSettingsCollection.encryptionSettingsVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionSettingsCollection;
        });
    }
}
