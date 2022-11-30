// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.Dimension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DimensionTests {
    @Test
    public void testDeserialize() {
        Dimension model =
            BinaryData
                .fromString(
                    "{\"name\":\"gsntnbybkzgcwr\",\"displayName\":\"lxxwrljdouskc\",\"internalName\":\"kocrcjdkwtnhx\",\"toBeExportedForShoebox\":true}")
                .toObject(Dimension.class);
        Assertions.assertEquals("gsntnbybkzgcwr", model.name());
        Assertions.assertEquals("lxxwrljdouskc", model.displayName());
        Assertions.assertEquals("kocrcjdkwtnhx", model.internalName());
        Assertions.assertEquals(true, model.toBeExportedForShoebox());
    }

    @Test
    public void testSerialize() {
        Dimension model =
            new Dimension()
                .withName("gsntnbybkzgcwr")
                .withDisplayName("lxxwrljdouskc")
                .withInternalName("kocrcjdkwtnhx")
                .withToBeExportedForShoebox(true);
        model = BinaryData.fromObject(model).toObject(Dimension.class);
        Assertions.assertEquals("gsntnbybkzgcwr", model.name());
        Assertions.assertEquals("lxxwrljdouskc", model.displayName());
        Assertions.assertEquals("kocrcjdkwtnhx", model.internalName());
        Assertions.assertEquals(true, model.toBeExportedForShoebox());
    }
}