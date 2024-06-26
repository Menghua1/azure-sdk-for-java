// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.ResourceGuardResourceInner;
import com.azure.resourcemanager.dataprotection.models.ResourceGuard;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardResourceList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardResourceList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"allowAutoApprovals\":true,\"resourceGuardOperations\":[{\"vaultCriticalOperation\":\"kghimdblxgwimfnj\",\"requestResourceType\":\"j\"}],\"vaultCriticalOperationExclusionList\":[\"szkkfoqre\",\"fkzikfj\"],\"description\":\"n\"},\"eTag\":\"ivx\",\"location\":\"zel\",\"tags\":{\"lsfeaenwabfatkld\":\"r\",\"oulpjrv\":\"xbjhwuaanozjosph\"},\"id\":\"ag\",\"name\":\"rvimjwosytxitcsk\",\"type\":\"cktqumiekkezzi\"}],\"nextLink\":\"ly\"}")
            .toObject(ResourceGuardResourceList.class);
        Assertions.assertEquals("ly", model.nextLink());
        Assertions.assertEquals("zel", model.value().get(0).location());
        Assertions.assertEquals("r", model.value().get(0).tags().get("lsfeaenwabfatkld"));
        Assertions.assertEquals("ivx", model.value().get(0).etag());
        Assertions.assertEquals("szkkfoqre",
            model.value().get(0).properties().vaultCriticalOperationExclusionList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardResourceList model = new ResourceGuardResourceList().withNextLink("ly")
            .withValue(Arrays.asList(new ResourceGuardResourceInner().withLocation("zel")
                .withTags(mapOf("lsfeaenwabfatkld", "r", "oulpjrv", "xbjhwuaanozjosph")).withEtag("ivx")
                .withProperties(new ResourceGuard()
                    .withVaultCriticalOperationExclusionList(Arrays.asList("szkkfoqre", "fkzikfj")))));
        model = BinaryData.fromObject(model).toObject(ResourceGuardResourceList.class);
        Assertions.assertEquals("ly", model.nextLink());
        Assertions.assertEquals("zel", model.value().get(0).location());
        Assertions.assertEquals("r", model.value().get(0).tags().get("lsfeaenwabfatkld"));
        Assertions.assertEquals("ivx", model.value().get(0).etag());
        Assertions.assertEquals("szkkfoqre",
            model.value().get(0).properties().vaultCriticalOperationExclusionList().get(0));
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
