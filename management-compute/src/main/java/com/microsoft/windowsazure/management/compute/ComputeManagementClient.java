/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute;

import com.microsoft.windowsazure.core.FilterableService;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.compute.models.ComputeOperationStatusResponse;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * The Service Management API provides programmatic access to much of the
 * functionality available through the Management Portal. The Service Management
 * API is a REST API. All API operations are performed over SSL and mutually
 * authenticated using X.509 v3 certificates. (see
 * http://msdn.microsoft.com/en-us/library/windowsazure/ee460799.aspx for more
 * information)
 */
public interface ComputeManagementClient extends
        FilterableService<ComputeManagementClient> {
    /**
     * The URI used as the base for all Service Management requests.
     * 
     * @return The BaseUri value.
     */
    URI getBaseUri();

    /**
     * When you create a Windows Azure subscription, it is uniquely identified
     * by a subscription ID. The subscription ID forms part of the URI for every
     * call that you make to the Service Management API. The Windows Azure
     * Service ManagementAPI use mutual authentication of management
     * certificates over SSL to ensure that a request made to the service is
     * secure. No anonymous requests are allowed.
     * 
     * @return The Credentials value.
     */
    SubscriptionCloudCredentials getCredentials();

    /**
     * The Service Management API includes operations for managing the
     * deployments beneath your subscription. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/ee460812.aspx for
     * more information)
     * 
     * @return The DeploymentsOperations value.
     */
    DeploymentOperations getDeploymentsOperations();

    /**
     * The Service Management API includes operations for managing the hosted
     * services beneath your subscription. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/ee460812.aspx for
     * more information)
     * 
     * @return The HostedServicesOperations value.
     */
    HostedServiceOperations getHostedServicesOperations();

    /**
     * Operations for determining the version of the Windows Azure Guest
     * Operating System on which your service is running. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/ff684169.aspx for
     * more information)
     * 
     * @return The OperatingSystemsOperations value.
     */
    OperatingSystemOperations getOperatingSystemsOperations();

    /**
     * Operations for managing service certificates for your subscription. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/ee795178.aspx for
     * more information)
     * 
     * @return The ServiceCertificatesOperations value.
     */
    ServiceCertificateOperations getServiceCertificatesOperations();

    /**
     * The Service Management API includes operations for managing the disks in
     * your subscription. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/jj157188.aspx for
     * more information)
     * 
     * @return The VirtualMachineDisksOperations value.
     */
    VirtualMachineDiskOperations getVirtualMachineDisksOperations();

    /**
     * The Service Management API includes operations for managing the virtual
     * machine extensions in your subscription. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/jj157206.aspx for
     * more information)
     * 
     * @return The VirtualMachineExtensionsOperations value.
     */
    VirtualMachineExtensionOperations getVirtualMachineExtensionsOperations();

    /**
     * The Service Management API includes operations for managing the OS images
     * in your subscription. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/jj157175.aspx for
     * more information)
     * 
     * @return The VirtualMachineImagesOperations value.
     */
    VirtualMachineImageOperations getVirtualMachineImagesOperations();

    /**
     * The Service Management API includes operations for managing the virtual
     * machines in your subscription. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/jj157206.aspx for
     * more information)
     * 
     * @return The VirtualMachinesOperations value.
     */
    VirtualMachineOperations getVirtualMachinesOperations();

    /**
     * The Get Operation Status operation returns the status of thespecified
     * operation. After calling an asynchronous operation, you can call Get
     * Operation Status to determine whether the operation has succeeded,
     * failed, or is still in progress. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/ee460783.aspx for
     * more information)
     * 
     * @param requestId
     *            The request ID for the request you wish to track. The request
     *            ID is returned in the x-ms-request-id response header for
     *            every request.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @throws ParserConfigurationException
     *             Thrown if there was a serious configuration error with the
     *             document parser.
     * @throws SAXException
     *             Thrown if there was an error parsing the XML response.
     * @return The response body contains the status of the specified
     *         asynchronous operation, indicating whether it has succeeded, is
     *         inprogress, or has failed. Note that this status is distinct from
     *         the HTTP status code returned for the Get Operation Status
     *         operation itself. If the asynchronous operation succeeded, the
     *         response body includes the HTTP status code for the successful
     *         request. If the asynchronous operation failed, the response body
     *         includes the HTTP status code for the failed request, and also
     *         includes error information regarding the failure.
     */
    ComputeOperationStatusResponse getOperationStatus(String requestId)
            throws IOException, ServiceException, ParserConfigurationException,
            SAXException;

    /**
     * The Get Operation Status operation returns the status of thespecified
     * operation. After calling an asynchronous operation, you can call Get
     * Operation Status to determine whether the operation has succeeded,
     * failed, or is still in progress. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/ee460783.aspx for
     * more information)
     * 
     * @param requestId
     *            The request ID for the request you wish to track. The request
     *            ID is returned in the x-ms-request-id response header for
     *            every request.
     * @return The response body contains the status of the specified
     *         asynchronous operation, indicating whether it has succeeded, is
     *         inprogress, or has failed. Note that this status is distinct from
     *         the HTTP status code returned for the Get Operation Status
     *         operation itself. If the asynchronous operation succeeded, the
     *         response body includes the HTTP status code for the successful
     *         request. If the asynchronous operation failed, the response body
     *         includes the HTTP status code for the failed request, and also
     *         includes error information regarding the failure.
     */
    Future<ComputeOperationStatusResponse> getOperationStatusAsync(
            String requestId);
}
