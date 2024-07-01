// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for WebApplicationFirewallPolicies Delete.
 */
public final class WebApplicationFirewallPoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/WafPolicyDelete.json
     */
    /**
     * Sample code: Deletes a WAF policy within a resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletesAWAFPolicyWithinAResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getWebApplicationFirewallPolicies()
            .delete("rg1", "Policy1", com.azure.core.util.Context.NONE);
    }
}
