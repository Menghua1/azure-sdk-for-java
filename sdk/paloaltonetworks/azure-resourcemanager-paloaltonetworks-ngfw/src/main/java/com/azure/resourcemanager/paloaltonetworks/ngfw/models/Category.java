// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * URL/EDL to match.
 */
@Fluent
public final class Category {
    /*
     * custom URL
     */
    @JsonProperty(value = "urlCustom", required = true)
    private List<String> urlCustom;

    /*
     * feed list
     */
    @JsonProperty(value = "feeds", required = true)
    private List<String> feeds;

    /**
     * Creates an instance of Category class.
     */
    public Category() {
    }

    /**
     * Get the urlCustom property: custom URL.
     * 
     * @return the urlCustom value.
     */
    public List<String> urlCustom() {
        return this.urlCustom;
    }

    /**
     * Set the urlCustom property: custom URL.
     * 
     * @param urlCustom the urlCustom value to set.
     * @return the Category object itself.
     */
    public Category withUrlCustom(List<String> urlCustom) {
        this.urlCustom = urlCustom;
        return this;
    }

    /**
     * Get the feeds property: feed list.
     * 
     * @return the feeds value.
     */
    public List<String> feeds() {
        return this.feeds;
    }

    /**
     * Set the feeds property: feed list.
     * 
     * @param feeds the feeds value to set.
     * @return the Category object itself.
     */
    public Category withFeeds(List<String> feeds) {
        this.feeds = feeds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (urlCustom() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property urlCustom in model Category"));
        }
        if (feeds() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property feeds in model Category"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Category.class);
}
