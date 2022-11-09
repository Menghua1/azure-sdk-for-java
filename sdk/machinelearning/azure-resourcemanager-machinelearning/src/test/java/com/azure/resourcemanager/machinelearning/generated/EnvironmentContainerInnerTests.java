// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.EnvironmentContainerInner;
import com.azure.resourcemanager.machinelearning.models.EnvironmentContainerProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EnvironmentContainerInnerTests {
    @Test
    public void testDeserialize() {
        EnvironmentContainerInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"isArchived\":false,\"latestVersion\":\"ulfgslqu\",\"nextVersion\":\"wdlenrdsut\",\"description\":\"bazpjuohmi\",\"properties\":{\"wpklvxw\":\"lnorwmdu\",\"epn\":\"ygdxpgpqchis\",\"fozauorsuk\":\"bjcrxgibbdaxco\"},\"tags\":{\"vnuuepzl\":\"bqplh\",\"vmnnrw\":\"phwzsoldweyuqdu\"}},\"id\":\"i\",\"name\":\"rk\",\"type\":\"alywjhhgdn\"}")
                .toObject(EnvironmentContainerInner.class);
        Assertions.assertEquals("bazpjuohmi", model.properties().description());
        Assertions.assertEquals("lnorwmdu", model.properties().properties().get("wpklvxw"));
        Assertions.assertEquals("bqplh", model.properties().tags().get("vnuuepzl"));
        Assertions.assertEquals(false, model.properties().isArchived());
    }

    @Test
    public void testSerialize() {
        EnvironmentContainerInner model =
            new EnvironmentContainerInner()
                .withProperties(
                    new EnvironmentContainerProperties()
                        .withDescription("bazpjuohmi")
                        .withProperties(
                            mapOf("wpklvxw", "lnorwmdu", "epn", "ygdxpgpqchis", "fozauorsuk", "bjcrxgibbdaxco"))
                        .withTags(mapOf("vnuuepzl", "bqplh", "vmnnrw", "phwzsoldweyuqdu"))
                        .withIsArchived(false));
        model = BinaryData.fromObject(model).toObject(EnvironmentContainerInner.class);
        Assertions.assertEquals("bazpjuohmi", model.properties().description());
        Assertions.assertEquals("lnorwmdu", model.properties().properties().get("wpklvxw"));
        Assertions.assertEquals("bqplh", model.properties().tags().get("vnuuepzl"));
        Assertions.assertEquals(false, model.properties().isArchived());
    }

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
