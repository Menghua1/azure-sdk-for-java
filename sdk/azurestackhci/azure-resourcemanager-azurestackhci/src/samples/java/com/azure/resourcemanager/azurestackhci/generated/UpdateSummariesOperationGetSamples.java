// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

/**
 * Samples for UpdateSummariesOperation Get.
 */
public final class UpdateSummariesOperationGetSamples {
    /*
     * x-ms-original-file:
     * specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/StackHCI/stable/2024-04-01/examples/
     * GetUpdateSummaries.json
     */
    /**
     * Sample code: Get Update summaries under cluster resource.
     * 
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void
        getUpdateSummariesUnderClusterResource(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.updateSummariesOperations().getWithResponse("testrg", "testcluster", com.azure.core.util.Context.NONE);
    }
}
