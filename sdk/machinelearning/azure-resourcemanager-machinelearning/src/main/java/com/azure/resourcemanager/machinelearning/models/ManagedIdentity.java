// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Managed identity configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "identityType")
@JsonTypeName("Managed")
@Fluent
public class ManagedIdentity extends IdentityConfiguration {
    /*
     * Specifies a user-assigned identity by client ID. For system-assigned, do not set this field.
     */
    @JsonProperty(value = "clientId")
    private UUID clientId;

    /*
     * Specifies a user-assigned identity by object ID. For system-assigned, do not set this field.
     */
    @JsonProperty(value = "objectId")
    private UUID objectId;

    /*
     * Specifies a user-assigned identity by ARM resource ID. For system-assigned, do not set this field.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /** Creates an instance of ManagedIdentity class. */
    public ManagedIdentity() {
    }

    /**
     * Get the clientId property: Specifies a user-assigned identity by client ID. For system-assigned, do not set this
     * field.
     *
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Specifies a user-assigned identity by client ID. For system-assigned, do not set this
     * field.
     *
     * @param clientId the clientId value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withClientId(UUID clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the objectId property: Specifies a user-assigned identity by object ID. For system-assigned, do not set this
     * field.
     *
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: Specifies a user-assigned identity by object ID. For system-assigned, do not set this
     * field.
     *
     * @param objectId the objectId value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withObjectId(UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the resourceId property: Specifies a user-assigned identity by ARM resource ID. For system-assigned, do not
     * set this field.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Specifies a user-assigned identity by ARM resource ID. For system-assigned, do not
     * set this field.
     *
     * @param resourceId the resourceId value to set.
     * @return the ManagedIdentity object itself.
     */
    public ManagedIdentity withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
    }
}
