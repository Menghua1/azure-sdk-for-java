// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.NetworkAcl;
import com.azure.resourcemanager.webpubsub.models.WebPubSubRequestType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkAclTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkAcl model =
            BinaryData
                .fromString(
                    "{\"allow\":[\"Trace\",\"ClientConnection\",\"Trace\"],\"deny\":[\"ClientConnection\",\"RESTAPI\",\"ClientConnection\"]}")
                .toObject(NetworkAcl.class);
        Assertions.assertEquals(WebPubSubRequestType.TRACE, model.allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.CLIENT_CONNECTION, model.deny().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkAcl model =
            new NetworkAcl()
                .withAllow(
                    Arrays
                        .asList(
                            WebPubSubRequestType.TRACE,
                            WebPubSubRequestType.CLIENT_CONNECTION,
                            WebPubSubRequestType.TRACE))
                .withDeny(
                    Arrays
                        .asList(
                            WebPubSubRequestType.CLIENT_CONNECTION,
                            WebPubSubRequestType.RESTAPI,
                            WebPubSubRequestType.CLIENT_CONNECTION));
        model = BinaryData.fromObject(model).toObject(NetworkAcl.class);
        Assertions.assertEquals(WebPubSubRequestType.TRACE, model.allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.CLIENT_CONNECTION, model.deny().get(0));
    }
}
