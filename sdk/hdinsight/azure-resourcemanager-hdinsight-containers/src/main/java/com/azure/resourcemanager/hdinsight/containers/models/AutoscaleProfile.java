// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the Autoscale profile for the cluster. This will allow customer to create cluster enabled with Autoscale.
 */
@Fluent
public final class AutoscaleProfile {
    /*
     * This indicates whether auto scale is enabled on HDInsight on AKS cluster.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * This property is for graceful decommission timeout; It has a default setting of 3600 seconds before forced
     * shutdown takes place. This is the maximal time to wait for running containers and applications to complete
     * before transition a DECOMMISSIONING node into DECOMMISSIONED. The default value is 3600 seconds. Negative value
     * (like -1) is handled as infinite timeout.
     */
    @JsonProperty(value = "gracefulDecommissionTimeout")
    private Integer gracefulDecommissionTimeout;

    /*
     * User to specify which type of Autoscale to be implemented - Scheduled Based or Load Based.
     */
    @JsonProperty(value = "autoscaleType")
    private AutoscaleType autoscaleType;

    /*
     * Profiles of schedule based Autoscale.
     */
    @JsonProperty(value = "scheduleBasedConfig")
    private ScheduleBasedConfig scheduleBasedConfig;

    /*
     * Profiles of load based Autoscale.
     */
    @JsonProperty(value = "loadBasedConfig")
    private LoadBasedConfig loadBasedConfig;

    /**
     * Creates an instance of AutoscaleProfile class.
     */
    public AutoscaleProfile() {
    }

    /**
     * Get the enabled property: This indicates whether auto scale is enabled on HDInsight on AKS cluster.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: This indicates whether auto scale is enabled on HDInsight on AKS cluster.
     * 
     * @param enabled the enabled value to set.
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the gracefulDecommissionTimeout property: This property is for graceful decommission timeout; It has a
     * default setting of 3600 seconds before forced shutdown takes place. This is the maximal time to wait for running
     * containers and applications to complete before transition a DECOMMISSIONING node into DECOMMISSIONED. The
     * default value is 3600 seconds. Negative value (like -1) is handled as infinite timeout.
     * 
     * @return the gracefulDecommissionTimeout value.
     */
    public Integer gracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Set the gracefulDecommissionTimeout property: This property is for graceful decommission timeout; It has a
     * default setting of 3600 seconds before forced shutdown takes place. This is the maximal time to wait for running
     * containers and applications to complete before transition a DECOMMISSIONING node into DECOMMISSIONED. The
     * default value is 3600 seconds. Negative value (like -1) is handled as infinite timeout.
     * 
     * @param gracefulDecommissionTimeout the gracefulDecommissionTimeout value to set.
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withGracefulDecommissionTimeout(Integer gracefulDecommissionTimeout) {
        this.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
        return this;
    }

    /**
     * Get the autoscaleType property: User to specify which type of Autoscale to be implemented - Scheduled Based or
     * Load Based.
     * 
     * @return the autoscaleType value.
     */
    public AutoscaleType autoscaleType() {
        return this.autoscaleType;
    }

    /**
     * Set the autoscaleType property: User to specify which type of Autoscale to be implemented - Scheduled Based or
     * Load Based.
     * 
     * @param autoscaleType the autoscaleType value to set.
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withAutoscaleType(AutoscaleType autoscaleType) {
        this.autoscaleType = autoscaleType;
        return this;
    }

    /**
     * Get the scheduleBasedConfig property: Profiles of schedule based Autoscale.
     * 
     * @return the scheduleBasedConfig value.
     */
    public ScheduleBasedConfig scheduleBasedConfig() {
        return this.scheduleBasedConfig;
    }

    /**
     * Set the scheduleBasedConfig property: Profiles of schedule based Autoscale.
     * 
     * @param scheduleBasedConfig the scheduleBasedConfig value to set.
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withScheduleBasedConfig(ScheduleBasedConfig scheduleBasedConfig) {
        this.scheduleBasedConfig = scheduleBasedConfig;
        return this;
    }

    /**
     * Get the loadBasedConfig property: Profiles of load based Autoscale.
     * 
     * @return the loadBasedConfig value.
     */
    public LoadBasedConfig loadBasedConfig() {
        return this.loadBasedConfig;
    }

    /**
     * Set the loadBasedConfig property: Profiles of load based Autoscale.
     * 
     * @param loadBasedConfig the loadBasedConfig value to set.
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withLoadBasedConfig(LoadBasedConfig loadBasedConfig) {
        this.loadBasedConfig = loadBasedConfig;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scheduleBasedConfig() != null) {
            scheduleBasedConfig().validate();
        }
        if (loadBasedConfig() != null) {
            loadBasedConfig().validate();
        }
    }
}
