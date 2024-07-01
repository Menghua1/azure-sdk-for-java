// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MongoDbCursorMethodsProperties;
import com.azure.resourcemanager.datafactory.models.MongoDbV2Source;
import java.util.HashMap;
import java.util.Map;

public final class MongoDbV2SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2Source model = BinaryData.fromString(
            "{\"type\":\"MongoDbV2Source\",\"filter\":\"datazuzvbqbroyrw\",\"cursorMethods\":{\"project\":\"databfweozkbokffsu\",\"sort\":\"datacslzca\",\"skip\":\"datad\",\"limit\":\"datafwkpupbsgfnqtxl\",\"\":{\"cist\":\"dataviklxsgstunsa\",\"ajkodpz\":\"databehkb\",\"faas\":\"datatgsazwx\",\"cdl\":\"datahasjbuhz\"}},\"batchSize\":\"datajstncjwze\",\"queryTimeout\":\"dataezltlundkjphvh\",\"additionalColumns\":\"dataivsh\",\"sourceRetryCount\":\"datax\",\"sourceRetryWait\":\"datajythxearlpnajjt\",\"maxConcurrentConnections\":\"datalyd\",\"disableMetricsCollection\":\"datauxbungmpnrytguc\",\"\":{\"cjugoa\":\"datagl\",\"uzanpoyrqjoni\":\"datazyzjc\",\"cloq\":\"datanyhzestt\"}}")
            .toObject(MongoDbV2Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2Source model = new MongoDbV2Source().withSourceRetryCount("datax")
            .withSourceRetryWait("datajythxearlpnajjt")
            .withMaxConcurrentConnections("datalyd")
            .withDisableMetricsCollection("datauxbungmpnrytguc")
            .withFilter("datazuzvbqbroyrw")
            .withCursorMethods(new MongoDbCursorMethodsProperties().withProject("databfweozkbokffsu")
                .withSort("datacslzca")
                .withSkip("datad")
                .withLimit("datafwkpupbsgfnqtxl")
                .withAdditionalProperties(mapOf()))
            .withBatchSize("datajstncjwze")
            .withQueryTimeout("dataezltlundkjphvh")
            .withAdditionalColumns("dataivsh");
        model = BinaryData.fromObject(model).toObject(MongoDbV2Source.class);
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
