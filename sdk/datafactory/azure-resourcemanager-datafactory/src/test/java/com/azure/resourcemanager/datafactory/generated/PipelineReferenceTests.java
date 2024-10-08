// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import org.junit.jupiter.api.Assertions;

public final class PipelineReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PipelineReference model
            = BinaryData.fromString("{\"referenceName\":\"pycvjqdvdwkqpldr\",\"name\":\"fgnaavuagnteta\"}")
                .toObject(PipelineReference.class);
        Assertions.assertEquals("pycvjqdvdwkqpldr", model.referenceName());
        Assertions.assertEquals("fgnaavuagnteta", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PipelineReference model
            = new PipelineReference().withReferenceName("pycvjqdvdwkqpldr").withName("fgnaavuagnteta");
        model = BinaryData.fromObject(model).toObject(PipelineReference.class);
        Assertions.assertEquals("pycvjqdvdwkqpldr", model.referenceName());
        Assertions.assertEquals("fgnaavuagnteta", model.name());
    }
}
