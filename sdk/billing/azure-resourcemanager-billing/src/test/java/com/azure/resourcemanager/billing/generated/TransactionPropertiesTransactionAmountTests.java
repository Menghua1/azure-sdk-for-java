// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.TransactionPropertiesTransactionAmount;

public final class TransactionPropertiesTransactionAmountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransactionPropertiesTransactionAmount model
            = BinaryData.fromString("{\"currency\":\"vkitb\",\"value\":51.716232}")
                .toObject(TransactionPropertiesTransactionAmount.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransactionPropertiesTransactionAmount model = new TransactionPropertiesTransactionAmount();
        model = BinaryData.fromObject(model).toObject(TransactionPropertiesTransactionAmount.class);
    }
}
