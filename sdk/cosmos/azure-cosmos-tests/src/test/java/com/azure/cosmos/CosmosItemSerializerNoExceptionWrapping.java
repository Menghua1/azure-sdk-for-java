/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 *
 */

package com.azure.cosmos;

public abstract class CosmosItemSerializerNoExceptionWrapping extends CosmosItemSerializer {
    public CosmosItemSerializerNoExceptionWrapping() {
        super(false);
    }
}
