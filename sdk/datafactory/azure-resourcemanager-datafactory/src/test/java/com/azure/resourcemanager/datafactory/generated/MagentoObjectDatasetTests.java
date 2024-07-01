// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MagentoObjectDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MagentoObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MagentoObjectDataset model = BinaryData.fromString(
            "{\"type\":\"MagentoObject\",\"typeProperties\":{\"tableName\":\"dataf\"},\"description\":\"zgccyn\",\"structure\":\"datavmsiehedm\",\"schema\":\"dataoneeyrxpa\",\"linkedServiceName\":{\"referenceName\":\"xtzayqwddig\",\"parameters\":{\"d\":\"dataspl\"}},\"parameters\":{\"zbjkjqpizd\":{\"type\":\"Object\",\"defaultValue\":\"datavee\"},\"wl\":{\"type\":\"Float\",\"defaultValue\":\"datah\"},\"ywbnk\":{\"type\":\"Int\",\"defaultValue\":\"dataj\"}},\"annotations\":[\"datarxactsawvxcimp\"],\"folder\":{\"name\":\"rm\"},\"\":{\"knyfuysjhvrr\":\"datamslub\"}}")
            .toObject(MagentoObjectDataset.class);
        Assertions.assertEquals("zgccyn", model.description());
        Assertions.assertEquals("xtzayqwddig", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("zbjkjqpizd").type());
        Assertions.assertEquals("rm", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MagentoObjectDataset model = new MagentoObjectDataset().withDescription("zgccyn")
            .withStructure("datavmsiehedm")
            .withSchema("dataoneeyrxpa")
            .withLinkedServiceName(
                new LinkedServiceReference().withReferenceName("xtzayqwddig").withParameters(mapOf("d", "dataspl")))
            .withParameters(mapOf("zbjkjqpizd",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datavee"), "wl",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datah"), "ywbnk",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataj")))
            .withAnnotations(Arrays.asList("datarxactsawvxcimp"))
            .withFolder(new DatasetFolder().withName("rm"))
            .withTableName("dataf");
        model = BinaryData.fromObject(model).toObject(MagentoObjectDataset.class);
        Assertions.assertEquals("zgccyn", model.description());
        Assertions.assertEquals("xtzayqwddig", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("zbjkjqpizd").type());
        Assertions.assertEquals("rm", model.folder().name());
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
