// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderFoDatabasesAwsOfferingDatabasesDspm;
import org.junit.jupiter.api.Assertions;

public final class DefenderFoDatabasesAwsOfferingDatabasesDspmTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderFoDatabasesAwsOfferingDatabasesDspm model
            = BinaryData.fromString("{\"enabled\":true,\"cloudRoleArn\":\"yxroiduyqypffmno\"}")
                .toObject(DefenderFoDatabasesAwsOfferingDatabasesDspm.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("yxroiduyqypffmno", model.cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderFoDatabasesAwsOfferingDatabasesDspm model
            = new DefenderFoDatabasesAwsOfferingDatabasesDspm().withEnabled(true).withCloudRoleArn("yxroiduyqypffmno");
        model = BinaryData.fromObject(model).toObject(DefenderFoDatabasesAwsOfferingDatabasesDspm.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("yxroiduyqypffmno", model.cloudRoleArn());
    }
}
