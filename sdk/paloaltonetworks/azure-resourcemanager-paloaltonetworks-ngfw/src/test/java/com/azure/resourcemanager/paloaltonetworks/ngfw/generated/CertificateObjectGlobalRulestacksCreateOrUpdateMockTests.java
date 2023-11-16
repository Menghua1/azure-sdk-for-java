// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.CertificateObjectGlobalRulestackResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.CertificateObjectGlobalRulestackResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CertificateObjectGlobalRulestacksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"certificateSignerResourceId\":\"xpunjqi\",\"certificateSelfSigned\":\"TRUE\",\"auditComment\":\"vvi\",\"description\":\"cgx\",\"etag\":\"csserxht\",\"provisioningState\":\"Succeeded\"},\"id\":\"hlwntsjgq\",\"name\":\"sxypruuu\",\"type\":\"bnchrsziz\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        PaloAltoNetworksNgfwManager manager = PaloAltoNetworksNgfwManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CertificateObjectGlobalRulestackResource response
            = manager.certificateObjectGlobalRulestacks().createOrUpdate("fvcl", "lxnfuijtkbusqogs",
                new CertificateObjectGlobalRulestackResourceInner().withCertificateSignerResourceId("kayi")
                    .withCertificateSelfSigned(BooleanEnum.FALSE).withAuditComment("haru").withDescription("ji")
                    .withEtag("fzyjqt"),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xpunjqi", response.certificateSignerResourceId());
        Assertions.assertEquals(BooleanEnum.TRUE, response.certificateSelfSigned());
        Assertions.assertEquals("vvi", response.auditComment());
        Assertions.assertEquals("cgx", response.description());
        Assertions.assertEquals("csserxht", response.etag());
    }
}
