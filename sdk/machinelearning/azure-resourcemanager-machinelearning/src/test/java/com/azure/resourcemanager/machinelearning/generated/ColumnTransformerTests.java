// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ColumnTransformer;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ColumnTransformerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ColumnTransformer model = BinaryData.fromString(
            "{\"fields\":[\"psdudgco\",\"zomehxlantolam\",\"bijux\",\"qllczipvwdtgckz\"],\"parameters\":\"dataiqdlratrkw\"}")
            .toObject(ColumnTransformer.class);
        Assertions.assertEquals("psdudgco", model.fields().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ColumnTransformer model = new ColumnTransformer()
            .withFields(Arrays.asList("psdudgco", "zomehxlantolam", "bijux", "qllczipvwdtgckz"))
            .withParameters("dataiqdlratrkw");
        model = BinaryData.fromObject(model).toObject(ColumnTransformer.class);
        Assertions.assertEquals("psdudgco", model.fields().get(0));
    }
}
