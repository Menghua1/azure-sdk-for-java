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
 * The Salesforce Service Cloud V2 object dataset.
 */
@Fluent
public class SalesforceServiceCloudV2ObjectDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "SalesforceServiceCloudV2Object";

    /*
     * The Salesforce Service Cloud V2 object API name. Type: string (or Expression with resultType string).
     */
    private Object objectApiName;

    /*
     * The Salesforce Service Cloud V2 reportId. Type: string (or Expression with resultType string).
     */
    private Object reportId;

    /**
     * Creates an instance of SalesforceServiceCloudV2ObjectDataset class.
     */
    public SalesforceServiceCloudV2ObjectDataset() {
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
     * Get the objectApiName property: The Salesforce Service Cloud V2 object API name. Type: string (or Expression with
     * resultType string).
     * 
     * @return the objectApiName value.
     */
    public Object getObjectApiName() {
        return this.objectApiName;
    }

    /**
     * Set the objectApiName property: The Salesforce Service Cloud V2 object API name. Type: string (or Expression with
     * resultType string).
     * 
     * @param objectApiName the objectApiName value to set.
     * @return the SalesforceServiceCloudV2ObjectDataset object itself.
     */
    public SalesforceServiceCloudV2ObjectDataset setObjectApiName(Object objectApiName) {
        this.objectApiName = objectApiName;
        return this;
    }

    /**
     * Get the reportId property: The Salesforce Service Cloud V2 reportId. Type: string (or Expression with resultType
     * string).
     * 
     * @return the reportId value.
     */
    public Object getReportId() {
        return this.reportId;
    }

    /**
     * Set the reportId property: The Salesforce Service Cloud V2 reportId. Type: string (or Expression with resultType
     * string).
     * 
     * @param reportId the reportId value to set.
     * @return the SalesforceServiceCloudV2ObjectDataset object itself.
     */
    public SalesforceServiceCloudV2ObjectDataset setReportId(Object reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset setFolder(DatasetFolder folder) {
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
        if (objectApiName != null || reportId != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("objectApiName", this.objectApiName);
            jsonWriter.writeUntypedField("reportId", this.reportId);
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
     * Reads an instance of SalesforceServiceCloudV2ObjectDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SalesforceServiceCloudV2ObjectDataset if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SalesforceServiceCloudV2ObjectDataset.
     */
    public static SalesforceServiceCloudV2ObjectDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SalesforceServiceCloudV2ObjectDataset deserializedSalesforceServiceCloudV2ObjectDataset
                = new SalesforceServiceCloudV2ObjectDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset
                        .setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedSalesforceServiceCloudV2ObjectDataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedSalesforceServiceCloudV2ObjectDataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("objectApiName".equals(fieldName)) {
                            deserializedSalesforceServiceCloudV2ObjectDataset.objectApiName = reader.readUntyped();
                        } else if ("reportId".equals(fieldName)) {
                            deserializedSalesforceServiceCloudV2ObjectDataset.reportId = reader.readUntyped();
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
            deserializedSalesforceServiceCloudV2ObjectDataset.setAdditionalProperties(additionalProperties);

            return deserializedSalesforceServiceCloudV2ObjectDataset;
        });
    }
}
