// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Vendor reference. */
@Immutable
public final class VendorReference {
    /*
     * Link title
     */
    @JsonProperty(value = "title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /*
     * Link url
     */
    @JsonProperty(value = "link", access = JsonProperty.Access.WRITE_ONLY)
    private String link;

    /**
     * Get the title property: Link title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Get the link property: Link url.
     *
     * @return the link value.
     */
    public String link() {
        return this.link;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
