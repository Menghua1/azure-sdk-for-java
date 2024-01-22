// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.streamanalytics.fluent.models.ClusterInner;
import com.azure.resourcemanager.streamanalytics.fluent.models.ClusterJobInner;

/**
 * An instance of this class provides access to all the operations defined in ClustersClient.
 */
public interface ClustersClient {
    /**
     * Creates a Stream Analytics Cluster or replaces an already existing cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster The definition of the cluster that will be used to create a new cluster or replace the existing
     * one.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Stream Analytics Cluster object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(String resourceGroupName, String clusterName,
        ClusterInner cluster);

    /**
     * Creates a Stream Analytics Cluster or replaces an already existing cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster The definition of the cluster that will be used to create a new cluster or replace the existing
     * one.
     * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set. Specify the
     * last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created, but to prevent updating an existing record
     * set. Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Stream Analytics Cluster object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(String resourceGroupName, String clusterName,
        ClusterInner cluster, String ifMatch, String ifNoneMatch, Context context);

    /**
     * Creates a Stream Analytics Cluster or replaces an already existing cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster The definition of the cluster that will be used to create a new cluster or replace the existing
     * one.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Stream Analytics Cluster object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(String resourceGroupName, String clusterName, ClusterInner cluster);

    /**
     * Creates a Stream Analytics Cluster or replaces an already existing cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster The definition of the cluster that will be used to create a new cluster or replace the existing
     * one.
     * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set. Specify the
     * last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created, but to prevent updating an existing record
     * set. Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Stream Analytics Cluster object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(String resourceGroupName, String clusterName, ClusterInner cluster, String ifMatch,
        String ifNoneMatch, Context context);

    /**
     * Updates an existing cluster. This can be used to partially update (ie. update one or two properties) a cluster
     * without affecting the rest of the cluster definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster The properties specified here will overwrite the corresponding properties in the existing cluster
     * (ie. Those properties will be updated).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Stream Analytics Cluster object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginUpdate(String resourceGroupName, String clusterName,
        ClusterInner cluster);

    /**
     * Updates an existing cluster. This can be used to partially update (ie. update one or two properties) a cluster
     * without affecting the rest of the cluster definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster The properties specified here will overwrite the corresponding properties in the existing cluster
     * (ie. Those properties will be updated).
     * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set. Specify the
     * last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Stream Analytics Cluster object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginUpdate(String resourceGroupName, String clusterName,
        ClusterInner cluster, String ifMatch, Context context);

    /**
     * Updates an existing cluster. This can be used to partially update (ie. update one or two properties) a cluster
     * without affecting the rest of the cluster definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster The properties specified here will overwrite the corresponding properties in the existing cluster
     * (ie. Those properties will be updated).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Stream Analytics Cluster object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(String resourceGroupName, String clusterName, ClusterInner cluster);

    /**
     * Updates an existing cluster. This can be used to partially update (ie. update one or two properties) a cluster
     * without affecting the rest of the cluster definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param cluster The properties specified here will overwrite the corresponding properties in the existing cluster
     * (ie. Those properties will be updated).
     * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set. Specify the
     * last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Stream Analytics Cluster object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(String resourceGroupName, String clusterName, ClusterInner cluster, String ifMatch,
        Context context);

    /**
     * Gets information about the specified cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> getByResourceGroupWithResponse(String resourceGroupName, String clusterName,
        Context context);

    /**
     * Gets information about the specified cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Deletes the specified cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName);

    /**
     * Deletes the specified cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, Context context);

    /**
     * Deletes the specified cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Deletes the specified cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * Lists all of the clusters in the given subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of clusters populated by a 'list' operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list();

    /**
     * Lists all of the clusters in the given subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of clusters populated by a 'list' operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list(Context context);

    /**
     * Lists all of the clusters in the given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of clusters populated by a 'list' operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the clusters in the given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of clusters populated by a 'list' operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all of the streaming jobs in the given cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of streaming jobs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterJobInner> listStreamingJobs(String resourceGroupName, String clusterName);

    /**
     * Lists all of the streaming jobs in the given cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of streaming jobs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterJobInner> listStreamingJobs(String resourceGroupName, String clusterName, Context context);
}
