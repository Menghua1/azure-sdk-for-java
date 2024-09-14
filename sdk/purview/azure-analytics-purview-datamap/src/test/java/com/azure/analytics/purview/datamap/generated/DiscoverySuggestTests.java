// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.ContactSearchResultValue;
import com.azure.analytics.purview.datamap.models.SuggestOptions;
import com.azure.analytics.purview.datamap.models.SuggestResult;
import com.azure.analytics.purview.datamap.models.SuggestResultValue;
import com.azure.analytics.purview.datamap.models.TermSearchResultValue;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class DiscoverySuggestTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testDiscoverySuggestTests() throws IOException {
        // method invocation
        SuggestResult response = discoveryClient.suggest(new SuggestOptions().setKeywords("fakeTokenPlaceholder")
            .setLimit(10)
            .setFilter(JacksonAdapter.createDefaultSerializerAdapter()
                .deserialize("{\"and\":[{\"entityType\":\"azure_blob_path\",\"includeSubTypes\":false}]}", Object.class,
                    SerializerEncoding.JSON)));

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "value"
        List<SuggestResultValue> responseValue = response.getValue();
        SuggestResultValue responseValueFirstItem = responseValue.iterator().next();
        Assertions.assertNotNull(responseValueFirstItem);
        Assertions.assertEquals(9.81402D, responseValueFirstItem.getSearchScore());
        Assertions.assertEquals("<em>exampledata.csv</em>", responseValueFirstItem.getSearchText());
        Assertions.assertEquals("af7a01b0-1b14-4ab6-83a5-12cb11a717ed", responseValueFirstItem.getId());
        Assertions.assertEquals("exampledata.csv", responseValueFirstItem.getName());
        Assertions.assertEquals("https://exampleaccount.blob.core.windows.net/examplepath/exampledata.csv",
            responseValueFirstItem.getQualifiedName());
        Assertions.assertEquals("azure_blob_path", responseValueFirstItem.getEntityType());
        Assertions.assertEquals("Example Description", responseValueFirstItem.getDescription());
        Assertions.assertEquals("$superuser", responseValueFirstItem.getOwner());
        List<String> responseValueFirstItemClassification = responseValueFirstItem.getClassification();
        Assertions.assertEquals("MICROSOFT.GOVERNMENT.US.PASSPORT_NUMBER",
            responseValueFirstItemClassification.iterator().next());
        List<String> responseValueFirstItemLabel = responseValueFirstItem.getLabel();
        Assertions.assertEquals("Example.Label", responseValueFirstItemLabel.iterator().next());
        List<TermSearchResultValue> responseValueFirstItemTerm = responseValueFirstItem.getTerm();
        TermSearchResultValue responseValueFirstItemTermFirstItem = responseValueFirstItemTerm.iterator().next();
        Assertions.assertNotNull(responseValueFirstItemTermFirstItem);
        Assertions.assertEquals("Example Term", responseValueFirstItemTermFirstItem.getName());
        Assertions.assertEquals("Glossary", responseValueFirstItemTermFirstItem.getGlossaryName());
        List<ContactSearchResultValue> responseValueFirstItemContact = responseValueFirstItem.getContact();
        ContactSearchResultValue responseValueFirstItemContactFirstItem
            = responseValueFirstItemContact.iterator().next();
        Assertions.assertNotNull(responseValueFirstItemContactFirstItem);
        Assertions.assertEquals("8a597ffc-6993-4772-ac25-86b7251e1234", responseValueFirstItemContactFirstItem.getId());
        Assertions.assertEquals("Example Info", responseValueFirstItemContactFirstItem.getInfo());
        Assertions.assertEquals("Expert", responseValueFirstItemContactFirstItem.getContactType());
        List<String> responseValueFirstItemAssetType = responseValueFirstItem.getAssetType();
        Assertions.assertEquals("Azure Blob Storage", responseValueFirstItemAssetType.iterator().next());
    }
}
