// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Defines an Aml Instance DataMount.
 */
@Fluent
public final class ComputeInstanceDataMount implements JsonSerializable<ComputeInstanceDataMount> {
    /*
     * Source of the ComputeInstance data mount.
     */
    private String source;

    /*
     * Data source type.
     */
    private SourceType sourceType;

    /*
     * name of the ComputeInstance data mount.
     */
    private String mountName;

    /*
     * Mount Action.
     */
    private MountAction mountAction;

    /*
     * who this data mount created by.
     */
    private String createdBy;

    /*
     * Path of this data mount.
     */
    private String mountPath;

    /*
     * Mount state.
     */
    private MountState mountState;

    /*
     * The time when the disk mounted.
     */
    private OffsetDateTime mountedOn;

    /*
     * Error of this data mount.
     */
    private String error;

    /**
     * Creates an instance of ComputeInstanceDataMount class.
     */
    public ComputeInstanceDataMount() {
    }

    /**
     * Get the source property: Source of the ComputeInstance data mount.
     * 
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Source of the ComputeInstance data mount.
     * 
     * @param source the source value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sourceType property: Data source type.
     * 
     * @return the sourceType value.
     */
    public SourceType sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: Data source type.
     * 
     * @param sourceType the sourceType value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the mountName property: name of the ComputeInstance data mount.
     * 
     * @return the mountName value.
     */
    public String mountName() {
        return this.mountName;
    }

    /**
     * Set the mountName property: name of the ComputeInstance data mount.
     * 
     * @param mountName the mountName value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withMountName(String mountName) {
        this.mountName = mountName;
        return this;
    }

    /**
     * Get the mountAction property: Mount Action.
     * 
     * @return the mountAction value.
     */
    public MountAction mountAction() {
        return this.mountAction;
    }

    /**
     * Set the mountAction property: Mount Action.
     * 
     * @param mountAction the mountAction value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withMountAction(MountAction mountAction) {
        this.mountAction = mountAction;
        return this;
    }

    /**
     * Get the createdBy property: who this data mount created by.
     * 
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: who this data mount created by.
     * 
     * @param createdBy the createdBy value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the mountPath property: Path of this data mount.
     * 
     * @return the mountPath value.
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set the mountPath property: Path of this data mount.
     * 
     * @param mountPath the mountPath value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * Get the mountState property: Mount state.
     * 
     * @return the mountState value.
     */
    public MountState mountState() {
        return this.mountState;
    }

    /**
     * Set the mountState property: Mount state.
     * 
     * @param mountState the mountState value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withMountState(MountState mountState) {
        this.mountState = mountState;
        return this;
    }

    /**
     * Get the mountedOn property: The time when the disk mounted.
     * 
     * @return the mountedOn value.
     */
    public OffsetDateTime mountedOn() {
        return this.mountedOn;
    }

    /**
     * Set the mountedOn property: The time when the disk mounted.
     * 
     * @param mountedOn the mountedOn value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withMountedOn(OffsetDateTime mountedOn) {
        this.mountedOn = mountedOn;
        return this;
    }

    /**
     * Get the error property: Error of this data mount.
     * 
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: Error of this data mount.
     * 
     * @param error the error value to set.
     * @return the ComputeInstanceDataMount object itself.
     */
    public ComputeInstanceDataMount withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("source", this.source);
        jsonWriter.writeStringField("sourceType", this.sourceType == null ? null : this.sourceType.toString());
        jsonWriter.writeStringField("mountName", this.mountName);
        jsonWriter.writeStringField("mountAction", this.mountAction == null ? null : this.mountAction.toString());
        jsonWriter.writeStringField("createdBy", this.createdBy);
        jsonWriter.writeStringField("mountPath", this.mountPath);
        jsonWriter.writeStringField("mountState", this.mountState == null ? null : this.mountState.toString());
        jsonWriter.writeStringField("mountedOn",
            this.mountedOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.mountedOn));
        jsonWriter.writeStringField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeInstanceDataMount from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeInstanceDataMount if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ComputeInstanceDataMount.
     */
    public static ComputeInstanceDataMount fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeInstanceDataMount deserializedComputeInstanceDataMount = new ComputeInstanceDataMount();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("source".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.source = reader.getString();
                } else if ("sourceType".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.sourceType = SourceType.fromString(reader.getString());
                } else if ("mountName".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.mountName = reader.getString();
                } else if ("mountAction".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.mountAction = MountAction.fromString(reader.getString());
                } else if ("createdBy".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.createdBy = reader.getString();
                } else if ("mountPath".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.mountPath = reader.getString();
                } else if ("mountState".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.mountState = MountState.fromString(reader.getString());
                } else if ("mountedOn".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.mountedOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("error".equals(fieldName)) {
                    deserializedComputeInstanceDataMount.error = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeInstanceDataMount;
        });
    }
}
