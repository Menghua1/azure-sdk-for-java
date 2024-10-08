// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpoint;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnection;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnectionWithSystemData;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateLinkServiceConnectionState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsUpdateByWorkspaceWithResponseMockTests {
    @Test
    public void testUpdateByWorkspaceWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"groupIds\":[\"kmqp\"],\"privateEndpoint\":{\"id\":\"hlfbcgwgc\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"ebqinjipnw\",\"actionsRequired\":\"ujqlafcbahh\"},\"provisioningState\":\"Creating\"},\"id\":\"foiyjwpfilk\",\"name\":\"kkholvdndvia\",\"type\":\"ogphuartvtiu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DesktopVirtualizationManager manager = DesktopVirtualizationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnectionWithSystemData response = manager.privateEndpointConnections()
            .updateByWorkspaceWithResponse("vmribiat", "gplucfotangcfhny", "zcugswvxwlmzqw",
                new PrivateEndpointConnection().withPrivateEndpoint(new PrivateEndpoint())
                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("n")
                        .withActionsRequired("oxgjiuqhibt")),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ebqinjipnw", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ujqlafcbahh", response.privateLinkServiceConnectionState().actionsRequired());
    }
}
