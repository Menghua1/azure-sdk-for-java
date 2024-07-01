// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for WorkloadNetworks GetPortMirroring.
 */
public final class WorkloadNetworksGetPortMirroringSamples {
    /*
     * x-ms-original-file:
     * specification/vmware/resource-manager/Microsoft.AVS/stable/2023-09-01/examples/WorkloadNetworks_GetPortMirroring.
     * json
     */
    /**
     * Sample code: WorkloadNetworks_GetPortMirroring.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksGetPortMirroring(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks()
            .getPortMirroringWithResponse("group1", "cloud1", "portMirroring1", com.azure.core.util.Context.NONE);
    }
}
