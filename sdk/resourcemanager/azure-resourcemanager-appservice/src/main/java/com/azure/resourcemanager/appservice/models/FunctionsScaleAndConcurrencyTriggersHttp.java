// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Scale and concurrency settings for the HTTP trigger.
 */
@Fluent
public final class FunctionsScaleAndConcurrencyTriggersHttp {
    /*
     * The maximum number of concurrent HTTP trigger invocations per instance.
     */
    @JsonProperty(value = "perInstanceConcurrency")
    private Float perInstanceConcurrency;

    /**
     * Creates an instance of FunctionsScaleAndConcurrencyTriggersHttp class.
     */
    public FunctionsScaleAndConcurrencyTriggersHttp() {
    }

    /**
     * Get the perInstanceConcurrency property: The maximum number of concurrent HTTP trigger invocations per instance.
     * 
     * @return the perInstanceConcurrency value.
     */
    public Float perInstanceConcurrency() {
        return this.perInstanceConcurrency;
    }

    /**
     * Set the perInstanceConcurrency property: The maximum number of concurrent HTTP trigger invocations per instance.
     * 
     * @param perInstanceConcurrency the perInstanceConcurrency value to set.
     * @return the FunctionsScaleAndConcurrencyTriggersHttp object itself.
     */
    public FunctionsScaleAndConcurrencyTriggersHttp withPerInstanceConcurrency(Float perInstanceConcurrency) {
        this.perInstanceConcurrency = perInstanceConcurrency;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
