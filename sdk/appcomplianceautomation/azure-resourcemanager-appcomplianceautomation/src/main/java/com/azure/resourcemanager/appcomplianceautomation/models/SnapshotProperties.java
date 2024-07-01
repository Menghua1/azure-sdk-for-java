// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SystemData;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Snapshot's properties.
 */
@Immutable
public final class SnapshotProperties implements JsonSerializable<SnapshotProperties> {
    /*
     * Snapshot name.
     */
    private String snapshotName;

    /*
     * The timestamp of resource creation (UTC).
     */
    private OffsetDateTime createdAt;

    /*
     * Azure lifecycle management
     */
    private ProvisioningState provisioningState;

    /*
     * The report essential info.
     */
    private ReportProperties reportProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData reportSystemData;

    /*
     * List of compliance results.
     */
    private List<ComplianceResult> complianceResults;

    /**
     * Creates an instance of SnapshotProperties class.
     */
    public SnapshotProperties() {
    }

    /**
     * Get the snapshotName property: Snapshot name.
     * 
     * @return the snapshotName value.
     */
    public String snapshotName() {
        return this.snapshotName;
    }

    /**
     * Get the createdAt property: The timestamp of resource creation (UTC).
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the reportProperties property: The report essential info.
     * 
     * @return the reportProperties value.
     */
    public ReportProperties reportProperties() {
        return this.reportProperties;
    }

    /**
     * Get the reportSystemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the reportSystemData value.
     */
    public SystemData reportSystemData() {
        return this.reportSystemData;
    }

    /**
     * Get the complianceResults property: List of compliance results.
     * 
     * @return the complianceResults value.
     */
    public List<ComplianceResult> complianceResults() {
        return this.complianceResults;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (reportProperties() != null) {
            reportProperties().validate();
        }
        if (complianceResults() != null) {
            complianceResults().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SnapshotProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SnapshotProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SnapshotProperties.
     */
    public static SnapshotProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SnapshotProperties deserializedSnapshotProperties = new SnapshotProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("snapshotName".equals(fieldName)) {
                    deserializedSnapshotProperties.snapshotName = reader.getString();
                } else if ("createdAt".equals(fieldName)) {
                    deserializedSnapshotProperties.createdAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSnapshotProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("reportProperties".equals(fieldName)) {
                    deserializedSnapshotProperties.reportProperties = ReportProperties.fromJson(reader);
                } else if ("reportSystemData".equals(fieldName)) {
                    deserializedSnapshotProperties.reportSystemData = SystemData.fromJson(reader);
                } else if ("complianceResults".equals(fieldName)) {
                    List<ComplianceResult> complianceResults
                        = reader.readArray(reader1 -> ComplianceResult.fromJson(reader1));
                    deserializedSnapshotProperties.complianceResults = complianceResults;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSnapshotProperties;
        });
    }
}
