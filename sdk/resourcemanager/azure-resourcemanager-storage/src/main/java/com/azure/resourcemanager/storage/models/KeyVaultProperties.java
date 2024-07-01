// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Properties of key vault.
 */
@Fluent
public final class KeyVaultProperties {
    /*
     * The name of KeyVault key.
     */
    @JsonProperty(value = "keyname")
    private String keyName;

    /*
     * The version of KeyVault key.
     */
    @JsonProperty(value = "keyversion")
    private String keyVersion;

    /*
     * The Uri of KeyVault.
     */
    @JsonProperty(value = "keyvaulturi")
    private String keyVaultUri;

    /*
     * The object identifier of the current versioned Key Vault Key in use.
     */
    @JsonProperty(value = "currentVersionedKeyIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String currentVersionedKeyIdentifier;

    /*
     * Timestamp of last rotation of the Key Vault Key.
     */
    @JsonProperty(value = "lastKeyRotationTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastKeyRotationTimestamp;

    /*
     * This is a read only property that represents the expiration time of the current version of the customer managed
     * key used for encryption.
     */
    @JsonProperty(value = "currentVersionedKeyExpirationTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime currentVersionedKeyExpirationTimestamp;

    /**
     * Creates an instance of KeyVaultProperties class.
     */
    public KeyVaultProperties() {
    }

    /**
     * Get the keyName property: The name of KeyVault key.
     * 
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of KeyVault key.
     * 
     * @param keyName the keyName value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The version of KeyVault key.
     * 
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The version of KeyVault key.
     * 
     * @param keyVersion the keyVersion value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the keyVaultUri property: The Uri of KeyVault.
     * 
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: The Uri of KeyVault.
     * 
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the currentVersionedKeyIdentifier property: The object identifier of the current versioned Key Vault Key in
     * use.
     * 
     * @return the currentVersionedKeyIdentifier value.
     */
    public String currentVersionedKeyIdentifier() {
        return this.currentVersionedKeyIdentifier;
    }

    /**
     * Get the lastKeyRotationTimestamp property: Timestamp of last rotation of the Key Vault Key.
     * 
     * @return the lastKeyRotationTimestamp value.
     */
    public OffsetDateTime lastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }

    /**
     * Get the currentVersionedKeyExpirationTimestamp property: This is a read only property that represents the
     * expiration time of the current version of the customer managed key used for encryption.
     * 
     * @return the currentVersionedKeyExpirationTimestamp value.
     */
    public OffsetDateTime currentVersionedKeyExpirationTimestamp() {
        return this.currentVersionedKeyExpirationTimestamp;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
