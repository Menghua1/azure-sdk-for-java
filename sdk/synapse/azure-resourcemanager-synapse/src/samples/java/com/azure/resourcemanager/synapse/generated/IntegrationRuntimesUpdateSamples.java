// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeAutoUpdate;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeResource;

/** Samples for IntegrationRuntimes Update. */
public final class IntegrationRuntimesUpdateSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/IntegrationRuntimes_Update.json
     */
    /**
     * Sample code: Update integration runtime.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void updateIntegrationRuntime(com.azure.resourcemanager.synapse.SynapseManager manager) {
        IntegrationRuntimeResource resource =
            manager
                .integrationRuntimes()
                .getWithResponse(
                    "exampleResourceGroup", "exampleWorkspace", "exampleIntegrationRuntime", null, Context.NONE)
                .getValue();
        resource.update().withAutoUpdate(IntegrationRuntimeAutoUpdate.OFF).withUpdateDelayOffset("\"PT3H\"").apply();
    }
}
