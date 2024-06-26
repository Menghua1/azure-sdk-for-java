// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BackupCriteria;
import com.azure.resourcemanager.dataprotection.models.BackupSchedule;
import com.azure.resourcemanager.dataprotection.models.RetentionTag;
import com.azure.resourcemanager.dataprotection.models.ScheduleBasedTriggerContext;
import com.azure.resourcemanager.dataprotection.models.TaggingCriteria;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScheduleBasedTriggerContextTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleBasedTriggerContext model = BinaryData.fromString(
            "{\"objectType\":\"ScheduleBasedTriggerContext\",\"schedule\":{\"repeatingTimeIntervals\":[\"gyvudtjuewbc\"],\"timeZone\":\"xuuwhcj\"},\"taggingCriteria\":[{\"criteria\":[{\"objectType\":\"BackupCriteria\"},{\"objectType\":\"BackupCriteria\"},{\"objectType\":\"BackupCriteria\"},{\"objectType\":\"BackupCriteria\"}],\"isDefault\":false,\"taggingPriority\":4402960897406815871,\"tagInfo\":{\"eTag\":\"ayakkudzpx\",\"id\":\"jplmagstcy\",\"tagName\":\"hpfkyrkdbdgi\"}},{\"criteria\":[{\"objectType\":\"BackupCriteria\"},{\"objectType\":\"BackupCriteria\"}],\"isDefault\":false,\"taggingPriority\":9049912645511706637,\"tagInfo\":{\"eTag\":\"wqjnob\",\"id\":\"yhddvia\",\"tagName\":\"egfnmntfpmvmemfn\"}}]}")
            .toObject(ScheduleBasedTriggerContext.class);
        Assertions.assertEquals("gyvudtjuewbc", model.schedule().repeatingTimeIntervals().get(0));
        Assertions.assertEquals("xuuwhcj", model.schedule().timeZone());
        Assertions.assertEquals(false, model.taggingCriteria().get(0).isDefault());
        Assertions.assertEquals(4402960897406815871L, model.taggingCriteria().get(0).taggingPriority());
        Assertions.assertEquals("hpfkyrkdbdgi", model.taggingCriteria().get(0).tagInfo().tagName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleBasedTriggerContext model = new ScheduleBasedTriggerContext()
            .withSchedule(
                new BackupSchedule().withRepeatingTimeIntervals(Arrays.asList("gyvudtjuewbc")).withTimeZone("xuuwhcj"))
            .withTaggingCriteria(Arrays.asList(
                new TaggingCriteria()
                    .withCriteria(Arrays.asList(new BackupCriteria(), new BackupCriteria(), new BackupCriteria(),
                        new BackupCriteria()))
                    .withIsDefault(false).withTaggingPriority(4402960897406815871L)
                    .withTagInfo(new RetentionTag().withTagName("hpfkyrkdbdgi")),
                new TaggingCriteria().withCriteria(Arrays.asList(new BackupCriteria(), new BackupCriteria()))
                    .withIsDefault(false).withTaggingPriority(9049912645511706637L)
                    .withTagInfo(new RetentionTag().withTagName("egfnmntfpmvmemfn"))));
        model = BinaryData.fromObject(model).toObject(ScheduleBasedTriggerContext.class);
        Assertions.assertEquals("gyvudtjuewbc", model.schedule().repeatingTimeIntervals().get(0));
        Assertions.assertEquals("xuuwhcj", model.schedule().timeZone());
        Assertions.assertEquals(false, model.taggingCriteria().get(0).isDefault());
        Assertions.assertEquals(4402960897406815871L, model.taggingCriteria().get(0).taggingPriority());
        Assertions.assertEquals("hpfkyrkdbdgi", model.taggingCriteria().get(0).tagInfo().tagName());
    }
}
