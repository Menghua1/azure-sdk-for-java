// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseCharacterSetListResult;
import org.junit.jupiter.api.Assertions;

public final class AutonomousDatabaseCharacterSetListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutonomousDatabaseCharacterSetListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"characterSet\":\"uebbaumnyqup\"},\"id\":\"eojnabc\",\"name\":\"hsmtxpsiebtfhvp\",\"type\":\"sapskr\"},{\"properties\":{\"characterSet\":\"mhjjdhtldwkyzx\"},\"id\":\"tkncwsc\",\"name\":\"svlxotogtwrup\",\"type\":\"sx\"},{\"properties\":{\"characterSet\":\"micykvceoveilo\"},\"id\":\"oty\",\"name\":\"jfcn\",\"type\":\"bkc\"},{\"properties\":{\"characterSet\":\"dhbt\"},\"id\":\"phywpnvj\",\"name\":\"oqnermclfpl\",\"type\":\"hoxus\"}],\"nextLink\":\"pabgyeps\"}")
            .toObject(AutonomousDatabaseCharacterSetListResult.class);
        Assertions.assertEquals("pabgyeps", model.nextLink());
    }
}
