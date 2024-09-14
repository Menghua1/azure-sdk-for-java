// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.AtlasLineageInfo;
import com.azure.analytics.purview.datamap.models.LineageDirection;
import com.azure.analytics.purview.datamap.models.LineageRelation;
import com.azure.analytics.purview.datamap.models.ParentRelation;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class LineageGetTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testLineageGetTests() {
        // method invocation
        AtlasLineageInfo response
            = lineageClient.get("a6894eb3-81f3-829b-2adc-52f3e603411a", LineageDirection.INPUT, 1);

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "baseEntityGuid"
        Assertions.assertEquals("a6894eb3-81f3-829b-2adc-52f3e603411a", response.getBaseEntityGuid());
        // verify property "guidEntityMap"
        Assertions.assertNotNull(response.getGuidEntityMap());
        // verify property "widthCounts"
        Assertions.assertNotNull(response.getWidthCounts());
        // verify property "lineageDepth"
        Assertions.assertEquals(1, response.getLineageDepth());
        // verify property "lineageWidth"
        Assertions.assertEquals(1, response.getLineageWidth());
        // verify property "childrenCount"
        Assertions.assertEquals(1, response.getChildrenCount());
        // verify property "lineageDirection"
        Assertions.assertEquals(LineageDirection.INPUT, response.getLineageDirection());
        // verify property "parentRelations"
        List<ParentRelation> responseParentRelations = response.getParentRelations();
        Assertions.assertEquals(0, responseParentRelations.size());
        // verify property "relations"
        List<LineageRelation> responseRelations = response.getRelations();
        Assertions.assertEquals(0, responseRelations.size());
    }
}
