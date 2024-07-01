// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for VolumeQuotaRules Get.
 */
public final class VolumeQuotaRulesGetSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/VolumeQuotaRules_Get.json
     */
    /**
     * Sample code: VolumeQuotaRules_Get.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumeQuotaRulesGet(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumeQuotaRules()
            .getWithResponse("myRG", "account-9957", "pool-5210", "volume-6387", "rule-0004",
                com.azure.core.util.Context.NONE);
    }
}
