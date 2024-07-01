// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JsonFormat;

public final class JsonFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonFormat model = BinaryData.fromString(
            "{\"type\":\"JsonFormat\",\"filePattern\":\"datazdqwuzvcm\",\"nestingSeparator\":\"datakxizek\",\"encodingName\":\"datafrjwucaon\",\"jsonNodeReference\":\"dataajbvbn\",\"jsonPathDefinition\":\"datademdidackzi\",\"serializer\":\"datazwdydamisvpztdi\",\"deserializer\":\"datakpxkqejtpjfoj\",\"\":{\"oiboan\":\"datarlshxuknsykd\",\"uld\":\"datadrcoanv\"}}")
            .toObject(JsonFormat.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonFormat model = new JsonFormat().withSerializer("datazwdydamisvpztdi")
            .withDeserializer("datakpxkqejtpjfoj")
            .withFilePattern("datazdqwuzvcm")
            .withNestingSeparator("datakxizek")
            .withEncodingName("datafrjwucaon")
            .withJsonNodeReference("dataajbvbn")
            .withJsonPathDefinition("datademdidackzi");
        model = BinaryData.fromObject(model).toObject(JsonFormat.class);
    }
}
