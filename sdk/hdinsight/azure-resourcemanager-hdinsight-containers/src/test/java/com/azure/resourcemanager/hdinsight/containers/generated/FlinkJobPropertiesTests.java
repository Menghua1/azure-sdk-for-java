// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.Action;
import com.azure.resourcemanager.hdinsight.containers.models.FlinkJobProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FlinkJobPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlinkJobProperties model = BinaryData.fromString(
            "{\"jobType\":\"FlinkJob\",\"runId\":\"bzevwrd\",\"jobName\":\"fukuvsjcswsmystu\",\"jobJarDirectory\":\"qypfcv\",\"jarName\":\"rchpqbmfpjbabwid\",\"entryClass\":\"xsspuunnoxyhk\",\"args\":\"qddrihpfhoqcaae\",\"savePointName\":\"aomdjvlpjxx\",\"action\":\"START\",\"flinkConfiguration\":{\"zkdnc\":\"sgeivsiy\",\"wyrpgogtqxepnyl\":\"dxonbzoggculap\",\"tlvofq\":\"fuajly\"},\"jobId\":\"vfcibyfmowux\",\"status\":\"jpvd\",\"jobOutput\":\"fzwiivwzjbhyz\",\"actionResult\":\"jrkambtrnegvmnv\",\"lastSavePoint\":\"eqvldspast\"}")
            .toObject(FlinkJobProperties.class);
        Assertions.assertEquals("bzevwrd", model.runId());
        Assertions.assertEquals("fukuvsjcswsmystu", model.jobName());
        Assertions.assertEquals("qypfcv", model.jobJarDirectory());
        Assertions.assertEquals("rchpqbmfpjbabwid", model.jarName());
        Assertions.assertEquals("xsspuunnoxyhk", model.entryClass());
        Assertions.assertEquals("qddrihpfhoqcaae", model.args());
        Assertions.assertEquals("aomdjvlpjxx", model.savePointName());
        Assertions.assertEquals(Action.START, model.action());
        Assertions.assertEquals("sgeivsiy", model.flinkConfiguration().get("zkdnc"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlinkJobProperties model = new FlinkJobProperties().withRunId("bzevwrd")
            .withJobName("fukuvsjcswsmystu")
            .withJobJarDirectory("qypfcv")
            .withJarName("rchpqbmfpjbabwid")
            .withEntryClass("xsspuunnoxyhk")
            .withArgs("qddrihpfhoqcaae")
            .withSavePointName("aomdjvlpjxx")
            .withAction(Action.START)
            .withFlinkConfiguration(
                mapOf("zkdnc", "sgeivsiy", "wyrpgogtqxepnyl", "dxonbzoggculap", "tlvofq", "fuajly"));
        model = BinaryData.fromObject(model).toObject(FlinkJobProperties.class);
        Assertions.assertEquals("bzevwrd", model.runId());
        Assertions.assertEquals("fukuvsjcswsmystu", model.jobName());
        Assertions.assertEquals("qypfcv", model.jobJarDirectory());
        Assertions.assertEquals("rchpqbmfpjbabwid", model.jarName());
        Assertions.assertEquals("xsspuunnoxyhk", model.entryClass());
        Assertions.assertEquals("qddrihpfhoqcaae", model.args());
        Assertions.assertEquals("aomdjvlpjxx", model.savePointName());
        Assertions.assertEquals(Action.START, model.action());
        Assertions.assertEquals("sgeivsiy", model.flinkConfiguration().get("zkdnc"));
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
