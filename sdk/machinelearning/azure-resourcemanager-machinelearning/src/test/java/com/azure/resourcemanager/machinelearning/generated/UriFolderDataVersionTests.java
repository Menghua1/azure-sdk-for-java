// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.UriFolderDataVersion;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UriFolderDataVersionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UriFolderDataVersion model = BinaryData.fromString(
            "{\"dataType\":\"uri_folder\",\"dataUri\":\"awfubkngejjxu\",\"isArchived\":true,\"isAnonymous\":false,\"description\":\"mo\",\"tags\":{\"fzcfdtstiax\":\"xuktdrsjtmnkxjou\",\"mlroiommemsoqgb\":\"yrnuhcfhepisqb\",\"bobaqca\":\"cyeqd\",\"xbj\":\"ebckcesrsixwnlpj\"},\"properties\":{\"yyfr\":\"y\",\"kidfhmlxrqkeknu\":\"idzfpsfy\",\"uwpuqpsrcekdvvo\":\"kqafzvptriysjrgt\",\"w\":\"dwedg\"}}")
            .toObject(UriFolderDataVersion.class);
        Assertions.assertEquals("mo", model.description());
        Assertions.assertEquals("xuktdrsjtmnkxjou", model.tags().get("fzcfdtstiax"));
        Assertions.assertEquals("y", model.properties().get("yyfr"));
        Assertions.assertEquals(true, model.isArchived());
        Assertions.assertEquals(false, model.isAnonymous());
        Assertions.assertEquals("awfubkngejjxu", model.dataUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UriFolderDataVersion model = new UriFolderDataVersion().withDescription("mo")
            .withTags(mapOf("fzcfdtstiax", "xuktdrsjtmnkxjou", "mlroiommemsoqgb", "yrnuhcfhepisqb", "bobaqca", "cyeqd",
                "xbj", "ebckcesrsixwnlpj"))
            .withProperties(
                mapOf("yyfr", "y", "kidfhmlxrqkeknu", "idzfpsfy", "uwpuqpsrcekdvvo", "kqafzvptriysjrgt", "w", "dwedg"))
            .withIsArchived(true)
            .withIsAnonymous(false)
            .withDataUri("awfubkngejjxu");
        model = BinaryData.fromObject(model).toObject(UriFolderDataVersion.class);
        Assertions.assertEquals("mo", model.description());
        Assertions.assertEquals("xuktdrsjtmnkxjou", model.tags().get("fzcfdtstiax"));
        Assertions.assertEquals("y", model.properties().get("yyfr"));
        Assertions.assertEquals(true, model.isArchived());
        Assertions.assertEquals(false, model.isAnonymous());
        Assertions.assertEquals("awfubkngejjxu", model.dataUri());
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
