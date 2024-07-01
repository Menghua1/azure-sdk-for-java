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
import com.azure.resourcemanager.netapp.models.SubvolumeModel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SubvolumesGetMetadataMockTests {
    @Test
    public void testGetMetadata() throws Exception {
        String responseStr
            = "{\"id\":\"qboshbra\",\"name\":\"pyyrmfs\",\"type\":\"pavbo\",\"properties\":{\"path\":\"pdbwnupgahxkum\",\"parentPath\":\"jcaacfdmmcpugm\",\"size\":2799453974287418624,\"bytesUsed\":5289288139576843863,\"permissions\":\"hbzehewho\",\"creationTimeStamp\":\"2021-08-24T10:40:17Z\",\"accessedTimeStamp\":\"2021-07-22T20:31:39Z\",\"modifiedTimeStamp\":\"2021-02-23T10:26:16Z\",\"changedTimeStamp\":\"2021-07-12T10:48:01Z\",\"provisioningState\":\"Succeeded\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SubvolumeModel response = manager.subvolumes()
            .getMetadata("ybww", "bdvibidmhmwffpl", "muvapc", "ccrrvweyoxoyyu", "phaimmoi",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pdbwnupgahxkum", response.path());
        Assertions.assertEquals("jcaacfdmmcpugm", response.parentPath());
        Assertions.assertEquals(2799453974287418624L, response.size());
        Assertions.assertEquals(5289288139576843863L, response.bytesUsed());
        Assertions.assertEquals("hbzehewho", response.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-24T10:40:17Z"), response.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-22T20:31:39Z"), response.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T10:26:16Z"), response.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-12T10:48:01Z"), response.changedTimestamp());
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }
}
