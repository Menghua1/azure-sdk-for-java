// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpoint;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Canceled\",\"privateEndpoint\":{\"id\":\"sdbnwdcfhucqdpf\"},\"groupIds\":[\"lsbjjcanvxbv\",\"vudutncor\"],\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"tvcof\",\"actionsRequired\":\"f\"}},\"id\":\"kgjubgdknnqvsazn\",\"name\":\"n\",\"type\":\"orudsgsa\"}")
            .toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals("sdbnwdcfhucqdpf", model.privateEndpoint().id());
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("tvcof", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("f", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model
            = new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint().withId("sdbnwdcfhucqdpf"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                        .withDescription("tvcof")
                        .withActionsRequired("f"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals("sdbnwdcfhucqdpf", model.privateEndpoint().id());
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("tvcof", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("f", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
