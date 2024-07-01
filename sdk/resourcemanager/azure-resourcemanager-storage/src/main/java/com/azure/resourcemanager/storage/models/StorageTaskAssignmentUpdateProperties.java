// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the storage task update assignment.
 */
@Fluent
public final class StorageTaskAssignmentUpdateProperties {
    /*
     * Id of the corresponding storage task
     */
    @JsonProperty(value = "taskId", access = JsonProperty.Access.WRITE_ONLY)
    private String taskId;

    /*
     * Whether the storage task assignment is enabled or not
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Text that describes the purpose of the storage task assignment
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The storage task assignment execution context
     */
    @JsonProperty(value = "executionContext")
    private StorageTaskAssignmentUpdateExecutionContext executionContext;

    /*
     * The storage task assignment report
     */
    @JsonProperty(value = "report")
    private StorageTaskAssignmentUpdateReport report;

    /*
     * Represents the provisioning state of the storage task assignment.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Run status of storage task assignment
     */
    @JsonProperty(value = "runStatus")
    private StorageTaskReportProperties runStatus;

    /**
     * Creates an instance of StorageTaskAssignmentUpdateProperties class.
     */
    public StorageTaskAssignmentUpdateProperties() {
    }

    /**
     * Get the taskId property: Id of the corresponding storage task.
     * 
     * @return the taskId value.
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Get the enabled property: Whether the storage task assignment is enabled or not.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether the storage task assignment is enabled or not.
     * 
     * @param enabled the enabled value to set.
     * @return the StorageTaskAssignmentUpdateProperties object itself.
     */
    public StorageTaskAssignmentUpdateProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the description property: Text that describes the purpose of the storage task assignment.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Text that describes the purpose of the storage task assignment.
     * 
     * @param description the description value to set.
     * @return the StorageTaskAssignmentUpdateProperties object itself.
     */
    public StorageTaskAssignmentUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the executionContext property: The storage task assignment execution context.
     * 
     * @return the executionContext value.
     */
    public StorageTaskAssignmentUpdateExecutionContext executionContext() {
        return this.executionContext;
    }

    /**
     * Set the executionContext property: The storage task assignment execution context.
     * 
     * @param executionContext the executionContext value to set.
     * @return the StorageTaskAssignmentUpdateProperties object itself.
     */
    public StorageTaskAssignmentUpdateProperties
        withExecutionContext(StorageTaskAssignmentUpdateExecutionContext executionContext) {
        this.executionContext = executionContext;
        return this;
    }

    /**
     * Get the report property: The storage task assignment report.
     * 
     * @return the report value.
     */
    public StorageTaskAssignmentUpdateReport report() {
        return this.report;
    }

    /**
     * Set the report property: The storage task assignment report.
     * 
     * @param report the report value to set.
     * @return the StorageTaskAssignmentUpdateProperties object itself.
     */
    public StorageTaskAssignmentUpdateProperties withReport(StorageTaskAssignmentUpdateReport report) {
        this.report = report;
        return this;
    }

    /**
     * Get the provisioningState property: Represents the provisioning state of the storage task assignment.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the runStatus property: Run status of storage task assignment.
     * 
     * @return the runStatus value.
     */
    public StorageTaskReportProperties runStatus() {
        return this.runStatus;
    }

    /**
     * Set the runStatus property: Run status of storage task assignment.
     * 
     * @param runStatus the runStatus value to set.
     * @return the StorageTaskAssignmentUpdateProperties object itself.
     */
    public StorageTaskAssignmentUpdateProperties withRunStatus(StorageTaskReportProperties runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (executionContext() != null) {
            executionContext().validate();
        }
        if (report() != null) {
            report().validate();
        }
        if (runStatus() != null) {
            runStatus().validate();
        }
    }
}
