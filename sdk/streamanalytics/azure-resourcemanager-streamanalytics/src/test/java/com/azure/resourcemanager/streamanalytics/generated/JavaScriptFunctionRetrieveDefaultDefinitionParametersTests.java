// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.JavaScriptFunctionRetrieveDefaultDefinitionParameters;
import com.azure.resourcemanager.streamanalytics.models.UdfType;
import org.junit.jupiter.api.Assertions;

public final class JavaScriptFunctionRetrieveDefaultDefinitionParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JavaScriptFunctionRetrieveDefaultDefinitionParameters model = BinaryData.fromString(
            "{\"bindingType\":\"Microsoft.StreamAnalytics/JavascriptUdf\",\"bindingRetrievalProperties\":{\"script\":\"oygmift\",\"udfType\":\"Scalar\"}}")
            .toObject(JavaScriptFunctionRetrieveDefaultDefinitionParameters.class);
        Assertions.assertEquals("oygmift", model.script());
        Assertions.assertEquals(UdfType.SCALAR, model.udfType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JavaScriptFunctionRetrieveDefaultDefinitionParameters model
            = new JavaScriptFunctionRetrieveDefaultDefinitionParameters().withScript("oygmift")
                .withUdfType(UdfType.SCALAR);
        model = BinaryData.fromObject(model).toObject(JavaScriptFunctionRetrieveDefaultDefinitionParameters.class);
        Assertions.assertEquals("oygmift", model.script());
        Assertions.assertEquals(UdfType.SCALAR, model.udfType());
    }
}
