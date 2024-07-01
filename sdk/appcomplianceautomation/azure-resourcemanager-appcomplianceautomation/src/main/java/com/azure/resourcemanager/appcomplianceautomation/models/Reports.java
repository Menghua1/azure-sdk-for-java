// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ReportResourceInner;

/**
 * Resource collection API of Reports.
 */
public interface Reports {
    /**
     * Get the AppComplianceAutomation report list for the tenant.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation report list for the tenant as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReportResource> list();

    /**
     * Get the AppComplianceAutomation report list for the tenant.
     * 
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * ?$select=reportName,id.
     * @param filter The filter to apply on the operation.
     * @param orderby OData order by query option.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation report list for the tenant as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReportResource> list(String skipToken, Integer top, String select, String filter, String orderby,
        String offerGuid, String reportCreatorTenantId, Context context);

    /**
     * Get the AppComplianceAutomation report and its properties.
     * 
     * @param reportName Report Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation report and its properties along with {@link Response}.
     */
    Response<ReportResource> getWithResponse(String reportName, Context context);

    /**
     * Get the AppComplianceAutomation report and its properties.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation report and its properties.
     */
    ReportResource get(String reportName);

    /**
     * Create a new AppComplianceAutomation report or update an exiting AppComplianceAutomation report.
     * 
     * @param reportName Report Name.
     * @param properties Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent an AppComplianceAutomation report resource.
     */
    ReportResource createOrUpdate(String reportName, ReportResourceInner properties);

    /**
     * Create a new AppComplianceAutomation report or update an exiting AppComplianceAutomation report.
     * 
     * @param reportName Report Name.
     * @param properties Parameters for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent an AppComplianceAutomation report resource.
     */
    ReportResource createOrUpdate(String reportName, ReportResourceInner properties, Context context);

    /**
     * Update an exiting AppComplianceAutomation report.
     * 
     * @param reportName Report Name.
     * @param properties Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent an AppComplianceAutomation report resource.
     */
    ReportResource update(String reportName, ReportResourcePatch properties);

    /**
     * Update an exiting AppComplianceAutomation report.
     * 
     * @param reportName Report Name.
     * @param properties Parameters for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent an AppComplianceAutomation report resource.
     */
    ReportResource update(String reportName, ReportResourcePatch properties, Context context);

    /**
     * Delete an AppComplianceAutomation report.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String reportName);

    /**
     * Delete an AppComplianceAutomation report.
     * 
     * @param reportName Report Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String reportName, Context context);

    /**
     * Checks the report's nested resource name availability, e.g: Webhooks, Evidences, Snapshots.
     * 
     * @param reportName Report Name.
     * @param body NameAvailabilityRequest object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response}.
     */
    Response<CheckNameAvailabilityResponse> nestedResourceCheckNameAvailabilityWithResponse(String reportName,
        CheckNameAvailabilityRequest body, Context context);

    /**
     * Checks the report's nested resource name availability, e.g: Webhooks, Evidences, Snapshots.
     * 
     * @param reportName Report Name.
     * @param body NameAvailabilityRequest object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result.
     */
    CheckNameAvailabilityResponse nestedResourceCheckNameAvailability(String reportName,
        CheckNameAvailabilityRequest body);

    /**
     * Fix the AppComplianceAutomation report error. e.g: App Compliance Automation Tool service unregistered,
     * automation removed.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return report fix result.
     */
    ReportFixResult fix(String reportName);

    /**
     * Fix the AppComplianceAutomation report error. e.g: App Compliance Automation Tool service unregistered,
     * automation removed.
     * 
     * @param reportName Report Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return report fix result.
     */
    ReportFixResult fix(String reportName, Context context);

    /**
     * Fix the AppComplianceAutomation report error. e.g: App Compliance Automation Tool service unregistered,
     * automation removed.
     * 
     * @param reportName Report Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scoping question list along with {@link Response}.
     */
    Response<ScopingQuestions> getScopingQuestionsWithResponse(String reportName, Context context);

    /**
     * Fix the AppComplianceAutomation report error. e.g: App Compliance Automation Tool service unregistered,
     * automation removed.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scoping question list.
     */
    ScopingQuestions getScopingQuestions(String reportName);

    /**
     * Synchronize attestation record from app compliance.
     * 
     * @param reportName Report Name.
     * @param body Parameters for synchronize certification record operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return synchronize certification record response.
     */
    SyncCertRecordResponse syncCertRecord(String reportName, SyncCertRecordRequest body);

    /**
     * Synchronize attestation record from app compliance.
     * 
     * @param reportName Report Name.
     * @param body Parameters for synchronize certification record operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return synchronize certification record response.
     */
    SyncCertRecordResponse syncCertRecord(String reportName, SyncCertRecordRequest body, Context context);

    /**
     * Verify the AppComplianceAutomation report health status.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return report health status verification result.
     */
    ReportVerificationResult verify(String reportName);

    /**
     * Verify the AppComplianceAutomation report health status.
     * 
     * @param reportName Report Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return report health status verification result.
     */
    ReportVerificationResult verify(String reportName, Context context);
}
