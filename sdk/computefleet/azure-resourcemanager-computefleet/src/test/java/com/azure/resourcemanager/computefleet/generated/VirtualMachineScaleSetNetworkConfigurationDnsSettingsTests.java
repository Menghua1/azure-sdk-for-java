// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computefleet.models.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VirtualMachineScaleSetNetworkConfigurationDnsSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualMachineScaleSetNetworkConfigurationDnsSettings model = BinaryData
            .fromString("{\"dnsServers\":[\"qzntypm\",\"bpizcdrqjsdpydn\",\"yhxdeoejzicwi\",\"sjttgzfbish\"]}")
            .toObject(VirtualMachineScaleSetNetworkConfigurationDnsSettings.class);
        Assertions.assertEquals("qzntypm", model.dnsServers().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualMachineScaleSetNetworkConfigurationDnsSettings model
            = new VirtualMachineScaleSetNetworkConfigurationDnsSettings()
                .withDnsServers(Arrays.asList("qzntypm", "bpizcdrqjsdpydn", "yhxdeoejzicwi", "sjttgzfbish"));
        model = BinaryData.fromObject(model).toObject(VirtualMachineScaleSetNetworkConfigurationDnsSettings.class);
        Assertions.assertEquals("qzntypm", model.dnsServers().get(0));
    }
}
