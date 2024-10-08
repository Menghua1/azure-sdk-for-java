// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.HealthProbeParameters;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import com.azure.resourcemanager.cdn.models.ResponseBasedOriginErrorDetectionParameters;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the origin group created on the CDN endpoint.
 */
@Fluent
public final class DeepCreatedOriginGroupProperties implements JsonSerializable<DeepCreatedOriginGroupProperties> {
    /*
     * Health probe settings to the origin that is used to determine the health of the origin.
     */
    private HealthProbeParameters healthProbeSettings;

    /*
     * The source of the content being delivered via CDN within given origin group.
     */
    private List<ResourceReference> origins;

    /*
     * Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new
     * endpoint is added. Default is 10 mins. This property is currently not supported.
     */
    private Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    /*
     * The JSON object that contains the properties to determine origin health using real requests/responses.This
     * property is currently not supported.
     */
    private ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings;

    /**
     * Creates an instance of DeepCreatedOriginGroupProperties class.
     */
    public DeepCreatedOriginGroupProperties() {
    }

    /**
     * Get the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     * 
     * @return the healthProbeSettings value.
     */
    public HealthProbeParameters healthProbeSettings() {
        return this.healthProbeSettings;
    }

    /**
     * Set the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     * 
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the DeepCreatedOriginGroupProperties object itself.
     */
    public DeepCreatedOriginGroupProperties withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        this.healthProbeSettings = healthProbeSettings;
        return this;
    }

    /**
     * Get the origins property: The source of the content being delivered via CDN within given origin group.
     * 
     * @return the origins value.
     */
    public List<ResourceReference> origins() {
        return this.origins;
    }

    /**
     * Set the origins property: The source of the content being delivered via CDN within given origin group.
     * 
     * @param origins the origins value to set.
     * @return the DeepCreatedOriginGroupProperties object itself.
     */
    public DeepCreatedOriginGroupProperties withOrigins(List<ResourceReference> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     * 
     * @return the trafficRestorationTimeToHealedOrNewEndpointsInMinutes value.
     */
    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    /**
     * Set the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     * 
     * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes the
     * trafficRestorationTimeToHealedOrNewEndpointsInMinutes value to set.
     * @return the DeepCreatedOriginGroupProperties object itself.
     */
    public DeepCreatedOriginGroupProperties withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes
            = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        return this;
    }

    /**
     * Get the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses.This property is currently not supported.
     * 
     * @return the responseBasedOriginErrorDetectionSettings value.
     */
    public ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings() {
        return this.responseBasedOriginErrorDetectionSettings;
    }

    /**
     * Set the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses.This property is currently not supported.
     * 
     * @param responseBasedOriginErrorDetectionSettings the responseBasedOriginErrorDetectionSettings value to set.
     * @return the DeepCreatedOriginGroupProperties object itself.
     */
    public DeepCreatedOriginGroupProperties withResponseBasedOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (healthProbeSettings() != null) {
            healthProbeSettings().validate();
        }
        if (origins() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property origins in model DeepCreatedOriginGroupProperties"));
        } else {
            origins().forEach(e -> e.validate());
        }
        if (responseBasedOriginErrorDetectionSettings() != null) {
            responseBasedOriginErrorDetectionSettings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeepCreatedOriginGroupProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("origins", this.origins, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("healthProbeSettings", this.healthProbeSettings);
        jsonWriter.writeNumberField("trafficRestorationTimeToHealedOrNewEndpointsInMinutes",
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        jsonWriter.writeJsonField("responseBasedOriginErrorDetectionSettings",
            this.responseBasedOriginErrorDetectionSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeepCreatedOriginGroupProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeepCreatedOriginGroupProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeepCreatedOriginGroupProperties.
     */
    public static DeepCreatedOriginGroupProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeepCreatedOriginGroupProperties deserializedDeepCreatedOriginGroupProperties
                = new DeepCreatedOriginGroupProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("origins".equals(fieldName)) {
                    List<ResourceReference> origins = reader.readArray(reader1 -> ResourceReference.fromJson(reader1));
                    deserializedDeepCreatedOriginGroupProperties.origins = origins;
                } else if ("healthProbeSettings".equals(fieldName)) {
                    deserializedDeepCreatedOriginGroupProperties.healthProbeSettings
                        = HealthProbeParameters.fromJson(reader);
                } else if ("trafficRestorationTimeToHealedOrNewEndpointsInMinutes".equals(fieldName)) {
                    deserializedDeepCreatedOriginGroupProperties.trafficRestorationTimeToHealedOrNewEndpointsInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("responseBasedOriginErrorDetectionSettings".equals(fieldName)) {
                    deserializedDeepCreatedOriginGroupProperties.responseBasedOriginErrorDetectionSettings
                        = ResponseBasedOriginErrorDetectionParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeepCreatedOriginGroupProperties;
        });
    }
}
