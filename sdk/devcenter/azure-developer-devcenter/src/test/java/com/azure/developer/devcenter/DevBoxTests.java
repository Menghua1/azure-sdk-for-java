// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter;

import com.azure.core.util.Configuration;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class DevBoxTests extends DevCenterClientTestBase {
    @Test
    public void testCreateDevBox() {
        String projectName = Configuration.getGlobalConfiguration().get("DEFAULT_PROJECT_NAME", "sdk-default-project");
        String poolName = Configuration.getGlobalConfiguration().get("DEFAULT_POOL_NAME", "sdk-default-pool");

        // Provision a Dev Box
        BinaryData devBoxBody = BinaryData.fromString("{\"poolName\":\"" + poolName + "\"}");
        SyncPoller<BinaryData, BinaryData> devBoxCreateResponse =
                devBoxesClient.beginCreateDevBox(projectName, "me", "TestDevBox", devBoxBody, null);
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, devBoxCreateResponse.waitForCompletion().getStatus());

        // Tear down the Dev Box when we're finished:
        SyncPoller<BinaryData, BinaryData> devBoxDeleteResponse =
                        devBoxesClient.beginDeleteDevBox(projectName, "me", "TestDevBox", null);
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, devBoxDeleteResponse.waitForCompletion().getStatus());
    }
}

