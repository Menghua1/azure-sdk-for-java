// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

/** Samples for PeerAsns List. */
public final class PeerAsnsListSamples {
    /*
     * x-ms-original-file: specification/peering/resource-manager/Microsoft.Peering/stable/2021-01-01/examples/ListPeerAsnsBySubscription.json
     */
    /**
     * Sample code: List peer ASNs in a subscription.
     *
     * @param manager Entry point to PeeringManager.
     */
    public static void listPeerASNsInASubscription(com.azure.resourcemanager.peering.PeeringManager manager) {
        manager.peerAsns().list(com.azure.core.util.Context.NONE);
    }
}
