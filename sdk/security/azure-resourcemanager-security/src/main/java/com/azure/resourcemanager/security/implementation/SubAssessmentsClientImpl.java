// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.security.fluent.SubAssessmentsClient;
import com.azure.resourcemanager.security.fluent.models.SecuritySubAssessmentInner;
import com.azure.resourcemanager.security.models.SecuritySubAssessmentList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SubAssessmentsClient. */
public final class SubAssessmentsClientImpl implements SubAssessmentsClient {
    /** The proxy service used to perform REST calls. */
    private final SubAssessmentsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of SubAssessmentsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SubAssessmentsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy.create(SubAssessmentsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterSubAssessments to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterSubAss")
    private interface SubAssessmentsService {
        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Security/subAssessments")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecuritySubAssessmentList>> listAll(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scope", encoded = true) String scope,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Security/assessments/{assessmentName}/subAssessments")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecuritySubAssessmentList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scope", encoded = true) String scope,
            @PathParam("assessmentName") String assessmentName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Security/assessments/{assessmentName}/subAssessments/{subAssessmentName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecuritySubAssessmentInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scope", encoded = true) String scope,
            @PathParam("assessmentName") String assessmentName,
            @PathParam("subAssessmentName") String subAssessmentName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecuritySubAssessmentList>> listAllNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SecuritySubAssessmentList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a subscription scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a subscription scope along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecuritySubAssessmentInner>> listAllSinglePageAsync(String scope) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listAll(this.client.getEndpoint(), apiVersion, scope, accept, context))
            .<PagedResponse<SecuritySubAssessmentInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a subscription scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a subscription scope along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecuritySubAssessmentInner>> listAllSinglePageAsync(String scope, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listAll(this.client.getEndpoint(), apiVersion, scope, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a subscription scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a subscription scope as paginated response
     *     with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SecuritySubAssessmentInner> listAllAsync(String scope) {
        return new PagedFlux<>(() -> listAllSinglePageAsync(scope), nextLink -> listAllNextSinglePageAsync(nextLink));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a subscription scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a subscription scope as paginated response
     *     with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SecuritySubAssessmentInner> listAllAsync(String scope, Context context) {
        return new PagedFlux<>(
            () -> listAllSinglePageAsync(scope, context), nextLink -> listAllNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a subscription scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a subscription scope as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecuritySubAssessmentInner> listAll(String scope) {
        return new PagedIterable<>(listAllAsync(scope));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a subscription scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a subscription scope as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecuritySubAssessmentInner> listAll(String scope, Context context) {
        return new PagedIterable<>(listAllAsync(scope, context));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a scope along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecuritySubAssessmentInner>> listSinglePageAsync(String scope, String assessmentName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (assessmentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter assessmentName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), apiVersion, scope, assessmentName, accept, context))
            .<PagedResponse<SecuritySubAssessmentInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a scope along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecuritySubAssessmentInner>> listSinglePageAsync(
        String scope, String assessmentName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (assessmentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter assessmentName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, scope, assessmentName, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a scope as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SecuritySubAssessmentInner> listAsync(String scope, String assessmentName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, assessmentName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a scope as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SecuritySubAssessmentInner> listAsync(String scope, String assessmentName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, assessmentName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a scope as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecuritySubAssessmentInner> list(String scope, String assessmentName) {
        return new PagedIterable<>(listAsync(scope, assessmentName));
    }

    /**
     * Get security sub-assessments on all your scanned resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a scope as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecuritySubAssessmentInner> list(String scope, String assessmentName, Context context) {
        return new PagedIterable<>(listAsync(scope, assessmentName, context));
    }

    /**
     * Get a security sub-assessment on your scanned resource.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param subAssessmentName The Sub-Assessment Key - Unique key for the sub-assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security sub-assessment on your scanned resource along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SecuritySubAssessmentInner>> getWithResponseAsync(
        String scope, String assessmentName, String subAssessmentName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (assessmentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter assessmentName is required and cannot be null."));
        }
        if (subAssessmentName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter subAssessmentName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            scope,
                            assessmentName,
                            subAssessmentName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a security sub-assessment on your scanned resource.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param subAssessmentName The Sub-Assessment Key - Unique key for the sub-assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security sub-assessment on your scanned resource along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SecuritySubAssessmentInner>> getWithResponseAsync(
        String scope, String assessmentName, String subAssessmentName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (assessmentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter assessmentName is required and cannot be null."));
        }
        if (subAssessmentName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter subAssessmentName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), apiVersion, scope, assessmentName, subAssessmentName, accept, context);
    }

    /**
     * Get a security sub-assessment on your scanned resource.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param subAssessmentName The Sub-Assessment Key - Unique key for the sub-assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security sub-assessment on your scanned resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SecuritySubAssessmentInner> getAsync(String scope, String assessmentName, String subAssessmentName) {
        return getWithResponseAsync(scope, assessmentName, subAssessmentName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a security sub-assessment on your scanned resource.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param subAssessmentName The Sub-Assessment Key - Unique key for the sub-assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security sub-assessment on your scanned resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecuritySubAssessmentInner get(String scope, String assessmentName, String subAssessmentName) {
        return getAsync(scope, assessmentName, subAssessmentName).block();
    }

    /**
     * Get a security sub-assessment on your scanned resource.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param subAssessmentName The Sub-Assessment Key - Unique key for the sub-assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security sub-assessment on your scanned resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SecuritySubAssessmentInner> getWithResponse(
        String scope, String assessmentName, String subAssessmentName, Context context) {
        return getWithResponseAsync(scope, assessmentName, subAssessmentName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security sub-assessments along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecuritySubAssessmentInner>> listAllNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listAllNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SecuritySubAssessmentInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security sub-assessments along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecuritySubAssessmentInner>> listAllNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listAllNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security sub-assessments along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecuritySubAssessmentInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SecuritySubAssessmentInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security sub-assessments along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SecuritySubAssessmentInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
