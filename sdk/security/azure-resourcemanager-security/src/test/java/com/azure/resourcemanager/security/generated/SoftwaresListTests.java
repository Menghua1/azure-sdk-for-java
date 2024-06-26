// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SoftwareInner;
import com.azure.resourcemanager.security.models.EndOfSupportStatus;
import com.azure.resourcemanager.security.models.SoftwaresList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SoftwaresListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SoftwaresList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"deviceId\":\"bgbkdmoizpost\",\"osPlatform\":\"rcfbunrm\",\"vendor\":\"jhhkxbp\",\"softwareName\":\"ymjhxxjyngudivkr\",\"version\":\"wbxqzvszjfau\",\"endOfSupportStatus\":\"noLongerSupported\",\"endOfSupportDate\":\"xxivetv\",\"numberOfKnownVulnerabilities\":1920566576,\"firstSeenAt\":\"qtdo\"},\"id\":\"mcbxvwvxysl\",\"name\":\"bhsfxob\",\"type\":\"ytkblmpew\"}],\"nextLink\":\"fbkrvrnsvs\"}")
            .toObject(SoftwaresList.class);
        Assertions.assertEquals("bgbkdmoizpost", model.value().get(0).deviceId());
        Assertions.assertEquals("rcfbunrm", model.value().get(0).osPlatform());
        Assertions.assertEquals("jhhkxbp", model.value().get(0).vendor());
        Assertions.assertEquals("ymjhxxjyngudivkr", model.value().get(0).softwareName());
        Assertions.assertEquals("wbxqzvszjfau", model.value().get(0).version());
        Assertions.assertEquals(EndOfSupportStatus.NO_LONGER_SUPPORTED, model.value().get(0).endOfSupportStatus());
        Assertions.assertEquals("xxivetv", model.value().get(0).endOfSupportDate());
        Assertions.assertEquals(1920566576, model.value().get(0).numberOfKnownVulnerabilities());
        Assertions.assertEquals("qtdo", model.value().get(0).firstSeenAt());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SoftwaresList model
            = new SoftwaresList().withValue(Arrays.asList(new SoftwareInner().withDeviceId("bgbkdmoizpost")
                .withOsPlatform("rcfbunrm")
                .withVendor("jhhkxbp")
                .withSoftwareName("ymjhxxjyngudivkr")
                .withVersion("wbxqzvszjfau")
                .withEndOfSupportStatus(EndOfSupportStatus.NO_LONGER_SUPPORTED)
                .withEndOfSupportDate("xxivetv")
                .withNumberOfKnownVulnerabilities(1920566576)
                .withFirstSeenAt("qtdo")));
        model = BinaryData.fromObject(model).toObject(SoftwaresList.class);
        Assertions.assertEquals("bgbkdmoizpost", model.value().get(0).deviceId());
        Assertions.assertEquals("rcfbunrm", model.value().get(0).osPlatform());
        Assertions.assertEquals("jhhkxbp", model.value().get(0).vendor());
        Assertions.assertEquals("ymjhxxjyngudivkr", model.value().get(0).softwareName());
        Assertions.assertEquals("wbxqzvszjfau", model.value().get(0).version());
        Assertions.assertEquals(EndOfSupportStatus.NO_LONGER_SUPPORTED, model.value().get(0).endOfSupportStatus());
        Assertions.assertEquals("xxivetv", model.value().get(0).endOfSupportDate());
        Assertions.assertEquals(1920566576, model.value().get(0).numberOfKnownVulnerabilities());
        Assertions.assertEquals("qtdo", model.value().get(0).firstSeenAt());
    }
}
