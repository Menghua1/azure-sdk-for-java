// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.fluent.models.OperationInner;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model = BinaryData.fromString(
            "{\"name\":\"pvecxgodeb\",\"isDataAction\":false,\"display\":{\"provider\":\"bmpukgriwflz\",\"resource\":\"bxzpuzycisp\",\"operation\":\"zahmgkbrpyydhibn\",\"description\":\"qkpikadrgvtqagnb\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}")
            .toObject(OperationInner.class);
    }
}
