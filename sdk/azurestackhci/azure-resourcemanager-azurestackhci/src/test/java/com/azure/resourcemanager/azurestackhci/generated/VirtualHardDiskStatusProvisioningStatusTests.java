// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.Status;
import com.azure.resourcemanager.azurestackhci.models.VirtualHardDiskStatusProvisioningStatus;
import org.junit.jupiter.api.Assertions;

public final class VirtualHardDiskStatusProvisioningStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualHardDiskStatusProvisioningStatus model =
            BinaryData
                .fromString("{\"operationId\":\"cuh\",\"status\":\"Failed\"}")
                .toObject(VirtualHardDiskStatusProvisioningStatus.class);
        Assertions.assertEquals("cuh", model.operationId());
        Assertions.assertEquals(Status.FAILED, model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualHardDiskStatusProvisioningStatus model =
            new VirtualHardDiskStatusProvisioningStatus().withOperationId("cuh").withStatus(Status.FAILED);
        model = BinaryData.fromObject(model).toObject(VirtualHardDiskStatusProvisioningStatus.class);
        Assertions.assertEquals("cuh", model.operationId());
        Assertions.assertEquals(Status.FAILED, model.status());
    }
}
