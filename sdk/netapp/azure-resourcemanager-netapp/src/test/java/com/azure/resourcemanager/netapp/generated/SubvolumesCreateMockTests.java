// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.SubvolumeInfo;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SubvolumesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"path\":\"ohec\",\"size\":4724039728117987325,\"parentPath\":\"ndyqleal\",\"provisioningState\":\"Succeeded\"},\"id\":\"br\",\"name\":\"fjmzsyzfho\",\"type\":\"lhikcyychunsj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SubvolumeInfo response = manager.subvolumes()
            .define("bsxtkcudfbsfarfs")
            .withExistingVolume("orim", "rsrrmoucsofldp", "viyfcaabeolhbhlv", "mxuq")
            .withPath("lkjxnqpvwgf")
            .withSize(4335540278124764929L)
            .withParentPath("ykizmdksaoaf")
            .create();

        Assertions.assertEquals("ohec", response.path());
        Assertions.assertEquals(4724039728117987325L, response.size());
        Assertions.assertEquals("ndyqleal", response.parentPath());
    }
}
