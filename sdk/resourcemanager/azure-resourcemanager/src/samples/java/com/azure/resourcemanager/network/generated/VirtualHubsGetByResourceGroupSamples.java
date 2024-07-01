// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualHubs GetByResourceGroup.
 */
public final class VirtualHubsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VirtualHubGet.json
     */
    /**
     * Sample code: VirtualHubGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualHubs()
            .getByResourceGroupWithResponse("rg1", "virtualHub1", com.azure.core.util.Context.NONE);
    }
}
