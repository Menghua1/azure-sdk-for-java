// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Synapse Analytics (Artifacts) linked service properties.
 */
@Fluent
public final class AzureSynapseArtifactsLinkedServiceTypeProperties {
    /*
     * https://<workspacename>.dev.azuresynapse.net, Azure Synapse Analytics workspace URL. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "endpoint", required = true)
    private Object endpoint;

    /*
     * Required to specify MSI, if using system assigned managed identity as authentication method. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "authentication")
    private Object authentication;

    /*
     * The resource ID of the Synapse workspace. The format should be:
     * /subscriptions/{subscriptionID}/resourceGroups/{resourceGroup}/providers/Microsoft.Synapse/workspaces/{
     * workspaceName}. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "workspaceResourceId")
    private Object workspaceResourceId;

    /**
     * Creates an instance of AzureSynapseArtifactsLinkedServiceTypeProperties class.
     */
    public AzureSynapseArtifactsLinkedServiceTypeProperties() {
    }

    /**
     * Get the endpoint property: https://&lt;workspacename&gt;.dev.azuresynapse.net, Azure Synapse Analytics workspace
     * URL. Type: string (or Expression with resultType string).
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: https://&lt;workspacename&gt;.dev.azuresynapse.net, Azure Synapse Analytics workspace
     * URL. Type: string (or Expression with resultType string).
     * 
     * @param endpoint the endpoint value to set.
     * @return the AzureSynapseArtifactsLinkedServiceTypeProperties object itself.
     */
    public AzureSynapseArtifactsLinkedServiceTypeProperties withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the authentication property: Required to specify MSI, if using system assigned managed identity as
     * authentication method. Type: string (or Expression with resultType string).
     * 
     * @return the authentication value.
     */
    public Object authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Required to specify MSI, if using system assigned managed identity as
     * authentication method. Type: string (or Expression with resultType string).
     * 
     * @param authentication the authentication value to set.
     * @return the AzureSynapseArtifactsLinkedServiceTypeProperties object itself.
     */
    public AzureSynapseArtifactsLinkedServiceTypeProperties withAuthentication(Object authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the workspaceResourceId property: The resource ID of the Synapse workspace. The format should be:
     * /subscriptions/{subscriptionID}/resourceGroups/{resourceGroup}/providers/Microsoft.Synapse/workspaces/{workspaceName}.
     * Type: string (or Expression with resultType string).
     * 
     * @return the workspaceResourceId value.
     */
    public Object workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set the workspaceResourceId property: The resource ID of the Synapse workspace. The format should be:
     * /subscriptions/{subscriptionID}/resourceGroups/{resourceGroup}/providers/Microsoft.Synapse/workspaces/{workspaceName}.
     * Type: string (or Expression with resultType string).
     * 
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the AzureSynapseArtifactsLinkedServiceTypeProperties object itself.
     */
    public AzureSynapseArtifactsLinkedServiceTypeProperties withWorkspaceResourceId(Object workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endpoint in model AzureSynapseArtifactsLinkedServiceTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureSynapseArtifactsLinkedServiceTypeProperties.class);
}
