// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobStorageWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class AzureBlobStorageWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobStorageWriteSettings model = BinaryData.fromString(
            "{\"type\":\"AzureBlobStorageWriteSettings\",\"blockSizeInMB\":\"datadcokbpbpqe\",\"maxConcurrentConnections\":\"dataszobtneltnby\",\"disableMetricsCollection\":\"datagrdrum\",\"copyBehavior\":\"datau\",\"metadata\":[{\"name\":\"datadsybiazfvxdkwvc\",\"value\":\"datalyxbyqqonkrekioj\"}],\"\":{\"yykx\":\"datadodkukycntaov\"}}")
            .toObject(AzureBlobStorageWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobStorageWriteSettings model
            = new AzureBlobStorageWriteSettings().withMaxConcurrentConnections("dataszobtneltnby")
                .withDisableMetricsCollection("datagrdrum")
                .withCopyBehavior("datau")
                .withMetadata(
                    Arrays.asList(new MetadataItem().withName("datadsybiazfvxdkwvc").withValue("datalyxbyqqonkrekioj")))
                .withBlockSizeInMB("datadcokbpbpqe");
        model = BinaryData.fromObject(model).toObject(AzureBlobStorageWriteSettings.class);
    }
}
