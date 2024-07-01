// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualWans GetByResourceGroup.
 */
public final class VirtualWansGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VirtualWANGet.json
     */
    /**
     * Sample code: VirtualWANGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualWANGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualWans()
            .getByResourceGroupWithResponse("rg1", "wan1", com.azure.core.util.Context.NONE);
    }
}
