// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.implementation.models.OperationListResult;
import com.azure.resourcemanager.standbypool.models.ActionType;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"hq\",\"isDataAction\":true,\"display\":{\"provider\":\"pybczmehmtzopb\",\"resource\":\"h\",\"operation\":\"pidgsybbejhphoyc\",\"description\":\"xaobhdxbmtqioqjz\"},\"origin\":\"system\",\"actionType\":\"Internal\"},{\"name\":\"fpownoizhwlr\",\"isDataAction\":false,\"display\":{\"provider\":\"oqijgkdmbpaz\",\"resource\":\"bc\",\"operation\":\"pdznrbtcqqjnqgl\",\"description\":\"gnufoooj\"},\"origin\":\"system\",\"actionType\":\"Internal\"},{\"name\":\"esaagdfm\",\"isDataAction\":true,\"display\":{\"provider\":\"j\",\"resource\":\"ifkwmrvktsizntoc\",\"operation\":\"a\",\"description\":\"ajpsquc\"},\"origin\":\"system\",\"actionType\":\"Internal\"}],\"nextLink\":\"kfo\"}")
            .toObject(OperationListResult.class);
        Assertions.assertEquals("pybczmehmtzopb", model.value().get(0).display().provider());
        Assertions.assertEquals("h", model.value().get(0).display().resource());
        Assertions.assertEquals("pidgsybbejhphoyc", model.value().get(0).display().operation());
        Assertions.assertEquals("xaobhdxbmtqioqjz", model.value().get(0).display().description());
        Assertions.assertEquals(ActionType.INTERNAL, model.value().get(0).actionType());
        Assertions.assertEquals("kfo", model.nextLink());
    }
}
