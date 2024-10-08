// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ClassificationPrimaryMetrics;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LogVerbosity;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.NlpVerticalFeaturizationSettings;
import com.azure.resourcemanager.machinelearning.models.NlpVerticalLimitSettings;
import com.azure.resourcemanager.machinelearning.models.TextClassification;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class TextClassificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TextClassification model = BinaryData.fromString(
            "{\"taskType\":\"TextClassification\",\"primaryMetric\":\"AveragePrecisionScoreWeighted\",\"limitSettings\":{\"timeout\":\"PT208H31M59S\",\"maxTrials\":1029367761,\"maxConcurrentTrials\":1396784838},\"featurizationSettings\":{\"datasetLanguage\":\"qdvnpyeevff\"},\"validationData\":{\"jobInputType\":\"mltable\",\"uri\":\"ujgtdowlxmwefcb\",\"mode\":\"Direct\",\"description\":\"hrtczwjcujyz\"},\"logVerbosity\":\"Debug\",\"trainingData\":{\"jobInputType\":\"mltable\",\"uri\":\"rjq\",\"mode\":\"ReadWriteMount\",\"description\":\"kuirxxe\"},\"targetColumnName\":\"iiircvn\"}")
            .toObject(TextClassification.class);
        Assertions.assertEquals(LogVerbosity.DEBUG, model.logVerbosity());
        Assertions.assertEquals("kuirxxe", model.trainingData().description());
        Assertions.assertEquals("rjq", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("iiircvn", model.targetColumnName());
        Assertions.assertEquals(ClassificationPrimaryMetrics.AVERAGE_PRECISION_SCORE_WEIGHTED, model.primaryMetric());
        Assertions.assertEquals(Duration.parse("PT208H31M59S"), model.limitSettings().timeout());
        Assertions.assertEquals(1029367761, model.limitSettings().maxTrials());
        Assertions.assertEquals(1396784838, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals("qdvnpyeevff", model.featurizationSettings().datasetLanguage());
        Assertions.assertEquals("hrtczwjcujyz", model.validationData().description());
        Assertions.assertEquals("ujgtdowlxmwefcb", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.DIRECT, model.validationData().mode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TextClassification model = new TextClassification().withLogVerbosity(LogVerbosity.DEBUG)
            .withTrainingData(new MLTableJobInput().withDescription("kuirxxe")
                .withUri("rjq")
                .withMode(InputDeliveryMode.READ_WRITE_MOUNT))
            .withTargetColumnName("iiircvn")
            .withPrimaryMetric(ClassificationPrimaryMetrics.AVERAGE_PRECISION_SCORE_WEIGHTED)
            .withLimitSettings(new NlpVerticalLimitSettings().withTimeout(Duration.parse("PT208H31M59S"))
                .withMaxTrials(1029367761)
                .withMaxConcurrentTrials(1396784838))
            .withFeaturizationSettings(new NlpVerticalFeaturizationSettings().withDatasetLanguage("qdvnpyeevff"))
            .withValidationData(new MLTableJobInput().withDescription("hrtczwjcujyz")
                .withUri("ujgtdowlxmwefcb")
                .withMode(InputDeliveryMode.DIRECT));
        model = BinaryData.fromObject(model).toObject(TextClassification.class);
        Assertions.assertEquals(LogVerbosity.DEBUG, model.logVerbosity());
        Assertions.assertEquals("kuirxxe", model.trainingData().description());
        Assertions.assertEquals("rjq", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("iiircvn", model.targetColumnName());
        Assertions.assertEquals(ClassificationPrimaryMetrics.AVERAGE_PRECISION_SCORE_WEIGHTED, model.primaryMetric());
        Assertions.assertEquals(Duration.parse("PT208H31M59S"), model.limitSettings().timeout());
        Assertions.assertEquals(1029367761, model.limitSettings().maxTrials());
        Assertions.assertEquals(1396784838, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals("qdvnpyeevff", model.featurizationSettings().datasetLanguage());
        Assertions.assertEquals("hrtczwjcujyz", model.validationData().description());
        Assertions.assertEquals("ujgtdowlxmwefcb", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.DIRECT, model.validationData().mode());
    }
}
