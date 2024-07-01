// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateDistributor;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateUpdateParametersProperties;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateVmProfile;
import com.azure.resourcemanager.imagebuilder.models.VirtualNetworkConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplateUpdateParametersPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplateUpdateParametersProperties model = BinaryData.fromString(
            "{\"distribute\":[{\"type\":\"ImageTemplateDistributor\",\"runOutputName\":\"bngui\",\"artifactTags\":{\"x\":\"uizga\"}},{\"type\":\"ImageTemplateDistributor\",\"runOutputName\":\"fizuckyf\",\"artifactTags\":{\"zuhtymwisdkfthwx\":\"fidfvzw\",\"mijcmmxdcufufs\":\"nteiwaopv\",\"fycc\":\"pymzidnsezcxtbzs\"}},{\"type\":\"ImageTemplateDistributor\",\"runOutputName\":\"newmdwzjeiachbo\",\"artifactTags\":{\"eeh\":\"lnrosfqp\",\"swjdkirso\":\"zvypyqrimzinp\",\"soifiyipjxsqw\":\"dqxhcrmnohjtckwh\",\"bznorcjxvsnby\":\"gr\"}}],\"vmProfile\":{\"vmSize\":\"bnmo\",\"osDiskSizeGB\":1668091107,\"userAssignedIdentities\":[\"hurzafblj\",\"gpbtoqcjmklj\",\"vbqid\",\"qajzyulpkudjkr\"],\"vnetConfig\":{\"subnetId\":\"bzhfepgzgqexz\",\"containerInstanceSubnetId\":\"c\",\"proxyVmSize\":\"c\"}}}")
            .toObject(ImageTemplateUpdateParametersProperties.class);
        Assertions.assertEquals("bngui", model.distribute().get(0).runOutputName());
        Assertions.assertEquals("uizga", model.distribute().get(0).artifactTags().get("x"));
        Assertions.assertEquals("bnmo", model.vmProfile().vmSize());
        Assertions.assertEquals(1668091107, model.vmProfile().osDiskSizeGB());
        Assertions.assertEquals("hurzafblj", model.vmProfile().userAssignedIdentities().get(0));
        Assertions.assertEquals("bzhfepgzgqexz", model.vmProfile().vnetConfig().subnetId());
        Assertions.assertEquals("c", model.vmProfile().vnetConfig().containerInstanceSubnetId());
        Assertions.assertEquals("c", model.vmProfile().vnetConfig().proxyVmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplateUpdateParametersProperties model = new ImageTemplateUpdateParametersProperties()
            .withDistribute(Arrays.asList(
                new ImageTemplateDistributor().withRunOutputName("bngui").withArtifactTags(mapOf("x", "uizga")),
                new ImageTemplateDistributor().withRunOutputName("fizuckyf")
                    .withArtifactTags(mapOf("zuhtymwisdkfthwx", "fidfvzw", "mijcmmxdcufufs", "nteiwaopv", "fycc",
                        "pymzidnsezcxtbzs")),
                new ImageTemplateDistributor().withRunOutputName("newmdwzjeiachbo")
                    .withArtifactTags(mapOf("eeh", "lnrosfqp", "swjdkirso", "zvypyqrimzinp", "soifiyipjxsqw",
                        "dqxhcrmnohjtckwh", "bznorcjxvsnby", "gr"))))
            .withVmProfile(new ImageTemplateVmProfile().withVmSize("bnmo")
                .withOsDiskSizeGB(1668091107)
                .withUserAssignedIdentities(Arrays.asList("hurzafblj", "gpbtoqcjmklj", "vbqid", "qajzyulpkudjkr"))
                .withVnetConfig(new VirtualNetworkConfig().withSubnetId("bzhfepgzgqexz")
                    .withContainerInstanceSubnetId("c")
                    .withProxyVmSize("c")));
        model = BinaryData.fromObject(model).toObject(ImageTemplateUpdateParametersProperties.class);
        Assertions.assertEquals("bngui", model.distribute().get(0).runOutputName());
        Assertions.assertEquals("uizga", model.distribute().get(0).artifactTags().get("x"));
        Assertions.assertEquals("bnmo", model.vmProfile().vmSize());
        Assertions.assertEquals(1668091107, model.vmProfile().osDiskSizeGB());
        Assertions.assertEquals("hurzafblj", model.vmProfile().userAssignedIdentities().get(0));
        Assertions.assertEquals("bzhfepgzgqexz", model.vmProfile().vnetConfig().subnetId());
        Assertions.assertEquals("c", model.vmProfile().vnetConfig().containerInstanceSubnetId());
        Assertions.assertEquals("c", model.vmProfile().vnetConfig().proxyVmSize());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
