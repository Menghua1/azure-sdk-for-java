// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AmazonRdsForOracleTableDatasetTypeProperties;

public final class AmazonRdsForOracleTableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonRdsForOracleTableDatasetTypeProperties model
            = BinaryData.fromString("{\"schema\":\"datanfywtkq\",\"table\":\"datasdlkhcz\"}")
                .toObject(AmazonRdsForOracleTableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonRdsForOracleTableDatasetTypeProperties model
            = new AmazonRdsForOracleTableDatasetTypeProperties().withSchema("datanfywtkq").withTable("datasdlkhcz");
        model = BinaryData.fromObject(model).toObject(AmazonRdsForOracleTableDatasetTypeProperties.class);
    }
}
