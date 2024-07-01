// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SSIS object metadata.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = SsisObjectMetadata.class, visible = true)
@JsonTypeName("SsisObjectMetadata")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Folder", value = SsisFolder.class),
    @JsonSubTypes.Type(name = "Project", value = SsisProject.class),
    @JsonSubTypes.Type(name = "Package", value = SsisPackage.class),
    @JsonSubTypes.Type(name = "Environment", value = SsisEnvironment.class) })
@Fluent
public class SsisObjectMetadata {
    /*
     * Type of metadata.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private SsisObjectMetadataType type = SsisObjectMetadataType.fromString("SsisObjectMetadata");

    /*
     * Metadata id.
     */
    @JsonProperty(value = "id")
    private Long id;

    /*
     * Metadata name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Metadata description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of SsisObjectMetadata class.
     */
    public SsisObjectMetadata() {
    }

    /**
     * Get the type property: Type of metadata.
     * 
     * @return the type value.
     */
    public SsisObjectMetadataType type() {
        return this.type;
    }

    /**
     * Get the id property: Metadata id.
     * 
     * @return the id value.
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set the id property: Metadata id.
     * 
     * @param id the id value to set.
     * @return the SsisObjectMetadata object itself.
     */
    public SsisObjectMetadata withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Metadata name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Metadata name.
     * 
     * @param name the name value to set.
     * @return the SsisObjectMetadata object itself.
     */
    public SsisObjectMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Metadata description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Metadata description.
     * 
     * @param description the description value to set.
     * @return the SsisObjectMetadata object itself.
     */
    public SsisObjectMetadata withDescription(String description) {
        this.description = description;
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
