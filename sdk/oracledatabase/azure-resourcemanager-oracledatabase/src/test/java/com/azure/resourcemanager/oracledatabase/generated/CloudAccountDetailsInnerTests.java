// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.CloudAccountDetailsInner;

public final class CloudAccountDetailsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudAccountDetailsInner model
            = BinaryData.fromString("{\"cloudAccountName\":\"wfluszdt\",\"cloudAccountHomeRegion\":\"rkwofyyvoqa\"}")
                .toObject(CloudAccountDetailsInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudAccountDetailsInner model = new CloudAccountDetailsInner();
        model = BinaryData.fromObject(model).toObject(CloudAccountDetailsInner.class);
    }
}
