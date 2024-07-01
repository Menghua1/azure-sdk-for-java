// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetSchemaDataElement;
import java.util.HashMap;
import java.util.Map;

public final class DatasetSchemaDataElementTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatasetSchemaDataElement model = BinaryData.fromString(
            "{\"name\":\"datakhoitw\",\"type\":\"datajsdmm\",\"\":{\"hzqpxzbawkikcdgf\":\"datanckidbjpg\",\"decfiwhagxsure\":\"databssdpjeyoqxd\",\"zjk\":\"dataqrshzzbgullcxiq\",\"rouigdmfivjqte\":\"dataxdupnamg\"}}")
            .toObject(DatasetSchemaDataElement.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatasetSchemaDataElement model = new DatasetSchemaDataElement().withName("datakhoitw")
            .withType("datajsdmm")
            .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(DatasetSchemaDataElement.class);
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
