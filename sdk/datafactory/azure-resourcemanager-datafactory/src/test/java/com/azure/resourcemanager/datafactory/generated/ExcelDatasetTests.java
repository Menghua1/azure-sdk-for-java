// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.ExcelDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExcelDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExcelDataset model = BinaryData.fromString(
            "{\"type\":\"Excel\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"datal\",\"fileName\":\"datalhhfi\",\"\":{\"yldqpzfzxsox\":\"datafculzjrmhpfyw\",\"cqsxytqqtcmiw\":\"datanunjlzkdr\"}},\"sheetName\":\"datais\",\"sheetIndex\":\"datamey\",\"range\":\"datajamca\",\"firstRowAsHeader\":\"datahftpzcrrykll\",\"compression\":{\"type\":\"datanqanhkigglclwal\",\"level\":\"dataubhg\",\"\":{\"alec\":\"dataetxdqcmyctajqzj\",\"egyxsbfpzvoik\":\"databibiwks\",\"pblalhhez\":\"datantwczfzwushlc\",\"qdsgptotxj\":\"datafkissaidqzsaa\"}},\"nullValue\":\"dataia\"},\"description\":\"nlrtbfijzz\",\"structure\":\"datao\",\"schema\":\"dataolbuauktwieope\",\"linkedServiceName\":{\"referenceName\":\"e\",\"parameters\":{\"kgxyxyauxre\":\"datadwrswyiljpi\"}},\"parameters\":{\"wytkujsqy\":{\"type\":\"SecureString\",\"defaultValue\":\"datacnlt\"}},\"annotations\":[\"dataoxfab\",\"dataqgpwbmwhr\"],\"folder\":{\"name\":\"iwrycgnwplrrb\"},\"\":{\"hqvumspbfs\":\"datatsbbibtic\",\"xmzrmtmvwitu\":\"dataeqbbewfcuqfpy\"}}")
            .toObject(ExcelDataset.class);
        Assertions.assertEquals("nlrtbfijzz", model.description());
        Assertions.assertEquals("e", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("wytkujsqy").type());
        Assertions.assertEquals("iwrycgnwplrrb", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExcelDataset model = new ExcelDataset().withDescription("nlrtbfijzz")
            .withStructure("datao")
            .withSchema("dataolbuauktwieope")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("e")
                .withParameters(mapOf("kgxyxyauxre", "datadwrswyiljpi")))
            .withParameters(mapOf("wytkujsqy",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datacnlt")))
            .withAnnotations(Arrays.asList("dataoxfab", "dataqgpwbmwhr"))
            .withFolder(new DatasetFolder().withName("iwrycgnwplrrb"))
            .withLocation(new DatasetLocation().withFolderPath("datal")
                .withFileName("datalhhfi")
                .withAdditionalProperties(mapOf("type", "DatasetLocation")))
            .withSheetName("datais")
            .withSheetIndex("datamey")
            .withRange("datajamca")
            .withFirstRowAsHeader("datahftpzcrrykll")
            .withCompression(new DatasetCompression().withType("datanqanhkigglclwal")
                .withLevel("dataubhg")
                .withAdditionalProperties(mapOf()))
            .withNullValue("dataia");
        model = BinaryData.fromObject(model).toObject(ExcelDataset.class);
        Assertions.assertEquals("nlrtbfijzz", model.description());
        Assertions.assertEquals("e", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("wytkujsqy").type());
        Assertions.assertEquals("iwrycgnwplrrb", model.folder().name());
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
