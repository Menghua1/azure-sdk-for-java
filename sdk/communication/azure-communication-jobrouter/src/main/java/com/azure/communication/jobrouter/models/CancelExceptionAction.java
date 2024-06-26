// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * An action that marks a job as cancelled.
 */
@Fluent
public final class CancelExceptionAction extends ExceptionAction {

    /*
     * The type discriminator describing a sub-type of ExceptionAction.
     */
    @Generated
    private ExceptionActionKind kind = ExceptionActionKind.CANCEL;

    /*
     * A note that will be appended to a job's notes collection with the current timestamp.
     */
    @Generated
    private String note;

    /*
     * Indicates the outcome of a job, populate this field with your own custom values.
     */
    @Generated
    private String dispositionCode;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of CancelExceptionAction class.
     */
    @Generated
    public CancelExceptionAction() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of ExceptionAction.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public ExceptionActionKind getKind() {
        return this.kind;
    }

    /**
     * Get the note property: A note that will be appended to a job's notes collection with the current timestamp.
     *
     * @return the note value.
     */
    @Generated
    public String getNote() {
        return this.note;
    }

    /**
     * Set the note property: A note that will be appended to a job's notes collection with the current timestamp.
     *
     * @param note the note value to set.
     * @return the CancelExceptionAction object itself.
     */
    @Generated
    public CancelExceptionAction setNote(String note) {
        this.note = note;
        this.updatedProperties.add("note");
        return this;
    }

    /**
     * Get the dispositionCode property: Indicates the outcome of a job, populate this field with your own custom
     * values.
     *
     * @return the dispositionCode value.
     */
    @Generated
    public String getDispositionCode() {
        return this.dispositionCode;
    }

    /**
     * Set the dispositionCode property: Indicates the outcome of a job, populate this field with your own custom
     * values.
     *
     * @param dispositionCode the dispositionCode value to set.
     * @return the CancelExceptionAction object itself.
     */
    @Generated
    public CancelExceptionAction setDispositionCode(String dispositionCode) {
        this.dispositionCode = dispositionCode;
        this.updatedProperties.add("dispositionCode");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public CancelExceptionAction setId(String id) {
        super.setId(id);
        this.updatedProperties.add("id");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getExceptionActionAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("id", getId());
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeStringField("note", this.note);
            jsonWriter.writeStringField("dispositionCode", this.dispositionCode);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("id")) {
            if (getId() == null) {
                jsonWriter.writeNullField("id");
            } else {
                jsonWriter.writeStringField("id", getId());
            }
        }
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("note")) {
            if (this.note == null) {
                jsonWriter.writeNullField("note");
            } else {
                jsonWriter.writeStringField("note", this.note);
            }
        }
        if (updatedProperties.contains("dispositionCode")) {
            if (this.dispositionCode == null) {
                jsonWriter.writeNullField("dispositionCode");
            } else {
                jsonWriter.writeStringField("dispositionCode", this.dispositionCode);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CancelExceptionAction from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CancelExceptionAction if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CancelExceptionAction.
     */
    @Generated
    public static CancelExceptionAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CancelExceptionAction deserializedCancelExceptionAction = new CancelExceptionAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    JsonMergePatchHelper.getExceptionActionAccessor()
                        .setId(deserializedCancelExceptionAction, reader.getString());
                } else if ("kind".equals(fieldName)) {
                    deserializedCancelExceptionAction.kind = ExceptionActionKind.fromString(reader.getString());
                } else if ("note".equals(fieldName)) {
                    deserializedCancelExceptionAction.note = reader.getString();
                } else if ("dispositionCode".equals(fieldName)) {
                    deserializedCancelExceptionAction.dispositionCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedCancelExceptionAction;
        });
    }
}
