// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for Jobs List. */
public final class JobsListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/Job/CommandJob/list.json
     */
    /**
     * Sample code: List Command Job.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listCommandJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.jobs().list("test-rg", "my-aml-workspace", null, "string", "string", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/Job/PipelineJob/list.json
     */
    /**
     * Sample code: List Pipeline Job.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listPipelineJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.jobs().list("test-rg", "my-aml-workspace", null, "string", "string", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/Job/SweepJob/list.json
     */
    /**
     * Sample code: List Sweep Job.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listSweepJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.jobs().list("test-rg", "my-aml-workspace", null, "string", "string", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/Job/AutoMLJob/list.json
     */
    /**
     * Sample code: List AutoML Job.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listAutoMLJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.jobs().list("test-rg", "my-aml-workspace", null, null, null, null, Context.NONE);
    }
}
