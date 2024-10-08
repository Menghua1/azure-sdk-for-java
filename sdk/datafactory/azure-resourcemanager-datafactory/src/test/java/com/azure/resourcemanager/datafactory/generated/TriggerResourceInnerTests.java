// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.TriggerResourceInner;
import com.azure.resourcemanager.datafactory.models.Trigger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TriggerResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TriggerResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"type\":\"Trigger\",\"description\":\"wn\",\"runtimeState\":\"Stopped\",\"annotations\":[\"datau\",\"datarj\"],\"\":{\"foj\":\"dataojcmisofieyp\"}},\"name\":\"dh\",\"type\":\"plcplcwkhi\",\"etag\":\"hlhzdsqtzbsrgno\",\"id\":\"jhf\"}")
            .toObject(TriggerResourceInner.class);
        Assertions.assertEquals("jhf", model.id());
        Assertions.assertEquals("wn", model.properties().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TriggerResourceInner model = new TriggerResourceInner().withId("jhf")
            .withProperties(new Trigger().withDescription("wn")
                .withAnnotations(Arrays.asList("datau", "datarj"))
                .withAdditionalProperties(mapOf("type", "Trigger", "runtimeState", "Stopped")));
        model = BinaryData.fromObject(model).toObject(TriggerResourceInner.class);
        Assertions.assertEquals("jhf", model.id());
        Assertions.assertEquals("wn", model.properties().description());
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
