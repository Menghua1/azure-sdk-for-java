// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PrefixListGlobalRulestackResourceInner;
import java.util.Arrays;

/**
 * Samples for PrefixListGlobalRulestack CreateOrUpdate.
 */
public final class PrefixListGlobalRulestackCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * PrefixListGlobalRulestack_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrefixListGlobalRulestack_CreateOrUpdate_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void prefixListGlobalRulestackCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.prefixListGlobalRulestacks().createOrUpdate("praval", "armid1",
            new PrefixListGlobalRulestackResourceInner().withDescription("string")
                .withPrefixList(Arrays.asList("1.0.0.0/24")).withEtag("2bf4a339-294d-4c25-b0b2-ef649e9f5c27")
                .withAuditComment("comment"),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * PrefixListGlobalRulestack_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrefixListGlobalRulestack_CreateOrUpdate_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void prefixListGlobalRulestackCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.prefixListGlobalRulestacks().createOrUpdate("praval", "armid1",
            new PrefixListGlobalRulestackResourceInner().withPrefixList(Arrays.asList("1.0.0.0/24")),
            com.azure.core.util.Context.NONE);
    }
}
