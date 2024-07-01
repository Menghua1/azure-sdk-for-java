// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of PrivateLinkResources.
 */
public interface PrivateLinkResources {
    /**
     * Gets the private link resources that need to be created for a RedisEnterprise cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Redis Enterprise cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a RedisEnterprise cluster as paginated response
     * with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByCluster(String resourceGroupName, String clusterName);

    /**
     * Gets the private link resources that need to be created for a RedisEnterprise cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Redis Enterprise cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a RedisEnterprise cluster as paginated response
     * with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByCluster(String resourceGroupName, String clusterName, Context context);
}
