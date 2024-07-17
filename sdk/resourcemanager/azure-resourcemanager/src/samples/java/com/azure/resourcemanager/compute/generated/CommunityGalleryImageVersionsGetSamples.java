// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for CommunityGalleryImageVersions Get.
 */
public final class CommunityGalleryImageVersionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2023-07-03/examples/
     * communityGalleryExamples/CommunityGalleryImageVersion_Get.json
     */
    /**
     * Sample code: Get a community gallery image version.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getACommunityGalleryImageVersion(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getCommunityGalleryImageVersions()
            .getWithResponse("myLocation", "publicGalleryName", "myGalleryImageName", "myGalleryImageVersionName",
                com.azure.core.util.Context.NONE);
    }
}
