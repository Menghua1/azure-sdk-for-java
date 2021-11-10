// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.resourcemanager.synapse.models.BlobAuditingPolicyName;
import com.azure.resourcemanager.synapse.models.BlobAuditingPolicyState;
import java.util.Arrays;
import java.util.UUID;

/** Samples for WorkspaceManagedSqlServerExtendedBlobAuditingPolicies CreateOrUpdate. */
public final class WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/CreateWorkspaceManagedSqlServerExtendedBlobAuditingSettingsWithAllParameters.json
     */
    /**
     * Sample code: Create or update workspace managed sql server's extended blob auditing policy of with all
     * parameters.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void createOrUpdateWorkspaceManagedSqlServerSExtendedBlobAuditingPolicyOfWithAllParameters(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .workspaceManagedSqlServerExtendedBlobAuditingPolicies()
            .define(BlobAuditingPolicyName.DEFAULT)
            .withExistingWorkspace("wsg-7398", "testWorkspace")
            .withPredicateExpression("object_name = 'SensitiveData'")
            .withState(BlobAuditingPolicyState.ENABLED)
            .withStorageEndpoint("https://mystorage.blob.core.windows.net")
            .withStorageAccountAccessKey(
                "sdlfkjabc+sdlfkjsdlkfsjdfLDKFTERLKFDFKLjsdfksjdflsdkfD2342309432849328476458/3RSD==")
            .withRetentionDays(6)
            .withAuditActionsAndGroups(
                Arrays
                    .asList(
                        "SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP",
                        "FAILED_DATABASE_AUTHENTICATION_GROUP",
                        "BATCH_COMPLETED_GROUP"))
            .withStorageAccountSubscriptionId(UUID.fromString("00000000-1234-0000-5678-000000000000"))
            .withIsStorageSecondaryKeyInUse(false)
            .withIsAzureMonitorTargetEnabled(true)
            .create();
    }

    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/CreateWorkspaceManagedSqlServerExetendedBlobAuditingSettingsWithMinParameters.json
     */
    /**
     * Sample code: Create or update workspace managed sql server's extended blob auditing policy of with minimal
     * parameters.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void createOrUpdateWorkspaceManagedSqlServerSExtendedBlobAuditingPolicyOfWithMinimalParameters(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .workspaceManagedSqlServerExtendedBlobAuditingPolicies()
            .define(BlobAuditingPolicyName.DEFAULT)
            .withExistingWorkspace("wsg-7398", "testWorkspace")
            .withState(BlobAuditingPolicyState.ENABLED)
            .withStorageEndpoint("https://mystorage.blob.core.windows.net")
            .withStorageAccountAccessKey(
                "sdlfkjabc+sdlfkjsdlkfsjdfLDKFTERLKFDFKLjsdfksjdflsdkfD2342309432849328476458/3RSD==")
            .create();
    }
}
