// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.fluent.models.SshPublicKeyResourceInner;

/**
 * Samples for SshPublicKeys Create.
 */
public final class SshPublicKeysCreateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * sshPublicKeyExamples/SshPublicKey_Create.json
     */
    /**
     * Sample code: Create a new SSH public key resource.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createANewSSHPublicKeyResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSshPublicKeys()
            .createWithResponse("myResourceGroup", "mySshPublicKeyName",
                new SshPublicKeyResourceInner().withLocation("westus").withPublicKey("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
