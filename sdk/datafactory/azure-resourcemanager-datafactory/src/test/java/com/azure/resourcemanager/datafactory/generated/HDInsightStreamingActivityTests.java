// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.HDInsightStreamingActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HDInsightStreamingActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HDInsightStreamingActivity model = BinaryData.fromString(
            "{\"type\":\"HDInsightStreaming\",\"typeProperties\":{\"storageLinkedServices\":[{\"referenceName\":\"gkxtgs\",\"parameters\":{\"puds\":\"datanholkoyxm\",\"xs\":\"datawvzunrqvup\",\"moftilhoye\":\"datanqzdfjwofgzif\",\"dircdtkvorif\":\"datahwaepg\"}},{\"referenceName\":\"qmfvzubmhsxtryy\",\"parameters\":{\"vturdh\":\"datammu\",\"zwmpt\":\"datanmhr\"}},{\"referenceName\":\"ygqztnbvueiz\",\"parameters\":{\"tbyiyeig\":\"datagqxekbvwxyumqoqw\",\"nhqxzewlwwdmpvpc\":\"datagrzvegxmx\"}}],\"arguments\":[\"dataovzkwhdtf\",\"datavfctsfujdapc\",\"datagamgbnktg\"],\"getDebugInfo\":\"Always\",\"mapper\":\"datadydb\",\"reducer\":\"datatexkwcolnaer\",\"input\":\"datasdyvah\",\"output\":\"dataidpc\",\"filePaths\":[\"datavnzhdsaqmekgt\",\"dataojrruhzvve\",\"datarwl\"],\"fileLinkedService\":{\"referenceName\":\"snlmdosiyzf\",\"parameters\":{\"aekcpum\":\"datazkggbmzdnyrmol\",\"sakoucssc\":\"datakc\"}},\"combiner\":\"dataqilzogilgr\",\"commandEnvironment\":[\"dataypwhfybflrpvcgq\"],\"defines\":{\"fjkxxn\":\"dataksghpsqvuisedeqr\",\"vwxvlsvicvpa\":\"datarqdxvbt\",\"emlozjyovrllv\":\"datawohkromzs\",\"ez\":\"databgkgjp\"}},\"linkedServiceName\":{\"referenceName\":\"flgps\",\"parameters\":{\"wzpfbiqjrz\":\"datanan\",\"jzknkffzdyozn\":\"datarxizorqliblybx\",\"dedlmfw\":\"datadsto\"}},\"policy\":{\"timeout\":\"datagfwebiwxm\",\"retry\":\"dataxidazslwhuyikh\",\"retryIntervalInSeconds\":1550086880,\"secureInput\":false,\"secureOutput\":true,\"\":{\"qrdvqvaloauuwoi\":\"datakpfperheiplzmsw\",\"myomavbotaoaix\":\"dataofumbpmzedmfjgk\",\"infy\":\"datapcw\"}},\"name\":\"tqvjn\",\"description\":\"mqwut\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"wraow\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Succeeded\",\"Failed\"],\"\":{\"dhwoyznjddshazl\":\"datajdmwcxvcronr\",\"otniqzqmpgvy\":\"datamvxvip\",\"fftszsw\":\"datadjwwbrhjhcw\",\"ghjgvhgyeoikxjpu\":\"datay\"}},{\"activity\":\"ggpsaqfn\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Failed\",\"Failed\"],\"\":{\"legtsqz\":\"datau\"}},{\"activity\":\"zworuhh\",\"dependencyConditions\":[\"Failed\",\"Succeeded\",\"Completed\",\"Completed\"],\"\":{\"gpnxu\":\"datahfxb\"}}],\"userProperties\":[{\"name\":\"gpznbklhwutyuvu\",\"value\":\"dataq\"},{\"name\":\"rfziubeflvktjbmc\",\"value\":\"dataplnukdawgzhbwh\"},{\"name\":\"vonuhv\",\"value\":\"datagxck\"}],\"\":{\"ocothsgxjc\":\"datao\"}}")
            .toObject(HDInsightStreamingActivity.class);
        Assertions.assertEquals("tqvjn", model.name());
        Assertions.assertEquals("mqwut", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("wraow", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gpznbklhwutyuvu", model.userProperties().get(0).name());
        Assertions.assertEquals("flgps", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1550086880, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("gkxtgs", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.ALWAYS, model.getDebugInfo());
        Assertions.assertEquals("snlmdosiyzf", model.fileLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HDInsightStreamingActivity model = new HDInsightStreamingActivity().withName("tqvjn")
            .withDescription("mqwut")
            .withState(ActivityState.ACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("wraow")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.SKIPPED,
                        DependencyCondition.SUCCEEDED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("ggpsaqfn")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SKIPPED,
                        DependencyCondition.FAILED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("zworuhh")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED, DependencyCondition.SUCCEEDED,
                        DependencyCondition.COMPLETED, DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("gpznbklhwutyuvu").withValue("dataq"),
                new UserProperty().withName("rfziubeflvktjbmc").withValue("dataplnukdawgzhbwh"),
                new UserProperty().withName("vonuhv").withValue("datagxck")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("flgps")
                .withParameters(
                    mapOf("wzpfbiqjrz", "datanan", "jzknkffzdyozn", "datarxizorqliblybx", "dedlmfw", "datadsto")))
            .withPolicy(new ActivityPolicy().withTimeout("datagfwebiwxm")
                .withRetry("dataxidazslwhuyikh")
                .withRetryIntervalInSeconds(1550086880)
                .withSecureInput(false)
                .withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withStorageLinkedServices(Arrays.asList(
                new LinkedServiceReference().withReferenceName("gkxtgs")
                    .withParameters(mapOf("puds", "datanholkoyxm", "xs", "datawvzunrqvup", "moftilhoye",
                        "datanqzdfjwofgzif", "dircdtkvorif", "datahwaepg")),
                new LinkedServiceReference().withReferenceName("qmfvzubmhsxtryy")
                    .withParameters(mapOf("vturdh", "datammu", "zwmpt", "datanmhr")),
                new LinkedServiceReference().withReferenceName("ygqztnbvueiz")
                    .withParameters(mapOf("tbyiyeig", "datagqxekbvwxyumqoqw", "nhqxzewlwwdmpvpc", "datagrzvegxmx"))))
            .withArguments(Arrays.asList("dataovzkwhdtf", "datavfctsfujdapc", "datagamgbnktg"))
            .withGetDebugInfo(HDInsightActivityDebugInfoOption.ALWAYS)
            .withMapper("datadydb")
            .withReducer("datatexkwcolnaer")
            .withInput("datasdyvah")
            .withOutput("dataidpc")
            .withFilePaths(Arrays.asList("datavnzhdsaqmekgt", "dataojrruhzvve", "datarwl"))
            .withFileLinkedService(new LinkedServiceReference().withReferenceName("snlmdosiyzf")
                .withParameters(mapOf("aekcpum", "datazkggbmzdnyrmol", "sakoucssc", "datakc")))
            .withCombiner("dataqilzogilgr")
            .withCommandEnvironment(Arrays.asList("dataypwhfybflrpvcgq"))
            .withDefines(mapOf("fjkxxn", "dataksghpsqvuisedeqr", "vwxvlsvicvpa", "datarqdxvbt", "emlozjyovrllv",
                "datawohkromzs", "ez", "databgkgjp"));
        model = BinaryData.fromObject(model).toObject(HDInsightStreamingActivity.class);
        Assertions.assertEquals("tqvjn", model.name());
        Assertions.assertEquals("mqwut", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("wraow", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gpznbklhwutyuvu", model.userProperties().get(0).name());
        Assertions.assertEquals("flgps", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1550086880, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("gkxtgs", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.ALWAYS, model.getDebugInfo());
        Assertions.assertEquals("snlmdosiyzf", model.fileLinkedService().referenceName());
    }

    // Use "Map.of" if available
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
