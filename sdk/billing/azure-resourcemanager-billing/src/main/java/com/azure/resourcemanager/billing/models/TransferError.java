// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Error details for transfer execution.
 */
@Immutable
public final class TransferError implements JsonSerializable<TransferError> {
    /*
     * Error code.
     */
    private String code;

    /*
     * Error message.
     */
    private String message;

    /**
     * Creates an instance of TransferError class.
     */
    public TransferError() {
    }

    /**
     * Get the code property: Error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: Error message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TransferError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TransferError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TransferError.
     */
    public static TransferError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TransferError deserializedTransferError = new TransferError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedTransferError.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedTransferError.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTransferError;
        });
    }
}
