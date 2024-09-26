// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.webpubsub.WebPubSubManager;
import com.azure.resourcemanager.webpubsub.models.SkuList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WebPubSubsListSkusWithResponseMockTests {
    @Test
    public void testListSkusWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"resourceType\":\"cazuaw\",\"sku\":{\"name\":\"z\",\"tier\":\"Standard\",\"size\":\"mwabzxrvxc\",\"family\":\"hsphaivmxyas\",\"capacity\":1805110370},\"capacity\":{\"minimum\":1752644697,\"maximum\":826140742,\"default\":1920170301,\"allowedValues\":[298842617],\"scaleType\":\"Automatic\"}},{\"resourceType\":\"nsmjbl\",\"sku\":{\"name\":\"jhlnymzotqyryu\",\"tier\":\"Standard\",\"size\":\"qqvxmvwfgtayxons\",\"family\":\"e\",\"capacity\":2074822274},\"capacity\":{\"minimum\":330319008,\"maximum\":1093253007,\"default\":1664438715,\"allowedValues\":[1417564823,570379226,1936009218],\"scaleType\":\"Automatic\"}},{\"resourceType\":\"gsxgnxfyqon\",\"sku\":{\"name\":\"qoxwd\",\"tier\":\"Basic\",\"size\":\"xiqxeiiqbimh\",\"family\":\"wwinhehf\",\"capacity\":1711839978},\"capacity\":{\"minimum\":808176503,\"maximum\":712044714,\"default\":1779769711,\"allowedValues\":[29362657,1824383862],\"scaleType\":\"Manual\"}}],\"nextLink\":\"vqvxk\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        WebPubSubManager manager = WebPubSubManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SkuList response = manager.webPubSubs()
            .listSkusWithResponse("clt", "jedexxmlf", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
