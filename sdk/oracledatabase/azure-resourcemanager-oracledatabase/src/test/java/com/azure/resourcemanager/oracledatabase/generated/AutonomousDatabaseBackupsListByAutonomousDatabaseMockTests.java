// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseBackup;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AutonomousDatabaseBackupsListByAutonomousDatabaseMockTests {
    @Test
    public void testListByAutonomousDatabase() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"autonomousDatabaseOcid\":\"hlnymzotq\",\"databaseSizeInTbs\":81.11026050091202,\"dbVersion\":\"cbm\",\"displayName\":\"vxmvw\",\"ocid\":\"tayx\",\"isAutomatic\":false,\"isRestorable\":false,\"lifecycleDetails\":\"ujlzqnhcvsqltn\",\"lifecycleState\":\"Failed\",\"retentionPeriodInDays\":643755351,\"sizeInTbs\":97.43360909372558,\"timeAvailableTil\":\"2021-03-11T11:00:33Z\",\"timeStarted\":\"yqo\",\"timeEnded\":\"p\",\"backupType\":\"LongTerm\",\"provisioningState\":\"Canceled\"},\"id\":\"fdbxiqxeiiqbim\",\"name\":\"tmwwi\",\"type\":\"h\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AutonomousDatabaseBackup> response = manager.autonomousDatabaseBackups()
            .listByAutonomousDatabase("lvgsgzwywakoih", "nsmjbl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vxmvw", response.iterator().next().properties().displayName());
        Assertions.assertEquals(643755351, response.iterator().next().properties().retentionPeriodInDays());
    }
}
