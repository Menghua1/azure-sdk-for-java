// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the os disk image information.
 */
@Fluent
public final class OSDiskImage {
    /*
     * The operating system of the osDiskImage.
     */
    @JsonProperty(value = "operatingSystem", required = true)
    private OperatingSystemTypes operatingSystem;

    /**
     * Creates an instance of OSDiskImage class.
     */
    public OSDiskImage() {
    }

    /**
     * Get the operatingSystem property: The operating system of the osDiskImage.
     * 
     * @return the operatingSystem value.
     */
    public OperatingSystemTypes operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operatingSystem property: The operating system of the osDiskImage.
     * 
     * @param operatingSystem the operatingSystem value to set.
     * @return the OSDiskImage object itself.
     */
    public OSDiskImage withOperatingSystem(OperatingSystemTypes operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operatingSystem() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property operatingSystem in model OSDiskImage"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OSDiskImage.class);
}
