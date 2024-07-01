// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for AutonomousDatabaseVersions Get.
 */
public final class AutonomousDatabaseVersionsGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/
     * autonomousDatabaseVersion_get.json
     */
    /**
     * Sample code: Get an autonomous version.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void getAnAutonomousVersion(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.autonomousDatabaseVersions().getWithResponse("eastus", "18.4.0.0", com.azure.core.util.Context.NONE);
    }
}
