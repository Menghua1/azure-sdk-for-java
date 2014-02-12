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

package com.microsoft.windowsazure.management.virtualnetworks;

import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.virtualnetworks.models.NetworkStaticIPAvailabilityResponse;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class StaticIPOperationsImpl implements
        ServiceOperations<VirtualNetworkManagementClientImpl>,
        StaticIPOperations {
    /**
     * Initializes a new instance of the StaticIPOperationsImpl class.
     * 
     * @param client
     *            Reference to the service client.
     */
    StaticIPOperationsImpl(VirtualNetworkManagementClientImpl client) {
        this.client = client;
    }

    private VirtualNetworkManagementClientImpl client;

    /**
     * Gets a reference to the
     * microsoft.windowsazure.management.virtualnetworks.
     * VirtualNetworkManagementClientImpl.
     * 
     * @return The Client value.
     */
    public VirtualNetworkManagementClientImpl getClient() {
        return this.client;
    }

    /**
     * The Check Static IP operation retrieves the details for the availability
     * of static IP addresses for the given virtual network.
     * 
     * @param virtualNetworkName
     *            The name of the virtual network.
     * @param ipAddress
     *            The address of the static IP.
     * @return A response that indicates the availability of a static IP
     *         address, and if not, provide a list of suggestions.
     */
    @Override
    public Future<NetworkStaticIPAvailabilityResponse> checkAsync(
            final String virtualNetworkName, final InetAddress ipAddress) {
        return this.getClient().getExecutorService()
                .submit(new Callable<NetworkStaticIPAvailabilityResponse>() {
                    @Override
                    public NetworkStaticIPAvailabilityResponse call()
                            throws Exception {
                        return check(virtualNetworkName, ipAddress);
                    }
                });
    }

    /**
     * The Check Static IP operation retrieves the details for the availability
     * of static IP addresses for the given virtual network.
     * 
     * @param virtualNetworkName
     *            The name of the virtual network.
     * @param ipAddress
     *            The address of the static IP.
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
     * @return A response that indicates the availability of a static IP
     *         address, and if not, provide a list of suggestions.
     */
    @Override
    public NetworkStaticIPAvailabilityResponse check(String virtualNetworkName,
            InetAddress ipAddress) throws IOException, ServiceException,
            ParserConfigurationException, SAXException {
        // Validate
        if (virtualNetworkName == null) {
            throw new NullPointerException("virtualNetworkName");
        }
        if (ipAddress == null) {
            throw new NullPointerException("ipAddress");
        }

        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("virtualNetworkName", virtualNetworkName);
            tracingParameters.put("ipAddress", ipAddress);
            CloudTracing.enter(invocationId, this, "checkAsync",
                    tracingParameters);
        }

        // Construct URL
        String url = this.getClient().getBaseUri() + "/"
                + this.getClient().getCredentials().getSubscriptionId()
                + "/services/networking/" + virtualNetworkName + "?";
        url = url + "op=checkavailability";
        url = url + "&" + "address="
                + URLEncoder.encode(ipAddress.toString(), "UTF-8");

        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);

        // Set Headers
        httpRequest.setHeader("x-ms-version", "2013-11-01");

        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient()
                    .execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(
                        httpRequest, null, httpResponse,
                        httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }

            // Create Result
            NetworkStaticIPAvailabilityResponse result = null;
            // Deserialize Response
            InputStream responseContent = httpResponse.getEntity().getContent();
            result = new NetworkStaticIPAvailabilityResponse();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                    .newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            DocumentBuilder documentBuilder = documentBuilderFactory
                    .newDocumentBuilder();
            Document responseDoc = documentBuilder.parse(responseContent);

            NodeList elements = responseDoc
                    .getElementsByTagName("AddressAvailabilityResponse");
            Element addressAvailabilityResponseElement = elements.getLength() > 0 ? ((Element) elements
                    .item(0)) : null;
            if (addressAvailabilityResponseElement != null) {
                NodeList elements2 = addressAvailabilityResponseElement
                        .getElementsByTagName("IsAvailable");
                Element isAvailableElement = elements2.getLength() > 0 ? ((Element) elements2
                        .item(0)) : null;
                if (isAvailableElement != null) {
                    boolean isAvailableInstance;
                    isAvailableInstance = DatatypeConverter
                            .parseBoolean(isAvailableElement.getTextContent());
                    result.setIsAvailable(isAvailableInstance);
                }

                NodeList elements3 = addressAvailabilityResponseElement
                        .getElementsByTagName("AvailableAddresses");
                Element availableAddressesSequenceElement = elements3
                        .getLength() > 0 ? ((Element) elements3.item(0)) : null;
                if (availableAddressesSequenceElement != null) {
                    for (int i1 = 0; i1 < availableAddressesSequenceElement
                            .getElementsByTagName("AvailableAddress")
                            .getLength(); i1 = i1 + 1) {
                        org.w3c.dom.Element availableAddressesElement = ((org.w3c.dom.Element) availableAddressesSequenceElement
                                .getElementsByTagName("AvailableAddress").item(
                                        i1));
                        result.getAvailableAddresses().add(
                                InetAddress.getByName(availableAddressesElement
                                        .getTextContent()));
                    }
                }
            }

            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader(
                        "x-ms-request-id").getValue());
            }

            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
