// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.DedicatedHostLicenseTypes;
import com.azure.resourcemanager.compute.models.DedicatedHostUpdate;
import com.azure.resourcemanager.compute.models.Sku;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DedicatedHosts Update.
 */
public final class DedicatedHostsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * dedicatedHostExamples/DedicatedHost_Update_Resize.json
     */
    /**
     * Sample code: DedicatedHost_Update_Resize.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostUpdateResize(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHosts()
            .update("rgcompute", "aaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa",
                new DedicatedHostUpdate().withSku(new Sku().withName("DSv3-Type1")), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * dedicatedHostExamples/DedicatedHost_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHost_Update_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostUpdateMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHosts()
            .update("rgcompute", "aaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa",
                new DedicatedHostUpdate().withTags(mapOf("key8813", "fakeTokenPlaceholder"))
                    .withPlatformFaultDomain(1)
                    .withAutoReplaceOnFailure(true)
                    .withLicenseType(DedicatedHostLicenseTypes.WINDOWS_SERVER_HYBRID),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * dedicatedHostExamples/DedicatedHost_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHost_Update_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostUpdateMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHosts()
            .update("rgcompute", "aa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", new DedicatedHostUpdate(),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
