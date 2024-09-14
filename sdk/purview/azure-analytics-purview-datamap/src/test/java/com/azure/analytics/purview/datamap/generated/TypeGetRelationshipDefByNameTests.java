// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.AtlasAttributeDef;
import com.azure.analytics.purview.datamap.models.AtlasRelationshipDef;
import com.azure.analytics.purview.datamap.models.AtlasRelationshipEndDef;
import com.azure.analytics.purview.datamap.models.CardinalityValue;
import com.azure.analytics.purview.datamap.models.RelationshipCategory;
import com.azure.analytics.purview.datamap.models.TypeCategory;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class TypeGetRelationshipDefByNameTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testTypeGetRelationshipDefByNameTests() {
        // method invocation
        AtlasRelationshipDef response = typeDefinitionClient.getRelationshipByName("storm_topology_nodes");

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "category"
        Assertions.assertEquals(TypeCategory.RELATIONSHIP, response.getCategory());
        // verify property "createTime"
        Assertions.assertEquals(1553065976797L, response.getCreateTime());
        // verify property "createdBy"
        Assertions.assertEquals("ExampleCreator", response.getCreatedBy());
        // verify property "description"
        Assertions.assertEquals("storm_topology_nodes", response.getDescription());
        // verify property "guid"
        Assertions.assertEquals("695edde1-2782-4a3c-841b-0b3aba25fe45", response.getGuid());
        // verify property "name"
        Assertions.assertEquals("storm_topology_nodes", response.getName());
        // verify property "typeVersion"
        Assertions.assertEquals("1.0", response.getTypeVersion());
        // verify property "updateTime"
        Assertions.assertEquals(1553065976797L, response.getUpdateTime());
        // verify property "updatedBy"
        Assertions.assertEquals("ExampleUpdator", response.getUpdatedBy());
        // verify property "version"
        Assertions.assertEquals(1L, response.getVersion());
        // verify property "attributeDefs"
        List<AtlasAttributeDef> responseAttributeDefs = response.getAttributeDefs();
        Assertions.assertEquals(0, responseAttributeDefs.size());
        // verify property "endDef1"
        AtlasRelationshipEndDef responseEndDef1 = response.getEndDef1();
        Assertions.assertNotNull(responseEndDef1);
        Assertions.assertEquals(CardinalityValue.SET, responseEndDef1.getCardinality());
        Assertions.assertEquals(false, responseEndDef1.isContainer());
        Assertions.assertEquals(true, responseEndDef1.isLegacyAttribute());
        Assertions.assertEquals("nodes", responseEndDef1.getName());
        Assertions.assertEquals("storm_topology", responseEndDef1.getType());
        // verify property "endDef2"
        AtlasRelationshipEndDef responseEndDef2 = response.getEndDef2();
        Assertions.assertNotNull(responseEndDef2);
        Assertions.assertEquals(CardinalityValue.SET, responseEndDef2.getCardinality());
        Assertions.assertEquals(false, responseEndDef2.isContainer());
        Assertions.assertEquals(false, responseEndDef2.isLegacyAttribute());
        Assertions.assertEquals("topolgies", responseEndDef2.getName());
        Assertions.assertEquals("storm_node", responseEndDef2.getType());
        // verify property "relationshipCategory"
        Assertions.assertEquals(RelationshipCategory.ASSOCIATION, response.getRelationshipCategory());
        // verify property "relationshipLabel"
        Assertions.assertEquals("r:storm_topology_nodes", response.getRelationshipLabel());
    }
}
