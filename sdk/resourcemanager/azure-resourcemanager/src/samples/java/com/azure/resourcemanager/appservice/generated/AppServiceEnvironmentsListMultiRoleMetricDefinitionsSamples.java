// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServiceEnvironments ListMultiRoleMetricDefinitions.
 */
public final class AppServiceEnvironmentsListMultiRoleMetricDefinitionsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/AppServiceEnvironments_ListMultiRoleMetricDefinitions.json
     */
    /**
     * Sample code: Get metric definitions for a multi-role pool of an App Service Environment.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getMetricDefinitionsForAMultiRolePoolOfAnAppServiceEnvironment(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .listMultiRoleMetricDefinitions("test-rg", "test-ase", com.azure.core.util.Context.NONE);
    }
}
