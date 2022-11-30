// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.ExecuteScriptActionParameters;
import com.azure.resourcemanager.hdinsight.models.RuntimeScriptAction;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ExecuteScriptActionParametersTests {
    @Test
    public void testDeserialize() {
        ExecuteScriptActionParameters model =
            BinaryData
                .fromString(
                    "{\"scriptActions\":[{\"name\":\"hmtnvy\",\"uri\":\"iatkzwpcnp\",\"parameters\":\"cjaesgvvs\",\"roles\":[\"yajguqfhwygzlv\",\"nk\"],\"applicationName\":\"usemdwzrmuhap\"},{\"name\":\"cqdpsqxqvpsvuoym\",\"uri\":\"ccelve\",\"parameters\":\"ypql\",\"roles\":[\"eokerqwkyhkobopg\"],\"applicationName\":\"dkow\"},{\"name\":\"pbqpcrfkbwccsn\",\"uri\":\"vcdwxlpqekftn\",\"parameters\":\"tjsyin\",\"roles\":[\"fq\",\"tmtdhtmdvypgik\"],\"applicationName\":\"szywkbirryu\"}],\"persistOnSuccess\":true}")
                .toObject(ExecuteScriptActionParameters.class);
        Assertions.assertEquals("hmtnvy", model.scriptActions().get(0).name());
        Assertions.assertEquals("iatkzwpcnp", model.scriptActions().get(0).uri());
        Assertions.assertEquals("cjaesgvvs", model.scriptActions().get(0).parameters());
        Assertions.assertEquals("yajguqfhwygzlv", model.scriptActions().get(0).roles().get(0));
        Assertions.assertEquals(true, model.persistOnSuccess());
    }

    @Test
    public void testSerialize() {
        ExecuteScriptActionParameters model =
            new ExecuteScriptActionParameters()
                .withScriptActions(
                    Arrays
                        .asList(
                            new RuntimeScriptAction()
                                .withName("hmtnvy")
                                .withUri("iatkzwpcnp")
                                .withParameters("cjaesgvvs")
                                .withRoles(Arrays.asList("yajguqfhwygzlv", "nk")),
                            new RuntimeScriptAction()
                                .withName("cqdpsqxqvpsvuoym")
                                .withUri("ccelve")
                                .withParameters("ypql")
                                .withRoles(Arrays.asList("eokerqwkyhkobopg")),
                            new RuntimeScriptAction()
                                .withName("pbqpcrfkbwccsn")
                                .withUri("vcdwxlpqekftn")
                                .withParameters("tjsyin")
                                .withRoles(Arrays.asList("fq", "tmtdhtmdvypgik"))))
                .withPersistOnSuccess(true);
        model = BinaryData.fromObject(model).toObject(ExecuteScriptActionParameters.class);
        Assertions.assertEquals("hmtnvy", model.scriptActions().get(0).name());
        Assertions.assertEquals("iatkzwpcnp", model.scriptActions().get(0).uri());
        Assertions.assertEquals("cjaesgvvs", model.scriptActions().get(0).parameters());
        Assertions.assertEquals("yajguqfhwygzlv", model.scriptActions().get(0).roles().get(0));
        Assertions.assertEquals(true, model.persistOnSuccess());
    }
}