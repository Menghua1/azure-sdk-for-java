// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DynamicsEntityDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DynamicsEntityDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DynamicsEntityDataset model = BinaryData.fromString(
            "{\"type\":\"DynamicsEntity\",\"typeProperties\":{\"entityName\":\"datam\"},\"description\":\"bvvcpw\",\"structure\":\"datasuspnhmzy\",\"schema\":\"datafetev\",\"linkedServiceName\":{\"referenceName\":\"ntfknwacycsyo\",\"parameters\":{\"xrmhnmizhvprh\":\"datakhfhfsatvc\",\"lobzgott\":\"dataqwcublehhk\"}},\"parameters\":{\"mtbtdvucfvvra\":{\"type\":\"Object\",\"defaultValue\":\"datazigh\"},\"bwkdwjyjiznioroo\":{\"type\":\"Object\",\"defaultValue\":\"dataurdeewlsuxp\"},\"uftrni\":{\"type\":\"SecureString\",\"defaultValue\":\"datataspmcrei\"}},\"annotations\":[\"datainuwqxungrob\"],\"folder\":{\"name\":\"msxjwdylwxm\"},\"\":{\"ugeerclbltbhpwac\":\"dataow\"}}")
            .toObject(DynamicsEntityDataset.class);
        Assertions.assertEquals("bvvcpw", model.description());
        Assertions.assertEquals("ntfknwacycsyo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("mtbtdvucfvvra").type());
        Assertions.assertEquals("msxjwdylwxm", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DynamicsEntityDataset model = new DynamicsEntityDataset().withDescription("bvvcpw")
            .withStructure("datasuspnhmzy")
            .withSchema("datafetev")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ntfknwacycsyo")
                .withParameters(mapOf("xrmhnmizhvprh", "datakhfhfsatvc", "lobzgott", "dataqwcublehhk")))
            .withParameters(mapOf("mtbtdvucfvvra",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datazigh"),
                "bwkdwjyjiznioroo",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataurdeewlsuxp"),
                "uftrni",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datataspmcrei")))
            .withAnnotations(Arrays.asList("datainuwqxungrob"))
            .withFolder(new DatasetFolder().withName("msxjwdylwxm"))
            .withEntityName("datam");
        model = BinaryData.fromObject(model).toObject(DynamicsEntityDataset.class);
        Assertions.assertEquals("bvvcpw", model.description());
        Assertions.assertEquals("ntfknwacycsyo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("mtbtdvucfvvra").type());
        Assertions.assertEquals("msxjwdylwxm", model.folder().name());
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
