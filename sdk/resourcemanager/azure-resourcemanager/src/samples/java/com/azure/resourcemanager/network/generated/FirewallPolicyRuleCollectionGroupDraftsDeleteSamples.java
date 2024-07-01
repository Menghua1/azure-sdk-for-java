// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for FirewallPolicyRuleCollectionGroupDrafts Delete.
 */
public final class FirewallPolicyRuleCollectionGroupDraftsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/FirewallPolicyRuleCollectionGroupDraftDelete.json
     */
    /**
     * Sample code: delete firewall rule collection group draft.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteFirewallRuleCollectionGroupDraft(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroupDrafts()
            .deleteWithResponse("rg1", "firewallPolicy", "ruleCollectionGroup1", com.azure.core.util.Context.NONE);
    }
}
