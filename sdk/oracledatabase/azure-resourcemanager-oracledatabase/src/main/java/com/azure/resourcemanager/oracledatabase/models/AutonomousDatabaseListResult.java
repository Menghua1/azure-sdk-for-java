// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response of a AutonomousDatabase list operation.
 */
@Fluent
public final class AutonomousDatabaseListResult {
    /*
     * The AutonomousDatabase items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<AutonomousDatabaseInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of AutonomousDatabaseListResult class.
     */
    public AutonomousDatabaseListResult() {
    }

    /**
     * Get the value property: The AutonomousDatabase items on this page.
     * 
     * @return the value value.
     */
    public List<AutonomousDatabaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The AutonomousDatabase items on this page.
     * 
     * @param value the value value to set.
     * @return the AutonomousDatabaseListResult object itself.
     */
    public AutonomousDatabaseListResult withValue(List<AutonomousDatabaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AutonomousDatabaseListResult object itself.
     */
    public AutonomousDatabaseListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model AutonomousDatabaseListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutonomousDatabaseListResult.class);
}
