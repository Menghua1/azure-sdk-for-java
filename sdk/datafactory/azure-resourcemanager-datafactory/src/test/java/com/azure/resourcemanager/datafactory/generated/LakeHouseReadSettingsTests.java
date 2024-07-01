// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LakeHouseReadSettings;

public final class LakeHouseReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LakeHouseReadSettings model = BinaryData.fromString(
            "{\"type\":\"LakeHouseReadSettings\",\"recursive\":\"datatj\",\"wildcardFolderPath\":\"dataymdypsxkwwfy\",\"wildcardFileName\":\"datahurklowm\",\"fileListPath\":\"datavzc\",\"enablePartitionDiscovery\":\"datalyoix\",\"partitionRootPath\":\"dataiznqizvsihsmtxj\",\"deleteFilesAfterCompletion\":\"datajhsjuqqtzr\",\"modifiedDatetimeStart\":\"databodgo\",\"modifiedDatetimeEnd\":\"datakia\",\"maxConcurrentConnections\":\"datagugrjxx\",\"disableMetricsCollection\":\"datagorvumwnbzslmff\",\"\":{\"kd\":\"datakprxypxti\",\"omev\":\"dataebafiq\",\"butytoainig\":\"dataetamdvncxt\",\"lack\":\"dataxhzqgbaqvqe\"}}")
            .toObject(LakeHouseReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LakeHouseReadSettings model = new LakeHouseReadSettings().withMaxConcurrentConnections("datagugrjxx")
            .withDisableMetricsCollection("datagorvumwnbzslmff")
            .withRecursive("datatj")
            .withWildcardFolderPath("dataymdypsxkwwfy")
            .withWildcardFileName("datahurklowm")
            .withFileListPath("datavzc")
            .withEnablePartitionDiscovery("datalyoix")
            .withPartitionRootPath("dataiznqizvsihsmtxj")
            .withDeleteFilesAfterCompletion("datajhsjuqqtzr")
            .withModifiedDatetimeStart("databodgo")
            .withModifiedDatetimeEnd("datakia");
        model = BinaryData.fromObject(model).toObject(LakeHouseReadSettings.class);
    }
}
