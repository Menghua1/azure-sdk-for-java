// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Backups GetVolumeLatestRestoreStatus.
 */
public final class BackupsGetVolumeLatestRestoreStatusSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/Volumes_LatestRestoreStatus.json
     */
    /**
     * Sample code: Volumes_RestoreStatus.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesRestoreStatus(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.backups()
            .getVolumeLatestRestoreStatusWithResponse("myRG", "account1", "pool1", "volume1",
                com.azure.core.util.Context.NONE);
    }
}
