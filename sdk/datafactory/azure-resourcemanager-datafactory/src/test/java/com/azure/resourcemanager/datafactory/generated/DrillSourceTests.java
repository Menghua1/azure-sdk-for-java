// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DrillSource;

public final class DrillSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DrillSource model = BinaryData.fromString(
            "{\"type\":\"DrillSource\",\"query\":\"datadbvcxoamh\",\"queryTimeout\":\"datauhnbdlz\",\"additionalColumns\":\"dataectzjjgvcbt\",\"sourceRetryCount\":\"datampnkyvujhej\",\"sourceRetryWait\":\"datarvlguy\",\"maxConcurrentConnections\":\"datarngnbqhmuqyzxko\",\"disableMetricsCollection\":\"datarcjshtcfnbf\",\"\":{\"huboqozx\":\"dataxlyhxpdqo\"}}")
            .toObject(DrillSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DrillSource model = new DrillSource().withSourceRetryCount("datampnkyvujhej")
            .withSourceRetryWait("datarvlguy")
            .withMaxConcurrentConnections("datarngnbqhmuqyzxko")
            .withDisableMetricsCollection("datarcjshtcfnbf")
            .withQueryTimeout("datauhnbdlz")
            .withAdditionalColumns("dataectzjjgvcbt")
            .withQuery("datadbvcxoamh");
        model = BinaryData.fromObject(model).toObject(DrillSource.class);
    }
}
