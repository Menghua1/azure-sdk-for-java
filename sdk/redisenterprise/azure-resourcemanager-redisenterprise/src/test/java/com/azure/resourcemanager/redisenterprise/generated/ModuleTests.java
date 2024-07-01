// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.models.Module;
import org.junit.jupiter.api.Assertions;

public final class ModuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Module model = BinaryData.fromString("{\"name\":\"t\",\"args\":\"vdfgiotk\",\"version\":\"utqxlngx\"}")
            .toObject(Module.class);
        Assertions.assertEquals("t", model.name());
        Assertions.assertEquals("vdfgiotk", model.args());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Module model = new Module().withName("t").withArgs("vdfgiotk");
        model = BinaryData.fromObject(model).toObject(Module.class);
        Assertions.assertEquals("t", model.name());
        Assertions.assertEquals("vdfgiotk", model.args());
    }
}
