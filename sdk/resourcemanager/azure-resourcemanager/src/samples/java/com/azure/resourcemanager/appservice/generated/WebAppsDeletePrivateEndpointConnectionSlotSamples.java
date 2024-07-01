// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WebApps DeletePrivateEndpointConnectionSlot.
 */
public final class WebAppsDeletePrivateEndpointConnectionSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/DeleteSitePrivateEndpointConnectionSlot.json
     */
    /**
     * Sample code: Delete a private endpoint connection for a site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAPrivateEndpointConnectionForASite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .deletePrivateEndpointConnectionSlot("rg", "testSite", "connection", "stage",
                com.azure.core.util.Context.NONE);
    }
}
