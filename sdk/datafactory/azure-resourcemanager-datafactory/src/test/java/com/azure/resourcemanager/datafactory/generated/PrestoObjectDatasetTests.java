// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PrestoObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PrestoObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrestoObjectDataset model = BinaryData.fromString(
            "{\"type\":\"PrestoObject\",\"typeProperties\":{\"tableName\":\"dataz\",\"table\":\"datayujxysv\",\"schema\":\"dataf\"},\"description\":\"clvildlf\",\"structure\":\"dataleirmtxfqpfildcg\",\"schema\":\"dataou\",\"linkedServiceName\":{\"referenceName\":\"fbpgcryvidbzdy\",\"parameters\":{\"jftecgprzsqmp\":\"datajatgngwn\",\"akzbyqha\":\"dataq\"}},\"parameters\":{\"lusyruxrz\":{\"type\":\"Array\",\"defaultValue\":\"datayxuuc\"},\"tpiforomppz\":{\"type\":\"Float\",\"defaultValue\":\"datahrvmgsbpgmncr\"}},\"annotations\":[\"dataqmeu\"],\"folder\":{\"name\":\"fcmpuaiugoceqtl\"},\"\":{\"ncfunlakgixhqjqh\":\"datajymwiccu\"}}")
            .toObject(PrestoObjectDataset.class);
        Assertions.assertEquals("clvildlf", model.description());
        Assertions.assertEquals("fbpgcryvidbzdy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("lusyruxrz").type());
        Assertions.assertEquals("fcmpuaiugoceqtl", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrestoObjectDataset model = new PrestoObjectDataset().withDescription("clvildlf")
            .withStructure("dataleirmtxfqpfildcg")
            .withSchema("dataou")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("fbpgcryvidbzdy")
                .withParameters(mapOf("jftecgprzsqmp", "datajatgngwn", "akzbyqha", "dataq")))
            .withParameters(mapOf("lusyruxrz",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datayxuuc"), "tpiforomppz",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datahrvmgsbpgmncr")))
            .withAnnotations(Arrays.asList("dataqmeu"))
            .withFolder(new DatasetFolder().withName("fcmpuaiugoceqtl"))
            .withTableName("dataz")
            .withTable("datayujxysv")
            .withSchemaTypePropertiesSchema("dataf");
        model = BinaryData.fromObject(model).toObject(PrestoObjectDataset.class);
        Assertions.assertEquals("clvildlf", model.description());
        Assertions.assertEquals("fbpgcryvidbzdy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("lusyruxrz").type());
        Assertions.assertEquals("fcmpuaiugoceqtl", model.folder().name());
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
