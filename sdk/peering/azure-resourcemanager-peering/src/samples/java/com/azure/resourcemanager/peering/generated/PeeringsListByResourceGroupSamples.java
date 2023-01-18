// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

/** Samples for Peerings ListByResourceGroup. */
public final class PeeringsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/peering/resource-manager/Microsoft.Peering/stable/2021-01-01/examples/ListPeeringsByResourceGroup.json
     */
    /**
     * Sample code: List peerings in a resource group.
     *
     * @param manager Entry point to PeeringManager.
     */
    public static void listPeeringsInAResourceGroup(com.azure.resourcemanager.peering.PeeringManager manager) {
        manager.peerings().listByResourceGroup("rgName", com.azure.core.util.Context.NONE);
    }
}
