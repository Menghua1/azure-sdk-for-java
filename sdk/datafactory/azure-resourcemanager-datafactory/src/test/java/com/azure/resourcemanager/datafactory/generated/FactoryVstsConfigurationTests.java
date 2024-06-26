// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FactoryVstsConfiguration;
import org.junit.jupiter.api.Assertions;

public final class FactoryVstsConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FactoryVstsConfiguration model = BinaryData.fromString(
            "{\"type\":\"FactoryVSTSConfiguration\",\"projectName\":\"qv\",\"tenantId\":\"makli\",\"accountName\":\"qcahyhxal\",\"repositoryName\":\"bx\",\"collaborationBranch\":\"woijpodtbl\",\"rootFolder\":\"pkkwj\",\"lastCommitId\":\"odqhyk\",\"disablePublish\":false}")
            .toObject(FactoryVstsConfiguration.class);
        Assertions.assertEquals("qcahyhxal", model.accountName());
        Assertions.assertEquals("bx", model.repositoryName());
        Assertions.assertEquals("woijpodtbl", model.collaborationBranch());
        Assertions.assertEquals("pkkwj", model.rootFolder());
        Assertions.assertEquals("odqhyk", model.lastCommitId());
        Assertions.assertEquals(false, model.disablePublish());
        Assertions.assertEquals("qv", model.projectName());
        Assertions.assertEquals("makli", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FactoryVstsConfiguration model = new FactoryVstsConfiguration().withAccountName("qcahyhxal")
            .withRepositoryName("bx")
            .withCollaborationBranch("woijpodtbl")
            .withRootFolder("pkkwj")
            .withLastCommitId("odqhyk")
            .withDisablePublish(false)
            .withProjectName("qv")
            .withTenantId("makli");
        model = BinaryData.fromObject(model).toObject(FactoryVstsConfiguration.class);
        Assertions.assertEquals("qcahyhxal", model.accountName());
        Assertions.assertEquals("bx", model.repositoryName());
        Assertions.assertEquals("woijpodtbl", model.collaborationBranch());
        Assertions.assertEquals("pkkwj", model.rootFolder());
        Assertions.assertEquals("odqhyk", model.lastCommitId());
        Assertions.assertEquals(false, model.disablePublish());
        Assertions.assertEquals("qv", model.projectName());
        Assertions.assertEquals("makli", model.tenantId());
    }
}
