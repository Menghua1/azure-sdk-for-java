// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Username / Password Credentials to connect to vcenter. */
@Fluent
public final class VICredential {
    /*
     * Gets or sets username to connect with the vCenter.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Gets or sets the password to connect with the vCenter.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the username property: Gets or sets username to connect with the vCenter.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Gets or sets username to connect with the vCenter.
     *
     * @param username the username value to set.
     * @return the VICredential object itself.
     */
    public VICredential withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Gets or sets the password to connect with the vCenter.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Gets or sets the password to connect with the vCenter.
     *
     * @param password the password value to set.
     * @return the VICredential object itself.
     */
    public VICredential withPassword(String password) {
        this.password = password;
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
