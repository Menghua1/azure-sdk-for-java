// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.fluent.models.StorageMoverUpdateProperties;
import org.junit.jupiter.api.Assertions;

public final class StorageMoverUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageMoverUpdateProperties model
            = BinaryData.fromString("{\"description\":\"ginuvamih\"}").toObject(StorageMoverUpdateProperties.class);
        Assertions.assertEquals("ginuvamih", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageMoverUpdateProperties model = new StorageMoverUpdateProperties().withDescription("ginuvamih");
        model = BinaryData.fromObject(model).toObject(StorageMoverUpdateProperties.class);
        Assertions.assertEquals("ginuvamih", model.description());
    }
}
