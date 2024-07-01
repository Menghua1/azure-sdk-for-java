// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

/**
 * Samples for Report GetScopingQuestions.
 */
public final class ReportGetScopingQuestionsSamples {
    /*
     * x-ms-original-file:
     * specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/
     * examples/Report_GetScopingQuestions.json
     */
    /**
     * Sample code: Report_GetScopingQuestions.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportGetScopingQuestions(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports().getScopingQuestionsWithResponse("testReportName", com.azure.core.util.Context.NONE);
    }
}
