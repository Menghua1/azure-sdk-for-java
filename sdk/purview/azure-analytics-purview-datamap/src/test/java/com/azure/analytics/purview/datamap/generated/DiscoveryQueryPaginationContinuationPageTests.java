// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.ContactSearchResultValue;
import com.azure.analytics.purview.datamap.models.QueryOptions;
import com.azure.analytics.purview.datamap.models.QueryResult;
import com.azure.analytics.purview.datamap.models.SearchFacetItem;
import com.azure.analytics.purview.datamap.models.SearchFacetSort;
import com.azure.analytics.purview.datamap.models.SearchResultValue;
import com.azure.analytics.purview.datamap.models.SearchSortOrder;
import com.azure.analytics.purview.datamap.models.TermSearchResultValue;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class DiscoveryQueryPaginationContinuationPageTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testDiscoveryQueryPaginationContinuationPageTests() throws IOException {
        // method invocation
        QueryResult response = discoveryClient.query(new QueryOptions().setKeywords("fakeTokenPlaceholder")
            .setLimit(2)
            .setContinuationToken("fakeTokenPlaceholder")
            .setOrderby(Arrays.asList(
                JacksonAdapter.createDefaultSerializerAdapter()
                    .deserialize("{\"name\":\"ASC\"}", Object.class, SerializerEncoding.JSON),
                JacksonAdapter.createDefaultSerializerAdapter()
                    .deserialize("{\"updateTime\":\"DESC\"}", Object.class, SerializerEncoding.JSON)))
            .setFilter(JacksonAdapter.createDefaultSerializerAdapter()
                .deserialize("{\"and\":[{\"objectType\":\"Files\"},{\"entityType\":\"azure_blob_path\"}]}",
                    Object.class, SerializerEncoding.JSON))
            .setFacets(Arrays.asList(
                new SearchFacetItem().setCount(0)
                    .setFacet("assetType")
                    .setSort(new SearchFacetSort().setCount(SearchSortOrder.DESCEND)),
                new SearchFacetItem().setCount(10)
                    .setFacet("classification")
                    .setSort(new SearchFacetSort().setCount(SearchSortOrder.DESCEND)),
                new SearchFacetItem().setCount(10)
                    .setFacet("contactId")
                    .setSort(new SearchFacetSort().setCount(SearchSortOrder.DESCEND)),
                new SearchFacetItem().setCount(10)
                    .setFacet("label")
                    .setSort(new SearchFacetSort().setCount(SearchSortOrder.DESCEND)),
                new SearchFacetItem().setCount(10)
                    .setFacet("term")
                    .setSort(new SearchFacetSort().setCount(SearchSortOrder.DESCEND)))));

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "searchCount"
        Assertions.assertEquals(6, response.getSearchCount());
        // verify property "searchCountApproximate"
        Assertions.assertEquals(false, response.isSearchCountApproximate());
        // verify property "continuationToken"
        Assertions.assertEquals("<token>", response.getContinuationToken());
        // verify property "value"
        List<SearchResultValue> responseValue = response.getValue();
        SearchResultValue responseValueFirstItem = responseValue.iterator().next();
        Assertions.assertNotNull(responseValueFirstItem);
        Assertions.assertEquals(1.0D, responseValueFirstItem.getSearchScore());
        Assertions.assertEquals("bfecbcc3-1838-45fe-96d6-112de8a170f9", responseValueFirstItem.getId());
        Assertions.assertEquals("exampledata1.txt", responseValueFirstItem.getName());
        Assertions.assertEquals("https://exampleaccount.blob.core.windows.net/examplepath/exampledata1.txt",
            responseValueFirstItem.getQualifiedName());
        Assertions.assertEquals("azure_blob_path", responseValueFirstItem.getEntityType());
        List<String> responseValueFirstItemClassification = responseValueFirstItem.getClassification();
        Assertions.assertEquals(0, responseValueFirstItemClassification.size());
        List<String> responseValueFirstItemLabel = responseValueFirstItem.getLabel();
        Assertions.assertEquals(0, responseValueFirstItemLabel.size());
        List<TermSearchResultValue> responseValueFirstItemTerm = responseValueFirstItem.getTerm();
        Assertions.assertEquals(0, responseValueFirstItemTerm.size());
        List<ContactSearchResultValue> responseValueFirstItemContact = responseValueFirstItem.getContact();
        Assertions.assertEquals(0, responseValueFirstItemContact.size());
        List<String> responseValueFirstItemAssetType = responseValueFirstItem.getAssetType();
        Assertions.assertEquals("Azure Blob Storage", responseValueFirstItemAssetType.iterator().next());
    }
}
