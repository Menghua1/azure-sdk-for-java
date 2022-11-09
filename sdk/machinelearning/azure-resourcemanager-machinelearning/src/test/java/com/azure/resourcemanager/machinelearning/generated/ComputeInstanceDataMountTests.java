// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceDataMount;
import com.azure.resourcemanager.machinelearning.models.MountAction;
import com.azure.resourcemanager.machinelearning.models.MountState;
import com.azure.resourcemanager.machinelearning.models.SourceType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComputeInstanceDataMountTests {
    @Test
    public void testDeserialize() {
        ComputeInstanceDataMount model =
            BinaryData
                .fromString(
                    "{\"source\":\"wlxte\",\"sourceType\":\"URI\",\"mountName\":\"jgwdtgukranbl\",\"mountAction\":\"Unmount\",\"createdBy\":\"lkccuzgygqwa\",\"mountPath\":\"iul\",\"mountState\":\"UnmountFailed\",\"mountedOn\":\"2021-09-27T01:24:26Z\",\"error\":\"rglvaw\"}")
                .toObject(ComputeInstanceDataMount.class);
        Assertions.assertEquals("wlxte", model.source());
        Assertions.assertEquals(SourceType.URI, model.sourceType());
        Assertions.assertEquals("jgwdtgukranbl", model.mountName());
        Assertions.assertEquals(MountAction.UNMOUNT, model.mountAction());
        Assertions.assertEquals("lkccuzgygqwa", model.createdBy());
        Assertions.assertEquals("iul", model.mountPath());
        Assertions.assertEquals(MountState.UNMOUNT_FAILED, model.mountState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-27T01:24:26Z"), model.mountedOn());
        Assertions.assertEquals("rglvaw", model.error());
    }

    @Test
    public void testSerialize() {
        ComputeInstanceDataMount model =
            new ComputeInstanceDataMount()
                .withSource("wlxte")
                .withSourceType(SourceType.URI)
                .withMountName("jgwdtgukranbl")
                .withMountAction(MountAction.UNMOUNT)
                .withCreatedBy("lkccuzgygqwa")
                .withMountPath("iul")
                .withMountState(MountState.UNMOUNT_FAILED)
                .withMountedOn(OffsetDateTime.parse("2021-09-27T01:24:26Z"))
                .withError("rglvaw");
        model = BinaryData.fromObject(model).toObject(ComputeInstanceDataMount.class);
        Assertions.assertEquals("wlxte", model.source());
        Assertions.assertEquals(SourceType.URI, model.sourceType());
        Assertions.assertEquals("jgwdtgukranbl", model.mountName());
        Assertions.assertEquals(MountAction.UNMOUNT, model.mountAction());
        Assertions.assertEquals("lkccuzgygqwa", model.createdBy());
        Assertions.assertEquals("iul", model.mountPath());
        Assertions.assertEquals(MountState.UNMOUNT_FAILED, model.mountState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-27T01:24:26Z"), model.mountedOn());
        Assertions.assertEquals("rglvaw", model.error());
    }
}
