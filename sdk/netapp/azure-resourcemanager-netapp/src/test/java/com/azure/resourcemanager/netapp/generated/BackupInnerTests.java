// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import org.junit.jupiter.api.Assertions;

public final class BackupInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"cqqudf\",\"properties\":{\"backupId\":\"yxbaaabjyvayf\",\"creationDate\":\"2021-07-23T05:30:54Z\",\"provisioningState\":\"zrtuzq\",\"size\":1189193758157462805,\"label\":\"nevfdnw\",\"backupType\":\"Manual\",\"failureReason\":\"wzsyyceuzs\",\"volumeName\":\"bjudpfrxtrthzv\",\"useExistingSnapshot\":false},\"id\":\"dwkqbrq\",\"name\":\"bpaxhexiilivpdt\",\"type\":\"irqtdqoa\"}")
                .toObject(BackupInner.class);
        Assertions.assertEquals("cqqudf", model.location());
        Assertions.assertEquals("nevfdnw", model.label());
        Assertions.assertEquals(false, model.useExistingSnapshot());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupInner model =
            new BackupInner().withLocation("cqqudf").withLabel("nevfdnw").withUseExistingSnapshot(false);
        model = BinaryData.fromObject(model).toObject(BackupInner.class);
        Assertions.assertEquals("cqqudf", model.location());
        Assertions.assertEquals("nevfdnw", model.label());
        Assertions.assertEquals(false, model.useExistingSnapshot());
    }
}
