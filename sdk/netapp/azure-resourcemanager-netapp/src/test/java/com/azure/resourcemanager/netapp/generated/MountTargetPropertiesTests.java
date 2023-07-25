// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.MountTargetProperties;
import org.junit.jupiter.api.Assertions;

public final class MountTargetPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MountTargetProperties model =
            BinaryData
                .fromString(
                    "{\"mountTargetId\":\"hprwmdyv\",\"fileSystemId\":\"qtayri\",\"ipAddress\":\"ro\",\"smbServerFqdn\":\"bexrmcq\"}")
                .toObject(MountTargetProperties.class);
        Assertions.assertEquals("qtayri", model.fileSystemId());
        Assertions.assertEquals("bexrmcq", model.smbServerFqdn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MountTargetProperties model =
            new MountTargetProperties().withFileSystemId("qtayri").withSmbServerFqdn("bexrmcq");
        model = BinaryData.fromObject(model).toObject(MountTargetProperties.class);
        Assertions.assertEquals("qtayri", model.fileSystemId());
        Assertions.assertEquals("bexrmcq", model.smbServerFqdn());
    }
}
