// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Gateways.
 */
public interface Gateways {
    /**
     * Retrieves information about the view of a gateway.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gatewayName The name of the Gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Arc Gateway along with {@link Response}.
     */
    Response<Gateway> getByResourceGroupWithResponse(String resourceGroupName, String gatewayName, Context context);

    /**
     * Retrieves information about the view of a gateway.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gatewayName The name of the Gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Arc Gateway.
     */
    Gateway getByResourceGroup(String resourceGroupName, String gatewayName);

    /**
     * The operation to delete a gateway.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gatewayName The name of the Gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String gatewayName);

    /**
     * The operation to delete a gateway.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gatewayName The name of the Gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String gatewayName, Context context);

    /**
     * The operation to get all gateways of a non-Azure machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List license operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Gateway> listByResourceGroup(String resourceGroupName);

    /**
     * The operation to get all gateways of a non-Azure machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List license operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Gateway> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * The operation to get all gateways of a non-Azure machine.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List license operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Gateway> list();

    /**
     * The operation to get all gateways of a non-Azure machine.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List license operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Gateway> list(Context context);

    /**
     * Retrieves information about the view of a gateway.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Arc Gateway along with {@link Response}.
     */
    Gateway getById(String id);

    /**
     * Retrieves information about the view of a gateway.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Arc Gateway along with {@link Response}.
     */
    Response<Gateway> getByIdWithResponse(String id, Context context);

    /**
     * The operation to delete a gateway.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete a gateway.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Gateway resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Gateway definition.
     */
    Gateway.DefinitionStages.Blank define(String name);
}
