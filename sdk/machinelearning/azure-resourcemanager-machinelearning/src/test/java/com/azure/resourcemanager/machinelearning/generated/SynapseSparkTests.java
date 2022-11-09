// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AutoPauseProperties;
import com.azure.resourcemanager.machinelearning.models.AutoScaleProperties;
import com.azure.resourcemanager.machinelearning.models.SynapseSpark;
import com.azure.resourcemanager.machinelearning.models.SynapseSparkProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SynapseSparkTests {
    @Test
    public void testDeserialize() {
        SynapseSpark model =
            BinaryData
                .fromString(
                    "{\"computeType\":\"SynapseSpark\",\"properties\":{\"autoScaleProperties\":{\"minNodeCount\":1214736566,\"enabled\":false,\"maxNodeCount\":576028683},\"autoPauseProperties\":{\"delayInMinutes\":909175637,\"enabled\":true},\"sparkVersion\":\"pedbwdpyqy\",\"nodeCount\":895891546,\"nodeSize\":\"bmdnafcbqwre\",\"nodeSizeFamily\":\"ela\",\"subscriptionId\":\"cigeleohdbvqvw\",\"resourceGroup\":\"jopwbeonrlkwz\",\"workspaceName\":\"ybxc\",\"poolName\":\"kxcpt\"},\"computeLocation\":\"qfyiaseqchkr\",\"provisioningState\":\"Canceled\",\"description\":\"azisgyk\",\"createdOn\":\"2021-05-23T19:22:14Z\",\"modifiedOn\":\"2021-11-23T05:48:50Z\",\"resourceId\":\"nbwzohmnrxxbso\",\"provisioningErrors\":[],\"isAttachedCompute\":true,\"disableLocalAuth\":false}")
                .toObject(SynapseSpark.class);
        Assertions.assertEquals("qfyiaseqchkr", model.computeLocation());
        Assertions.assertEquals("azisgyk", model.description());
        Assertions.assertEquals("nbwzohmnrxxbso", model.resourceId());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(1214736566, model.properties().autoScaleProperties().minNodeCount());
        Assertions.assertEquals(false, model.properties().autoScaleProperties().enabled());
        Assertions.assertEquals(576028683, model.properties().autoScaleProperties().maxNodeCount());
        Assertions.assertEquals(909175637, model.properties().autoPauseProperties().delayInMinutes());
        Assertions.assertEquals(true, model.properties().autoPauseProperties().enabled());
        Assertions.assertEquals("pedbwdpyqy", model.properties().sparkVersion());
        Assertions.assertEquals(895891546, model.properties().nodeCount());
        Assertions.assertEquals("bmdnafcbqwre", model.properties().nodeSize());
        Assertions.assertEquals("ela", model.properties().nodeSizeFamily());
        Assertions.assertEquals("cigeleohdbvqvw", model.properties().subscriptionId());
        Assertions.assertEquals("jopwbeonrlkwz", model.properties().resourceGroup());
        Assertions.assertEquals("ybxc", model.properties().workspaceName());
        Assertions.assertEquals("kxcpt", model.properties().poolName());
    }

    @Test
    public void testSerialize() {
        SynapseSpark model =
            new SynapseSpark()
                .withComputeLocation("qfyiaseqchkr")
                .withDescription("azisgyk")
                .withResourceId("nbwzohmnrxxbso")
                .withDisableLocalAuth(false)
                .withProperties(
                    new SynapseSparkProperties()
                        .withAutoScaleProperties(
                            new AutoScaleProperties()
                                .withMinNodeCount(1214736566)
                                .withEnabled(false)
                                .withMaxNodeCount(576028683))
                        .withAutoPauseProperties(
                            new AutoPauseProperties().withDelayInMinutes(909175637).withEnabled(true))
                        .withSparkVersion("pedbwdpyqy")
                        .withNodeCount(895891546)
                        .withNodeSize("bmdnafcbqwre")
                        .withNodeSizeFamily("ela")
                        .withSubscriptionId("cigeleohdbvqvw")
                        .withResourceGroup("jopwbeonrlkwz")
                        .withWorkspaceName("ybxc")
                        .withPoolName("kxcpt"));
        model = BinaryData.fromObject(model).toObject(SynapseSpark.class);
        Assertions.assertEquals("qfyiaseqchkr", model.computeLocation());
        Assertions.assertEquals("azisgyk", model.description());
        Assertions.assertEquals("nbwzohmnrxxbso", model.resourceId());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(1214736566, model.properties().autoScaleProperties().minNodeCount());
        Assertions.assertEquals(false, model.properties().autoScaleProperties().enabled());
        Assertions.assertEquals(576028683, model.properties().autoScaleProperties().maxNodeCount());
        Assertions.assertEquals(909175637, model.properties().autoPauseProperties().delayInMinutes());
        Assertions.assertEquals(true, model.properties().autoPauseProperties().enabled());
        Assertions.assertEquals("pedbwdpyqy", model.properties().sparkVersion());
        Assertions.assertEquals(895891546, model.properties().nodeCount());
        Assertions.assertEquals("bmdnafcbqwre", model.properties().nodeSize());
        Assertions.assertEquals("ela", model.properties().nodeSizeFamily());
        Assertions.assertEquals("cigeleohdbvqvw", model.properties().subscriptionId());
        Assertions.assertEquals("jopwbeonrlkwz", model.properties().resourceGroup());
        Assertions.assertEquals("ybxc", model.properties().workspaceName());
        Assertions.assertEquals("kxcpt", model.properties().poolName());
    }
}
