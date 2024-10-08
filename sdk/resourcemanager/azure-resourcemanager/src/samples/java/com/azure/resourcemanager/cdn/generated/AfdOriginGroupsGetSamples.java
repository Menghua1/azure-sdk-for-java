// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/**
 * Samples for AfdOriginGroups Get.
 */
public final class AfdOriginGroupsGetSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/AFDOriginGroups_Get.json
     */
    /**
     * Sample code: AFDOriginGroups_Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void aFDOriginGroupsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles()
            .manager()
            .serviceClient()
            .getAfdOriginGroups()
            .getWithResponse("RG", "profile1", "origingroup1", com.azure.core.util.Context.NONE);
    }
}
