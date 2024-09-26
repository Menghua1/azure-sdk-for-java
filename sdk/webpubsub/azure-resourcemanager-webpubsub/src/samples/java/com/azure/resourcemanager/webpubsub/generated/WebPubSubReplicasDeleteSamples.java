// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/**
 * Samples for WebPubSubReplicas Delete.
 */
public final class WebPubSubReplicasDeleteSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/stable/2024-03-01/examples/
     * WebPubSubReplicas_Delete.json
     */
    /**
     * Sample code: WebPubSubReplicas_Delete.
     * 
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubReplicasDelete(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager.webPubSubReplicas()
            .deleteWithResponse("myResourceGroup", "myWebPubSubService", "myWebPubSubService-eastus",
                com.azure.core.util.Context.NONE);
    }
}
