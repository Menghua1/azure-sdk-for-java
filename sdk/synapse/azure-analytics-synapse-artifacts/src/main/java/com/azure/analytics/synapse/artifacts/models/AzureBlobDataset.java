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
 * The Azure Blob storage.
 */
@Fluent
public class AzureBlobDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "AzureBlob";

    /*
     * The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     */
    private Object folderPath;

    /*
     * The root of blob path. Type: string (or Expression with resultType string).
     */
    private Object tableRootLocation;

    /*
     * The name of the Azure Blob. Type: string (or Expression with resultType string).
     */
    private Object fileName;

    /*
     * The start of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     */
    private Object modifiedDatetimeStart;

    /*
     * The end of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     */
    private Object modifiedDatetimeEnd;

    /*
     * The format of the Azure Blob storage.
     */
    private DatasetStorageFormat format;

    /*
     * The data compression method used for the blob storage.
     */
    private DatasetCompression compression;

    /**
     * Creates an instance of AzureBlobDataset class.
     */
    public AzureBlobDataset() {
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
     * Get the folderPath property: The path of the Azure Blob storage. Type: string (or Expression with resultType
     * string).
     * 
     * @return the folderPath value.
     */
    public Object getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The path of the Azure Blob storage. Type: string (or Expression with resultType
     * string).
     * 
     * @param folderPath the folderPath value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the tableRootLocation property: The root of blob path. Type: string (or Expression with resultType string).
     * 
     * @return the tableRootLocation value.
     */
    public Object getTableRootLocation() {
        return this.tableRootLocation;
    }

    /**
     * Set the tableRootLocation property: The root of blob path. Type: string (or Expression with resultType string).
     * 
     * @param tableRootLocation the tableRootLocation value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setTableRootLocation(Object tableRootLocation) {
        this.tableRootLocation = tableRootLocation;
        return this;
    }

    /**
     * Get the fileName property: The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     * @return the fileName value.
     */
    public Object getFileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     * @param fileName the fileName value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of Azure Blob's modified datetime. Type: string (or Expression
     * with resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of Azure Blob's modified datetime. Type: string (or Expression
     * with resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of Azure Blob's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of Azure Blob's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get the format property: The format of the Azure Blob storage.
     * 
     * @return the format value.
     */
    public DatasetStorageFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: The format of the Azure Blob storage.
     * 
     * @param format the format value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the blob storage.
     * 
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the blob storage.
     * 
     * @param compression the compression value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset setFolder(DatasetFolder folder) {
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
        if (folderPath != null
            || tableRootLocation != null
            || fileName != null
            || modifiedDatetimeStart != null
            || modifiedDatetimeEnd != null
            || format != null
            || compression != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("folderPath", this.folderPath);
            jsonWriter.writeUntypedField("tableRootLocation", this.tableRootLocation);
            jsonWriter.writeUntypedField("fileName", this.fileName);
            jsonWriter.writeUntypedField("modifiedDatetimeStart", this.modifiedDatetimeStart);
            jsonWriter.writeUntypedField("modifiedDatetimeEnd", this.modifiedDatetimeEnd);
            jsonWriter.writeJsonField("format", this.format);
            jsonWriter.writeJsonField("compression", this.compression);
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
     * Reads an instance of AzureBlobDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureBlobDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureBlobDataset.
     */
    public static AzureBlobDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureBlobDataset deserializedAzureBlobDataset = new AzureBlobDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedAzureBlobDataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureBlobDataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedAzureBlobDataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedAzureBlobDataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureBlobDataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureBlobDataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedAzureBlobDataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedAzureBlobDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("folderPath".equals(fieldName)) {
                            deserializedAzureBlobDataset.folderPath = reader.readUntyped();
                        } else if ("tableRootLocation".equals(fieldName)) {
                            deserializedAzureBlobDataset.tableRootLocation = reader.readUntyped();
                        } else if ("fileName".equals(fieldName)) {
                            deserializedAzureBlobDataset.fileName = reader.readUntyped();
                        } else if ("modifiedDatetimeStart".equals(fieldName)) {
                            deserializedAzureBlobDataset.modifiedDatetimeStart = reader.readUntyped();
                        } else if ("modifiedDatetimeEnd".equals(fieldName)) {
                            deserializedAzureBlobDataset.modifiedDatetimeEnd = reader.readUntyped();
                        } else if ("format".equals(fieldName)) {
                            deserializedAzureBlobDataset.format = DatasetStorageFormat.fromJson(reader);
                        } else if ("compression".equals(fieldName)) {
                            deserializedAzureBlobDataset.compression = DatasetCompression.fromJson(reader);
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
            deserializedAzureBlobDataset.setAdditionalProperties(additionalProperties);

            return deserializedAzureBlobDataset;
        });
    }
}
