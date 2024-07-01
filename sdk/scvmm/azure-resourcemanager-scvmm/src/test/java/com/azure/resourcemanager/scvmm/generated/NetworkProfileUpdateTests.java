// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.AllocationMethod;
import com.azure.resourcemanager.scvmm.models.NetworkInterfaceUpdate;
import com.azure.resourcemanager.scvmm.models.NetworkProfileUpdate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkProfileUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkProfileUpdate model = BinaryData.fromString(
            "{\"networkInterfaces\":[{\"name\":\"ae\",\"macAddress\":\"fhyhltrpmopjmcma\",\"virtualNetworkId\":\"okth\",\"ipv4AddressType\":\"Dynamic\",\"ipv6AddressType\":\"Static\",\"macAddressType\":\"Static\",\"nicId\":\"fcp\"}]}")
            .toObject(NetworkProfileUpdate.class);
        Assertions.assertEquals("ae", model.networkInterfaces().get(0).name());
        Assertions.assertEquals("fhyhltrpmopjmcma", model.networkInterfaces().get(0).macAddress());
        Assertions.assertEquals("okth", model.networkInterfaces().get(0).virtualNetworkId());
        Assertions.assertEquals(AllocationMethod.DYNAMIC, model.networkInterfaces().get(0).ipv4AddressType());
        Assertions.assertEquals(AllocationMethod.STATIC, model.networkInterfaces().get(0).ipv6AddressType());
        Assertions.assertEquals(AllocationMethod.STATIC, model.networkInterfaces().get(0).macAddressType());
        Assertions.assertEquals("fcp", model.networkInterfaces().get(0).nicId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkProfileUpdate model
            = new NetworkProfileUpdate().withNetworkInterfaces(Arrays.asList(new NetworkInterfaceUpdate().withName("ae")
                .withMacAddress("fhyhltrpmopjmcma")
                .withVirtualNetworkId("okth")
                .withIpv4AddressType(AllocationMethod.DYNAMIC)
                .withIpv6AddressType(AllocationMethod.STATIC)
                .withMacAddressType(AllocationMethod.STATIC)
                .withNicId("fcp")));
        model = BinaryData.fromObject(model).toObject(NetworkProfileUpdate.class);
        Assertions.assertEquals("ae", model.networkInterfaces().get(0).name());
        Assertions.assertEquals("fhyhltrpmopjmcma", model.networkInterfaces().get(0).macAddress());
        Assertions.assertEquals("okth", model.networkInterfaces().get(0).virtualNetworkId());
        Assertions.assertEquals(AllocationMethod.DYNAMIC, model.networkInterfaces().get(0).ipv4AddressType());
        Assertions.assertEquals(AllocationMethod.STATIC, model.networkInterfaces().get(0).ipv6AddressType());
        Assertions.assertEquals(AllocationMethod.STATIC, model.networkInterfaces().get(0).macAddressType());
        Assertions.assertEquals("fcp", model.networkInterfaces().get(0).nicId());
    }
}
