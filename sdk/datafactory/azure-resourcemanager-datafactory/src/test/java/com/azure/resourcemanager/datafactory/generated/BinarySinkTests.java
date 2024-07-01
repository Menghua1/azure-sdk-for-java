// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BinarySink;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class BinarySinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BinarySink model = BinaryData.fromString(
            "{\"type\":\"BinarySink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"dataaeiepvjr\",\"disableMetricsCollection\":\"dataksx\",\"copyBehavior\":\"datakb\",\"metadata\":[{\"name\":\"datawokrhh\",\"value\":\"dataahrmuw\"},{\"name\":\"datadyruo\",\"value\":\"datadtx\"},{\"name\":\"datanmjimgg\",\"value\":\"dataqgpldrn\"}],\"\":{\"etzufkvxe\":\"datadbnfbms\"}},\"writeBatchSize\":\"dataddrtngdc\",\"writeBatchTimeout\":\"datajzgzaeuu\",\"sinkRetryCount\":\"datavheqzl\",\"sinkRetryWait\":\"datavaskrgoodfhpyue\",\"maxConcurrentConnections\":\"dataynyddpjlizl\",\"disableMetricsCollection\":\"datahtcuglgmfz\",\"\":{\"lkqmznkcwiokuyk\":\"datalaflsjwa\",\"htcoelx\":\"datavxmobnehbb\",\"veuog\":\"datafnpxumgnjmsk\"}}")
            .toObject(BinarySink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BinarySink model = new BinarySink().withWriteBatchSize("dataddrtngdc")
            .withWriteBatchTimeout("datajzgzaeuu")
            .withSinkRetryCount("datavheqzl")
            .withSinkRetryWait("datavaskrgoodfhpyue")
            .withMaxConcurrentConnections("dataynyddpjlizl")
            .withDisableMetricsCollection("datahtcuglgmfz")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("dataaeiepvjr")
                .withDisableMetricsCollection("dataksx")
                .withCopyBehavior("datakb")
                .withMetadata(Arrays.asList(new MetadataItem().withName("datawokrhh").withValue("dataahrmuw"),
                    new MetadataItem().withName("datadyruo").withValue("datadtx"),
                    new MetadataItem().withName("datanmjimgg").withValue("dataqgpldrn")))
                .withAdditionalProperties(mapOf("type", "StoreWriteSettings")));
        model = BinaryData.fromObject(model).toObject(BinarySink.class);
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
