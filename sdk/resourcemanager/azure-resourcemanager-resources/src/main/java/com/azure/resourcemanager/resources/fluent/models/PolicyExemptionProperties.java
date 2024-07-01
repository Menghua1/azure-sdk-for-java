// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.models.AssignmentScopeValidation;
import com.azure.resourcemanager.resources.models.ExemptionCategory;
import com.azure.resourcemanager.resources.models.ResourceSelector;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The policy exemption properties.
 */
@Fluent
public final class PolicyExemptionProperties {
    /*
     * The ID of the policy assignment that is being exempted.
     */
    @JsonProperty(value = "policyAssignmentId", required = true)
    private String policyAssignmentId;

    /*
     * The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
     */
    @JsonProperty(value = "policyDefinitionReferenceIds")
    private List<String> policyDefinitionReferenceIds;

    /*
     * The policy exemption category. Possible values are Waiver and Mitigated.
     */
    @JsonProperty(value = "exemptionCategory", required = true)
    private ExemptionCategory exemptionCategory;

    /*
     * The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the policy exemption.
     */
    @JsonProperty(value = "expiresOn")
    private OffsetDateTime expiresOn;

    /*
     * The display name of the policy exemption.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the policy exemption.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The policy exemption metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /*
     * The resource selector list to filter policies by resource properties.
     */
    @JsonProperty(value = "resourceSelectors")
    private List<ResourceSelector> resourceSelectors;

    /*
     * The option whether validate the exemption is at or under the assignment scope.
     */
    @JsonProperty(value = "assignmentScopeValidation")
    private AssignmentScopeValidation assignmentScopeValidation;

    /**
     * Creates an instance of PolicyExemptionProperties class.
     */
    public PolicyExemptionProperties() {
    }

    /**
     * Get the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     * 
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Set the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     * 
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     * 
     * @return the policyDefinitionReferenceIds value.
     */
    public List<String> policyDefinitionReferenceIds() {
        return this.policyDefinitionReferenceIds;
    }

    /**
     * Set the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     * 
     * @param policyDefinitionReferenceIds the policyDefinitionReferenceIds value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties withPolicyDefinitionReferenceIds(List<String> policyDefinitionReferenceIds) {
        this.policyDefinitionReferenceIds = policyDefinitionReferenceIds;
        return this;
    }

    /**
     * Get the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     * @return the exemptionCategory value.
     */
    public ExemptionCategory exemptionCategory() {
        return this.exemptionCategory;
    }

    /**
     * Set the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     * @param exemptionCategory the exemptionCategory value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties withExemptionCategory(ExemptionCategory exemptionCategory) {
        this.exemptionCategory = exemptionCategory;
        return this;
    }

    /**
     * Get the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the
     * policy exemption.
     * 
     * @return the expiresOn value.
     */
    public OffsetDateTime expiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the
     * policy exemption.
     * 
     * @param expiresOn the expiresOn value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties withExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy exemption.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the policy exemption.
     * 
     * @param displayName the displayName value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the policy exemption.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the policy exemption.
     * 
     * @param description the description value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     * 
     * @param metadata the metadata value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the resourceSelectors property: The resource selector list to filter policies by resource properties.
     * 
     * @return the resourceSelectors value.
     */
    public List<ResourceSelector> resourceSelectors() {
        return this.resourceSelectors;
    }

    /**
     * Set the resourceSelectors property: The resource selector list to filter policies by resource properties.
     * 
     * @param resourceSelectors the resourceSelectors value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties withResourceSelectors(List<ResourceSelector> resourceSelectors) {
        this.resourceSelectors = resourceSelectors;
        return this;
    }

    /**
     * Get the assignmentScopeValidation property: The option whether validate the exemption is at or under the
     * assignment scope.
     * 
     * @return the assignmentScopeValidation value.
     */
    public AssignmentScopeValidation assignmentScopeValidation() {
        return this.assignmentScopeValidation;
    }

    /**
     * Set the assignmentScopeValidation property: The option whether validate the exemption is at or under the
     * assignment scope.
     * 
     * @param assignmentScopeValidation the assignmentScopeValidation value to set.
     * @return the PolicyExemptionProperties object itself.
     */
    public PolicyExemptionProperties
        withAssignmentScopeValidation(AssignmentScopeValidation assignmentScopeValidation) {
        this.assignmentScopeValidation = assignmentScopeValidation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyAssignmentId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property policyAssignmentId in model PolicyExemptionProperties"));
        }
        if (exemptionCategory() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property exemptionCategory in model PolicyExemptionProperties"));
        }
        if (resourceSelectors() != null) {
            resourceSelectors().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PolicyExemptionProperties.class);
}
