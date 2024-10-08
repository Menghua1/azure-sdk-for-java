// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.JiraObjectDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class JiraObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JiraObjectDataset model = BinaryData.fromString(
            "{\"type\":\"JiraObject\",\"typeProperties\":{\"tableName\":\"datazc\"},\"description\":\"kckrnovqdmh\",\"structure\":\"datajstfs\",\"schema\":\"datacjakgkqwx\",\"linkedServiceName\":{\"referenceName\":\"dsoqzhxwdjoxwkb\",\"parameters\":{\"lfhn\":\"dataobvcnsbioez\",\"t\":\"dataz\"}},\"parameters\":{\"cmwbejywwwvn\":{\"type\":\"Bool\",\"defaultValue\":\"datagtkxncwdytnlr\"}},\"annotations\":[\"datakrmqevrhhafqf\",\"datadfyziruqvgnjxi\",\"datakgyjmzbm\"],\"folder\":{\"name\":\"kyluyug\"},\"\":{\"loxtvq\":\"datadcv\",\"ryhmmglv\":\"datab\",\"nkpsvokkyankxvc\":\"datab\"}}")
            .toObject(JiraObjectDataset.class);
        Assertions.assertEquals("kckrnovqdmh", model.description());
        Assertions.assertEquals("dsoqzhxwdjoxwkb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("cmwbejywwwvn").type());
        Assertions.assertEquals("kyluyug", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JiraObjectDataset model = new JiraObjectDataset().withDescription("kckrnovqdmh")
            .withStructure("datajstfs")
            .withSchema("datacjakgkqwx")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("dsoqzhxwdjoxwkb")
                .withParameters(mapOf("lfhn", "dataobvcnsbioez", "t", "dataz")))
            .withParameters(mapOf("cmwbejywwwvn",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datagtkxncwdytnlr")))
            .withAnnotations(Arrays.asList("datakrmqevrhhafqf", "datadfyziruqvgnjxi", "datakgyjmzbm"))
            .withFolder(new DatasetFolder().withName("kyluyug"))
            .withTableName("datazc");
        model = BinaryData.fromObject(model).toObject(JiraObjectDataset.class);
        Assertions.assertEquals("kckrnovqdmh", model.description());
        Assertions.assertEquals("dsoqzhxwdjoxwkb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("cmwbejywwwvn").type());
        Assertions.assertEquals("kyluyug", model.folder().name());
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
