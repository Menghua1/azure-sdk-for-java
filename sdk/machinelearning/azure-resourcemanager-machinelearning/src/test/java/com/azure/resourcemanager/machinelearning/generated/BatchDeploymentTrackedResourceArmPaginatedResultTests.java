// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.BatchDeploymentInner;
import com.azure.resourcemanager.machinelearning.models.BatchDeploymentProperties;
import com.azure.resourcemanager.machinelearning.models.BatchDeploymentTrackedResourceArmPaginatedResult;
import com.azure.resourcemanager.machinelearning.models.BatchLoggingLevel;
import com.azure.resourcemanager.machinelearning.models.BatchOutputAction;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BatchDeploymentTrackedResourceArmPaginatedResultTests {
    @Test
    public void testDeserialize() {
        BatchDeploymentTrackedResourceArmPaginatedResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"byuqerpqlp\",\"value\":[{\"identity\":{\"principalId\":\"c9a6d637-0074-42d0-ac95-22e4866ed7f2\",\"tenantId\":\"bde40d98-edf9-4257-81c1-ff2eb1eaa331\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"dbutauvfbtkuwhh\",\"properties\":{\"compute\":\"ykojoxafnndlpic\",\"errorThreshold\":171305753,\"loggingLevel\":\"Warning\",\"maxConcurrencyPerInstance\":1638328793,\"miniBatchSize\":8200965629156318432,\"outputAction\":\"AppendRow\",\"outputFileName\":\"pwdreqnovvqf\",\"provisioningState\":\"Failed\",\"description\":\"suwsyrsnds\",\"environmentId\":\"g\",\"environmentVariables\":{},\"properties\":{}},\"sku\":{\"name\":\"r\",\"tier\":\"Standard\",\"size\":\"neqn\",\"family\":\"rrwlquuijfqkace\",\"capacity\":2104888829},\"location\":\"fpubjibwwi\",\"tags\":{\"ynfs\":\"hqkvpuvksgplsak\",\"jphuopxodlqi\":\"n\",\"slyzrpzbchckqq\":\"ntorzihleosjswsr\",\"suiizynkedyat\":\"qioxi\"},\"id\":\"wyhqmibzyhwits\",\"name\":\"ypyynpcdpumnzg\",\"type\":\"wznm\"},{\"identity\":{\"principalId\":\"d2980a2a-72b7-4299-b23e-11e1bbaad762\",\"tenantId\":\"82d6a0fa-ffa4-4c24-a2ce-74aae4ae64ab\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"rgjhxb\",\"properties\":{\"compute\":\"tlwwrlk\",\"errorThreshold\":1940246801,\"loggingLevel\":\"Warning\",\"maxConcurrencyPerInstance\":333571047,\"miniBatchSize\":4567104725520033936,\"outputAction\":\"SummaryOnly\",\"outputFileName\":\"yhgsy\",\"provisioningState\":\"Deleting\",\"description\":\"dtbnnha\",\"environmentId\":\"ocrkvcikh\",\"environmentVariables\":{},\"properties\":{}},\"sku\":{\"name\":\"mqg\",\"tier\":\"Basic\",\"size\":\"ezikywggxkal\",\"family\":\"tmelw\",\"capacity\":908050565},\"location\":\"ccjzkzivgvv\",\"tags\":{\"hyrnxxmu\":\"y\",\"v\":\"edndr\"},\"id\":\"tkwqqtchealm\",\"name\":\"mtdaa\",\"type\":\"gdv\"},{\"identity\":{\"principalId\":\"a6b9562c-5d15-4042-ac41-45c8b64d10c5\",\"tenantId\":\"f8adbbb1-f380-4a2a-ba40-1703488e9225\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"g\",\"properties\":{\"compute\":\"rtfudxepxg\",\"errorThreshold\":682770513,\"loggingLevel\":\"Warning\",\"maxConcurrencyPerInstance\":1825902686,\"miniBatchSize\":4744038705838577883,\"outputAction\":\"AppendRow\",\"outputFileName\":\"himdbl\",\"provisioningState\":\"Deleting\",\"description\":\"jhfjxwm\",\"environmentId\":\"kkfoqr\",\"environmentVariables\":{},\"properties\":{}},\"sku\":{\"name\":\"zi\",\"tier\":\"Basic\",\"size\":\"wneaiv\",\"family\":\"czelpcirel\",\"capacity\":561356651},\"location\":\"enwabfatk\",\"tags\":{\"oulpjrv\":\"xbjhwuaanozjosph\",\"rvimjwosytxitcsk\":\"ag\",\"hlyfjhdgqgg\":\"cktqumiekkezzi\",\"qfatpxllrxcyjm\":\"bdunygaeqid\"},\"id\":\"a\",\"name\":\"su\",\"type\":\"arm\"},{\"identity\":{\"principalId\":\"8407fdfc-3489-43a0-aab0-268a28d71da1\",\"tenantId\":\"ce2591e0-770a-41dc-a1bb-6125b7a58935\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"q\",\"properties\":{\"compute\":\"hhyxxrw\",\"errorThreshold\":324291601,\"loggingLevel\":\"Info\",\"maxConcurrencyPerInstance\":381030924,\"miniBatchSize\":4370015191993628840,\"outputAction\":\"AppendRow\",\"outputFileName\":\"areqna\",\"provisioningState\":\"Succeeded\",\"description\":\"ky\",\"environmentId\":\"beddgssofw\",\"environmentVariables\":{},\"properties\":{}},\"sku\":{\"name\":\"alkrmn\",\"tier\":\"Basic\",\"size\":\"xacqqudfnbyx\",\"family\":\"aabjyvayffimrz\",\"capacity\":1007625802},\"location\":\"qogsexnevfd\",\"tags\":{\"euzsoi\":\"wmewzsyy\"},\"id\":\"judpfrxt\",\"name\":\"thzvaytdwkqbrqu\",\"type\":\"paxh\"}]}")
                .toObject(BatchDeploymentTrackedResourceArmPaginatedResult.class);
        Assertions.assertEquals("byuqerpqlp", model.nextLink());
        Assertions.assertEquals("fpubjibwwi", model.value().get(0).location());
        Assertions.assertEquals("hqkvpuvksgplsak", model.value().get(0).tags().get("ynfs"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("dbutauvfbtkuwhh", model.value().get(0).kind());
        Assertions.assertEquals("suwsyrsnds", model.value().get(0).properties().description());
        Assertions.assertEquals("g", model.value().get(0).properties().environmentId());
        Assertions.assertEquals("ykojoxafnndlpic", model.value().get(0).properties().compute());
        Assertions.assertEquals(171305753, model.value().get(0).properties().errorThreshold());
        Assertions.assertEquals(BatchLoggingLevel.WARNING, model.value().get(0).properties().loggingLevel());
        Assertions.assertEquals(1638328793, model.value().get(0).properties().maxConcurrencyPerInstance());
        Assertions.assertEquals(8200965629156318432L, model.value().get(0).properties().miniBatchSize());
        Assertions.assertEquals(BatchOutputAction.APPEND_ROW, model.value().get(0).properties().outputAction());
        Assertions.assertEquals("pwdreqnovvqf", model.value().get(0).properties().outputFileName());
        Assertions.assertEquals("r", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, model.value().get(0).sku().tier());
        Assertions.assertEquals("neqn", model.value().get(0).sku().size());
        Assertions.assertEquals("rrwlquuijfqkace", model.value().get(0).sku().family());
        Assertions.assertEquals(2104888829, model.value().get(0).sku().capacity());
    }

    @Test
    public void testSerialize() {
        BatchDeploymentTrackedResourceArmPaginatedResult model =
            new BatchDeploymentTrackedResourceArmPaginatedResult()
                .withNextLink("byuqerpqlp")
                .withValue(
                    Arrays
                        .asList(
                            new BatchDeploymentInner()
                                .withLocation("fpubjibwwi")
                                .withTags(
                                    mapOf(
                                        "ynfs",
                                        "hqkvpuvksgplsak",
                                        "jphuopxodlqi",
                                        "n",
                                        "slyzrpzbchckqq",
                                        "ntorzihleosjswsr",
                                        "suiizynkedyat",
                                        "qioxi"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("dbutauvfbtkuwhh")
                                .withProperties(
                                    new BatchDeploymentProperties()
                                        .withDescription("suwsyrsnds")
                                        .withEnvironmentId("g")
                                        .withEnvironmentVariables(mapOf())
                                        .withProperties(mapOf())
                                        .withCompute("ykojoxafnndlpic")
                                        .withErrorThreshold(171305753)
                                        .withLoggingLevel(BatchLoggingLevel.WARNING)
                                        .withMaxConcurrencyPerInstance(1638328793)
                                        .withMiniBatchSize(8200965629156318432L)
                                        .withOutputAction(BatchOutputAction.APPEND_ROW)
                                        .withOutputFileName("pwdreqnovvqf"))
                                .withSku(
                                    new Sku()
                                        .withName("r")
                                        .withTier(SkuTier.STANDARD)
                                        .withSize("neqn")
                                        .withFamily("rrwlquuijfqkace")
                                        .withCapacity(2104888829)),
                            new BatchDeploymentInner()
                                .withLocation("ccjzkzivgvv")
                                .withTags(mapOf("hyrnxxmu", "y", "v", "edndr"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("rgjhxb")
                                .withProperties(
                                    new BatchDeploymentProperties()
                                        .withDescription("dtbnnha")
                                        .withEnvironmentId("ocrkvcikh")
                                        .withEnvironmentVariables(mapOf())
                                        .withProperties(mapOf())
                                        .withCompute("tlwwrlk")
                                        .withErrorThreshold(1940246801)
                                        .withLoggingLevel(BatchLoggingLevel.WARNING)
                                        .withMaxConcurrencyPerInstance(333571047)
                                        .withMiniBatchSize(4567104725520033936L)
                                        .withOutputAction(BatchOutputAction.SUMMARY_ONLY)
                                        .withOutputFileName("yhgsy"))
                                .withSku(
                                    new Sku()
                                        .withName("mqg")
                                        .withTier(SkuTier.BASIC)
                                        .withSize("ezikywggxkal")
                                        .withFamily("tmelw")
                                        .withCapacity(908050565)),
                            new BatchDeploymentInner()
                                .withLocation("enwabfatk")
                                .withTags(
                                    mapOf(
                                        "oulpjrv",
                                        "xbjhwuaanozjosph",
                                        "rvimjwosytxitcsk",
                                        "ag",
                                        "hlyfjhdgqgg",
                                        "cktqumiekkezzi",
                                        "qfatpxllrxcyjm",
                                        "bdunygaeqid"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("g")
                                .withProperties(
                                    new BatchDeploymentProperties()
                                        .withDescription("jhfjxwm")
                                        .withEnvironmentId("kkfoqr")
                                        .withEnvironmentVariables(mapOf())
                                        .withProperties(mapOf())
                                        .withCompute("rtfudxepxg")
                                        .withErrorThreshold(682770513)
                                        .withLoggingLevel(BatchLoggingLevel.WARNING)
                                        .withMaxConcurrencyPerInstance(1825902686)
                                        .withMiniBatchSize(4744038705838577883L)
                                        .withOutputAction(BatchOutputAction.APPEND_ROW)
                                        .withOutputFileName("himdbl"))
                                .withSku(
                                    new Sku()
                                        .withName("zi")
                                        .withTier(SkuTier.BASIC)
                                        .withSize("wneaiv")
                                        .withFamily("czelpcirel")
                                        .withCapacity(561356651)),
                            new BatchDeploymentInner()
                                .withLocation("qogsexnevfd")
                                .withTags(mapOf("euzsoi", "wmewzsyy"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("q")
                                .withProperties(
                                    new BatchDeploymentProperties()
                                        .withDescription("ky")
                                        .withEnvironmentId("beddgssofw")
                                        .withEnvironmentVariables(mapOf())
                                        .withProperties(mapOf())
                                        .withCompute("hhyxxrw")
                                        .withErrorThreshold(324291601)
                                        .withLoggingLevel(BatchLoggingLevel.INFO)
                                        .withMaxConcurrencyPerInstance(381030924)
                                        .withMiniBatchSize(4370015191993628840L)
                                        .withOutputAction(BatchOutputAction.APPEND_ROW)
                                        .withOutputFileName("areqna"))
                                .withSku(
                                    new Sku()
                                        .withName("alkrmn")
                                        .withTier(SkuTier.BASIC)
                                        .withSize("xacqqudfnbyx")
                                        .withFamily("aabjyvayffimrz")
                                        .withCapacity(1007625802))));
        model = BinaryData.fromObject(model).toObject(BatchDeploymentTrackedResourceArmPaginatedResult.class);
        Assertions.assertEquals("byuqerpqlp", model.nextLink());
        Assertions.assertEquals("fpubjibwwi", model.value().get(0).location());
        Assertions.assertEquals("hqkvpuvksgplsak", model.value().get(0).tags().get("ynfs"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("dbutauvfbtkuwhh", model.value().get(0).kind());
        Assertions.assertEquals("suwsyrsnds", model.value().get(0).properties().description());
        Assertions.assertEquals("g", model.value().get(0).properties().environmentId());
        Assertions.assertEquals("ykojoxafnndlpic", model.value().get(0).properties().compute());
        Assertions.assertEquals(171305753, model.value().get(0).properties().errorThreshold());
        Assertions.assertEquals(BatchLoggingLevel.WARNING, model.value().get(0).properties().loggingLevel());
        Assertions.assertEquals(1638328793, model.value().get(0).properties().maxConcurrencyPerInstance());
        Assertions.assertEquals(8200965629156318432L, model.value().get(0).properties().miniBatchSize());
        Assertions.assertEquals(BatchOutputAction.APPEND_ROW, model.value().get(0).properties().outputAction());
        Assertions.assertEquals("pwdreqnovvqf", model.value().get(0).properties().outputFileName());
        Assertions.assertEquals("r", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, model.value().get(0).sku().tier());
        Assertions.assertEquals("neqn", model.value().get(0).sku().size());
        Assertions.assertEquals("rrwlquuijfqkace", model.value().get(0).sku().family());
        Assertions.assertEquals(2104888829, model.value().get(0).sku().capacity());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
