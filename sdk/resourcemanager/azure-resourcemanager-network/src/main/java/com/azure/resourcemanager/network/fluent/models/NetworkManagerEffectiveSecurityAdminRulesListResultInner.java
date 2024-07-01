// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.EffectiveBaseSecurityAdminRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list networkManagerEffectiveSecurityAdminRules. It contains a list of groups and a skiptoken
 * to get the next set of results.
 */
@Fluent
public final class NetworkManagerEffectiveSecurityAdminRulesListResultInner {
    /*
     * Gets a page of NetworkManagerEffectiveSecurityAdminRules
     */
    @JsonProperty(value = "value")
    private List<EffectiveBaseSecurityAdminRule> value;

    /*
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     */
    @JsonProperty(value = "skipToken")
    private String skipToken;

    /**
     * Creates an instance of NetworkManagerEffectiveSecurityAdminRulesListResultInner class.
     */
    public NetworkManagerEffectiveSecurityAdminRulesListResultInner() {
    }

    /**
     * Get the value property: Gets a page of NetworkManagerEffectiveSecurityAdminRules.
     * 
     * @return the value value.
     */
    public List<EffectiveBaseSecurityAdminRule> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a page of NetworkManagerEffectiveSecurityAdminRules.
     * 
     * @param value the value value to set.
     * @return the NetworkManagerEffectiveSecurityAdminRulesListResultInner object itself.
     */
    public NetworkManagerEffectiveSecurityAdminRulesListResultInner
        withValue(List<EffectiveBaseSecurityAdminRule> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     * 
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     * 
     * @param skipToken the skipToken value to set.
     * @return the NetworkManagerEffectiveSecurityAdminRulesListResultInner object itself.
     */
    public NetworkManagerEffectiveSecurityAdminRulesListResultInner withSkipToken(String skipToken) {
        this.skipToken = skipToken;
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
