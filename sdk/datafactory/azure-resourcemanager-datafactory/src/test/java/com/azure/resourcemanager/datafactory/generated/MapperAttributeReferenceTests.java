// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ConnectionType;
import com.azure.resourcemanager.datafactory.models.MapperAttributeReference;
import com.azure.resourcemanager.datafactory.models.MapperConnectionReference;
import org.junit.jupiter.api.Assertions;

public final class MapperAttributeReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MapperAttributeReference model = BinaryData.fromString(
            "{\"name\":\"hfaogzv\",\"entity\":\"wrsiwdyjqurykc\",\"entityConnectionReference\":{\"connectionName\":\"ueekcsue\",\"type\":\"linkedservicetype\"}}")
            .toObject(MapperAttributeReference.class);
        Assertions.assertEquals("hfaogzv", model.name());
        Assertions.assertEquals("wrsiwdyjqurykc", model.entity());
        Assertions.assertEquals("ueekcsue", model.entityConnectionReference().connectionName());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE, model.entityConnectionReference().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MapperAttributeReference model = new MapperAttributeReference().withName("hfaogzv")
            .withEntity("wrsiwdyjqurykc")
            .withEntityConnectionReference(new MapperConnectionReference().withConnectionName("ueekcsue")
                .withType(ConnectionType.LINKEDSERVICETYPE));
        model = BinaryData.fromObject(model).toObject(MapperAttributeReference.class);
        Assertions.assertEquals("hfaogzv", model.name());
        Assertions.assertEquals("wrsiwdyjqurykc", model.entity());
        Assertions.assertEquals("ueekcsue", model.entityConnectionReference().connectionName());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE, model.entityConnectionReference().type());
    }
}
