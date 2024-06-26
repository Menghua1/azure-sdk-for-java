// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of FlexibleServers.
 */
public interface FlexibleServers {
    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call.
     */
    Response<LtrPreBackupResponse> triggerLtrPreBackupWithResponse(String resourceGroupName, String serverName,
        LtrPreBackupRequest parameters, Context context);

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call.
     */
    LtrPreBackupResponse triggerLtrPreBackup(String resourceGroupName, String serverName,
        LtrPreBackupRequest parameters);

    /**
     * Start the Long Term Retention Backup operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call.
     */
    LtrBackupResponse startLtrBackup(String resourceGroupName, String serverName, LtrBackupRequest parameters);

    /**
     * Start the Long Term Retention Backup operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call.
     */
    LtrBackupResponse startLtrBackup(String resourceGroupName, String serverName, LtrBackupRequest parameters,
        Context context);
}
