// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateManagedImageDistributor;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplateManagedImageDistributorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplateManagedImageDistributor model = BinaryData.fromString(
            "{\"type\":\"ManagedImage\",\"imageId\":\"zcdrqjsdpydnfyhx\",\"location\":\"eoejzic\",\"runOutputName\":\"ifsjttgzfbishcb\",\"artifactTags\":{\"alpbuxwgipwhon\":\"jdeyeamdpha\",\"kix\":\"wkgshwa\",\"eputtmrywnuzoqf\":\"bin\",\"qvyxlwhzlsicoho\":\"iyqzrnk\"}}")
            .toObject(ImageTemplateManagedImageDistributor.class);
        Assertions.assertEquals("ifsjttgzfbishcb", model.runOutputName());
        Assertions.assertEquals("jdeyeamdpha", model.artifactTags().get("alpbuxwgipwhon"));
        Assertions.assertEquals("zcdrqjsdpydnfyhx", model.imageId());
        Assertions.assertEquals("eoejzic", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplateManagedImageDistributor model
            = new ImageTemplateManagedImageDistributor().withRunOutputName("ifsjttgzfbishcb")
                .withArtifactTags(mapOf("alpbuxwgipwhon", "jdeyeamdpha", "kix", "wkgshwa", "eputtmrywnuzoqf", "bin",
                    "qvyxlwhzlsicoho", "iyqzrnk"))
                .withImageId("zcdrqjsdpydnfyhx")
                .withLocation("eoejzic");
        model = BinaryData.fromObject(model).toObject(ImageTemplateManagedImageDistributor.class);
        Assertions.assertEquals("ifsjttgzfbishcb", model.runOutputName());
        Assertions.assertEquals("jdeyeamdpha", model.artifactTags().get("alpbuxwgipwhon"));
        Assertions.assertEquals("zcdrqjsdpydnfyhx", model.imageId());
        Assertions.assertEquals("eoejzic", model.location());
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
