// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The cluster monitoring status response. */
@Fluent
public final class ClusterMonitoringResponseInner {
    /*
     * The status of the monitor on the HDInsight cluster.
     */
    @JsonProperty(value = "clusterMonitoringEnabled")
    private Boolean clusterMonitoringEnabled;

    /*
     * The workspace ID of the monitor on the HDInsight cluster.
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /** Creates an instance of ClusterMonitoringResponseInner class. */
    public ClusterMonitoringResponseInner() {
    }

    /**
     * Get the clusterMonitoringEnabled property: The status of the monitor on the HDInsight cluster.
     *
     * @return the clusterMonitoringEnabled value.
     */
    public Boolean clusterMonitoringEnabled() {
        return this.clusterMonitoringEnabled;
    }

    /**
     * Set the clusterMonitoringEnabled property: The status of the monitor on the HDInsight cluster.
     *
     * @param clusterMonitoringEnabled the clusterMonitoringEnabled value to set.
     * @return the ClusterMonitoringResponseInner object itself.
     */
    public ClusterMonitoringResponseInner withClusterMonitoringEnabled(Boolean clusterMonitoringEnabled) {
        this.clusterMonitoringEnabled = clusterMonitoringEnabled;
        return this;
    }

    /**
     * Get the workspaceId property: The workspace ID of the monitor on the HDInsight cluster.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The workspace ID of the monitor on the HDInsight cluster.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the ClusterMonitoringResponseInner object itself.
     */
    public ClusterMonitoringResponseInner withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
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
