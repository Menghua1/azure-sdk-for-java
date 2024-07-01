// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Azure Synapse nested object which contains information about creating pipeline run.
 */
@Fluent
public class Trigger implements JsonSerializable<Trigger> {
    /*
     * Trigger type.
     */
    private String type;

    /*
     * Trigger description.
     */
    private String description;

    /*
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     */
    private TriggerRuntimeState runtimeState;

    /*
     * List of tags that can be used for describing the trigger.
     */
    private List<Object> annotations;

    /*
     * Azure Synapse nested object which contains information about creating pipeline run
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of Trigger class.
     */
    public Trigger() {
        this.type = "Trigger";
    }

    /**
     * Get the type property: Trigger type.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the description property: Trigger description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Trigger description.
     * 
     * @param description the description value to set.
     * @return the Trigger object itself.
     */
    public Trigger setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the runtimeState property: Indicates if trigger is running or not. Updated when Start/Stop APIs are called on
     * the Trigger.
     * 
     * @return the runtimeState value.
     */
    public TriggerRuntimeState getRuntimeState() {
        return this.runtimeState;
    }

    /**
     * Set the runtimeState property: Indicates if trigger is running or not. Updated when Start/Stop APIs are called on
     * the Trigger.
     * 
     * @param runtimeState the runtimeState value to set.
     * @return the Trigger object itself.
     */
    Trigger setRuntimeState(TriggerRuntimeState runtimeState) {
        this.runtimeState = runtimeState;
        return this;
    }

    /**
     * Get the annotations property: List of tags that can be used for describing the trigger.
     * 
     * @return the annotations value.
     */
    public List<Object> getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: List of tags that can be used for describing the trigger.
     * 
     * @param annotations the annotations value to set.
     * @return the Trigger object itself.
     */
    public Trigger setAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the additionalProperties property: Azure Synapse nested object which contains information about creating
     * pipeline run.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Azure Synapse nested object which contains information about creating
     * pipeline run.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the Trigger object itself.
     */
    public Trigger setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("annotations", this.annotations, (writer, element) -> writer.writeUntyped(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Trigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Trigger if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Trigger.
     */
    public static Trigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("RerunTumblingWindowTrigger".equals(discriminatorValue)) {
                    return RerunTumblingWindowTrigger.fromJson(readerToUse.reset());
                } else if ("MultiplePipelineTrigger".equals(discriminatorValue)) {
                    return MultiplePipelineTrigger.fromJsonKnownDiscriminator(readerToUse.reset());
                } else if ("ScheduleTrigger".equals(discriminatorValue)) {
                    return ScheduleTrigger.fromJson(readerToUse.reset());
                } else if ("BlobTrigger".equals(discriminatorValue)) {
                    return BlobTrigger.fromJson(readerToUse.reset());
                } else if ("BlobEventsTrigger".equals(discriminatorValue)) {
                    return BlobEventsTrigger.fromJson(readerToUse.reset());
                } else if ("CustomEventsTrigger".equals(discriminatorValue)) {
                    return CustomEventsTrigger.fromJson(readerToUse.reset());
                } else if ("TumblingWindowTrigger".equals(discriminatorValue)) {
                    return TumblingWindowTrigger.fromJson(readerToUse.reset());
                } else if ("ChainingTrigger".equals(discriminatorValue)) {
                    return ChainingTrigger.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static Trigger fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Trigger deserializedTrigger = new Trigger();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedTrigger.type = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedTrigger.description = reader.getString();
                } else if ("runtimeState".equals(fieldName)) {
                    deserializedTrigger.runtimeState = TriggerRuntimeState.fromString(reader.getString());
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedTrigger.annotations = annotations;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedTrigger.additionalProperties = additionalProperties;

            return deserializedTrigger;
        });
    }
}
