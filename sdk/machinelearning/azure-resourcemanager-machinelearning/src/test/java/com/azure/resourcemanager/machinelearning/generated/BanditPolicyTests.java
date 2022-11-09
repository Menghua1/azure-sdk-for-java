// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BanditPolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BanditPolicyTests {
    @Test
    public void testDeserialize() {
        BanditPolicy model =
            BinaryData
                .fromString(
                    "{\"policyType\":\"Bandit\",\"slackAmount\":59.648163,\"slackFactor\":43.063473,\"delayEvaluation\":364097944,\"evaluationInterval\":2114496472}")
                .toObject(BanditPolicy.class);
        Assertions.assertEquals(364097944, model.delayEvaluation());
        Assertions.assertEquals(2114496472, model.evaluationInterval());
        Assertions.assertEquals(59.648163F, model.slackAmount());
        Assertions.assertEquals(43.063473F, model.slackFactor());
    }

    @Test
    public void testSerialize() {
        BanditPolicy model =
            new BanditPolicy()
                .withDelayEvaluation(364097944)
                .withEvaluationInterval(2114496472)
                .withSlackAmount(59.648163F)
                .withSlackFactor(43.063473F);
        model = BinaryData.fromObject(model).toObject(BanditPolicy.class);
        Assertions.assertEquals(364097944, model.delayEvaluation());
        Assertions.assertEquals(2114496472, model.evaluationInterval());
        Assertions.assertEquals(59.648163F, model.slackAmount());
        Assertions.assertEquals(43.063473F, model.slackFactor());
    }
}
