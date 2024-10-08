// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.EnabledState;
import com.azure.resourcemanager.cdn.models.HealthProbeParameters;
import com.azure.resourcemanager.cdn.models.LoadBalancingSettingsParameters;
import java.io.IOException;

/**
 * AFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be served from
 * Azure Front Door.
 */
@Fluent
public final class AfdOriginGroupInner extends ProxyResource {
    /*
     * The JSON object that contains the properties of the origin group.
     */
    private AfdOriginGroupProperties innerProperties;

    /*
     * Read only system data
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of AfdOriginGroupInner class.
     */
    public AfdOriginGroupInner() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the origin group.
     * 
     * @return the innerProperties value.
     */
    private AfdOriginGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
    }

    /**
     * Get the profileName property: The name of the profile which holds the origin group.
     * 
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the loadBalancingSettings property: Load balancing settings for a backend pool.
     * 
     * @return the loadBalancingSettings value.
     */
    public LoadBalancingSettingsParameters loadBalancingSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancingSettings();
    }

    /**
     * Set the loadBalancingSettings property: Load balancing settings for a backend pool.
     * 
     * @param loadBalancingSettings the loadBalancingSettings value to set.
     * @return the AfdOriginGroupInner object itself.
     */
    public AfdOriginGroupInner withLoadBalancingSettings(LoadBalancingSettingsParameters loadBalancingSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupProperties();
        }
        this.innerProperties().withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /**
     * Get the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     * 
     * @return the healthProbeSettings value.
     */
    public HealthProbeParameters healthProbeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().healthProbeSettings();
    }

    /**
     * Set the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     * 
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the AfdOriginGroupInner object itself.
     */
    public AfdOriginGroupInner withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupProperties();
        }
        this.innerProperties().withHealthProbeSettings(healthProbeSettings);
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
        return this.innerProperties() == null
            ? null
            : this.innerProperties().trafficRestorationTimeToHealedOrNewEndpointsInMinutes();
    }

    /**
     * Set the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     * 
     * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes the
     * trafficRestorationTimeToHealedOrNewEndpointsInMinutes value to set.
     * @return the AfdOriginGroupInner object itself.
     */
    public AfdOriginGroupInner withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupProperties();
        }
        this.innerProperties()
            .withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        return this;
    }

    /**
     * Get the sessionAffinityState property: Whether to allow session affinity on this host. Valid options are
     * 'Enabled' or 'Disabled'.
     * 
     * @return the sessionAffinityState value.
     */
    public EnabledState sessionAffinityState() {
        return this.innerProperties() == null ? null : this.innerProperties().sessionAffinityState();
    }

    /**
     * Set the sessionAffinityState property: Whether to allow session affinity on this host. Valid options are
     * 'Enabled' or 'Disabled'.
     * 
     * @param sessionAffinityState the sessionAffinityState value to set.
     * @return the AfdOriginGroupInner object itself.
     */
    public AfdOriginGroupInner withSessionAffinityState(EnabledState sessionAffinityState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginGroupProperties();
        }
        this.innerProperties().withSessionAffinityState(sessionAffinityState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AfdOriginGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AfdOriginGroupInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AfdOriginGroupInner.
     */
    public static AfdOriginGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AfdOriginGroupInner deserializedAfdOriginGroupInner = new AfdOriginGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAfdOriginGroupInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAfdOriginGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAfdOriginGroupInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAfdOriginGroupInner.innerProperties = AfdOriginGroupProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedAfdOriginGroupInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAfdOriginGroupInner;
        });
    }
}
