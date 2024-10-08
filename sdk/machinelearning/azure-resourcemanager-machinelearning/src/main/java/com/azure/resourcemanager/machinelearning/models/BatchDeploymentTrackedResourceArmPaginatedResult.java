// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.fluent.models.BatchDeploymentInner;
import java.io.IOException;
import java.util.List;

/**
 * A paginated list of BatchDeployment entities.
 */
@Fluent
public final class BatchDeploymentTrackedResourceArmPaginatedResult
    implements JsonSerializable<BatchDeploymentTrackedResourceArmPaginatedResult> {
    /*
     * An array of objects of type BatchDeployment.
     */
    private List<BatchDeploymentInner> value;

    /*
     * The link to the next page of BatchDeployment objects. If null, there are no additional pages.
     */
    private String nextLink;

    /**
     * Creates an instance of BatchDeploymentTrackedResourceArmPaginatedResult class.
     */
    public BatchDeploymentTrackedResourceArmPaginatedResult() {
    }

    /**
     * Get the value property: An array of objects of type BatchDeployment.
     * 
     * @return the value value.
     */
    public List<BatchDeploymentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of objects of type BatchDeployment.
     * 
     * @param value the value value to set.
     * @return the BatchDeploymentTrackedResourceArmPaginatedResult object itself.
     */
    public BatchDeploymentTrackedResourceArmPaginatedResult withValue(List<BatchDeploymentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of BatchDeployment objects. If null, there are no additional
     * pages.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of BatchDeployment objects. If null, there are no additional
     * pages.
     * 
     * @param nextLink the nextLink value to set.
     * @return the BatchDeploymentTrackedResourceArmPaginatedResult object itself.
     */
    public BatchDeploymentTrackedResourceArmPaginatedResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchDeploymentTrackedResourceArmPaginatedResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchDeploymentTrackedResourceArmPaginatedResult if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchDeploymentTrackedResourceArmPaginatedResult.
     */
    public static BatchDeploymentTrackedResourceArmPaginatedResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchDeploymentTrackedResourceArmPaginatedResult deserializedBatchDeploymentTrackedResourceArmPaginatedResult
                = new BatchDeploymentTrackedResourceArmPaginatedResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<BatchDeploymentInner> value
                        = reader.readArray(reader1 -> BatchDeploymentInner.fromJson(reader1));
                    deserializedBatchDeploymentTrackedResourceArmPaginatedResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedBatchDeploymentTrackedResourceArmPaginatedResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBatchDeploymentTrackedResourceArmPaginatedResult;
        });
    }
}
