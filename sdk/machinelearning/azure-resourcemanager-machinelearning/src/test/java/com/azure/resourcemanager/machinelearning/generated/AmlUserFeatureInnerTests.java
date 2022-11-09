// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.AmlUserFeatureInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AmlUserFeatureInnerTests {
    @Test
    public void testDeserialize() {
        AmlUserFeatureInner model =
            BinaryData
                .fromString("{\"id\":\"pkt\",\"displayName\":\"ylkmqp\",\"description\":\"yhlfb\"}")
                .toObject(AmlUserFeatureInner.class);
        Assertions.assertEquals("pkt", model.id());
        Assertions.assertEquals("ylkmqp", model.displayName());
        Assertions.assertEquals("yhlfb", model.description());
    }

    @Test
    public void testSerialize() {
        AmlUserFeatureInner model =
            new AmlUserFeatureInner().withId("pkt").withDisplayName("ylkmqp").withDescription("yhlfb");
        model = BinaryData.fromObject(model).toObject(AmlUserFeatureInner.class);
        Assertions.assertEquals("pkt", model.id());
        Assertions.assertEquals("ylkmqp", model.displayName());
        Assertions.assertEquals("yhlfb", model.description());
    }
}
