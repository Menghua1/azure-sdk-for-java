// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * CloudExadataInfrastructure resource model.
 */
@Fluent
public final class CloudExadataInfrastructureProperties {
    /*
     * Exadata infra ocid
     */
    @JsonProperty(value = "ocid", access = JsonProperty.Access.WRITE_ONLY)
    private String ocid;

    /*
     * The number of compute servers for the cloud Exadata infrastructure.
     */
    @JsonProperty(value = "computeCount")
    private Integer computeCount;

    /*
     * The number of storage servers for the cloud Exadata infrastructure.
     */
    @JsonProperty(value = "storageCount")
    private Integer storageCount;

    /*
     * The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     */
    @JsonProperty(value = "totalStorageSizeInGbs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalStorageSizeInGbs;

    /*
     * The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     */
    @JsonProperty(value = "availableStorageSizeInGbs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer availableStorageSizeInGbs;

    /*
     * The date and time the cloud Exadata infrastructure resource was created.
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private String timeCreated;

    /*
     * Additional information about the current lifecycle state.
     */
    @JsonProperty(value = "lifecycleDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String lifecycleDetails;

    /*
     * maintenanceWindow property
     */
    @JsonProperty(value = "maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /*
     * The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
     */
    @JsonProperty(value = "estimatedPatchingTime", access = JsonProperty.Access.WRITE_ONLY)
    private EstimatedPatchingTime estimatedPatchingTime;

    /*
     * The list of customer email addresses that receive information from Oracle about the specified OCI Database service resource. Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators. Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance. 
     */
    @JsonProperty(value = "customerContacts")
    private List<CustomerContact> customerContacts;

    /*
     * CloudExadataInfrastructure provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AzureResourceProvisioningState provisioningState;

    /*
     * CloudExadataInfrastructure lifecycle state
     */
    @JsonProperty(value = "lifecycleState", access = JsonProperty.Access.WRITE_ONLY)
    private CloudExadataInfrastructureLifecycleState lifecycleState;

    /*
     * The model name of the cloud Exadata infrastructure resource.
     */
    @JsonProperty(value = "shape", required = true)
    private String shape;

    /*
     * HTTPS link to OCI resources exposed to Azure Customer via Azure Interface.
     */
    @JsonProperty(value = "ociUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String ociUrl;

    /*
     * The total number of CPU cores allocated.
     */
    @JsonProperty(value = "cpuCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer cpuCount;

    /*
     * The total number of CPU cores available.
     */
    @JsonProperty(value = "maxCpuCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxCpuCount;

    /*
     * The memory allocated in GBs.
     */
    @JsonProperty(value = "memorySizeInGbs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer memorySizeInGbs;

    /*
     * The total memory available in GBs.
     */
    @JsonProperty(value = "maxMemoryInGbs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxMemoryInGbs;

    /*
     * The local node storage to be allocated in GBs.
     */
    @JsonProperty(value = "dbNodeStorageSizeInGbs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer dbNodeStorageSizeInGbs;

    /*
     * The total local node storage available in GBs.
     */
    @JsonProperty(value = "maxDbNodeStorageSizeInGbs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxDbNodeStorageSizeInGbs;

    /*
     * The quantity of data in the database, in terabytes.
     */
    @JsonProperty(value = "dataStorageSizeInTbs", access = JsonProperty.Access.WRITE_ONLY)
    private Double dataStorageSizeInTbs;

    /*
     * The total available DATA disk group size.
     */
    @JsonProperty(value = "maxDataStorageInTbs", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxDataStorageInTbs;

    /*
     * The software version of the database servers (dom0) in the Exadata infrastructure.
     */
    @JsonProperty(value = "dbServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String dbServerVersion;

    /*
     * The software version of the storage servers (cells) in the Exadata infrastructure.
     */
    @JsonProperty(value = "storageServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String storageServerVersion;

    /*
     * The requested number of additional storage servers activated for the Exadata infrastructure.
     */
    @JsonProperty(value = "activatedStorageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer activatedStorageCount;

    /*
     * The requested number of additional storage servers for the Exadata infrastructure.
     */
    @JsonProperty(value = "additionalStorageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer additionalStorageCount;

    /*
     * The name for the Exadata infrastructure.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * The OCID of the last maintenance run.
     */
    @JsonProperty(value = "lastMaintenanceRunId", access = JsonProperty.Access.WRITE_ONLY)
    private String lastMaintenanceRunId;

    /*
     * The OCID of the next maintenance run.
     */
    @JsonProperty(value = "nextMaintenanceRunId", access = JsonProperty.Access.WRITE_ONLY)
    private String nextMaintenanceRunId;

    /*
     * Monthly Db Server version
     */
    @JsonProperty(value = "monthlyDbServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String monthlyDbServerVersion;

    /*
     * Monthly Storage Server version
     */
    @JsonProperty(value = "monthlyStorageServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String monthlyStorageServerVersion;

    /**
     * Creates an instance of CloudExadataInfrastructureProperties class.
     */
    public CloudExadataInfrastructureProperties() {
    }

    /**
     * Get the ocid property: Exadata infra ocid.
     * 
     * @return the ocid value.
     */
    public String ocid() {
        return this.ocid;
    }

    /**
     * Get the computeCount property: The number of compute servers for the cloud Exadata infrastructure.
     * 
     * @return the computeCount value.
     */
    public Integer computeCount() {
        return this.computeCount;
    }

    /**
     * Set the computeCount property: The number of compute servers for the cloud Exadata infrastructure.
     * 
     * @param computeCount the computeCount value to set.
     * @return the CloudExadataInfrastructureProperties object itself.
     */
    public CloudExadataInfrastructureProperties withComputeCount(Integer computeCount) {
        this.computeCount = computeCount;
        return this;
    }

    /**
     * Get the storageCount property: The number of storage servers for the cloud Exadata infrastructure.
     * 
     * @return the storageCount value.
     */
    public Integer storageCount() {
        return this.storageCount;
    }

    /**
     * Set the storageCount property: The number of storage servers for the cloud Exadata infrastructure.
     * 
     * @param storageCount the storageCount value to set.
     * @return the CloudExadataInfrastructureProperties object itself.
     */
    public CloudExadataInfrastructureProperties withStorageCount(Integer storageCount) {
        this.storageCount = storageCount;
        return this;
    }

    /**
     * Get the totalStorageSizeInGbs property: The total storage allocated to the cloud Exadata infrastructure resource,
     * in gigabytes (GB).
     * 
     * @return the totalStorageSizeInGbs value.
     */
    public Integer totalStorageSizeInGbs() {
        return this.totalStorageSizeInGbs;
    }

    /**
     * Get the availableStorageSizeInGbs property: The available storage can be allocated to the cloud Exadata
     * infrastructure resource, in gigabytes (GB).
     * 
     * @return the availableStorageSizeInGbs value.
     */
    public Integer availableStorageSizeInGbs() {
        return this.availableStorageSizeInGbs;
    }

    /**
     * Get the timeCreated property: The date and time the cloud Exadata infrastructure resource was created.
     * 
     * @return the timeCreated value.
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the lifecycleDetails property: Additional information about the current lifecycle state.
     * 
     * @return the lifecycleDetails value.
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }

    /**
     * Get the maintenanceWindow property: maintenanceWindow property.
     * 
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: maintenanceWindow property.
     * 
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the CloudExadataInfrastructureProperties object itself.
     */
    public CloudExadataInfrastructureProperties withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Get the estimatedPatchingTime property: The estimated total time required in minutes for all patching operations
     * (database server, storage server, and network switch patching).
     * 
     * @return the estimatedPatchingTime value.
     */
    public EstimatedPatchingTime estimatedPatchingTime() {
        return this.estimatedPatchingTime;
    }

    /**
     * Get the customerContacts property: The list of customer email addresses that receive information from Oracle
     * about the specified OCI Database service resource. Oracle uses these email addresses to send notifications about
     * planned and unplanned software maintenance updates, information about system hardware, and other information
     * needed by administrators. Up to 10 email addresses can be added to the customer contacts for a cloud Exadata
     * infrastructure instance.
     * 
     * @return the customerContacts value.
     */
    public List<CustomerContact> customerContacts() {
        return this.customerContacts;
    }

    /**
     * Set the customerContacts property: The list of customer email addresses that receive information from Oracle
     * about the specified OCI Database service resource. Oracle uses these email addresses to send notifications about
     * planned and unplanned software maintenance updates, information about system hardware, and other information
     * needed by administrators. Up to 10 email addresses can be added to the customer contacts for a cloud Exadata
     * infrastructure instance.
     * 
     * @param customerContacts the customerContacts value to set.
     * @return the CloudExadataInfrastructureProperties object itself.
     */
    public CloudExadataInfrastructureProperties withCustomerContacts(List<CustomerContact> customerContacts) {
        this.customerContacts = customerContacts;
        return this;
    }

    /**
     * Get the provisioningState property: CloudExadataInfrastructure provisioning state.
     * 
     * @return the provisioningState value.
     */
    public AzureResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the lifecycleState property: CloudExadataInfrastructure lifecycle state.
     * 
     * @return the lifecycleState value.
     */
    public CloudExadataInfrastructureLifecycleState lifecycleState() {
        return this.lifecycleState;
    }

    /**
     * Get the shape property: The model name of the cloud Exadata infrastructure resource.
     * 
     * @return the shape value.
     */
    public String shape() {
        return this.shape;
    }

    /**
     * Set the shape property: The model name of the cloud Exadata infrastructure resource.
     * 
     * @param shape the shape value to set.
     * @return the CloudExadataInfrastructureProperties object itself.
     */
    public CloudExadataInfrastructureProperties withShape(String shape) {
        this.shape = shape;
        return this;
    }

    /**
     * Get the ociUrl property: HTTPS link to OCI resources exposed to Azure Customer via Azure Interface.
     * 
     * @return the ociUrl value.
     */
    public String ociUrl() {
        return this.ociUrl;
    }

    /**
     * Get the cpuCount property: The total number of CPU cores allocated.
     * 
     * @return the cpuCount value.
     */
    public Integer cpuCount() {
        return this.cpuCount;
    }

    /**
     * Get the maxCpuCount property: The total number of CPU cores available.
     * 
     * @return the maxCpuCount value.
     */
    public Integer maxCpuCount() {
        return this.maxCpuCount;
    }

    /**
     * Get the memorySizeInGbs property: The memory allocated in GBs.
     * 
     * @return the memorySizeInGbs value.
     */
    public Integer memorySizeInGbs() {
        return this.memorySizeInGbs;
    }

    /**
     * Get the maxMemoryInGbs property: The total memory available in GBs.
     * 
     * @return the maxMemoryInGbs value.
     */
    public Integer maxMemoryInGbs() {
        return this.maxMemoryInGbs;
    }

    /**
     * Get the dbNodeStorageSizeInGbs property: The local node storage to be allocated in GBs.
     * 
     * @return the dbNodeStorageSizeInGbs value.
     */
    public Integer dbNodeStorageSizeInGbs() {
        return this.dbNodeStorageSizeInGbs;
    }

    /**
     * Get the maxDbNodeStorageSizeInGbs property: The total local node storage available in GBs.
     * 
     * @return the maxDbNodeStorageSizeInGbs value.
     */
    public Integer maxDbNodeStorageSizeInGbs() {
        return this.maxDbNodeStorageSizeInGbs;
    }

    /**
     * Get the dataStorageSizeInTbs property: The quantity of data in the database, in terabytes.
     * 
     * @return the dataStorageSizeInTbs value.
     */
    public Double dataStorageSizeInTbs() {
        return this.dataStorageSizeInTbs;
    }

    /**
     * Get the maxDataStorageInTbs property: The total available DATA disk group size.
     * 
     * @return the maxDataStorageInTbs value.
     */
    public Double maxDataStorageInTbs() {
        return this.maxDataStorageInTbs;
    }

    /**
     * Get the dbServerVersion property: The software version of the database servers (dom0) in the Exadata
     * infrastructure.
     * 
     * @return the dbServerVersion value.
     */
    public String dbServerVersion() {
        return this.dbServerVersion;
    }

    /**
     * Get the storageServerVersion property: The software version of the storage servers (cells) in the Exadata
     * infrastructure.
     * 
     * @return the storageServerVersion value.
     */
    public String storageServerVersion() {
        return this.storageServerVersion;
    }

    /**
     * Get the activatedStorageCount property: The requested number of additional storage servers activated for the
     * Exadata infrastructure.
     * 
     * @return the activatedStorageCount value.
     */
    public Integer activatedStorageCount() {
        return this.activatedStorageCount;
    }

    /**
     * Get the additionalStorageCount property: The requested number of additional storage servers for the Exadata
     * infrastructure.
     * 
     * @return the additionalStorageCount value.
     */
    public Integer additionalStorageCount() {
        return this.additionalStorageCount;
    }

    /**
     * Get the displayName property: The name for the Exadata infrastructure.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name for the Exadata infrastructure.
     * 
     * @param displayName the displayName value to set.
     * @return the CloudExadataInfrastructureProperties object itself.
     */
    public CloudExadataInfrastructureProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the lastMaintenanceRunId property: The OCID of the last maintenance run.
     * 
     * @return the lastMaintenanceRunId value.
     */
    public String lastMaintenanceRunId() {
        return this.lastMaintenanceRunId;
    }

    /**
     * Get the nextMaintenanceRunId property: The OCID of the next maintenance run.
     * 
     * @return the nextMaintenanceRunId value.
     */
    public String nextMaintenanceRunId() {
        return this.nextMaintenanceRunId;
    }

    /**
     * Get the monthlyDbServerVersion property: Monthly Db Server version.
     * 
     * @return the monthlyDbServerVersion value.
     */
    public String monthlyDbServerVersion() {
        return this.monthlyDbServerVersion;
    }

    /**
     * Get the monthlyStorageServerVersion property: Monthly Storage Server version.
     * 
     * @return the monthlyStorageServerVersion value.
     */
    public String monthlyStorageServerVersion() {
        return this.monthlyStorageServerVersion;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
        if (estimatedPatchingTime() != null) {
            estimatedPatchingTime().validate();
        }
        if (customerContacts() != null) {
            customerContacts().forEach(e -> e.validate());
        }
        if (shape() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property shape in model CloudExadataInfrastructureProperties"));
        }
        if (displayName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property displayName in model CloudExadataInfrastructureProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CloudExadataInfrastructureProperties.class);
}
