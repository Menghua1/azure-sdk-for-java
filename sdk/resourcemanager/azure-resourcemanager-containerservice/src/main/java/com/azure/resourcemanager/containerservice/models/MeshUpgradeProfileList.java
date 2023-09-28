// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservice.fluent.models.MeshUpgradeProfileInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Holds an array of MeshUpgradeProfiles. */
@Fluent
public final class MeshUpgradeProfileList {
    /*
     * Array of supported service mesh add-on upgrade profiles.
     */
    @JsonProperty(value = "value")
    private List<MeshUpgradeProfileInner> value;

    /*
     * The URL to get the next set of mesh upgrade profile.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of MeshUpgradeProfileList class. */
    public MeshUpgradeProfileList() {
    }

    /**
     * Get the value property: Array of supported service mesh add-on upgrade profiles.
     *
     * @return the value value.
     */
    public List<MeshUpgradeProfileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of supported service mesh add-on upgrade profiles.
     *
     * @param value the value value to set.
     * @return the MeshUpgradeProfileList object itself.
     */
    public MeshUpgradeProfileList withValue(List<MeshUpgradeProfileInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of mesh upgrade profile.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
