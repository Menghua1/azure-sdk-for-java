// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.InstanceTypeSchema;
import com.azure.resourcemanager.machinelearning.models.InstanceTypeSchemaResources;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InstanceTypeSchemaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InstanceTypeSchema model = BinaryData.fromString(
            "{\"nodeSelector\":{\"q\":\"vl\",\"nthbbnkgzukwd\":\"xyrqo\"},\"resources\":{\"requests\":{\"mlfuyfjbp\":\"jthfceyjnc\",\"yjmqrf\":\"iddhlrufzc\"},\"limits\":{\"rsazrhxud\":\"cuselq\",\"jmr\":\"qmdtffi\"}}}")
            .toObject(InstanceTypeSchema.class);
        Assertions.assertEquals("vl", model.nodeSelector().get("q"));
        Assertions.assertEquals("jthfceyjnc", model.resources().requests().get("mlfuyfjbp"));
        Assertions.assertEquals("cuselq", model.resources().limits().get("rsazrhxud"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InstanceTypeSchema model
            = new InstanceTypeSchema().withNodeSelector(mapOf("q", "vl", "nthbbnkgzukwd", "xyrqo"))
                .withResources(new InstanceTypeSchemaResources()
                    .withRequests(mapOf("mlfuyfjbp", "jthfceyjnc", "yjmqrf", "iddhlrufzc"))
                    .withLimits(mapOf("rsazrhxud", "cuselq", "jmr", "qmdtffi")));
        model = BinaryData.fromObject(model).toObject(InstanceTypeSchema.class);
        Assertions.assertEquals("vl", model.nodeSelector().get("q"));
        Assertions.assertEquals("jthfceyjnc", model.resources().requests().get("mlfuyfjbp"));
        Assertions.assertEquals("cuselq", model.resources().limits().get("rsazrhxud"));
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
