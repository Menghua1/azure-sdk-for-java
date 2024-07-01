// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

/**
 * Samples for Snapshot List.
 */
public final class SnapshotListSamples {
    /*
     * x-ms-original-file:
     * specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/
     * examples/Snapshot_List.json
     */
    /**
     * Sample code: Snapshot_List.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        snapshotList(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshots()
            .list("testReportName", "1", 100, null, null, null, "00000000-0000-0000-0000-000000000001",
                "00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
