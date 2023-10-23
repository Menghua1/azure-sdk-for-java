// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The analysis request of the image. */
@Fluent
public final class AnalyzeImageOptions {
    /*
     * The image needs to be analyzed.
     */
    @Generated
    @JsonProperty(value = "image")
    private ImageData image;

    /*
     * The categories will be analyzed. If not assigned, a default set of the categories' analysis results will be
     * returned.
     */
    @Generated
    @JsonProperty(value = "categories")
    private List<ImageCategory> categories;

    /**
     * Creates an instance of AnalyzeImageOptions class.
     *
     * @param image the image value to set.
     */
    @Generated
    @JsonCreator
    public AnalyzeImageOptions(@JsonProperty(value = "image") ImageData image) {
        this.image = image;
    }

    /**
     * Get the image property: The image needs to be analyzed.
     *
     * @return the image value.
     */
    @Generated
    public ImageData getImage() {
        return this.image;
    }

    /**
     * Get the categories property: The categories will be analyzed. If not assigned, a default set of the categories'
     * analysis results will be returned.
     *
     * @return the categories value.
     */
    @Generated
    public List<ImageCategory> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: The categories will be analyzed. If not assigned, a default set of the categories'
     * analysis results will be returned.
     *
     * @param categories the categories value to set.
     * @return the AnalyzeImageOptions object itself.
     */
    @Generated
    public AnalyzeImageOptions setCategories(List<ImageCategory> categories) {
        this.categories = categories;
        return this;
    }
}
