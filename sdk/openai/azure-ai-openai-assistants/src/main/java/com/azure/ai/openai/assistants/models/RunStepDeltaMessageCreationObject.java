// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents the data within a streaming run step message creation response object.
 */
@Immutable
public final class RunStepDeltaMessageCreationObject implements JsonSerializable<RunStepDeltaMessageCreationObject> {

    /*
     * The ID of the newly-created message.
     */
    @Generated
    private String messageId;

    /**
     * Creates an instance of RunStepDeltaMessageCreationObject class.
     */
    @Generated
    private RunStepDeltaMessageCreationObject() {
    }

    /**
     * Get the messageId property: The ID of the newly-created message.
     *
     * @return the messageId value.
     */
    @Generated
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("message_id", this.messageId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaMessageCreationObject from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaMessageCreationObject if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunStepDeltaMessageCreationObject.
     */
    @Generated
    public static RunStepDeltaMessageCreationObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDeltaMessageCreationObject deserializedRunStepDeltaMessageCreationObject
                = new RunStepDeltaMessageCreationObject();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("message_id".equals(fieldName)) {
                    deserializedRunStepDeltaMessageCreationObject.messageId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRunStepDeltaMessageCreationObject;
        });
    }
}
