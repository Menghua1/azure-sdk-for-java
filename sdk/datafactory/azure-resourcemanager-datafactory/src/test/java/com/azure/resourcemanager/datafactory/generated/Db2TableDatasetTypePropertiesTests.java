// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.Db2TableDatasetTypeProperties;

public final class Db2TableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Db2TableDatasetTypeProperties model = BinaryData
            .fromString("{\"tableName\":\"dataxf\",\"schema\":\"dataigcfddofxnf\",\"table\":\"datajyyrqaedw\"}")
            .toObject(Db2TableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Db2TableDatasetTypeProperties model = new Db2TableDatasetTypeProperties().withTableName("dataxf")
            .withSchema("dataigcfddofxnf")
            .withTable("datajyyrqaedw");
        model = BinaryData.fromObject(model).toObject(Db2TableDatasetTypeProperties.class);
    }
}
