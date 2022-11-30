// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.VMExtension;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VMExtensionTests {
    @Test
    public void testDeserialize() {
        VMExtension model =
            BinaryData
                .fromString(
                    "{\"name\":\"maqolbgycduie\",\"publisher\":\"tgccymvaolpss\",\"type\":\"qlfmmdnbb\",\"typeHandlerVersion\":\"zpswiydmc\",\"autoUpgradeMinorVersion\":true,\"settings\":\"datadxssadbzm\",\"protectedSettings\":\"datadfznudaodv\",\"provisionAfterExtensions\":[\"ncblylpst\",\"bhhxsrzdzuc\",\"rsc\",\"ntnev\"]}")
                .toObject(VMExtension.class);
        Assertions.assertEquals("maqolbgycduie", model.name());
        Assertions.assertEquals("tgccymvaolpss", model.publisher());
        Assertions.assertEquals("qlfmmdnbb", model.type());
        Assertions.assertEquals("zpswiydmc", model.typeHandlerVersion());
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
        Assertions.assertEquals("ncblylpst", model.provisionAfterExtensions().get(0));
    }

    @Test
    public void testSerialize() {
        VMExtension model =
            new VMExtension()
                .withName("maqolbgycduie")
                .withPublisher("tgccymvaolpss")
                .withType("qlfmmdnbb")
                .withTypeHandlerVersion("zpswiydmc")
                .withAutoUpgradeMinorVersion(true)
                .withSettings("datadxssadbzm")
                .withProtectedSettings("datadfznudaodv")
                .withProvisionAfterExtensions(Arrays.asList("ncblylpst", "bhhxsrzdzuc", "rsc", "ntnev"));
        model = BinaryData.fromObject(model).toObject(VMExtension.class);
        Assertions.assertEquals("maqolbgycduie", model.name());
        Assertions.assertEquals("tgccymvaolpss", model.publisher());
        Assertions.assertEquals("qlfmmdnbb", model.type());
        Assertions.assertEquals("zpswiydmc", model.typeHandlerVersion());
        Assertions.assertEquals(true, model.autoUpgradeMinorVersion());
        Assertions.assertEquals("ncblylpst", model.provisionAfterExtensions().get(0));
    }
}