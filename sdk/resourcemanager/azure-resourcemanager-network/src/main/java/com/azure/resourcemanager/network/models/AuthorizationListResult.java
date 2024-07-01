// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCircuitAuthorizationInner;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Response for ListAuthorizations API service call retrieves all authorizations that belongs to an ExpressRouteCircuit.
 */
@Fluent
public final class AuthorizationListResult {
    /*
     * The authorizations in an ExpressRoute Circuit.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitAuthorizationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of AuthorizationListResult class.
     */
    public AuthorizationListResult() {
    }

    /**
     * Get the value property: The authorizations in an ExpressRoute Circuit.
     *
     * @return the value value.
     */
    public List<ExpressRouteCircuitAuthorizationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The authorizations in an ExpressRoute Circuit.
     *
     * @param value the value value to set.
     * @return the AuthorizationListResult object itself.
     */
    public AuthorizationListResult withValue(List<ExpressRouteCircuitAuthorizationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the AuthorizationListResult object itself.
     */
    public AuthorizationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
