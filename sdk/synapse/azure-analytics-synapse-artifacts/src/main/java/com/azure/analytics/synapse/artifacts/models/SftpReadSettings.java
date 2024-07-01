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
 * Sftp read settings.
 */
@Fluent
public final class SftpReadSettings extends StoreReadSettings {
    /*
     * The read setting type.
     */
    private String type = "SftpReadSettings";

    /*
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     */
    private Object recursive;

    /*
     * Sftp wildcardFolderPath. Type: string (or Expression with resultType string).
     */
    private Object wildcardFolderPath;

    /*
     * Sftp wildcardFileName. Type: string (or Expression with resultType string).
     */
    private Object wildcardFileName;

    /*
     * Indicates whether to enable partition discovery. Type: boolean (or Expression with resultType boolean).
     */
    private Object enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     */
    private Object partitionRootPath;

    /*
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     */
    private Object fileListPath;

    /*
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     */
    private Object deleteFilesAfterCompletion;

    /*
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     */
    private Object modifiedDatetimeStart;

    /*
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     */
    private Object modifiedDatetimeEnd;

    /*
     * If true, disable parallel reading within each file. Default is false. Type: boolean (or Expression with resultType boolean).
     */
    private Object disableChunking;

    /**
     * Creates an instance of SftpReadSettings class.
     */
    public SftpReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the recursive value.
     */
    public Object getRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param recursive the recursive value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Sftp wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     * 
     * @return the wildcardFolderPath value.
     */
    public Object getWildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Sftp wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     * 
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Sftp wildcardFileName. Type: string (or Expression with resultType string).
     * 
     * @return the wildcardFileName value.
     */
    public Object getWildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Sftp wildcardFileName. Type: string (or Expression with resultType string).
     * 
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the enablePartitionDiscovery value.
     */
    public Object getEnablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setEnablePartitionDiscovery(Object enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @return the partitionRootPath value.
     */
    public Object getPartitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @return the fileListPath value.
     */
    public Object getFileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @param fileListPath the fileListPath value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the deleteFilesAfterCompletion value.
     */
    public Object getDeleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get the disableChunking property: If true, disable parallel reading within each file. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the disableChunking value.
     */
    public Object getDisableChunking() {
        return this.disableChunking;
    }

    /**
     * Set the disableChunking property: If true, disable parallel reading within each file. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param disableChunking the disableChunking value to set.
     * @return the SftpReadSettings object itself.
     */
    public SftpReadSettings setDisableChunking(Object disableChunking) {
        this.disableChunking = disableChunking;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SftpReadSettings setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("recursive", this.recursive);
        jsonWriter.writeUntypedField("wildcardFolderPath", this.wildcardFolderPath);
        jsonWriter.writeUntypedField("wildcardFileName", this.wildcardFileName);
        jsonWriter.writeUntypedField("enablePartitionDiscovery", this.enablePartitionDiscovery);
        jsonWriter.writeUntypedField("partitionRootPath", this.partitionRootPath);
        jsonWriter.writeUntypedField("fileListPath", this.fileListPath);
        jsonWriter.writeUntypedField("deleteFilesAfterCompletion", this.deleteFilesAfterCompletion);
        jsonWriter.writeUntypedField("modifiedDatetimeStart", this.modifiedDatetimeStart);
        jsonWriter.writeUntypedField("modifiedDatetimeEnd", this.modifiedDatetimeEnd);
        jsonWriter.writeUntypedField("disableChunking", this.disableChunking);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SftpReadSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SftpReadSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SftpReadSettings.
     */
    public static SftpReadSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SftpReadSettings deserializedSftpReadSettings = new SftpReadSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedSftpReadSettings.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedSftpReadSettings.type = reader.getString();
                } else if ("recursive".equals(fieldName)) {
                    deserializedSftpReadSettings.recursive = reader.readUntyped();
                } else if ("wildcardFolderPath".equals(fieldName)) {
                    deserializedSftpReadSettings.wildcardFolderPath = reader.readUntyped();
                } else if ("wildcardFileName".equals(fieldName)) {
                    deserializedSftpReadSettings.wildcardFileName = reader.readUntyped();
                } else if ("enablePartitionDiscovery".equals(fieldName)) {
                    deserializedSftpReadSettings.enablePartitionDiscovery = reader.readUntyped();
                } else if ("partitionRootPath".equals(fieldName)) {
                    deserializedSftpReadSettings.partitionRootPath = reader.readUntyped();
                } else if ("fileListPath".equals(fieldName)) {
                    deserializedSftpReadSettings.fileListPath = reader.readUntyped();
                } else if ("deleteFilesAfterCompletion".equals(fieldName)) {
                    deserializedSftpReadSettings.deleteFilesAfterCompletion = reader.readUntyped();
                } else if ("modifiedDatetimeStart".equals(fieldName)) {
                    deserializedSftpReadSettings.modifiedDatetimeStart = reader.readUntyped();
                } else if ("modifiedDatetimeEnd".equals(fieldName)) {
                    deserializedSftpReadSettings.modifiedDatetimeEnd = reader.readUntyped();
                } else if ("disableChunking".equals(fieldName)) {
                    deserializedSftpReadSettings.disableChunking = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSftpReadSettings.setAdditionalProperties(additionalProperties);

            return deserializedSftpReadSettings;
        });
    }
}
