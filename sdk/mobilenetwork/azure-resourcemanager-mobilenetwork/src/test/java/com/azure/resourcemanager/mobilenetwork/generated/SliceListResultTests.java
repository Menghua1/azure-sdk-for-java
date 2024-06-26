// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SliceInner;
import com.azure.resourcemanager.mobilenetwork.models.SliceListResult;
import com.azure.resourcemanager.mobilenetwork.models.Snssai;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SliceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SliceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleted\",\"snssai\":{\"sst\":822408153,\"sd\":\"nwm\"},\"description\":\"mvpdvjdhttzaef\"},\"location\":\"x\",\"tags\":{\"dfzpbgtgkylkdg\":\"hrphkmcrjdqn\"},\"id\":\"rjeuut\",\"name\":\"wxezwzhok\",\"type\":\"bwnhhtql\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"snssai\":{\"sst\":2037950734,\"sd\":\"pipifh\"},\"description\":\"e\"},\"location\":\"jvgcxtx\",\"tags\":{\"gsresmkssj\":\"heafidlt\",\"tillucbiqtg\":\"oiftxfkfwegprh\"},\"id\":\"q\",\"name\":\"hm\",\"type\":\"wsldrizetpwbr\"},{\"properties\":{\"provisioningState\":\"Unknown\",\"snssai\":{\"sst\":1155046174,\"sd\":\"bphbqzmizakakank\"},\"description\":\"dnjzh\"},\"location\":\"oylhjlmuoyxprimr\",\"tags\":{\"asylwx\":\"teecjmeislst\",\"eoohguufuzboyj\":\"zaum\"},\"id\":\"thwtzol\",\"name\":\"a\",\"type\":\"mwmdxmebwjscjpa\"},{\"properties\":{\"provisioningState\":\"Unknown\",\"snssai\":{\"sst\":1860405842,\"sd\":\"a\"},\"description\":\"qxnmwmqt\"},\"location\":\"xyi\",\"tags\":{\"mrsieekp\":\"tvqcttadijaeu\"},\"id\":\"dzaapmudqme\",\"name\":\"wig\",\"type\":\"ibudqwy\"}],\"nextLink\":\"beybpmzznrtffyaq\"}")
            .toObject(SliceListResult.class);
        Assertions.assertEquals("x", model.value().get(0).location());
        Assertions.assertEquals("hrphkmcrjdqn", model.value().get(0).tags().get("dfzpbgtgkylkdg"));
        Assertions.assertEquals(822408153, model.value().get(0).snssai().sst());
        Assertions.assertEquals("nwm", model.value().get(0).snssai().sd());
        Assertions.assertEquals("mvpdvjdhttzaef", model.value().get(0).description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SliceListResult model = new SliceListResult().withValue(Arrays.asList(
            new SliceInner().withLocation("x")
                .withTags(mapOf("dfzpbgtgkylkdg", "hrphkmcrjdqn"))
                .withSnssai(new Snssai().withSst(822408153).withSd("nwm"))
                .withDescription("mvpdvjdhttzaef"),
            new SliceInner().withLocation("jvgcxtx")
                .withTags(mapOf("gsresmkssj", "heafidlt", "tillucbiqtg", "oiftxfkfwegprh"))
                .withSnssai(new Snssai().withSst(2037950734).withSd("pipifh"))
                .withDescription("e"),
            new SliceInner().withLocation("oylhjlmuoyxprimr")
                .withTags(mapOf("asylwx", "teecjmeislst", "eoohguufuzboyj", "zaum"))
                .withSnssai(new Snssai().withSst(1155046174).withSd("bphbqzmizakakank"))
                .withDescription("dnjzh"),
            new SliceInner().withLocation("xyi")
                .withTags(mapOf("mrsieekp", "tvqcttadijaeu"))
                .withSnssai(new Snssai().withSst(1860405842).withSd("a"))
                .withDescription("qxnmwmqt")));
        model = BinaryData.fromObject(model).toObject(SliceListResult.class);
        Assertions.assertEquals("x", model.value().get(0).location());
        Assertions.assertEquals("hrphkmcrjdqn", model.value().get(0).tags().get("dfzpbgtgkylkdg"));
        Assertions.assertEquals(822408153, model.value().get(0).snssai().sst());
        Assertions.assertEquals("nwm", model.value().get(0).snssai().sd());
        Assertions.assertEquals("mvpdvjdhttzaef", model.value().get(0).description());
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
