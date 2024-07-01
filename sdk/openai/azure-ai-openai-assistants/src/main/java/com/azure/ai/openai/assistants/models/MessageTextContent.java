// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A representation of a textual item of thread message content.
 */
@Immutable
public final class MessageTextContent extends MessageContent {

    /*
     * The text and associated annotations for this thread message content item.
     */
    @Generated
    private final MessageTextDetails text;

    /**
     * Creates an instance of MessageTextContent class.
     *
     * @param text the text value to set.
     */
    @Generated
    public MessageTextContent(MessageTextDetails text) {
        this.text = text;
    }

    /**
     * Get the text property: The text and associated annotations for this thread message content item.
     *
     * @return the text value.
     */
    @Generated
    public MessageTextDetails getText() {
        return this.text;
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "text";

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("text", this.text);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageTextContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageTextContent if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageTextContent.
     */
    @Generated
    public static MessageTextContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MessageTextDetails text = null;
            String type = "text";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("text".equals(fieldName)) {
                    text = MessageTextDetails.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            MessageTextContent deserializedMessageTextContent = new MessageTextContent(text);
            deserializedMessageTextContent.type = type;
            return deserializedMessageTextContent;
        });
    }
}
