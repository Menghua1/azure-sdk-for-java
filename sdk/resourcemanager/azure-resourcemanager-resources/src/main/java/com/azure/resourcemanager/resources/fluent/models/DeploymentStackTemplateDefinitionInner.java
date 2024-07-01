// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.models.DeploymentStacksTemplateLink;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Export Template specific properties of the Deployment stack.
 */
@Fluent
public final class DeploymentStackTemplateDefinitionInner {
    /*
     * The template content. Use this element to pass the template syntax directly in the request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the templateLink property or the template property, but not both.
     */
    @JsonProperty(value = "template")
    private Object template;

    /*
     * The URI of the template. Use either the templateLink property or the template property, but not both.
     */
    @JsonProperty(value = "templateLink")
    private DeploymentStacksTemplateLink templateLink;

    /**
     * Creates an instance of DeploymentStackTemplateDefinitionInner class.
     */
    public DeploymentStackTemplateDefinitionInner() {
    }

    /**
     * Get the template property: The template content. Use this element to pass the template syntax directly in the
     * request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the
     * templateLink property or the template property, but not both.
     * 
     * @return the template value.
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template property: The template content. Use this element to pass the template syntax directly in the
     * request rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the
     * templateLink property or the template property, but not both.
     * 
     * @param template the template value to set.
     * @return the DeploymentStackTemplateDefinitionInner object itself.
     */
    public DeploymentStackTemplateDefinitionInner withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the templateLink property: The URI of the template. Use either the templateLink property or the template
     * property, but not both.
     * 
     * @return the templateLink value.
     */
    public DeploymentStacksTemplateLink templateLink() {
        return this.templateLink;
    }

    /**
     * Set the templateLink property: The URI of the template. Use either the templateLink property or the template
     * property, but not both.
     * 
     * @param templateLink the templateLink value to set.
     * @return the DeploymentStackTemplateDefinitionInner object itself.
     */
    public DeploymentStackTemplateDefinitionInner withTemplateLink(DeploymentStacksTemplateLink templateLink) {
        this.templateLink = templateLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (templateLink() != null) {
            templateLink().validate();
        }
    }
}
