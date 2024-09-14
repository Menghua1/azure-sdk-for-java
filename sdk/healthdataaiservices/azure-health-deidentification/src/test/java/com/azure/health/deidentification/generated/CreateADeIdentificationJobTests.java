// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.deidentification.generated;

import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import com.azure.health.deidentification.models.DeidentificationJob;
import com.azure.health.deidentification.models.DocumentDataType;
import com.azure.health.deidentification.models.OperationType;
import com.azure.health.deidentification.models.SourceStorageLocation;
import com.azure.health.deidentification.models.TargetStorageLocation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class CreateADeIdentificationJobTests extends DeidentificationClientTestBase {
    @Test
    @Disabled
    public void testCreateADeIdentificationJobTests() {
        // method invocation
        SyncPoller<DeidentificationJob, DeidentificationJob> response = setPlaybackSyncPollerPollInterval(
            deidentificationClient.beginCreateJob("documents_smith_1", new DeidentificationJob(
                new SourceStorageLocation(
                    "https://blobtest.blob.core.windows.net/container?sp=r&st=2024-01-24T18:11:10Z&se=2024-01-25T02:11:10Z&spr=https&sv=2022-11-02&sr=c&sig=signature%3D",
                    "/documents").setExtensions(Arrays.asList("*")),
                new TargetStorageLocation(
                    "https://blobtest.blob.core.windows.net/container?sp=r&st=2024-01-24T18:11:10Z&se=2024-01-25T02:11:10Z&spr=https&sv=2022-11-02&sr=c&sig=signature%3D",
                    "/documents"))
                .setOperation(OperationType.REDACT)
                .setDataType(DocumentDataType.PLAINTEXT)
                .setRedactionFormat("[{type}]")));

        // response assertion
        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED,
            response.waitForCompletion().getStatus());
    }
}
