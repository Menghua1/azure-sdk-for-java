// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.resourcemanager.hdinsight.containers.models.Category;

/**
 * Samples for ClusterLibraries List.
 */
public final class ClusterLibrariesListSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2024-05-01-preview/examples/
     * ListPredefinedClusterLibraries.json
     */
    /**
     * Sample code: ListPredefinedClusterLibraries.
     * 
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void listPredefinedClusterLibraries(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager.clusterLibraries()
            .list("hiloResourceGroup", "clusterPool", "cluster", Category.PREDEFINED, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2024-05-01-preview/examples/
     * ListUserCustomClusterLibraries.json
     */
    /**
     * Sample code: ListUserCustomClusterLibraries.
     * 
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void listUserCustomClusterLibraries(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager.clusterLibraries()
            .list("hiloResourceGroup", "clusterPool", "cluster", Category.CUSTOM, com.azure.core.util.Context.NONE);
    }
}
