// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegment;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentSubnet;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksCreateSegmentsMockTests {
    @Test
    public void testCreateSegments() throws Exception {
        String responseStr
            = "{\"properties\":{\"displayName\":\"zydmxzjijpvuaurk\",\"connectedGateway\":\"ci\",\"subnet\":{\"dhcpRanges\":[\"fx\",\"dcoxnbk\",\"ja\"],\"gatewayAddress\":\"rnnqb\"},\"portVif\":[{\"portName\":\"izxqltgrd\"},{\"portName\":\"ypxrx\"},{\"portName\":\"fihwu\"}],\"status\":\"FAILURE\",\"provisioningState\":\"Succeeded\",\"revision\":277871752472439784},\"id\":\"xrblmliowxihs\",\"name\":\"nxw\",\"type\":\"agnepzwaklsb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        WorkloadNetworkSegment response = manager.workloadNetworks()
            .defineSegments("l")
            .withExistingPrivateCloud("psmgo", "guamlj")
            .withDisplayName("splzga")
            .withConnectedGateway("cshhv")
            .withSubnet(new WorkloadNetworkSegmentSubnet()
                .withDhcpRanges(Arrays.asList("nxkympqanxrjk", "xtwbta", "ypnyghshxc"))
                .withGatewayAddress("hkgmnsg"))
            .withRevision(4535170373281810468L)
            .create();

        Assertions.assertEquals("zydmxzjijpvuaurk", response.displayName());
        Assertions.assertEquals("ci", response.connectedGateway());
        Assertions.assertEquals("fx", response.subnet().dhcpRanges().get(0));
        Assertions.assertEquals("rnnqb", response.subnet().gatewayAddress());
        Assertions.assertEquals(277871752472439784L, response.revision());
    }
}
