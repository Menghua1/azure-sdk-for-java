// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.FunctionRetrieveDefaultDefinitionParameters;

public final class FunctionRetrieveDefaultDefinitionParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FunctionRetrieveDefaultDefinitionParameters model
            = BinaryData.fromString("{\"bindingType\":\"FunctionRetrieveDefaultDefinitionParameters\"}")
                .toObject(FunctionRetrieveDefaultDefinitionParameters.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FunctionRetrieveDefaultDefinitionParameters model = new FunctionRetrieveDefaultDefinitionParameters();
        model = BinaryData.fromObject(model).toObject(FunctionRetrieveDefaultDefinitionParameters.class);
    }
}
