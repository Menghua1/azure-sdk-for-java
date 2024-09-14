// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.ContactSearchResultValue;
import com.azure.analytics.purview.datamap.models.QueryOptions;
import com.azure.analytics.purview.datamap.models.QueryResult;
import com.azure.analytics.purview.datamap.models.SearchHighlights;
import com.azure.analytics.purview.datamap.models.SearchResultValue;
import com.azure.analytics.purview.datamap.models.TermSearchResultValue;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class DiscoveryQueryAndOrNestedTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testDiscoveryQueryAndOrNestedTests() throws IOException {
        // method invocation
        QueryResult response = discoveryClient.query(new QueryOptions().setLimit(10)
            .setFilter(JacksonAdapter.createDefaultSerializerAdapter()
                .deserialize(
                    "{\"and\":[{\"entityType\":\"azure_blob_path\"},{\"attributeName\":\"qualifiedName\",\"operator\":\"contains\",\"attributeValue\":\".csv\"},{\"or\":[{\"attributeName\":\"name\",\"operator\":\"eq\",\"attributeValue\":\"exampledata.csv\"},{\"attributeName\":\"qualifiedName\",\"operator\":\"prefix\",\"attributeValue\":\"https://\"}]}]}",
                    Object.class, SerializerEncoding.JSON)));

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "searchCount"
        Assertions.assertEquals(2, response.getSearchCount());
        // verify property "searchCountApproximate"
        Assertions.assertEquals(false, response.isSearchCountApproximate());
        // verify property "value"
        List<SearchResultValue> responseValue = response.getValue();
        SearchResultValue responseValueFirstItem = responseValue.iterator().next();
        Assertions.assertNotNull(responseValueFirstItem);
        Assertions.assertEquals(1.0D, responseValueFirstItem.getSearchScore());
        SearchHighlights responseValueFirstItemSearchHighlights = responseValueFirstItem.getSearchHighlights();
        Assertions.assertNotNull(responseValueFirstItemSearchHighlights);
        List<String> responseValueFirstItemSearchHighlightsQualifiedName
            = responseValueFirstItemSearchHighlights.getQualifiedName();
        Assertions.assertEquals("https://exampleaccount.blob.core.windows.net/examplepath/<em>csv</em>/exampledata.csv",
            responseValueFirstItemSearchHighlightsQualifiedName.iterator().next());
        Assertions.assertEquals("63b92968-c9ac-4af8-8cff-f61d147bbf88", responseValueFirstItem.getId());
        Assertions.assertEquals("exampledata.csv", responseValueFirstItem.getName());
        Assertions.assertEquals("https://exampleaccount.blob.core.windows.net/examplepath/csv/exampledata.csv",
            responseValueFirstItem.getQualifiedName());
        Assertions.assertEquals("azure_blob_path", responseValueFirstItem.getEntityType());
        List<String> responseValueFirstItemClassification = responseValueFirstItem.getClassification();
        Assertions.assertEquals(0, responseValueFirstItemClassification.size());
        List<String> responseValueFirstItemLabel = responseValueFirstItem.getLabel();
        Assertions.assertEquals("Example.Label", responseValueFirstItemLabel.iterator().next());
        List<TermSearchResultValue> responseValueFirstItemTerm = responseValueFirstItem.getTerm();
        Assertions.assertEquals(0, responseValueFirstItemTerm.size());
        List<ContactSearchResultValue> responseValueFirstItemContact = responseValueFirstItem.getContact();
        Assertions.assertEquals(0, responseValueFirstItemContact.size());
        List<String> responseValueFirstItemAssetType = responseValueFirstItem.getAssetType();
        Assertions.assertEquals("Azure Blob Storage", responseValueFirstItemAssetType.iterator().next());
    }
}
