// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.RefundTransactionDetailsAmountRequested;

public final class RefundTransactionDetailsAmountRequestedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RefundTransactionDetailsAmountRequested model
            = BinaryData.fromString("{\"currency\":\"ncclabvoyngsuxxc\",\"value\":37.41293}")
                .toObject(RefundTransactionDetailsAmountRequested.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RefundTransactionDetailsAmountRequested model = new RefundTransactionDetailsAmountRequested();
        model = BinaryData.fromObject(model).toObject(RefundTransactionDetailsAmountRequested.class);
    }
}
