// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Microsoft Defender for Endpoint autoprovisioning configuration. */
@Fluent
public final class DefenderForServersAwsOfferingMdeAutoProvisioning {
    /*
     * Is Microsoft Defender for Endpoint auto provisioning enabled
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * configuration for Microsoft Defender for Endpoint autoprovisioning
     */
    @JsonProperty(value = "configuration")
    private Object configuration;

    /**
     * Get the enabled property: Is Microsoft Defender for Endpoint auto provisioning enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is Microsoft Defender for Endpoint auto provisioning enabled.
     *
     * @param enabled the enabled value to set.
     * @return the DefenderForServersAwsOfferingMdeAutoProvisioning object itself.
     */
    public DefenderForServersAwsOfferingMdeAutoProvisioning withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the configuration property: configuration for Microsoft Defender for Endpoint autoprovisioning.
     *
     * @return the configuration value.
     */
    public Object configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: configuration for Microsoft Defender for Endpoint autoprovisioning.
     *
     * @param configuration the configuration value to set.
     * @return the DefenderForServersAwsOfferingMdeAutoProvisioning object itself.
     */
    public DefenderForServersAwsOfferingMdeAutoProvisioning withConfiguration(Object configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
