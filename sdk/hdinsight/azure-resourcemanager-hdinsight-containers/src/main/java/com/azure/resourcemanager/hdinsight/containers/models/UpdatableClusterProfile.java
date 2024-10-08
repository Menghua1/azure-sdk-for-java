// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Cluster resource patch properties.
 */
@Fluent
public final class UpdatableClusterProfile implements JsonSerializable<UpdatableClusterProfile> {
    /*
     * The service configs profiles.
     */
    private List<ClusterServiceConfigsProfile> serviceConfigsProfiles;

    /*
     * Ssh profile for the cluster.
     */
    private SshProfile sshProfile;

    /*
     * This is the Autoscale profile for the cluster. This will allow customer to create cluster enabled with Autoscale.
     */
    private AutoscaleProfile autoscaleProfile;

    /*
     * Authorization profile with details of AAD user Ids and group Ids authorized for data plane access.
     */
    private AuthorizationProfile authorizationProfile;

    /*
     * Cluster log analytics profile to enable or disable OMS agent for cluster.
     */
    private ClusterLogAnalyticsProfile logAnalyticsProfile;

    /*
     * Cluster Prometheus profile.
     */
    private ClusterPrometheusProfile prometheusProfile;

    /*
     * Cluster Ranger plugin profile.
     */
    private ClusterRangerPluginProfile rangerPluginProfile;

    /*
     * The ranger cluster profile.
     */
    private RangerProfile rangerProfile;

    /*
     * The script action profile list.
     */
    private List<ScriptActionProfile> scriptActionProfiles;

    /*
     * The cluster secret profile.
     */
    private SecretsProfile secretsProfile;

    /*
     * Trino Cluster profile.
     */
    private TrinoProfile trinoProfile;

    /**
     * Creates an instance of UpdatableClusterProfile class.
     */
    public UpdatableClusterProfile() {
    }

    /**
     * Get the serviceConfigsProfiles property: The service configs profiles.
     * 
     * @return the serviceConfigsProfiles value.
     */
    public List<ClusterServiceConfigsProfile> serviceConfigsProfiles() {
        return this.serviceConfigsProfiles;
    }

    /**
     * Set the serviceConfigsProfiles property: The service configs profiles.
     * 
     * @param serviceConfigsProfiles the serviceConfigsProfiles value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile
        withServiceConfigsProfiles(List<ClusterServiceConfigsProfile> serviceConfigsProfiles) {
        this.serviceConfigsProfiles = serviceConfigsProfiles;
        return this;
    }

    /**
     * Get the sshProfile property: Ssh profile for the cluster.
     * 
     * @return the sshProfile value.
     */
    public SshProfile sshProfile() {
        return this.sshProfile;
    }

    /**
     * Set the sshProfile property: Ssh profile for the cluster.
     * 
     * @param sshProfile the sshProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withSshProfile(SshProfile sshProfile) {
        this.sshProfile = sshProfile;
        return this;
    }

    /**
     * Get the autoscaleProfile property: This is the Autoscale profile for the cluster. This will allow customer to
     * create cluster enabled with Autoscale.
     * 
     * @return the autoscaleProfile value.
     */
    public AutoscaleProfile autoscaleProfile() {
        return this.autoscaleProfile;
    }

    /**
     * Set the autoscaleProfile property: This is the Autoscale profile for the cluster. This will allow customer to
     * create cluster enabled with Autoscale.
     * 
     * @param autoscaleProfile the autoscaleProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withAutoscaleProfile(AutoscaleProfile autoscaleProfile) {
        this.autoscaleProfile = autoscaleProfile;
        return this;
    }

    /**
     * Get the authorizationProfile property: Authorization profile with details of AAD user Ids and group Ids
     * authorized for data plane access.
     * 
     * @return the authorizationProfile value.
     */
    public AuthorizationProfile authorizationProfile() {
        return this.authorizationProfile;
    }

