// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.azure.resourcemanager.datafactory.models.HttpDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HttpDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpDataset model = BinaryData.fromString(
            "{\"type\":\"HttpFile\",\"typeProperties\":{\"relativeUrl\":\"dataqnl\",\"requestMethod\":\"dataxc\",\"requestBody\":\"datanitodmrahj\",\"additionalHeaders\":\"datadodnvltcvmah\",\"format\":{\"type\":\"DatasetStorageFormat\",\"serializer\":\"datakupbbnhiclhyzhr\",\"deserializer\":\"datadfwbifnnhlsf\",\"\":{\"fijtezgxmp\":\"dataimtfcqmmynbrpel\",\"ivczktllxswtdap\":\"dataszamadlerzinf\",\"xcevdspth\":\"datamirmnrijefmrt\"}},\"compression\":{\"type\":\"datafmwtblgm\",\"level\":\"datakqoikxiefwln\",\"\":{\"cotelikjiyteh\":\"dataffcnuestbsliejdn\",\"gncrdorcty\":\"dataxtzxqdwbymuql\",\"mmwckozvlf\":\"dataecpekhxdbyhqtzcv\"}}},\"description\":\"trtsvx\",\"structure\":\"dataqtzckjbcbkgnrf\",\"schema\":\"dataschjxncqzah\",\"linkedServiceName\":{\"referenceName\":\"tvbgdobi\",\"parameters\":{\"sgihtrxueqbmxqf\":\"datazolx\"}},\"parameters\":{\"shesgcsqose\":{\"type\":\"Object\",\"defaultValue\":\"dataqs\"},\"spfyvslazip\":{\"type\":\"Float\",\"defaultValue\":\"datangoufpizpbmfx\"},\"i\":{\"type\":\"Object\",\"defaultValue\":\"datagtdumjty\"}},\"annotations\":[\"dataznlaxozqthk\",\"dataxfugfzizyxd\"],\"folder\":{\"name\":\"nqzbrq\"},\"\":{\"amnsbqoitwhmucj\":\"datamfckviyju\"}}")
            .toObject(HttpDataset.class);
        Assertions.assertEquals("trtsvx", model.description());
        Assertions.assertEquals("tvbgdobi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("shesgcsqose").type());
        Assertions.assertEquals("nqzbrq", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpDataset model = new HttpDataset().withDescription("trtsvx")
            .withStructure("dataqtzckjbcbkgnrf")
            .withSchema("dataschjxncqzah")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("tvbgdobi")
                .withParameters(mapOf("sgihtrxueqbmxqf", "datazolx")))
            .withParameters(mapOf("shesgcsqose",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataqs"), "spfyvslazip",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datangoufpizpbmfx"), "i",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datagtdumjty")))
            .withAnnotations(Arrays.asList("dataznlaxozqthk", "dataxfugfzizyxd"))
            .withFolder(new DatasetFolder().withName("nqzbrq"))
            .withRelativeUrl("dataqnl")
            .withRequestMethod("dataxc")
            .withRequestBody("datanitodmrahj")
            .withAdditionalHeaders("datadodnvltcvmah")
            .withFormat(new DatasetStorageFormat().withSerializer("datakupbbnhiclhyzhr")
                .withDeserializer("datadfwbifnnhlsf")
                .withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
            .withCompression(new DatasetCompression().withType("datafmwtblgm")
                .withLevel("datakqoikxiefwln")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(HttpDataset.class);
        Assertions.assertEquals("trtsvx", model.description());
        Assertions.assertEquals("tvbgdobi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("shesgcsqose").type());
        Assertions.assertEquals("nqzbrq", model.folder().name());
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
