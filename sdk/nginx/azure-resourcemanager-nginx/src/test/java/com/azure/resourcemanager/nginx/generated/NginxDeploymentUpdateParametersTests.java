// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.AutoUpgradeProfile;
import com.azure.resourcemanager.nginx.models.IdentityProperties;
import com.azure.resourcemanager.nginx.models.IdentityType;
import com.azure.resourcemanager.nginx.models.NginxDeploymentScalingProperties;
import com.azure.resourcemanager.nginx.models.NginxDeploymentUpdateParameters;
import com.azure.resourcemanager.nginx.models.NginxDeploymentUpdateProperties;
import com.azure.resourcemanager.nginx.models.NginxDeploymentUserProfile;
import com.azure.resourcemanager.nginx.models.NginxLogging;
import com.azure.resourcemanager.nginx.models.NginxStorageAccount;
import com.azure.resourcemanager.nginx.models.ResourceSku;
import com.azure.resourcemanager.nginx.models.ScaleProfile;
import com.azure.resourcemanager.nginx.models.ScaleProfileCapacity;
import com.azure.resourcemanager.nginx.models.UserIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NginxDeploymentUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NginxDeploymentUpdateParameters model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"ocfs\",\"tenantId\":\"s\",\"type\":\"None\",\"userAssignedIdentities\":{\"oczvy\":{\"principalId\":\"tki\",\"clientId\":\"xhqyudxorrqnb\"}}},\"tags\":{\"vdfwatkpn\":\"rvkdvjsllrm\",\"wiqzbqjvsovmyo\":\"ulexxbczwtr\"},\"sku\":{\"name\":\"cspkwlhzdobpxjmf\"},\"location\":\"vvnchrkcc\",\"properties\":{\"enableDiagnosticsSupport\":true,\"logging\":{\"storageAccount\":{\"accountName\":\"khrs\",\"containerName\":\"iwkuofos\"}},\"scalingProperties\":{\"capacity\":1623882899,\"autoScaleSettings\":{\"profiles\":[{\"name\":\"uimjmvx\",\"capacity\":{\"min\":1584034364,\"max\":192455104}},{\"name\":\"uugidyjrrfby\",\"capacity\":{\"min\":1774598517,\"max\":1874197992}},{\"name\":\"v\",\"capacity\":{\"min\":499062312,\"max\":766224962}},{\"name\":\"sonpclhocohs\",\"capacity\":{\"min\":1118484246,\"max\":442163665}}]}},\"userProfile\":{\"preferredEmail\":\"eggzfb\"},\"autoUpgradeProfile\":{\"upgradeChannel\":\"fmvfaxkffeiit\"}}}")
            .toObject(NginxDeploymentUpdateParameters.class);
        Assertions.assertEquals(IdentityType.NONE, model.identity().type());
        Assertions.assertEquals("rvkdvjsllrm", model.tags().get("vdfwatkpn"));
        Assertions.assertEquals("cspkwlhzdobpxjmf", model.sku().name());
        Assertions.assertEquals("vvnchrkcc", model.location());
        Assertions.assertEquals(true, model.properties().enableDiagnosticsSupport());
        Assertions.assertEquals("khrs", model.properties().logging().storageAccount().accountName());
        Assertions.assertEquals("iwkuofos", model.properties().logging().storageAccount().containerName());
        Assertions.assertEquals(1623882899, model.properties().scalingProperties().capacity());
        Assertions.assertEquals("uimjmvx", model.properties().scalingProperties().profiles().get(0).name());
        Assertions.assertEquals(1584034364, model.properties().scalingProperties().profiles().get(0).capacity().min());
        Assertions.assertEquals(192455104, model.properties().scalingProperties().profiles().get(0).capacity().max());
        Assertions.assertEquals("eggzfb", model.properties().userProfile().preferredEmail());
        Assertions.assertEquals("fmvfaxkffeiit", model.properties().autoUpgradeProfile().upgradeChannel());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NginxDeploymentUpdateParameters model = new NginxDeploymentUpdateParameters()
            .withIdentity(new IdentityProperties().withType(IdentityType.NONE)
                .withUserAssignedIdentities(mapOf("oczvy", new UserIdentityProperties())))
            .withTags(mapOf("vdfwatkpn", "rvkdvjsllrm", "wiqzbqjvsovmyo", "ulexxbczwtr"))
            .withSku(new ResourceSku().withName("cspkwlhzdobpxjmf"))
            .withLocation("vvnchrkcc")
            .withProperties(new NginxDeploymentUpdateProperties().withEnableDiagnosticsSupport(true)
                .withLogging(new NginxLogging().withStorageAccount(
                    new NginxStorageAccount().withAccountName("khrs").withContainerName("iwkuofos")))
                .withScalingProperties(new NginxDeploymentScalingProperties().withCapacity(1623882899)
                    .withProfiles(Arrays.asList(
                        new ScaleProfile().withName("uimjmvx")
                            .withCapacity(new ScaleProfileCapacity().withMin(1584034364).withMax(192455104)),
                        new ScaleProfile().withName("uugidyjrrfby")
                            .withCapacity(new ScaleProfileCapacity().withMin(1774598517).withMax(1874197992)),
                        new ScaleProfile().withName("v")
                            .withCapacity(new ScaleProfileCapacity().withMin(499062312).withMax(766224962)),
                        new ScaleProfile().withName("sonpclhocohs")
                            .withCapacity(new ScaleProfileCapacity().withMin(1118484246).withMax(442163665)))))
                .withUserProfile(new NginxDeploymentUserProfile().withPreferredEmail("eggzfb"))
                .withAutoUpgradeProfile(new AutoUpgradeProfile().withUpgradeChannel("fmvfaxkffeiit")));
        model = BinaryData.fromObject(model).toObject(NginxDeploymentUpdateParameters.class);
        Assertions.assertEquals(IdentityType.NONE, model.identity().type());
        Assertions.assertEquals("rvkdvjsllrm", model.tags().get("vdfwatkpn"));
        Assertions.assertEquals("cspkwlhzdobpxjmf", model.sku().name());
        Assertions.assertEquals("vvnchrkcc", model.location());
        Assertions.assertEquals(true, model.properties().enableDiagnosticsSupport());
        Assertions.assertEquals("khrs", model.properties().logging().storageAccount().accountName());
        Assertions.assertEquals("iwkuofos", model.properties().logging().storageAccount().containerName());
        Assertions.assertEquals(1623882899, model.properties().scalingProperties().capacity());
        Assertions.assertEquals("uimjmvx", model.properties().scalingProperties().profiles().get(0).name());
        Assertions.assertEquals(1584034364, model.properties().scalingProperties().profiles().get(0).capacity().min());
        Assertions.assertEquals(192455104, model.properties().scalingProperties().profiles().get(0).capacity().max());
        Assertions.assertEquals("eggzfb", model.properties().userProfile().preferredEmail());
        Assertions.assertEquals("fmvfaxkffeiit", model.properties().autoUpgradeProfile().upgradeChannel());
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