    /**
     * Set the authorizationProfile property: Authorization profile with details of AAD user Ids and group Ids
     * authorized for data plane access.
     * 
     * @param authorizationProfile the authorizationProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withAuthorizationProfile(AuthorizationProfile authorizationProfile) {
        this.authorizationProfile = authorizationProfile;
        return this;
    }

    /**
     * Get the logAnalyticsProfile property: Cluster log analytics profile to enable or disable OMS agent for cluster.
     * 
     * @return the logAnalyticsProfile value.
     */
    public ClusterLogAnalyticsProfile logAnalyticsProfile() {
        return this.logAnalyticsProfile;
    }

    /**
     * Set the logAnalyticsProfile property: Cluster log analytics profile to enable or disable OMS agent for cluster.
     * 
     * @param logAnalyticsProfile the logAnalyticsProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withLogAnalyticsProfile(ClusterLogAnalyticsProfile logAnalyticsProfile) {
        this.logAnalyticsProfile = logAnalyticsProfile;
        return this;
    }

    /**
     * Get the prometheusProfile property: Cluster Prometheus profile.
     * 
     * @return the prometheusProfile value.
     */
    public ClusterPrometheusProfile prometheusProfile() {
        return this.prometheusProfile;
    }

    /**
     * Set the prometheusProfile property: Cluster Prometheus profile.
     * 
     * @param prometheusProfile the prometheusProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withPrometheusProfile(ClusterPrometheusProfile prometheusProfile) {
        this.prometheusProfile = prometheusProfile;
        return this;
    }

    /**
     * Get the rangerPluginProfile property: Cluster Ranger plugin profile.
     * 
     * @return the rangerPluginProfile value.
     */
    public ClusterRangerPluginProfile rangerPluginProfile() {
        return this.rangerPluginProfile;
    }

    /**
     * Set the rangerPluginProfile property: Cluster Ranger plugin profile.
     * 
     * @param rangerPluginProfile the rangerPluginProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withRangerPluginProfile(ClusterRangerPluginProfile rangerPluginProfile) {
        this.rangerPluginProfile = rangerPluginProfile;
        return this;
    }

    /**
     * Get the rangerProfile property: The ranger cluster profile.
     * 
     * @return the rangerProfile value.
     */
    public RangerProfile rangerProfile() {
        return this.rangerProfile;
    }

    /**
     * Set the rangerProfile property: The ranger cluster profile.
     * 
     * @param rangerProfile the rangerProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withRangerProfile(RangerProfile rangerProfile) {
        this.rangerProfile = rangerProfile;
        return this;
    }

    /**
     * Get the scriptActionProfiles property: The script action profile list.
     * 
     * @return the scriptActionProfiles value.
     */
    public List<ScriptActionProfile> scriptActionProfiles() {
        return this.scriptActionProfiles;
    }

    /**
     * Set the scriptActionProfiles property: The script action profile list.
     * 
     * @param scriptActionProfiles the scriptActionProfiles value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withScriptActionProfiles(List<ScriptActionProfile> scriptActionProfiles) {
        this.scriptActionProfiles = scriptActionProfiles;
        return this;
    }

    /**
     * Get the secretsProfile property: The cluster secret profile.
     * 
     * @return the secretsProfile value.
     */
    public SecretsProfile secretsProfile() {
        return this.secretsProfile;
    }

    /**
     * Set the secretsProfile property: The cluster secret profile.
     * 
     * @param secretsProfile the secretsProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withSecretsProfile(SecretsProfile secretsProfile) {
        this.secretsProfile = secretsProfile;
        return this;
    }

    /**
     * Get the trinoProfile property: Trino Cluster profile.
     * 
     * @return the trinoProfile value.
     */
    public TrinoProfile trinoProfile() {
        return this.trinoProfile;
    }

