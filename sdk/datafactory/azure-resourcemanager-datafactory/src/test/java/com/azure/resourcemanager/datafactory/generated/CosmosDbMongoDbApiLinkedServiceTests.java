// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbMongoDbApiLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CosmosDbMongoDbApiLinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbMongoDbApiLinkedService model = BinaryData.fromString(
            "{\"type\":\"CosmosDbMongoDbApi\",\"typeProperties\":{\"isServerVersionAbove32\":\"datamewwlkryz\",\"connectionString\":\"datapgqqdhtctx\",\"database\":\"dataregykjmpad\"},\"connectVia\":{\"referenceName\":\"joh\",\"parameters\":{\"dljgrpqu\":\"datazhdxit\",\"qqb\":\"datafxg\"}},\"description\":\"tffxdbisihumw\",\"parameters\":{\"zqqihvb\":{\"type\":\"Array\",\"defaultValue\":\"datatgljop\"},\"kjpajl\":{\"type\":\"Int\",\"defaultValue\":\"dataqiqddjynpgomz\"},\"bnwitafjjevp\":{\"type\":\"Object\",\"defaultValue\":\"datavrljlhejcccp\"},\"arskp\":{\"type\":\"Bool\",\"defaultValue\":\"datatghzqwvk\"}},\"annotations\":[\"datatqc\"],\"\":{\"fwrm\":\"databsudcykgulel\",\"oubxlpkdsnbqoyms\":\"datauxyqbm\",\"zyrp\":\"datalraduhgwa\"}}")
            .toObject(CosmosDbMongoDbApiLinkedService.class);
        Assertions.assertEquals("joh", model.connectVia().referenceName());
        Assertions.assertEquals("tffxdbisihumw", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("zqqihvb").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbMongoDbApiLinkedService model = new CosmosDbMongoDbApiLinkedService()
            .withConnectVia(new IntegrationRuntimeReference().withReferenceName("joh")
                .withParameters(mapOf("dljgrpqu", "datazhdxit", "qqb", "datafxg")))
            .withDescription("tffxdbisihumw")
            .withParameters(mapOf("zqqihvb",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datatgljop"), "kjpajl",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataqiqddjynpgomz"),
                "bnwitafjjevp",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datavrljlhejcccp"),
                "arskp", new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datatghzqwvk")))
            .withAnnotations(Arrays.asList("datatqc"))
            .withIsServerVersionAbove32("datamewwlkryz")
            .withConnectionString("datapgqqdhtctx")
            .withDatabase("dataregykjmpad");
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiLinkedService.class);
        Assertions.assertEquals("joh", model.connectVia().referenceName());
        Assertions.assertEquals("tffxdbisihumw", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("zqqihvb").type());
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
