// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The error detail.
 */
@Immutable
public final class ErrorDetail implements JsonSerializable<ErrorDetail> {
    /*
     * The error code.
     */
    private String code;

    /*
     * The error message.
     */
    private String message;

    /*
     * The error target.
     */
    private String target;

    /*
     * The error details.
     */
    private List<ErrorDetail> details;

    /*
     * The error additional info.
     */
    private List<ErrorAdditionalInfo> additionalInfo;

    /**
     * Creates an instance of ErrorDetail class.
     */
    public ErrorDetail() {
    }

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: The error message.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: The error target.
     * 
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details property: The error details.
     * 
     * @return the details value.
     */
    public List<ErrorDetail> getDetails() {
        return this.details;
    }

    /**
     * Get the additionalInfo property: The error additional info.
     * 
     * @return the additionalInfo value.
     */
    public List<ErrorAdditionalInfo> getAdditionalInfo() {
        return this.additionalInfo;
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
     * Reads an instance of ErrorDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ErrorDetail.
     */
    public static ErrorDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ErrorDetail deserializedErrorDetail = new ErrorDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedErrorDetail.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedErrorDetail.message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedErrorDetail.target = reader.getString();
                } else if ("details".equals(fieldName)) {
                    List<ErrorDetail> details = reader.readArray(reader1 -> ErrorDetail.fromJson(reader1));
                    deserializedErrorDetail.details = details;
                } else if ("additionalInfo".equals(fieldName)) {
                    List<ErrorAdditionalInfo> additionalInfo
                        = reader.readArray(reader1 -> ErrorAdditionalInfo.fromJson(reader1));
                    deserializedErrorDetail.additionalInfo = additionalInfo;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedErrorDetail;
        });
    }
}
