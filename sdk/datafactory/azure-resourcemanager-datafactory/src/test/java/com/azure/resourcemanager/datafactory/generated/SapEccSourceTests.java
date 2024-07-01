// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapEccSource;

public final class SapEccSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapEccSource model = BinaryData.fromString(
            "{\"type\":\"SapEccSource\",\"query\":\"datakd\",\"httpRequestTimeout\":\"datakdpn\",\"queryTimeout\":\"datadwcxjv\",\"additionalColumns\":\"datal\",\"sourceRetryCount\":\"dataxcmcccotqocnryyp\",\"sourceRetryWait\":\"dataduldsolbz\",\"maxConcurrentConnections\":\"datarufkeylkpvaagrd\",\"disableMetricsCollection\":\"datavglqdsphvo\",\"\":{\"thzfotfrfhrjka\":\"dataryhuo\",\"nitrmzvnrfkzn\":\"datadofshgmqxwop\",\"rnxrjmilogcn\":\"dataaittbmobrxhwpg\",\"plrtxhzt\":\"datafgqibb\"}}")
            .toObject(SapEccSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapEccSource model = new SapEccSource().withSourceRetryCount("dataxcmcccotqocnryyp")
            .withSourceRetryWait("dataduldsolbz")
            .withMaxConcurrentConnections("datarufkeylkpvaagrd")
            .withDisableMetricsCollection("datavglqdsphvo")
            .withQueryTimeout("datadwcxjv")
            .withAdditionalColumns("datal")
            .withQuery("datakd")
            .withHttpRequestTimeout("datakdpn");
        model = BinaryData.fromObject(model).toObject(SapEccSource.class);
    }
}
