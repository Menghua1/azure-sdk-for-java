// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.LogicalDatabaseTransparentDataEncryptionInner;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionName;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionState;

/**
 * Samples for TransparentDataEncryptions CreateOrUpdate.
 */
public final class TransparentDataEncryptionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/TransparentDataEncryptionUpdate.json
     */
    /**
     * Sample code: Update a database's Transparent Data Encryption state with minimal parameters.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateADatabaseSTransparentDataEncryptionStateWithMinimalParameters(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getTransparentDataEncryptions()
            .createOrUpdate("securitytde-42-rg", "securitytde-42", "testdb", TransparentDataEncryptionName.CURRENT,
                new LogicalDatabaseTransparentDataEncryptionInner().withState(TransparentDataEncryptionState.ENABLED),
                com.azure.core.util.Context.NONE);
    }
}
