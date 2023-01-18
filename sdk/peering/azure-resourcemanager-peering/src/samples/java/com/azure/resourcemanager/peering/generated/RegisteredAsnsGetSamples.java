// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

/** Samples for RegisteredAsns Get. */
public final class RegisteredAsnsGetSamples {
    /*
     * x-ms-original-file: specification/peering/resource-manager/Microsoft.Peering/stable/2021-01-01/examples/GetRegisteredAsn.json
     */
    /**
     * Sample code: Get a registered ASN associated with the peering.
     *
     * @param manager Entry point to PeeringManager.
     */
    public static void getARegisteredASNAssociatedWithThePeering(
        com.azure.resourcemanager.peering.PeeringManager manager) {
        manager
            .registeredAsns()
            .getWithResponse("rgName", "peeringName", "registeredAsnName0", com.azure.core.util.Context.NONE);
    }
}
