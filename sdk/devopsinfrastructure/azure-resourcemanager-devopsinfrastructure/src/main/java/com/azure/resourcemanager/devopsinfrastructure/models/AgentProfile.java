// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The agent profile of the machines in the pool.
 */
@Fluent
public class AgentProfile implements JsonSerializable<AgentProfile> {
    /*
     * Discriminator property for AgentProfile.
     */
    private String kind = "AgentProfile";

    /*
     * Defines pool buffer/stand-by agents.
     */
    private Object resourcePredictions;

    /*
     * Defines how the pool buffer/stand-by agents is provided.
     */
    private ResourcePredictionsProfile resourcePredictionsProfile;

    /**
     * Creates an instance of AgentProfile class.
     */
    public AgentProfile() {
    }

    /**
     * Get the kind property: Discriminator property for AgentProfile.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the resourcePredictions property: Defines pool buffer/stand-by agents.
     * 
     * @return the resourcePredictions value.
     */
    public Object resourcePredictions() {
        return this.resourcePredictions;
    }

    /**
     * Set the resourcePredictions property: Defines pool buffer/stand-by agents.
     * 
     * @param resourcePredictions the resourcePredictions value to set.
     * @return the AgentProfile object itself.
     */
    public AgentProfile withResourcePredictions(Object resourcePredictions) {
        this.resourcePredictions = resourcePredictions;
        return this;
    }

    /**
     * Get the resourcePredictionsProfile property: Defines how the pool buffer/stand-by agents is provided.
     * 
     * @return the resourcePredictionsProfile value.
     */
    public ResourcePredictionsProfile resourcePredictionsProfile() {
        return this.resourcePredictionsProfile;
    }

    /**
     * Set the resourcePredictionsProfile property: Defines how the pool buffer/stand-by agents is provided.
     * 
     * @param resourcePredictionsProfile the resourcePredictionsProfile value to set.
     * @return the AgentProfile object itself.
     */
    public AgentProfile withResourcePredictionsProfile(ResourcePredictionsProfile resourcePredictionsProfile) {
        this.resourcePredictionsProfile = resourcePredictionsProfile;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourcePredictionsProfile() != null) {
            resourcePredictionsProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeUntypedField("resourcePredictions", this.resourcePredictions);
        jsonWriter.writeJsonField("resourcePredictionsProfile", this.resourcePredictionsProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AgentProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AgentProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AgentProfile.
     */
    public static AgentProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Stateless".equals(discriminatorValue)) {
                    return StatelessAgentProfile.fromJson(readerToUse.reset());
                } else if ("Stateful".equals(discriminatorValue)) {
                    return Stateful.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static AgentProfile fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AgentProfile deserializedAgentProfile = new AgentProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedAgentProfile.kind = reader.getString();
                } else if ("resourcePredictions".equals(fieldName)) {
                    deserializedAgentProfile.resourcePredictions = reader.readUntyped();
                } else if ("resourcePredictionsProfile".equals(fieldName)) {
                    deserializedAgentProfile.resourcePredictionsProfile = ResourcePredictionsProfile.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAgentProfile;
        });
    }
}
