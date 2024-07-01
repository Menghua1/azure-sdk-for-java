// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

/**
 * Samples for VirtualMachineInstances Restart.
 */
public final class VirtualMachineInstancesRestartSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * VirtualMachineInstances_Restart_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineInstances_Restart_MaximumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void virtualMachineInstancesRestartMaximumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualMachineInstances().restart("gtgclehcbsyave", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * VirtualMachineInstances_Restart_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineInstances_Restart_MinimumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void virtualMachineInstancesRestartMinimumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualMachineInstances().restart("gtgclehcbsyave", com.azure.core.util.Context.NONE);
    }
}
