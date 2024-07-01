// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for CredentialOperations Get.
 */
public final class CredentialOperationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/Credentials_Get.json
     */
    /**
     * Sample code: Credentials_Get.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void credentialsGet(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.credentialOperations()
            .getWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleCredential", null,
                com.azure.core.util.Context.NONE);
    }
}