    /**
     * Set the trinoProfile property: Trino Cluster profile.
     * 
     * @param trinoProfile the trinoProfile value to set.
     * @return the UpdatableClusterProfile object itself.
     */
    public UpdatableClusterProfile withTrinoProfile(TrinoProfile trinoProfile) {
        this.trinoProfile = trinoProfile;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceConfigsProfiles() != null) {
            serviceConfigsProfiles().forEach(e -> e.validate());
        }
        if (sshProfile() != null) {
            sshProfile().validate();
        }
        if (autoscaleProfile() != null) {
            autoscaleProfile().validate();
        }
        if (authorizationProfile() != null) {
            authorizationProfile().validate();
        }
        if (logAnalyticsProfile() != null) {
            logAnalyticsProfile().validate();
        }
        if (prometheusProfile() != null) {
            prometheusProfile().validate();
        }
        if (rangerPluginProfile() != null) {
            rangerPluginProfile().validate();
        }
        if (rangerProfile() != null) {
            rangerProfile().validate();
        }
        if (scriptActionProfiles() != null) {
            scriptActionProfiles().forEach(e -> e.validate());
        }
        if (secretsProfile() != null) {
            secretsProfile().validate();
        }
        if (trinoProfile() != null) {
            trinoProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("serviceConfigsProfiles", this.serviceConfigsProfiles,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("sshProfile", this.sshProfile);
        jsonWriter.writeJsonField("autoscaleProfile", this.autoscaleProfile);
        jsonWriter.writeJsonField("authorizationProfile", this.authorizationProfile);
        jsonWriter.writeJsonField("logAnalyticsProfile", this.logAnalyticsProfile);
        jsonWriter.writeJsonField("prometheusProfile", this.prometheusProfile);
        jsonWriter.writeJsonField("rangerPluginProfile", this.rangerPluginProfile);
        jsonWriter.writeJsonField("rangerProfile", this.rangerProfile);
        jsonWriter.writeArrayField("scriptActionProfiles", this.scriptActionProfiles,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("secretsProfile", this.secretsProfile);
        jsonWriter.writeJsonField("trinoProfile", this.trinoProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdatableClusterProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdatableClusterProfile if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdatableClusterProfile.
     */
    public static UpdatableClusterProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdatableClusterProfile deserializedUpdatableClusterProfile = new UpdatableClusterProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceConfigsProfiles".equals(fieldName)) {
                    List<ClusterServiceConfigsProfile> serviceConfigsProfiles
                        = reader.readArray(reader1 -> ClusterServiceConfigsProfile.fromJson(reader1));
                    deserializedUpdatableClusterProfile.serviceConfigsProfiles = serviceConfigsProfiles;
                } else if ("sshProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.sshProfile = SshProfile.fromJson(reader);
                } else if ("autoscaleProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.autoscaleProfile = AutoscaleProfile.fromJson(reader);
                } else if ("authorizationProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.authorizationProfile = AuthorizationProfile.fromJson(reader);
                } else if ("logAnalyticsProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.logAnalyticsProfile
                        = ClusterLogAnalyticsProfile.fromJson(reader);
                } else if ("prometheusProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.prometheusProfile = ClusterPrometheusProfile.fromJson(reader);
                } else if ("rangerPluginProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.rangerPluginProfile
                        = ClusterRangerPluginProfile.fromJson(reader);
                } else if ("rangerProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.rangerProfile = RangerProfile.fromJson(reader);
                } else if ("scriptActionProfiles".equals(fieldName)) {
                    List<ScriptActionProfile> scriptActionProfiles
                        = reader.readArray(reader1 -> ScriptActionProfile.fromJson(reader1));
                    deserializedUpdatableClusterProfile.scriptActionProfiles = scriptActionProfiles;
                } else if ("secretsProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.secretsProfile = SecretsProfile.fromJson(reader);
                } else if ("trinoProfile".equals(fieldName)) {
                    deserializedUpdatableClusterProfile.trinoProfile = TrinoProfile.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdatableClusterProfile;
        });
    }
}
