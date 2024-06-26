// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.billing.fluent.models.InstructionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of billing instructions used during invoice generation. */
@Immutable
public final class InstructionListResult {
    /*
     * The list of billing instructions used during invoice generation.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstructionInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of InstructionListResult class. */
    public InstructionListResult() {
    }

    /**
     * Get the value property: The list of billing instructions used during invoice generation.
     *
     * @return the value value.
     */
    public List<InstructionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
