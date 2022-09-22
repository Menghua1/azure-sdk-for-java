// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Statistical information about the number of alerts per device during last set number of days. */
@Immutable
public final class IoTSecurityAlertedDevice {
    /*
     * Device identifier.
     */
    @JsonProperty(value = "deviceId", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceId;

    /*
     * Number of alerts raised for this device.
     */
    @JsonProperty(value = "alertsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long alertsCount;

    /**
     * Get the deviceId property: Device identifier.
     *
     * @return the deviceId value.
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Get the alertsCount property: Number of alerts raised for this device.
     *
     * @return the alertsCount value.
     */
    public Long alertsCount() {
        return this.alertsCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
