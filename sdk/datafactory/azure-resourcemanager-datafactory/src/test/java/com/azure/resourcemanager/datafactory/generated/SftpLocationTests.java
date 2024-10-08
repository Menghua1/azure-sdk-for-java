// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SftpLocation;

public final class SftpLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SftpLocation model = BinaryData.fromString(
            "{\"type\":\"SftpLocation\",\"folderPath\":\"dataclbtxl\",\"fileName\":\"datavsolzwil\",\"\":{\"jx\":\"dataojfsqebuu\",\"kktpmbmxbmbr\":\"datafxfjwp\"}}")
            .toObject(SftpLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SftpLocation model = new SftpLocation().withFolderPath("dataclbtxl").withFileName("datavsolzwil");
        model = BinaryData.fromObject(model).toObject(SftpLocation.class);
    }
}
