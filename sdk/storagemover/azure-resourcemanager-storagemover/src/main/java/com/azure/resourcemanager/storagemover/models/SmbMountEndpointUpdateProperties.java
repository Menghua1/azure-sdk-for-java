// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties of SMB share endpoint to update.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "endpointType",
    defaultImpl = SmbMountEndpointUpdateProperties.class,
    visible = true)
@JsonTypeName("SmbMount")
@Fluent
public final class SmbMountEndpointUpdateProperties extends EndpointBaseUpdateProperties {
    /*
     * The Endpoint resource type.
     */
    @JsonTypeId
    @JsonProperty(value = "endpointType", required = true)
    private EndpointType endpointType = EndpointType.SMB_MOUNT;

    /*
     * The Azure Key Vault secret URIs which store the required credentials to access the SMB share.
     */
    @JsonProperty(value = "credentials")
    private AzureKeyVaultSmbCredentials credentials;

    /**
     * Creates an instance of SmbMountEndpointUpdateProperties class.
     */
    public SmbMountEndpointUpdateProperties() {
    }

    /**
     * Get the endpointType property: The Endpoint resource type.
     * 
     * @return the endpointType value.
     */
    @Override
    public EndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Get the credentials property: The Azure Key Vault secret URIs which store the required credentials to access the
     * SMB share.
     * 
     * @return the credentials value.
     */
    public AzureKeyVaultSmbCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The Azure Key Vault secret URIs which store the required credentials to access the
     * SMB share.
     * 
     * @param credentials the credentials value to set.
     * @return the SmbMountEndpointUpdateProperties object itself.
     */
    public SmbMountEndpointUpdateProperties withCredentials(AzureKeyVaultSmbCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmbMountEndpointUpdateProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
