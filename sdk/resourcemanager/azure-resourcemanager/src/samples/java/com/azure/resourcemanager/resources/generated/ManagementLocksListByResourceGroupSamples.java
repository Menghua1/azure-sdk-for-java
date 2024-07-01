// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for ManagementLocks ListByResourceGroup.
 */
public final class ManagementLocksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2017-04-01/examples/ManagementLocks_ListAtResourceGroupLevel.json
     */
    /**
     * Sample code: List management groups at resource group level.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagementGroupsAtResourceGroupLevel(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .managementLockClient()
            .getManagementLocks()
            .listByResourceGroup("resourcegroupname", null, com.azure.core.util.Context.NONE);
    }
}
