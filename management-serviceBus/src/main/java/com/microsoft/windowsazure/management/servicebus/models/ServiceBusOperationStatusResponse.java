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

package com.microsoft.windowsazure.management.servicebus.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
 * The response body contains the status of the specified asynchronous
 * operation, indicating whether it has succeeded, is inprogress, or has failed.
 * Note that this status is distinct from the HTTP status code returned for the
 * Get Operation Status operation itself. If the asynchronous operation
 * succeeded, the response body includes the HTTP status code for the successful
 * request. If the asynchronous operation failed, the response body includes the
 * HTTP status code for the failed request, and also includes error information
 * regarding the failure.
 */
public class ServiceBusOperationStatusResponse extends OperationResponse {
    private ServiceBusOperationStatusResponse.ErrorDetails error;

    /**
     * If the asynchronous operation failed, the response body includes the HTTP
     * status code for the failed request, and also includes error information
     * regarding the failure.
     * 
     * @return The Error value.
     */
    public ServiceBusOperationStatusResponse.ErrorDetails getError() {
        return this.error;
    }

    /**
     * If the asynchronous operation failed, the response body includes the HTTP
     * status code for the failed request, and also includes error information
     * regarding the failure.
     * 
     * @param errorValue
     *            The Error value.
     */
    public void setError(
            final ServiceBusOperationStatusResponse.ErrorDetails errorValue) {
        this.error = errorValue;
    }

    private Integer httpStatusCode;

    /**
     * The HTTP status code for the asynchronous request.
     * 
     * @return The HttpStatusCode value.
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * The HTTP status code for the asynchronous request.
     * 
     * @param httpStatusCodeValue
     *            The HttpStatusCode value.
     */
    public void setHttpStatusCode(final Integer httpStatusCodeValue) {
        this.httpStatusCode = httpStatusCodeValue;
    }

    private String id;

    /**
     * The request ID of the asynchronous request. This value is returned in the
     * x-ms-request-id response header of the asynchronous request.
     * 
     * @return The Id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * The request ID of the asynchronous request. This value is returned in the
     * x-ms-request-id response header of the asynchronous request.
     * 
     * @param idValue
     *            The Id value.
     */
    public void setId(final String idValue) {
        this.id = idValue;
    }

    private OperationStatus status;

    /**
     * The status of the asynchronous request.
     * 
     * @return The Status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * The status of the asynchronous request.
     * 
     * @param statusValue
     *            The Status value.
     */
    public void setStatus(final OperationStatus statusValue) {
        this.status = statusValue;
    }

    /**
     * If the asynchronous operation failed, the response body includes the HTTP
     * status code for the failed request, and also includes error information
     * regarding the failure.
     */
    public static class ErrorDetails {
        private String code;

        /**
         * The management service error code returned if the asynchronous
         * request failed.
         * 
         * @return The Code value.
         */
        public String getCode() {
            return this.code;
        }

        /**
         * The management service error code returned if the asynchronous
         * request failed.
         * 
         * @param codeValue
         *            The Code value.
         */
        public void setCode(final String codeValue) {
            this.code = codeValue;
        }

        private String message;

        /**
         * The management service error message returned if the asynchronous
         * request failed.
         * 
         * @return The Message value.
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * The management service error message returned if the asynchronous
         * request failed.
         * 
         * @param messageValue
         *            The Message value.
         */
        public void setMessage(final String messageValue) {
            this.message = messageValue;
        }
    }
}
