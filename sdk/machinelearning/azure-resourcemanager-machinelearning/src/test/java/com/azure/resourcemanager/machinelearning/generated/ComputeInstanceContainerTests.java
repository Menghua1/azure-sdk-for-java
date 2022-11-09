// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.Autosave;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceContainer;
import com.azure.resourcemanager.machinelearning.models.ComputeInstanceEnvironmentInfo;
import com.azure.resourcemanager.machinelearning.models.Network;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComputeInstanceContainerTests {
    @Test
    public void testDeserialize() {
        ComputeInstanceContainer model =
            BinaryData
                .fromString(
                    "{\"name\":\"khvuhxepmrutz\",\"autosave\":\"Remote\",\"gpu\":\"obns\",\"network\":\"Host\",\"environment\":{\"name\":\"ltymkmvguihywart\",\"version\":\"phkixkykxdssjpe\"},\"services\":[\"datacfxhikkflrmy\"]}")
                .toObject(ComputeInstanceContainer.class);
        Assertions.assertEquals("khvuhxepmrutz", model.name());
        Assertions.assertEquals(Autosave.REMOTE, model.autosave());
        Assertions.assertEquals("obns", model.gpu());
        Assertions.assertEquals(Network.HOST, model.network());
        Assertions.assertEquals("ltymkmvguihywart", model.environment().name());
        Assertions.assertEquals("phkixkykxdssjpe", model.environment().version());
    }

    @Test
    public void testSerialize() {
        ComputeInstanceContainer model =
            new ComputeInstanceContainer()
                .withName("khvuhxepmrutz")
                .withAutosave(Autosave.REMOTE)
                .withGpu("obns")
                .withNetwork(Network.HOST)
                .withEnvironment(
                    new ComputeInstanceEnvironmentInfo().withName("ltymkmvguihywart").withVersion("phkixkykxdssjpe"));
        model = BinaryData.fromObject(model).toObject(ComputeInstanceContainer.class);
        Assertions.assertEquals("khvuhxepmrutz", model.name());
        Assertions.assertEquals(Autosave.REMOTE, model.autosave());
        Assertions.assertEquals("obns", model.gpu());
        Assertions.assertEquals(Network.HOST, model.network());
        Assertions.assertEquals("ltymkmvguihywart", model.environment().name());
        Assertions.assertEquals("phkixkykxdssjpe", model.environment().version());
    }
}
