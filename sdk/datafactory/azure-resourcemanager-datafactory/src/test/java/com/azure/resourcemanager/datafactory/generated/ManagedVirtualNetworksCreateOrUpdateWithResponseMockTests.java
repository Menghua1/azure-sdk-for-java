// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetwork;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ManagedVirtualNetworksCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"vNetId\":\"wolzuk\",\"alias\":\"qlszlymy\",\"\":{\"qmi\":\"datajbu\",\"cvrfqqmbuvti\":\"dataukwmzm\"}},\"name\":\"mcymwr\",\"type\":\"kaztuldg\",\"etag\":\"edvxhqhptn\",\"id\":\"pafurttshr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ManagedVirtualNetworkResource response = manager.managedVirtualNetworks()
            .define("sta")
            .withExistingFactory("ycjuxabpuphg", "gmggkkjciz")
            .withProperties(
                new ManagedVirtualNetwork().withAdditionalProperties(mapOf("vNetId", "mjpgzwtlupz", "alias", "gsidk")))
            .withIfMatch("eyfkrcmx")
            .create();

        Assertions.assertEquals("pafurttshr", response.id());
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
