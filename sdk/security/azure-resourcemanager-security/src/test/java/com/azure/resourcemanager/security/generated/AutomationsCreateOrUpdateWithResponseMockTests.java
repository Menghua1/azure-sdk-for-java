// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.Automation;
import com.azure.resourcemanager.security.models.AutomationAction;
import com.azure.resourcemanager.security.models.AutomationRuleSet;
import com.azure.resourcemanager.security.models.AutomationScope;
import com.azure.resourcemanager.security.models.AutomationSource;
import com.azure.resourcemanager.security.models.EventSource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AutomationsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"y\",\"isEnabled\":true,\"scopes\":[{\"description\":\"cjfa\",\"scopePath\":\"ulp\"},{\"description\":\"akrxi\",\"scopePath\":\"nf\"},{\"description\":\"rxsqtz\",\"scopePath\":\"xbsalewg\"}],\"sources\":[{\"eventSource\":\"AttackPathsSnapshot\",\"ruleSets\":[{}]},{\"eventSource\":\"SubAssessments\",\"ruleSets\":[{},{},{},{}]},{\"eventSource\":\"RegulatoryComplianceAssessmentSnapshot\",\"ruleSets\":[{},{},{},{}]},{\"eventSource\":\"AttackPaths\",\"ruleSets\":[{},{},{}]}],\"actions\":[{\"actionType\":\"AutomationAction\"},{\"actionType\":\"AutomationAction\"},{\"actionType\":\"AutomationAction\"},{\"actionType\":\"AutomationAction\"}]},\"location\":\"saangfgbmcvmh\",\"tags\":{\"eonmzrjjaojp\":\"liuajklnacgdnx\",\"udd\":\"ngdrzigecwsadsq\",\"hheuyuun\":\"hwqdm\"},\"id\":\"myevyigdeipn\",\"name\":\"izej\",\"type\":\"li\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Automation response = manager.automations()
            .define("kbuud")
            .withRegion("efxli")
            .withExistingResourceGroup("nqbjxgjwsrer")
            .withTags(mapOf("smhssfnwh", "ot", "nfmkcuft", "kahhec", "dvhzfkdn", "dgwuzron", "k", "ysodcikgx"))
            .withDescription("wkwkjxlaacedikqe")
            .withIsEnabled(false)
            .withScopes(Arrays.asList(new AutomationScope().withDescription("bevgbn").withScopePath("mmkiqhypwtmzy"),
                new AutomationScope().withDescription("yut").withScopePath("zql"),
                new AutomationScope().withDescription("agwiijc").withScopePath("iywhxpsb")))
            .withSources(Arrays.asList(
                new AutomationSource().withEventSource(EventSource.ASSESSMENTS)
                    .withRuleSets(Arrays.asList(new AutomationRuleSet(), new AutomationRuleSet(),
                        new AutomationRuleSet(), new AutomationRuleSet())),
                new AutomationSource().withEventSource(EventSource.ASSESSMENTS)
                    .withRuleSets(Arrays.asList(new AutomationRuleSet())),
                new AutomationSource().withEventSource(EventSource.SECURE_SCORE_CONTROLS)
                    .withRuleSets(Arrays.asList(new AutomationRuleSet(), new AutomationRuleSet(),
                        new AutomationRuleSet(), new AutomationRuleSet()))))
            .withActions(Arrays.asList(new AutomationAction(), new AutomationAction(), new AutomationAction()))
            .create();

        Assertions.assertEquals("saangfgbmcvmh", response.location());
        Assertions.assertEquals("liuajklnacgdnx", response.tags().get("eonmzrjjaojp"));
        Assertions.assertEquals("y", response.description());
        Assertions.assertEquals(true, response.isEnabled());
        Assertions.assertEquals("cjfa", response.scopes().get(0).description());
        Assertions.assertEquals("ulp", response.scopes().get(0).scopePath());
        Assertions.assertEquals(EventSource.ATTACK_PATHS_SNAPSHOT, response.sources().get(0).eventSource());
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
