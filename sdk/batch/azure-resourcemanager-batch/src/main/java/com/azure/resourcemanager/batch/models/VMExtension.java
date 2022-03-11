// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration for virtual machine extensions. */
@Fluent
public final class VMExtension {
    /*
     * The name of the virtual machine extension.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "publisher", required = true)
    private String publisher;

    /*
     * The type of the extensions.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The version of script handler.
     */
    @JsonProperty(value = "typeHandlerVersion")
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension
     * will not upgrade minor versions unless redeployed, even with this
     * property set to true.
     */
    @JsonProperty(value = "autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /*
     * Any object
     */
    @JsonProperty(value = "settings")
    private Object settings;

    /*
     * The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     */
    @JsonProperty(value = "protectedSettings")
    private Object protectedSettings;

    /*
     * The collection of extension names. Collection of extension names after
     * which this extension needs to be provisioned.
     */
    @JsonProperty(value = "provisionAfterExtensions")
    private List<String> provisionAfterExtensions;

    /**
     * Get the name property: The name of the virtual machine extension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the virtual machine extension.
     *
     * @param name the name value to set.
     * @return the VMExtension object itself.
     */
    public VMExtension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     *
     * @param publisher the publisher value to set.
     * @return the VMExtension object itself.
     */
    public VMExtension withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the type property: The type of the extensions.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the extensions.
     *
     * @param type the type value to set.
     * @return the VMExtension object itself.
     */
    public VMExtension withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: The version of script handler.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: The version of script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VMExtension object itself.
     */
    public VMExtension withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the VMExtension object itself.
     */
    public VMExtension withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the settings property: Any object.
     *
     * @return the settings value.
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Any object.
     *
     * @param settings the settings value to set.
     * @return the VMExtension object itself.
     */
    public VMExtension withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the VMExtension object itself.
     */
    public VMExtension withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the provisionAfterExtensions property: The collection of extension names. Collection of extension names after
     * which this extension needs to be provisioned.
     *
     * @return the provisionAfterExtensions value.
     */
    public List<String> provisionAfterExtensions() {
        return this.provisionAfterExtensions;
    }

    /**
     * Set the provisionAfterExtensions property: The collection of extension names. Collection of extension names after
     * which this extension needs to be provisioned.
     *
     * @param provisionAfterExtensions the provisionAfterExtensions value to set.
     * @return the VMExtension object itself.
     */
    public VMExtension withProvisionAfterExtensions(List<String> provisionAfterExtensions) {
        this.provisionAfterExtensions = provisionAfterExtensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model VMExtension"));
        }
        if (publisher() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property publisher in model VMExtension"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model VMExtension"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VMExtension.class);
}
