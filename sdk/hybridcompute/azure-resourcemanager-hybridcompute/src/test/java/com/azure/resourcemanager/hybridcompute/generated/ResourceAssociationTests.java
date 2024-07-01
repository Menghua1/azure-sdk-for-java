// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.ResourceAssociation;

public final class ResourceAssociationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceAssociation model = BinaryData.fromString("{\"name\":\"wzf\",\"accessMode\":\"enforced\"}")
            .toObject(ResourceAssociation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceAssociation model = new ResourceAssociation();
        model = BinaryData.fromObject(model).toObject(ResourceAssociation.class);
    }
}
