// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

/** Samples for VirtualMachineInstances Restart. */
public final class VirtualMachineInstancesRestartSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2023-09-01-preview/examples/RestartVirtualMachineInstance.json
     */
    /**
     * Sample code: RestartVirtualMachine.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void restartVirtualMachine(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager
            .virtualMachineInstances()
            .restart(
                "subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/Microsoft.HybridCompute/machines/DemoVM/providers/Microsoft.AzureStackHCI/virtualMachineInstances/default",
                com.azure.core.util.Context.NONE);
    }
}
