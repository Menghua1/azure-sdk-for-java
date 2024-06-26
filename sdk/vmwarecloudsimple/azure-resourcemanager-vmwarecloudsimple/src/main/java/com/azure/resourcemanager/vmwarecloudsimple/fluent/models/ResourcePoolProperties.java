// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of resource pool. */
@Immutable
public final class ResourcePoolProperties {
    /*
     * Hierarchical resource pool name
     */
    @JsonProperty(value = "fullName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullName;

    /** Creates an instance of ResourcePoolProperties class. */
    public ResourcePoolProperties() {
    }

    /**
     * Get the fullName property: Hierarchical resource pool name.
     *
     * @return the fullName value.
     */
    public String fullName() {
        return this.fullName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
