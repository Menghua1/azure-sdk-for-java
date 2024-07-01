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
import java.util.Map;

/**
 * Pipeline that needs to be triggered with the given parameters.
 */
@Fluent
public final class TriggerPipelineReference implements JsonSerializable<TriggerPipelineReference> {
    /*
     * Pipeline reference.
     */
    private PipelineReference pipelineReference;

    /*
     * Pipeline parameters.
     */
    private Map<String, Object> parameters;

    /**
     * Creates an instance of TriggerPipelineReference class.
     */
    public TriggerPipelineReference() {
    }

    /**
     * Get the pipelineReference property: Pipeline reference.
     * 
     * @return the pipelineReference value.
     */
    public PipelineReference getPipelineReference() {
        return this.pipelineReference;
    }

    /**
     * Set the pipelineReference property: Pipeline reference.
     * 
     * @param pipelineReference the pipelineReference value to set.
     * @return the TriggerPipelineReference object itself.
     */
    public TriggerPipelineReference setPipelineReference(PipelineReference pipelineReference) {
        this.pipelineReference = pipelineReference;
        return this;
    }

    /**
     * Get the parameters property: Pipeline parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Pipeline parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the TriggerPipelineReference object itself.
     */
    public TriggerPipelineReference setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("pipelineReference", this.pipelineReference);
        jsonWriter.writeMapField("parameters", this.parameters, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggerPipelineReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggerPipelineReference if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TriggerPipelineReference.
     */
    public static TriggerPipelineReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggerPipelineReference deserializedTriggerPipelineReference = new TriggerPipelineReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("pipelineReference".equals(fieldName)) {
                    deserializedTriggerPipelineReference.pipelineReference = PipelineReference.fromJson(reader);
                } else if ("parameters".equals(fieldName)) {
                    Map<String, Object> parameters = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedTriggerPipelineReference.parameters = parameters;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggerPipelineReference;
        });
    }
}
