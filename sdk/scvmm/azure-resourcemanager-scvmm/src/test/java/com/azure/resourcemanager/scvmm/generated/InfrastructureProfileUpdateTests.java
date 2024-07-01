// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.InfrastructureProfileUpdate;
import org.junit.jupiter.api.Assertions;

public final class InfrastructureProfileUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InfrastructureProfileUpdate model = BinaryData.fromString("{\"checkpointType\":\"wkuofoskghsauu\"}")
            .toObject(InfrastructureProfileUpdate.class);
        Assertions.assertEquals("wkuofoskghsauu", model.checkpointType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InfrastructureProfileUpdate model = new InfrastructureProfileUpdate().withCheckpointType("wkuofoskghsauu");
        model = BinaryData.fromObject(model).toObject(InfrastructureProfileUpdate.class);
        Assertions.assertEquals("wkuofoskghsauu", model.checkpointType());
    }
}
