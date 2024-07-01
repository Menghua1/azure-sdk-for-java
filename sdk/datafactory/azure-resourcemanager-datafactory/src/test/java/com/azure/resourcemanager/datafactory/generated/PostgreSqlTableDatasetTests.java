// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PostgreSqlTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PostgreSqlTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PostgreSqlTableDataset model = BinaryData.fromString(
            "{\"type\":\"PostgreSqlTable\",\"typeProperties\":{\"tableName\":\"dataxlhmpmhef\",\"table\":\"dataaphqeofytl\",\"schema\":\"datalowmcm\"},\"description\":\"ixuanccqvjfdgfq\",\"structure\":\"dataquxpjhcfaara\",\"schema\":\"dataiovmufzgugrblwal\",\"linkedServiceName\":{\"referenceName\":\"ossnq\",\"parameters\":{\"sman\":\"dataotbptg\",\"ecvtamqwzmno\":\"dataxrwqfmd\",\"wpsibxovuqoq\":\"datafe\"}},\"parameters\":{\"cvtqnzjcyqqzhemb\":{\"type\":\"Bool\",\"defaultValue\":\"datandyclwg\"},\"isj\":{\"type\":\"String\",\"defaultValue\":\"datanalbad\"}},\"annotations\":[\"dataajvmvvlooubsfxip\",\"dataeopsk\",\"dataocjomlup\",\"dataazusjcd\"],\"folder\":{\"name\":\"lgdwzrgdqyx\"},\"\":{\"cwwsj\":\"datalgrcavqcwyzoqzkm\",\"qxilefejs\":\"datakiixepbntqqwwgfg\"}}")
            .toObject(PostgreSqlTableDataset.class);
        Assertions.assertEquals("ixuanccqvjfdgfq", model.description());
        Assertions.assertEquals("ossnq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("cvtqnzjcyqqzhemb").type());
        Assertions.assertEquals("lgdwzrgdqyx", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PostgreSqlTableDataset model = new PostgreSqlTableDataset().withDescription("ixuanccqvjfdgfq")
            .withStructure("dataquxpjhcfaara")
            .withSchema("dataiovmufzgugrblwal")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ossnq")
                .withParameters(mapOf("sman", "dataotbptg", "ecvtamqwzmno", "dataxrwqfmd", "wpsibxovuqoq", "datafe")))
            .withParameters(mapOf("cvtqnzjcyqqzhemb",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datandyclwg"), "isj",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datanalbad")))
            .withAnnotations(Arrays.asList("dataajvmvvlooubsfxip", "dataeopsk", "dataocjomlup", "dataazusjcd"))
            .withFolder(new DatasetFolder().withName("lgdwzrgdqyx"))
            .withTableName("dataxlhmpmhef")
            .withTable("dataaphqeofytl")
            .withSchemaTypePropertiesSchema("datalowmcm");
        model = BinaryData.fromObject(model).toObject(PostgreSqlTableDataset.class);
        Assertions.assertEquals("ixuanccqvjfdgfq", model.description());
        Assertions.assertEquals("ossnq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("cvtqnzjcyqqzhemb").type());
        Assertions.assertEquals("lgdwzrgdqyx", model.folder().name());
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
