// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The springbootsites resource definition.
 */
@Fluent
public final class SpringbootsitesProperties {
    /*
     * The master site ID from Azure Migrate.
     */
    @JsonProperty(value = "masterSiteId")
    private String masterSiteId;

    /*
     * The migrate project ID from Azure Migrate.
     */
    @JsonProperty(value = "migrateProjectId")
    private String migrateProjectId;

    /*
     * The resource provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of SpringbootsitesProperties class.
     */
    public SpringbootsitesProperties() {
    }

    /**
     * Get the masterSiteId property: The master site ID from Azure Migrate.
     * 
     * @return the masterSiteId value.
     */
    public String masterSiteId() {
        return this.masterSiteId;
    }

    /**
     * Set the masterSiteId property: The master site ID from Azure Migrate.
     * 
     * @param masterSiteId the masterSiteId value to set.
     * @return the SpringbootsitesProperties object itself.
     */
    public SpringbootsitesProperties withMasterSiteId(String masterSiteId) {
        this.masterSiteId = masterSiteId;
        return this;
    }

    /**
     * Get the migrateProjectId property: The migrate project ID from Azure Migrate.
     * 
     * @return the migrateProjectId value.
     */
    public String migrateProjectId() {
        return this.migrateProjectId;
    }

    /**
     * Set the migrateProjectId property: The migrate project ID from Azure Migrate.
     * 
     * @param migrateProjectId the migrateProjectId value to set.
     * @return the SpringbootsitesProperties object itself.
     */
    public SpringbootsitesProperties withMigrateProjectId(String migrateProjectId) {
        this.migrateProjectId = migrateProjectId;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The resource provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the SpringbootsitesProperties object itself.
     */
    public SpringbootsitesProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
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
