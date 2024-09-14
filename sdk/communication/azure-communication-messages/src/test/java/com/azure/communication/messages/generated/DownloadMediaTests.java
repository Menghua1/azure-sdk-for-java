// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.communication.messages.generated;

import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class DownloadMediaTests extends NotificationMessagesClientTestBase {
    @Test
    @Disabled
    public void testDownloadMediaTests() {
        // method invocation
        BinaryData response = notificationMessagesClient.downloadMedia("d19e68ec-bdd6-4a50-8dfb-cbb1642df6ab");

        // response assertion
        Assertions.assertNotNull(response);
    }
}
