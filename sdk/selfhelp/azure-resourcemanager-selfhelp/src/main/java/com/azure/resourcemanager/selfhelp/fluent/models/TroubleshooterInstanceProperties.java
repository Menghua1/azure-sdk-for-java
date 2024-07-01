// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.selfhelp.models.Step;
import com.azure.resourcemanager.selfhelp.models.TroubleshooterProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Troubleshooter Instance properties.
 */
@Fluent
public final class TroubleshooterInstanceProperties implements JsonSerializable<TroubleshooterInstanceProperties> {
    /*
     * Solution Id to identify single troubleshooter.
     */
    private String solutionId;

    /*
     * Client input parameters to run Troubleshooter Resource
     */
    private Map<String, String> parameters;

    /*
     * Status of troubleshooter provisioning.
     */
    private TroubleshooterProvisioningState provisioningState;

    /*
     * List of step object.
     */
    private List<Step> steps;

    /**
     * Creates an instance of TroubleshooterInstanceProperties class.
     */
    public TroubleshooterInstanceProperties() {
    }

    /**
     * Get the solutionId property: Solution Id to identify single troubleshooter.
     * 
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.solutionId;
    }

    /**
     * Set the solutionId property: Solution Id to identify single troubleshooter.
     * 
     * @param solutionId the solutionId value to set.
     * @return the TroubleshooterInstanceProperties object itself.
     */
    public TroubleshooterInstanceProperties withSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }

    /**
     * Get the parameters property: Client input parameters to run Troubleshooter Resource.
     * 
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Client input parameters to run Troubleshooter Resource.
     * 
     * @param parameters the parameters value to set.
     * @return the TroubleshooterInstanceProperties object itself.
     */
    public TroubleshooterInstanceProperties withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the provisioningState property: Status of troubleshooter provisioning.
     * 
     * @return the provisioningState value.
     */
    public TroubleshooterProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the steps property: List of step object.
     * 
     * @return the steps value.
     */
    public List<Step> steps() {
        return this.steps;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (steps() != null) {
            steps().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("solutionId", this.solutionId);
        jsonWriter.writeMapField("parameters", this.parameters, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TroubleshooterInstanceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TroubleshooterInstanceProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TroubleshooterInstanceProperties.
     */
    public static TroubleshooterInstanceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TroubleshooterInstanceProperties deserializedTroubleshooterInstanceProperties
                = new TroubleshooterInstanceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("solutionId".equals(fieldName)) {
                    deserializedTroubleshooterInstanceProperties.solutionId = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    Map<String, String> parameters = reader.readMap(reader1 -> reader1.getString());
                    deserializedTroubleshooterInstanceProperties.parameters = parameters;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedTroubleshooterInstanceProperties.provisioningState
                        = TroubleshooterProvisioningState.fromString(reader.getString());
                } else if ("steps".equals(fieldName)) {
                    List<Step> steps = reader.readArray(reader1 -> Step.fromJson(reader1));
                    deserializedTroubleshooterInstanceProperties.steps = steps;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTroubleshooterInstanceProperties;
        });
    }
}
