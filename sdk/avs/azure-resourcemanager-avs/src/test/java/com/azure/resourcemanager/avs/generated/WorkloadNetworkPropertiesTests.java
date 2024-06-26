// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkProperties;

public final class WorkloadNetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkProperties model
            = BinaryData.fromString("{\"provisioningState\":\"Succeeded\"}").toObject(WorkloadNetworkProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkProperties model = new WorkloadNetworkProperties();
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkProperties.class);
    }
}
