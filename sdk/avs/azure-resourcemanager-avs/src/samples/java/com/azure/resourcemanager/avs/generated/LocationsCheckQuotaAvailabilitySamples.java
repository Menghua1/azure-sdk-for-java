// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for Locations CheckQuotaAvailability.
 */
public final class LocationsCheckQuotaAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/vmware/resource-manager/Microsoft.AVS/stable/2023-09-01/examples/Locations_CheckQuotaAvailability.
     * json
     */
    /**
     * Sample code: Locations_CheckQuotaAvailability.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void locationsCheckQuotaAvailability(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.locations().checkQuotaAvailabilityWithResponse("eastus", com.azure.core.util.Context.NONE);
    }
}
