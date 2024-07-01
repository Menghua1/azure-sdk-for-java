// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ChangeDataCaptureFolder;
import org.junit.jupiter.api.Assertions;

public final class ChangeDataCaptureFolderTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChangeDataCaptureFolder model
            = BinaryData.fromString("{\"name\":\"tekva\"}").toObject(ChangeDataCaptureFolder.class);
        Assertions.assertEquals("tekva", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChangeDataCaptureFolder model = new ChangeDataCaptureFolder().withName("tekva");
        model = BinaryData.fromObject(model).toObject(ChangeDataCaptureFolder.class);
        Assertions.assertEquals("tekva", model.name());
    }
}
