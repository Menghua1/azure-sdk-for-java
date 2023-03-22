// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/** Samples for WebPubSubHubs List. */
public final class WebPubSubHubsListSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/stable/2023-02-01/examples/WebPubSubHubs_List.json
     */
    /**
     * Sample code: WebPubSubHubs_List.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubHubsList(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager.webPubSubHubs().list("myResourceGroup", "myWebPubSubService", com.azure.core.util.Context.NONE);
    }
}
