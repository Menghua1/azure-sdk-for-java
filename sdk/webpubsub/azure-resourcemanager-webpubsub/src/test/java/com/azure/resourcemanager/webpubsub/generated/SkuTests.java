// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.Sku;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model = BinaryData.fromString(
            "{\"resourceType\":\"vf\",\"sku\":{\"name\":\"awzqadfl\",\"tier\":\"Free\",\"size\":\"iglaecx\",\"family\":\"t\",\"capacity\":1510056241},\"capacity\":{\"minimum\":675680646,\"maximum\":635512255,\"default\":2090573911,\"allowedValues\":[412723764,443285023,763019330],\"scaleType\":\"None\"}}")
            .toObject(Sku.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku();
        model = BinaryData.fromObject(model).toObject(Sku.class);
    }
}
