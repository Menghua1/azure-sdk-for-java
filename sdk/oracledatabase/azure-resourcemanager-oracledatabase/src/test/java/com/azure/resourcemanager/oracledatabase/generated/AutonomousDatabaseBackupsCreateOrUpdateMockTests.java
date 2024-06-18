// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseBackup;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseBackupProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AutonomousDatabaseBackupsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"autonomousDatabaseOcid\":\"mxswvruunzz\",\"databaseSizeInTbs\":77.25669415562001,\"dbVersion\":\"fkimrtix\",\"displayName\":\"ffqyinlj\",\"ocid\":\"pqwhixmonst\",\"isAutomatic\":false,\"isRestorable\":true,\"lifecycleDetails\":\"velfcldu\",\"lifecycleState\":\"Deleting\",\"retentionPeriodInDays\":667519337,\"sizeInTbs\":18.709508916398665,\"timeAvailableTil\":\"2021-01-25T09:33:02Z\",\"timeStarted\":\"o\",\"timeEnded\":\"egstmninwjizci\",\"backupType\":\"Full\",\"provisioningState\":\"Succeeded\"},\"id\":\"h\",\"name\":\"jjtbxqmuluxlxqz\",\"type\":\"nersb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AutonomousDatabaseBackup response = manager.autonomousDatabaseBackups()
            .define("crpfbcunez")
            .withExistingAutonomousDatabase("ostbzbkiwb", "qnyophzfyls")
            .withProperties(
                new AutonomousDatabaseBackupProperties().withDisplayName("aylp").withRetentionPeriodInDays(754983653))
            .create();

        Assertions.assertEquals("ffqyinlj", response.properties().displayName());
        Assertions.assertEquals(667519337, response.properties().retentionPeriodInDays());
    }
}
