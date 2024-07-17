// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for CloudServiceRoleInstances Get.
 */
public final class CloudServiceRoleInstancesGetSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-09-04/examples/
     * CloudServiceRoleInstance_Get.json
     */
    /**
     * Sample code: Get Cloud Service Role Instance.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getCloudServiceRoleInstance(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getCloudServiceRoleInstances()
            .getWithResponse("{roleInstance-name}", "ConstosoRG", "{cs-name}", null, com.azure.core.util.Context.NONE);
    }
}
