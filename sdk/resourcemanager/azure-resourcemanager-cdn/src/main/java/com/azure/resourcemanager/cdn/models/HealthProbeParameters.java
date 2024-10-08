// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The JSON object that contains the properties to send health probes to origin.
 */
@Fluent
public final class HealthProbeParameters implements JsonSerializable<HealthProbeParameters> {
    /*
     * The path relative to the origin that is used to determine the health of the origin.
     */
    private String probePath;

    /*
     * The type of health probe request that is made.
     */
    private HealthProbeRequestType probeRequestType;

    /*
     * Protocol to use for health probe.
     */
    private ProbeProtocol probeProtocol;

    /*
     * The number of seconds between health probes.Default is 240sec.
     */
    private Integer probeIntervalInSeconds;

    /**
     * Creates an instance of HealthProbeParameters class.
     */
    public HealthProbeParameters() {
    }

    /**
     * Get the probePath property: The path relative to the origin that is used to determine the health of the origin.
     * 
     * @return the probePath value.
     */
    public String probePath() {
        return this.probePath;
    }

    /**
     * Set the probePath property: The path relative to the origin that is used to determine the health of the origin.
     * 
     * @param probePath the probePath value to set.
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbePath(String probePath) {
        this.probePath = probePath;
        return this;
    }

    /**
     * Get the probeRequestType property: The type of health probe request that is made.
     * 
     * @return the probeRequestType value.
     */
    public HealthProbeRequestType probeRequestType() {
        return this.probeRequestType;
    }

    /**
     * Set the probeRequestType property: The type of health probe request that is made.
     * 
     * @param probeRequestType the probeRequestType value to set.
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeRequestType(HealthProbeRequestType probeRequestType) {
        this.probeRequestType = probeRequestType;
        return this;
    }

    /**
     * Get the probeProtocol property: Protocol to use for health probe.
     * 
     * @return the probeProtocol value.
     */
    public ProbeProtocol probeProtocol() {
        return this.probeProtocol;
    }

    /**
     * Set the probeProtocol property: Protocol to use for health probe.
     * 
     * @param probeProtocol the probeProtocol value to set.
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeProtocol(ProbeProtocol probeProtocol) {
        this.probeProtocol = probeProtocol;
        return this;
    }

    /**
     * Get the probeIntervalInSeconds property: The number of seconds between health probes.Default is 240sec.
     * 
     * @return the probeIntervalInSeconds value.
     */
    public Integer probeIntervalInSeconds() {
        return this.probeIntervalInSeconds;
    }

    /**
     * Set the probeIntervalInSeconds property: The number of seconds between health probes.Default is 240sec.
     * 
     * @param probeIntervalInSeconds the probeIntervalInSeconds value to set.
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeIntervalInSeconds(Integer probeIntervalInSeconds) {
        this.probeIntervalInSeconds = probeIntervalInSeconds;
        return this;
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
        jsonWriter.writeStringField("probePath", this.probePath);
        jsonWriter.writeStringField("probeRequestType",
            this.probeRequestType == null ? null : this.probeRequestType.toString());
        jsonWriter.writeStringField("probeProtocol", this.probeProtocol == null ? null : this.probeProtocol.toString());
        jsonWriter.writeNumberField("probeIntervalInSeconds", this.probeIntervalInSeconds);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HealthProbeParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HealthProbeParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HealthProbeParameters.
     */
    public static HealthProbeParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HealthProbeParameters deserializedHealthProbeParameters = new HealthProbeParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("probePath".equals(fieldName)) {
                    deserializedHealthProbeParameters.probePath = reader.getString();
                } else if ("probeRequestType".equals(fieldName)) {
                    deserializedHealthProbeParameters.probeRequestType
                        = HealthProbeRequestType.fromString(reader.getString());
                } else if ("probeProtocol".equals(fieldName)) {
                    deserializedHealthProbeParameters.probeProtocol = ProbeProtocol.fromString(reader.getString());
                } else if ("probeIntervalInSeconds".equals(fieldName)) {
                    deserializedHealthProbeParameters.probeIntervalInSeconds = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHealthProbeParameters;
        });
    }
}
