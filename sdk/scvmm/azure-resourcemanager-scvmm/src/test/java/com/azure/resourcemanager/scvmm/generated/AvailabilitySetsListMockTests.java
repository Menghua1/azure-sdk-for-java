// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.scvmm.ScvmmManager;
import com.azure.resourcemanager.scvmm.models.AvailabilitySet;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AvailabilitySetsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"availabilitySetName\":\"cf\",\"vmmServerId\":\"rxgkne\",\"provisioningState\":\"Deleting\"},\"extendedLocation\":{\"type\":\"nzqodfvpg\",\"name\":\"oxgsgbpfgzdjtx\"},\"location\":\"flbqvgaq\",\"tags\":{\"cqusr\":\"a\",\"lduycv\":\"vetnwsdtutn\"},\"id\":\"zhyrmewipmve\",\"name\":\"dxukuqgsjjxundxg\",\"type\":\"etw\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ScvmmManager manager = ScvmmManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AvailabilitySet> response = manager.availabilitySets().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("flbqvgaq", response.iterator().next().location());
        Assertions.assertEquals("a", response.iterator().next().tags().get("cqusr"));
        Assertions.assertEquals("cf", response.iterator().next().properties().availabilitySetName());
        Assertions.assertEquals("rxgkne", response.iterator().next().properties().vmmServerId());
        Assertions.assertEquals("nzqodfvpg", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals("oxgsgbpfgzdjtx", response.iterator().next().extendedLocation().name());
    }
}
