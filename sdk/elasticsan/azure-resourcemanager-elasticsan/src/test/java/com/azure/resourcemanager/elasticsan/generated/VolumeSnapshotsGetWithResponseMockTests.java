// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.Snapshot;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VolumeSnapshotsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"creationData\":{\"sourceId\":\"gplcrpwjxeznoigb\"},\"provisioningState\":\"Pending\",\"sourceVolumeSizeGiB\":2186486162242158404,\"volumeName\":\"pn\"},\"id\":\"azej\",\"name\":\"oqkag\",\"type\":\"hsxttaugzxnf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ElasticSanManager manager = ElasticSanManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Snapshot response = manager.volumeSnapshots()
            .getWithResponse("fxtsgum", "jglikkxwslolb", "pvuzlmv", "elfk", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("gplcrpwjxeznoigb", response.creationData().sourceId());
    }
}
