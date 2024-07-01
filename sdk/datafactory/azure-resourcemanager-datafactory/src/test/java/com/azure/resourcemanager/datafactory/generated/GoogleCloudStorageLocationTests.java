// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GoogleCloudStorageLocation;

public final class GoogleCloudStorageLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GoogleCloudStorageLocation model = BinaryData.fromString(
            "{\"type\":\"GoogleCloudStorageLocation\",\"bucketName\":\"datarulcfogx\",\"version\":\"dataxnwjtpfdzxcouz\",\"folderPath\":\"dataofwakukzk\",\"fileName\":\"datazxsoednl\",\"\":{\"isnionetbzdrdpue\":\"dataihezomucmq\"}}")
            .toObject(GoogleCloudStorageLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GoogleCloudStorageLocation model = new GoogleCloudStorageLocation().withFolderPath("dataofwakukzk")
            .withFileName("datazxsoednl")
            .withBucketName("datarulcfogx")
            .withVersion("dataxnwjtpfdzxcouz");
        model = BinaryData.fromObject(model).toObject(GoogleCloudStorageLocation.class);
    }
}
