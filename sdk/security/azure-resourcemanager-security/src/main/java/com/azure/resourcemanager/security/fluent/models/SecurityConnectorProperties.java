// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.CloudName;
import com.azure.resourcemanager.security.models.CloudOffering;
import com.azure.resourcemanager.security.models.EnvironmentData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A set of properties that defines the security connector configuration. */
@Fluent
public final class SecurityConnectorProperties {
    /*
     * The multi cloud resource identifier (account id in case of AWS connector, project number in case of GCP
     * connector).
     */
    @JsonProperty(value = "hierarchyIdentifier")
    private String hierarchyIdentifier;

    /*
     * The date on which the trial period will end, if applicable. Trial period exists for 30 days after upgrading to
     * payed offerings.
     */
    @JsonProperty(value = "hierarchyIdentifierTrialEndDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime hierarchyIdentifierTrialEndDate;

    /*
     * The multi cloud resource's cloud name.
     */
    @JsonProperty(value = "environmentName")
    private CloudName environmentName;

    /*
     * A collection of offerings for the security connector.
     */
    @JsonProperty(value = "offerings")
    private List<CloudOffering> offerings;

    /*
     * The security connector environment data.
     */
    @JsonProperty(value = "environmentData")
    private EnvironmentData environmentData;

    /**
     * Get the hierarchyIdentifier property: The multi cloud resource identifier (account id in case of AWS connector,
     * project number in case of GCP connector).
     *
     * @return the hierarchyIdentifier value.
     */
    public String hierarchyIdentifier() {
        return this.hierarchyIdentifier;
    }

    /**
     * Set the hierarchyIdentifier property: The multi cloud resource identifier (account id in case of AWS connector,
     * project number in case of GCP connector).
     *
     * @param hierarchyIdentifier the hierarchyIdentifier value to set.
     * @return the SecurityConnectorProperties object itself.
     */
    public SecurityConnectorProperties withHierarchyIdentifier(String hierarchyIdentifier) {
        this.hierarchyIdentifier = hierarchyIdentifier;
        return this;
    }

    /**
     * Get the hierarchyIdentifierTrialEndDate property: The date on which the trial period will end, if applicable.
     * Trial period exists for 30 days after upgrading to payed offerings.
     *
     * @return the hierarchyIdentifierTrialEndDate value.
     */
    public OffsetDateTime hierarchyIdentifierTrialEndDate() {
        return this.hierarchyIdentifierTrialEndDate;
    }

    /**
     * Get the environmentName property: The multi cloud resource's cloud name.
     *
     * @return the environmentName value.
     */
    public CloudName environmentName() {
        return this.environmentName;
    }

    /**
     * Set the environmentName property: The multi cloud resource's cloud name.
     *
     * @param environmentName the environmentName value to set.
     * @return the SecurityConnectorProperties object itself.
     */
    public SecurityConnectorProperties withEnvironmentName(CloudName environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * Get the offerings property: A collection of offerings for the security connector.
     *
     * @return the offerings value.
     */
    public List<CloudOffering> offerings() {
        return this.offerings;
    }

    /**
     * Set the offerings property: A collection of offerings for the security connector.
     *
     * @param offerings the offerings value to set.
     * @return the SecurityConnectorProperties object itself.
     */
    public SecurityConnectorProperties withOfferings(List<CloudOffering> offerings) {
        this.offerings = offerings;
        return this;
    }

    /**
     * Get the environmentData property: The security connector environment data.
     *
     * @return the environmentData value.
     */
    public EnvironmentData environmentData() {
        return this.environmentData;
    }

    /**
     * Set the environmentData property: The security connector environment data.
     *
     * @param environmentData the environmentData value to set.
     * @return the SecurityConnectorProperties object itself.
     */
    public SecurityConnectorProperties withEnvironmentData(EnvironmentData environmentData) {
        this.environmentData = environmentData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (offerings() != null) {
            offerings().forEach(e -> e.validate());
        }
        if (environmentData() != null) {
            environmentData().validate();
        }
    }
}
