// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for WorkspaceConnections List. */
public final class WorkspaceConnectionsListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/WorkspaceConnection/list.json
     */
    /**
     * Sample code: ListWorkspaceConnections.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listWorkspaceConnections(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .workspaceConnections()
            .list("resourceGroup-1", "workspace-1", "www.facebook.com", "ContainerRegistry", Context.NONE);
    }
}
