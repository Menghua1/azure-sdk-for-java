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
import java.util.Map;

/**
 * Spark job definition.
 */
@Fluent
public final class SparkJobDefinition implements JsonSerializable<SparkJobDefinition> {
    /*
     * The description of the Spark job definition.
     */
    private String description;

    /*
     * Big data pool reference.
     */
    private BigDataPoolReference targetBigDataPool;

    /*
     * The spark configuration of the spark job.
     */
    private SparkConfigurationReference targetSparkConfiguration;

    /*
     * The required Spark version of the application.
     */
    private String requiredSparkVersion;

    /*
     * The language of the Spark application.
     */
    private String language;

    /*
     * The properties of the Spark job.
     */
    private SparkJobProperties jobProperties;

    /*
     * The folder that this Spark job definition is in. If not specified, this Spark job definition will appear at the root level.
     */
    private SparkJobDefinitionFolder folder;

    /*
     * Spark job definition.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of SparkJobDefinition class.
     */
    public SparkJobDefinition() {
    }

    /**
     * Get the description property: The description of the Spark job definition.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the Spark job definition.
     * 
     * @param description the description value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the targetBigDataPool property: Big data pool reference.
     * 
     * @return the targetBigDataPool value.
     */
    public BigDataPoolReference getTargetBigDataPool() {
        return this.targetBigDataPool;
    }

    /**
     * Set the targetBigDataPool property: Big data pool reference.
     * 
     * @param targetBigDataPool the targetBigDataPool value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setTargetBigDataPool(BigDataPoolReference targetBigDataPool) {
        this.targetBigDataPool = targetBigDataPool;
        return this;
    }

    /**
     * Get the targetSparkConfiguration property: The spark configuration of the spark job.
     * 
     * @return the targetSparkConfiguration value.
     */
    public SparkConfigurationReference getTargetSparkConfiguration() {
        return this.targetSparkConfiguration;
    }

    /**
     * Set the targetSparkConfiguration property: The spark configuration of the spark job.
     * 
     * @param targetSparkConfiguration the targetSparkConfiguration value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setTargetSparkConfiguration(SparkConfigurationReference targetSparkConfiguration) {
        this.targetSparkConfiguration = targetSparkConfiguration;
        return this;
    }

    /**
     * Get the requiredSparkVersion property: The required Spark version of the application.
     * 
     * @return the requiredSparkVersion value.
     */
    public String getRequiredSparkVersion() {
        return this.requiredSparkVersion;
    }

    /**
     * Set the requiredSparkVersion property: The required Spark version of the application.
     * 
     * @param requiredSparkVersion the requiredSparkVersion value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setRequiredSparkVersion(String requiredSparkVersion) {
        this.requiredSparkVersion = requiredSparkVersion;
        return this;
    }

    /**
     * Get the language property: The language of the Spark application.
     * 
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The language of the Spark application.
     * 
     * @param language the language value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the jobProperties property: The properties of the Spark job.
     * 
     * @return the jobProperties value.
     */
    public SparkJobProperties getJobProperties() {
        return this.jobProperties;
    }

    /**
     * Set the jobProperties property: The properties of the Spark job.
     * 
     * @param jobProperties the jobProperties value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setJobProperties(SparkJobProperties jobProperties) {
        this.jobProperties = jobProperties;
        return this;
    }

    /**
     * Get the folder property: The folder that this Spark job definition is in. If not specified, this Spark job
     * definition will appear at the root level.
     * 
     * @return the folder value.
     */
    public SparkJobDefinitionFolder getFolder() {
        return this.folder;
    }

    /**
     * Set the folder property: The folder that this Spark job definition is in. If not specified, this Spark job
     * definition will appear at the root level.
     * 
     * @param folder the folder value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setFolder(SparkJobDefinitionFolder folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Get the additionalProperties property: Spark job definition.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Spark job definition.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("targetBigDataPool", this.targetBigDataPool);
        jsonWriter.writeJsonField("jobProperties", this.jobProperties);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeJsonField("targetSparkConfiguration", this.targetSparkConfiguration);
        jsonWriter.writeStringField("requiredSparkVersion", this.requiredSparkVersion);
        jsonWriter.writeStringField("language", this.language);
        jsonWriter.writeJsonField("folder", this.folder);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SparkJobDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SparkJobDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SparkJobDefinition.
     */
    public static SparkJobDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SparkJobDefinition deserializedSparkJobDefinition = new SparkJobDefinition();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetBigDataPool".equals(fieldName)) {
                    deserializedSparkJobDefinition.targetBigDataPool = BigDataPoolReference.fromJson(reader);
                } else if ("jobProperties".equals(fieldName)) {
                    deserializedSparkJobDefinition.jobProperties = SparkJobProperties.fromJson(reader);
                } else if ("description".equals(fieldName)) {
                    deserializedSparkJobDefinition.description = reader.getString();
                } else if ("targetSparkConfiguration".equals(fieldName)) {
                    deserializedSparkJobDefinition.targetSparkConfiguration
                        = SparkConfigurationReference.fromJson(reader);
                } else if ("requiredSparkVersion".equals(fieldName)) {
                    deserializedSparkJobDefinition.requiredSparkVersion = reader.getString();
                } else if ("language".equals(fieldName)) {
                    deserializedSparkJobDefinition.language = reader.getString();
                } else if ("folder".equals(fieldName)) {
                    deserializedSparkJobDefinition.folder = SparkJobDefinitionFolder.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSparkJobDefinition.additionalProperties = additionalProperties;

            return deserializedSparkJobDefinition;
        });
    }
}
