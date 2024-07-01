// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.Operation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"saedglubqtfcupj\",\"origin\":\"te\",\"display\":{\"description\":\"ujiqmksafjhtl\",\"provider\":\"kghtsfppjunk\",\"resource\":\"thkqnyvufvzrqa\",\"operation\":\"epc\"},\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"etasiji\",\"displayName\":\"qwomkzcmwqfd\",\"blobDuration\":\"pmvlfm\"},{\"name\":\"umjmpsxz\",\"displayName\":\"af\",\"blobDuration\":\"d\"},{\"name\":\"zporjhubzkzjazf\",\"displayName\":\"wvxq\",\"blobDuration\":\"n\"},{\"name\":\"sdgmoxnelhxhzfyz\",\"displayName\":\"kofcsvipwa\",\"blobDuration\":\"huctprgpmgtjvu\"}],\"metricSpecifications\":[{\"name\":\"fzcsklvtceaoi\",\"displayName\":\"rqlcdhebjfhp\",\"displayDescription\":\"wwesaqsuqpskv\",\"unit\":\"dlra\",\"aggregationType\":\"diathhxqs\",\"enableRegionalMdmAccount\":\"yleyopgy\",\"sourceMdmAccount\":\"rnyf\",\"sourceMdmNamespace\":\"oaomogkpcwffo\",\"availabilities\":[{},{}],\"dimensions\":[{},{}]},{\"name\":\"gjuzgqkx\",\"displayName\":\"avbteaegyojy\",\"displayDescription\":\"epcdhqjczh\",\"unit\":\"tlvujbh\",\"aggregationType\":\"szrhf\",\"enableRegionalMdmAccount\":\"ihkjj\",\"sourceMdmAccount\":\"itmuriizyrgzxpr\",\"sourceMdmNamespace\":\"wmasodsmj\",\"availabilities\":[{},{},{}],\"dimensions\":[{},{}]},{\"name\":\"mhrlgid\",\"displayName\":\"brdhuwcqn\",\"displayDescription\":\"pjd\",\"unit\":\"ienkliyfg\",\"aggregationType\":\"wky\",\"enableRegionalMdmAccount\":\"ndiybdoyyk\",\"sourceMdmAccount\":\"diandktwijoxkkyn\",\"sourceMdmNamespace\":\"qtxpjfo\",\"availabilities\":[{},{},{},{}],\"dimensions\":[{},{}]},{\"name\":\"kqq\",\"displayName\":\"imoinqzva\",\"displayDescription\":\"puggy\",\"unit\":\"chamwofqnttbk\",\"aggregationType\":\"gupxnu\",\"enableRegionalMdmAccount\":\"hguubpmvp\",\"sourceMdmAccount\":\"uiyogvafbdz\",\"sourceMdmNamespace\":\"plolcalyvcxv\",\"availabilities\":[{},{},{}],\"dimensions\":[{}]}]}}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Operation> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("saedglubqtfcupj", response.iterator().next().name());
        Assertions.assertEquals("te", response.iterator().next().origin());
        Assertions.assertEquals("ujiqmksafjhtl", response.iterator().next().display().description());
        Assertions.assertEquals("kghtsfppjunk", response.iterator().next().display().provider());
        Assertions.assertEquals("thkqnyvufvzrqa", response.iterator().next().display().resource());
        Assertions.assertEquals("epc", response.iterator().next().display().operation());
        Assertions.assertEquals("etasiji",
            response.iterator().next().serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("qwomkzcmwqfd",
            response.iterator().next().serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("pmvlfm",
            response.iterator().next().serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("fzcsklvtceaoi",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("rqlcdhebjfhp",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("wwesaqsuqpskv",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("dlra",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("diathhxqs",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("yleyopgy",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("rnyf",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("oaomogkpcwffo",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
    }
}
