// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.DbServer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DbServersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"ocid\":\"bpdqmjxlyy\",\"displayName\":\"lgouwtlmjj\",\"compartmentId\":\"ojqtobaxk\",\"exadataInfrastructureId\":\"ytunlbfjkwr\",\"cpuCoreCount\":33332792,\"dbServerPatchingDetails\":{\"estimatedPatchDuration\":913517833,\"patchingStatus\":\"Scheduled\",\"timePatchingEnded\":\"2021-11-28T23:19:16Z\",\"timePatchingStarted\":\"2021-10-30T08:45:06Z\"},\"maxMemoryInGbs\":1414461023,\"dbNodeStorageSizeInGbs\":171540417,\"vmClusterIds\":[\"nxaulk\"],\"dbNodeIds\":[\"d\"],\"lifecycleDetails\":\"fmjnnawtqa\",\"lifecycleState\":\"Available\",\"maxCpuCount\":1193273500,\"autonomousVmClusterIds\":[\"ggqowey\"],\"autonomousVirtualMachineIds\":[\"hlisngw\",\"lqqmpiz\",\"uwnpqxpxiwfcng\",\"saasiixtmkzj\"],\"maxDbNodeStorageInGbs\":671429821,\"memorySizeInGbs\":679945701,\"shape\":\"hgfgrwsd\",\"timeCreated\":\"2021-10-21T21:04:50Z\",\"provisioningState\":\"Succeeded\"},\"id\":\"vzbglbyvi\",\"name\":\"tctbrxkjzwrgxffm\",\"type\":\"hkwfbkgozxwop\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DbServer response = manager.dbServers()
            .getWithResponse("nnbsoqeqa", "arvlagunbt", "febwlnbmhyreeudz", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
