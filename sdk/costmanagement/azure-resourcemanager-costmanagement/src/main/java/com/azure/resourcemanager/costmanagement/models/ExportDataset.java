// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The definition for data in the export. */
@Fluent
public final class ExportDataset {
    /*
     * The granularity of rows in the export. Currently only 'Daily' is supported.
     */
    @JsonProperty(value = "granularity")
    private GranularityType granularity;

    /*
     * The export dataset configuration.
     */
    @JsonProperty(value = "configuration")
    private ExportDatasetConfiguration configuration;

    /** Creates an instance of ExportDataset class. */
    public ExportDataset() {
    }

    /**
     * Get the granularity property: The granularity of rows in the export. Currently only 'Daily' is supported.
     *
     * @return the granularity value.
     */
    public GranularityType granularity() {
        return this.granularity;
    }

    /**
     * Set the granularity property: The granularity of rows in the export. Currently only 'Daily' is supported.
     *
     * @param granularity the granularity value to set.
     * @return the ExportDataset object itself.
     */
    public ExportDataset withGranularity(GranularityType granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get the configuration property: The export dataset configuration.
     *
     * @return the configuration value.
     */
    public ExportDatasetConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: The export dataset configuration.
     *
     * @param configuration the configuration value to set.
     * @return the ExportDataset object itself.
     */
    public ExportDataset withConfiguration(ExportDatasetConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
    }
}
