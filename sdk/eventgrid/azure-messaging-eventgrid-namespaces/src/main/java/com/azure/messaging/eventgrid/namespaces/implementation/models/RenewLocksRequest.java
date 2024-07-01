// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.namespaces.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The RenewLocksRequest model.
 */
@Immutable
public final class RenewLocksRequest implements JsonSerializable<RenewLocksRequest> {

    /*
     * Array of lock tokens.
     */
    @Generated
    private final List<String> lockTokens;

    /**
     * Creates an instance of RenewLocksRequest class.
     *
     * @param lockTokens the lockTokens value to set.
     */
    @Generated
    public RenewLocksRequest(List<String> lockTokens) {
        this.lockTokens = lockTokens;
    }

    /**
     * Get the lockTokens property: Array of lock tokens.
     *
     * @return the lockTokens value.
     */
    @Generated
    public List<String> getLockTokens() {
        return this.lockTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("lockTokens", this.lockTokens, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RenewLocksRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RenewLocksRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RenewLocksRequest.
     */
    @Generated
    public static RenewLocksRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> lockTokens = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("lockTokens".equals(fieldName)) {
                    lockTokens = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new RenewLocksRequest(lockTokens);
        });
    }
}
