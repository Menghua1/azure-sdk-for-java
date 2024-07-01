// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Configuration of live transcription.
 */
@Fluent
public final class TranscriptionConfigurationInternal implements JsonSerializable<TranscriptionConfigurationInternal> {
    /*
     * Transport URL for live transcription
     */
    private String transportUrl;

    /*
     * The type of transport to be used for live transcription, eg. Websocket
     */
    private TranscriptionTransportTypeInternal transportType;

    /*
     * Defines the locale for the data e.g en-CA, en-AU
     */
    private String locale;

    /*
     * Determines if the transcription should be started immediately after call is answered or not.
     */
    private boolean startTranscription;

    /**
     * Creates an instance of TranscriptionConfigurationInternal class.
     */
    public TranscriptionConfigurationInternal() {
    }

    /**
     * Get the transportUrl property: Transport URL for live transcription.
     * 
     * @return the transportUrl value.
     */
    public String getTransportUrl() {
        return this.transportUrl;
    }

    /**
     * Set the transportUrl property: Transport URL for live transcription.
     * 
     * @param transportUrl the transportUrl value to set.
     * @return the TranscriptionConfigurationInternal object itself.
     */
    public TranscriptionConfigurationInternal setTransportUrl(String transportUrl) {
        this.transportUrl = transportUrl;
        return this;
    }

    /**
     * Get the transportType property: The type of transport to be used for live transcription, eg. Websocket.
     * 
     * @return the transportType value.
     */
    public TranscriptionTransportTypeInternal getTransportType() {
        return this.transportType;
    }

    /**
     * Set the transportType property: The type of transport to be used for live transcription, eg. Websocket.
     * 
     * @param transportType the transportType value to set.
     * @return the TranscriptionConfigurationInternal object itself.
     */
    public TranscriptionConfigurationInternal setTransportType(TranscriptionTransportTypeInternal transportType) {
        this.transportType = transportType;
        return this;
    }

    /**
     * Get the locale property: Defines the locale for the data e.g en-CA, en-AU.
     * 
     * @return the locale value.
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * Set the locale property: Defines the locale for the data e.g en-CA, en-AU.
     * 
     * @param locale the locale value to set.
     * @return the TranscriptionConfigurationInternal object itself.
     */
    public TranscriptionConfigurationInternal setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get the startTranscription property: Determines if the transcription should be started immediately after call is
     * answered or not.
     * 
     * @return the startTranscription value.
     */
    public boolean isStartTranscription() {
        return this.startTranscription;
    }

    /**
     * Set the startTranscription property: Determines if the transcription should be started immediately after call is
     * answered or not.
     * 
     * @param startTranscription the startTranscription value to set.
     * @return the TranscriptionConfigurationInternal object itself.
     */
    public TranscriptionConfigurationInternal setStartTranscription(boolean startTranscription) {
        this.startTranscription = startTranscription;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("transportUrl", this.transportUrl);
        jsonWriter.writeStringField("transportType", this.transportType == null ? null : this.transportType.toString());
        jsonWriter.writeStringField("locale", this.locale);
        jsonWriter.writeBooleanField("startTranscription", this.startTranscription);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TranscriptionConfigurationInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TranscriptionConfigurationInternal if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TranscriptionConfigurationInternal.
     */
    public static TranscriptionConfigurationInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TranscriptionConfigurationInternal deserializedTranscriptionConfigurationInternal
                = new TranscriptionConfigurationInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("transportUrl".equals(fieldName)) {
                    deserializedTranscriptionConfigurationInternal.transportUrl = reader.getString();
                } else if ("transportType".equals(fieldName)) {
                    deserializedTranscriptionConfigurationInternal.transportType
                        = TranscriptionTransportTypeInternal.fromString(reader.getString());
                } else if ("locale".equals(fieldName)) {
                    deserializedTranscriptionConfigurationInternal.locale = reader.getString();
                } else if ("startTranscription".equals(fieldName)) {
                    deserializedTranscriptionConfigurationInternal.startTranscription = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTranscriptionConfigurationInternal;
        });
    }
}
