// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerVersionCapability;

public final class ServerVersionCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerVersionCapability model = BinaryData.fromString(
            "{\"name\":\"bwwaloa\",\"supportedSkus\":[{\"name\":\"wrtz\",\"vCores\":1900837356777018235,\"supportedIops\":2493734222555395016,\"supportedMemoryPerVCoreMB\":5304844297296220991},{\"name\":\"ongmtsa\",\"vCores\":4946607856371446692,\"supportedIops\":7752304449285326809,\"supportedMemoryPerVCoreMB\":398412434287347439},{\"name\":\"knftguvriuh\",\"vCores\":2144176809632708140,\"supportedIops\":6220323322610788577,\"supportedMemoryPerVCoreMB\":6305214480301008748}]}")
            .toObject(ServerVersionCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerVersionCapability model = new ServerVersionCapability();
        model = BinaryData.fromObject(model).toObject(ServerVersionCapability.class);
    }
}
