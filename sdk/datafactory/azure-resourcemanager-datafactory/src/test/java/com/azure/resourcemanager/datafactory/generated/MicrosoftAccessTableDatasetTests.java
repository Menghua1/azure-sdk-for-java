// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MicrosoftAccessTableDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MicrosoftAccessTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MicrosoftAccessTableDataset model = BinaryData.fromString(
            "{\"type\":\"MicrosoftAccessTable\",\"typeProperties\":{\"tableName\":\"datamotahbqsvnk\"},\"description\":\"ytzuaedrl\",\"structure\":\"datagc\",\"schema\":\"datayrhkvxzzmiem\",\"linkedServiceName\":{\"referenceName\":\"yftgpqoswgfqv\",\"parameters\":{\"qyhls\":\"datahpak\",\"jm\":\"datarnfbmeqagkn\",\"mqmbwpp\":\"databnyevztnjawrhule\",\"xjucl\":\"datairxbkitzmnhit\"}},\"parameters\":{\"gdzdvyljubvfj\":{\"type\":\"Bool\",\"defaultValue\":\"datagcem\"},\"difnivlutgg\":{\"type\":\"String\",\"defaultValue\":\"dataf\"},\"oiyygkts\":{\"type\":\"Object\",\"defaultValue\":\"datacxauhvcgzxhklsqx\"}},\"annotations\":[\"dataxxoxwfzbkv\"],\"folder\":{\"name\":\"xfxp\"},\"\":{\"wm\":\"datawbebsnbwutlv\",\"ustihtgrafjajvky\":\"datau\",\"derjennmk\":\"datammjczvog\"}}")
            .toObject(MicrosoftAccessTableDataset.class);
        Assertions.assertEquals("ytzuaedrl", model.description());
        Assertions.assertEquals("yftgpqoswgfqv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("gdzdvyljubvfj").type());
        Assertions.assertEquals("xfxp", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MicrosoftAccessTableDataset model = new MicrosoftAccessTableDataset().withDescription("ytzuaedrl")
            .withStructure("datagc")
            .withSchema("datayrhkvxzzmiem")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("yftgpqoswgfqv")
                .withParameters(mapOf("qyhls", "datahpak", "jm", "datarnfbmeqagkn", "mqmbwpp", "databnyevztnjawrhule",
                    "xjucl", "datairxbkitzmnhit")))
            .withParameters(mapOf("gdzdvyljubvfj",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datagcem"), "difnivlutgg",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataf"), "oiyygkts",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datacxauhvcgzxhklsqx")))
            .withAnnotations(Arrays.asList("dataxxoxwfzbkv"))
            .withFolder(new DatasetFolder().withName("xfxp"))
            .withTableName("datamotahbqsvnk");
        model = BinaryData.fromObject(model).toObject(MicrosoftAccessTableDataset.class);
        Assertions.assertEquals("ytzuaedrl", model.description());
        Assertions.assertEquals("yftgpqoswgfqv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("gdzdvyljubvfj").type());
        Assertions.assertEquals("xfxp", model.folder().name());
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
