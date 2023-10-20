// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

/** Samples for StorageContainersOperation Delete. */
public final class StorageContainersOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2023-09-01-preview/examples/DeleteStorageContainer.json
     */
    /**
     * Sample code: DeleteStorageContainer.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void deleteStorageContainer(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.storageContainersOperations().delete("test-rg", "Default_Container", com.azure.core.util.Context.NONE);
    }
}
