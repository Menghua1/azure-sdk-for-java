// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Output of check name availability API.
 */
@Immutable
public final class CheckNameAvailabilityOutput implements JsonSerializable<CheckNameAvailabilityOutput> {
    /*
     * A value indicating whether the name is available.
     */
    private Boolean isNameAvailable;

    /*
     * The reason why the name is not available. 'Invalid' indicates the name provided does not match the naming
     * requirements (incorrect length, unsupported characters, etc.). 'AlreadyExists' indicates that the name is already
     * in use and is therefore unavailable.
     */
    private UnavailableNameReason reason;

    /*
     * A message that explains why the name is invalid and provides resource naming requirements. Available only if
     * 'Invalid' is returned in the 'reason' property.
     */
    private String message;

    /**
     * Creates an instance of CheckNameAvailabilityOutput class.
     */
    public CheckNameAvailabilityOutput() {
    }

    /**
     * Get the isNameAvailable property: A value indicating whether the name is available.
     * 
     * @return the isNameAvailable value.
     */
    public Boolean isNameAvailable() {
        return this.isNameAvailable;
    }

    /**
     * Get the reason property: The reason why the name is not available. 'Invalid' indicates the name provided does not
     * match the naming requirements (incorrect length, unsupported characters, etc.). 'AlreadyExists' indicates that
     * the name is already in use and is therefore unavailable.
     * 
     * @return the reason value.
     */
    public UnavailableNameReason reason() {
        return this.reason;
    }

    /**
     * Get the message property: A message that explains why the name is invalid and provides resource naming
     * requirements. Available only if 'Invalid' is returned in the 'reason' property.
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
     * Reads an instance of CheckNameAvailabilityOutput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckNameAvailabilityOutput if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CheckNameAvailabilityOutput.
     */
    public static CheckNameAvailabilityOutput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckNameAvailabilityOutput deserializedCheckNameAvailabilityOutput = new CheckNameAvailabilityOutput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nameAvailable".equals(fieldName)) {
                    deserializedCheckNameAvailabilityOutput.isNameAvailable
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedCheckNameAvailabilityOutput.reason
                        = UnavailableNameReason.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedCheckNameAvailabilityOutput.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckNameAvailabilityOutput;
        });
    }
}
