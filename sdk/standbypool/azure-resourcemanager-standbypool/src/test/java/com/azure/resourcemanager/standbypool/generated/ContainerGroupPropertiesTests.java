// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.models.ContainerGroupProfile;
import com.azure.resourcemanager.standbypool.models.ContainerGroupProperties;
import com.azure.resourcemanager.standbypool.models.Subnet;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContainerGroupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerGroupProperties model = BinaryData.fromString(
            "{\"containerGroupProfile\":{\"id\":\"l\",\"revision\":620396584491866948},\"subnetIds\":[{\"id\":\"rlkhbzhfepgzgq\"},{\"id\":\"xzlocxscp\"},{\"id\":\"ierhhbcsglummaj\"}]}")
            .toObject(ContainerGroupProperties.class);
        Assertions.assertEquals("l", model.containerGroupProfile().id());
        Assertions.assertEquals(620396584491866948L, model.containerGroupProfile().revision());
        Assertions.assertEquals("rlkhbzhfepgzgq", model.subnetIds().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerGroupProperties model = new ContainerGroupProperties()
            .withContainerGroupProfile(new ContainerGroupProfile().withId("l").withRevision(620396584491866948L))
            .withSubnetIds(Arrays.asList(new Subnet().withId("rlkhbzhfepgzgq"), new Subnet().withId("xzlocxscp"),
                new Subnet().withId("ierhhbcsglummaj")));
        model = BinaryData.fromObject(model).toObject(ContainerGroupProperties.class);
        Assertions.assertEquals("l", model.containerGroupProfile().id());
        Assertions.assertEquals(620396584491866948L, model.containerGroupProfile().revision());
        Assertions.assertEquals("rlkhbzhfepgzgq", model.subnetIds().get(0).id());
    }
}
