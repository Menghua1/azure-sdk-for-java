// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.selfhelp.SelfHelpManager;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpRequest;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DiscoverySolutionNlpsDiscoverSolutionsBySubscriptionWithResponseMockTests {
    @Test
    public void testDiscoverSolutionsBySubscriptionWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"problemTitle\":\"zoggculapz\",\"problemDescription\":\"rpgogtqxep\",\"serviceId\":\"lbfu\",\"problemClassificationId\":\"lyjt\",\"solutions\":[{}],\"relatedServices\":[{}]},\"id\":\"hvfcibyfmow\",\"name\":\"xrkjpvdw\",\"type\":\"fzwiivwzjbhyz\"},{\"properties\":{\"problemTitle\":\"rkambt\",\"problemDescription\":\"egv\",\"serviceId\":\"vuqeqvldspast\",\"problemClassificationId\":\"kkdmfl\",\"solutions\":[{},{},{}],\"relatedServices\":[{},{},{},{}]},\"id\":\"lx\",\"name\":\"ril\",\"type\":\"zapeewchpx\"},{\"properties\":{\"problemTitle\":\"wk\",\"problemDescription\":\"iycslevuf\",\"serviceId\":\"tcktyhjtqedcgzu\",\"problemClassificationId\":\"mmrqz\",\"solutions\":[{},{},{},{}],\"relatedServices\":[{},{}]},\"id\":\"gl\",\"name\":\"dzgkr\",\"type\":\"qeevt\"},{\"properties\":{\"problemTitle\":\"r\",\"problemDescription\":\"t\",\"serviceId\":\"ytp\",\"problemClassificationId\":\"mov\",\"solutions\":[{},{}],\"relatedServices\":[{},{},{}]},\"id\":\"wzqa\",\"name\":\"f\",\"type\":\"gzuriglaecxndt\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SelfHelpManager manager = SelfHelpManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DiscoveryNlpResponse response = manager.discoverySolutionNlps()
            .discoverSolutionsBySubscriptionWithResponse("ddrihpf",
                new DiscoveryNlpRequest().withIssueSummary("oqcaaewdaomdj")
                    .withResourceId("pjxxkzb")
                    .withServiceId("sgeivsiy")
                    .withAdditionalContext("kdncj"),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zoggculapz", response.value().get(0).problemTitle());
        Assertions.assertEquals("rpgogtqxep", response.value().get(0).problemDescription());
        Assertions.assertEquals("lbfu", response.value().get(0).serviceId());
        Assertions.assertEquals("lyjt", response.value().get(0).problemClassificationId());
    }
}
