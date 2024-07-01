// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

/**
 * Samples for Agents Get.
 */
public final class AgentsGetSamples {
    /*
     * x-ms-original-file:
     * specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2024-07-01/examples/
     * Agents_Get_MaximumSet.json
     */
    /**
     * Sample code: Agents_Get_MaximumSet.
     * 
     * @param manager Entry point to StorageMoverManager.
     */
    public static void agentsGetMaximumSet(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager.agents()
            .getWithResponse("examples-rg", "examples-storageMoverName", "examples-agentName",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2024-07-01/examples/
     * Agents_Get_MinimumSet.json
     */
    /**
     * Sample code: Agents_Get_MinimumSet.
     * 
     * @param manager Entry point to StorageMoverManager.
     */
    public static void agentsGetMinimumSet(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager.agents()
            .getWithResponse("examples-rg", "examples-storageMoverName", "examples-agentName",
                com.azure.core.util.Context.NONE);
    }
}
