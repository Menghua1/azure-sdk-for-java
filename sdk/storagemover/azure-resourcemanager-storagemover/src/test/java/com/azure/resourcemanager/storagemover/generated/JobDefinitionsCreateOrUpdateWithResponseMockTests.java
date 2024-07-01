// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.storagemover.StorageMoverManager;
import com.azure.resourcemanager.storagemover.models.CopyMode;
import com.azure.resourcemanager.storagemover.models.JobDefinition;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JobDefinitionsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"pvhelxprg\",\"copyMode\":\"Additive\",\"sourceName\":\"atddc\",\"sourceResourceId\":\"bcuejrjxgci\",\"sourceSubpath\":\"brh\",\"targetName\":\"sxsdqrhzoymibm\",\"targetResourceId\":\"yiba\",\"targetSubpath\":\"fluszdtm\",\"latestJobRunName\":\"kwofyyvoq\",\"latestJobRunResourceId\":\"piexpbtgiw\",\"latestJobRunStatus\":\"CancelRequested\",\"agentName\":\"nwashrtd\",\"agentResourceId\":\"cnqxwbpokulpi\",\"provisioningState\":\"Canceled\"},\"id\":\"asipqiio\",\"name\":\"yuq\",\"type\":\"rpqlp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StorageMoverManager manager = StorageMoverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        JobDefinition response = manager.jobDefinitions()
            .define("obzdopcjwvnhdl")
            .withExistingProject("gafcnihgwqapnedg", "bcvkcvqvpkeq", "cvdrhvoodsot")
            .withCopyMode(CopyMode.MIRROR)
            .withSourceName("wuoegrpk")
            .withTargetName("uefywsbpfvmwy")
            .withDescription("mgxcxrslpm")
            .withSourceSubpath("kzzlvmbmpaxmodf")
            .withTargetSubpath("akcp")
            .withAgentName("smond")
            .create();

        Assertions.assertEquals("pvhelxprg", response.description());
        Assertions.assertEquals(CopyMode.ADDITIVE, response.copyMode());
        Assertions.assertEquals("atddc", response.sourceName());
        Assertions.assertEquals("brh", response.sourceSubpath());
        Assertions.assertEquals("sxsdqrhzoymibm", response.targetName());
        Assertions.assertEquals("fluszdtm", response.targetSubpath());
        Assertions.assertEquals("nwashrtd", response.agentName());
    }
}
