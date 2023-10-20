// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.StorageContainersUpdateRequest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StorageContainersUpdateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageContainersUpdateRequest model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"jrunmpxtt\":\"vpnazzm\",\"bnlankxmyskpb\":\"bh\",\"nrs\":\"enbtkcxywny\",\"lhaaxdbabp\":\"nlqidybyxczf\"}}")
                .toObject(StorageContainersUpdateRequest.class);
        Assertions.assertEquals("vpnazzm", model.tags().get("jrunmpxtt"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageContainersUpdateRequest model =
            new StorageContainersUpdateRequest()
                .withTags(
                    mapOf(
                        "jrunmpxtt",
                        "vpnazzm",
                        "bnlankxmyskpb",
                        "bh",
                        "nrs",
                        "enbtkcxywny",
                        "lhaaxdbabp",
                        "nlqidybyxczf"));
        model = BinaryData.fromObject(model).toObject(StorageContainersUpdateRequest.class);
        Assertions.assertEquals("vpnazzm", model.tags().get("jrunmpxtt"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
