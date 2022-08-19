// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.connectedvmware.models.ResourceStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the resource properties. */
@Fluent
public final class VirtualNetworkProperties {
    /*
     * Gets or sets a unique identifier for this resource.
     */
    @JsonProperty(value = "uuid", access = JsonProperty.Access.WRITE_ONLY)
    private String uuid;

    /*
     * Gets or sets the ARM Id of the vCenter resource in which this template resides.
     */
    @JsonProperty(value = "vCenterId")
    private String vCenterId;

    /*
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
     */
    @JsonProperty(value = "moRefId")
    private String moRefId;

    /*
     * Gets or sets the inventory Item ID for the virtual network.
     */
    @JsonProperty(value = "inventoryItemId")
    private String inventoryItemId;

    /*
     * Gets or sets the vCenter Managed Object name for the virtual network.
     */
    @JsonProperty(value = "moName", access = JsonProperty.Access.WRITE_ONLY)
    private String moName;

    /*
     * Gets the name of the corresponding resource in Kubernetes.
     */
    @JsonProperty(value = "customResourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String customResourceName;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceStatus> statuses;

    /*
     * Gets or sets the provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the uuid property: Gets or sets a unique identifier for this resource.
     *
     * @return the uuid value.
     */
    public String uuid() {
        return this.uuid;
    }

    /**
     * Get the vCenterId property: Gets or sets the ARM Id of the vCenter resource in which this template resides.
     *
     * @return the vCenterId value.
     */
    public String vCenterId() {
        return this.vCenterId;
    }

    /**
     * Set the vCenterId property: Gets or sets the ARM Id of the vCenter resource in which this template resides.
     *
     * @param vCenterId the vCenterId value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withVCenterId(String vCenterId) {
        this.vCenterId = vCenterId;
        return this;
    }

    /**
     * Get the moRefId property: Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
     *
     * @return the moRefId value.
     */
    public String moRefId() {
        return this.moRefId;
    }

    /**
     * Set the moRefId property: Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
     *
     * @param moRefId the moRefId value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withMoRefId(String moRefId) {
        this.moRefId = moRefId;
        return this;
    }

    /**
     * Get the inventoryItemId property: Gets or sets the inventory Item ID for the virtual network.
     *
     * @return the inventoryItemId value.
     */
    public String inventoryItemId() {
        return this.inventoryItemId;
    }

    /**
     * Set the inventoryItemId property: Gets or sets the inventory Item ID for the virtual network.
     *
     * @param inventoryItemId the inventoryItemId value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    /**
     * Get the moName property: Gets or sets the vCenter Managed Object name for the virtual network.
     *
     * @return the moName value.
     */
    public String moName() {
        return this.moName;
    }

    /**
     * Get the customResourceName property: Gets the name of the corresponding resource in Kubernetes.
     *
     * @return the customResourceName value.
     */
    public String customResourceName() {
        return this.customResourceName;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<ResourceStatus> statuses() {
        return this.statuses;
    }

    /**
     * Get the provisioningState property: Gets or sets the provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
