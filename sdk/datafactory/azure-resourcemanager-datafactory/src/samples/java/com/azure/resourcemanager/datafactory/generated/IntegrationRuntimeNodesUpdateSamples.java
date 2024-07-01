// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.resourcemanager.datafactory.models.UpdateIntegrationRuntimeNodeRequest;

/**
 * Samples for IntegrationRuntimeNodes Update.
 */
public final class IntegrationRuntimeNodesUpdateSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * IntegrationRuntimeNodes_Update.json
     */
    /**
     * Sample code: IntegrationRuntimeNodes_Update.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void integrationRuntimeNodesUpdate(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.integrationRuntimeNodes()
            .updateWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleIntegrationRuntime", "Node_1",
                new UpdateIntegrationRuntimeNodeRequest().withConcurrentJobsLimit(2), com.azure.core.util.Context.NONE);
    }
}
