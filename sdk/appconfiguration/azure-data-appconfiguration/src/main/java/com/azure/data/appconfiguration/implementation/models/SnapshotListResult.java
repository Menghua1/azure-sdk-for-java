// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.data.appconfiguration.models.ConfigurationSettingSnapshot;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a snapshot list request. */
@Fluent
public final class SnapshotListResult {
    /*
     * The collection value.
     */
    @JsonProperty(value = "items")
    private List<ConfigurationSettingSnapshot> items;

    /*
     * The URI that can be used to request the next set of paged results.
     */
    @JsonProperty(value = "@nextLink")
    private String nextLink;

    /** Creates an instance of SnapshotListResult class. */
    public SnapshotListResult() {}

    /**
     * Get the items property: The collection value.
     *
     * @return the items value.
     */
    public List<ConfigurationSettingSnapshot> getItems() {
        return this.items;
    }

    /**
     * Set the items property: The collection value.
     *
     * @param items the items value to set.
     * @return the SnapshotListResult object itself.
     */
    public SnapshotListResult setItems(List<ConfigurationSettingSnapshot> items) {
        this.items = items;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next set of paged results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next set of paged results.
     *
     * @param nextLink the nextLink value to set.
     * @return the SnapshotListResult object itself.
     */
    public SnapshotListResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
