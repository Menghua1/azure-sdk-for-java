// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.WebPubSubResourceInner;
import com.azure.resourcemanager.webpubsub.models.AclAction;
import com.azure.resourcemanager.webpubsub.models.IpRule;
import com.azure.resourcemanager.webpubsub.models.LiveTraceCategory;
import com.azure.resourcemanager.webpubsub.models.LiveTraceConfiguration;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentity;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentityType;
import com.azure.resourcemanager.webpubsub.models.NetworkAcl;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpointAcl;
import com.azure.resourcemanager.webpubsub.models.ResourceLogCategory;
import com.azure.resourcemanager.webpubsub.models.ResourceLogConfiguration;
import com.azure.resourcemanager.webpubsub.models.ResourceSku;
import com.azure.resourcemanager.webpubsub.models.ServiceKind;
import com.azure.resourcemanager.webpubsub.models.UserAssignedIdentityProperty;
import com.azure.resourcemanager.webpubsub.models.WebPubSubNetworkACLs;
import com.azure.resourcemanager.webpubsub.models.WebPubSubRequestType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubResourceList;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSkuTier;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSocketIOSettings;
import com.azure.resourcemanager.webpubsub.models.WebPubSubTlsSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WebPubSubResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebPubSubResourceList model = BinaryData.fromString(
            "{\"value\":[{\"sku\":{\"name\":\"tpngjcrcczsqpjh\",\"tier\":\"Free\",\"size\":\"jvnysounqe\",\"family\":\"noae\",\"capacity\":1901274446},\"properties\":{\"provisioningState\":\"Deleting\",\"externalIP\":\"trpmo\",\"hostName\":\"mcmatuokthfuiu\",\"publicPort\":1445775245,\"serverPort\":680550088,\"version\":\"pk\",\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"uozmyzydagfua\",\"name\":\"bezy\",\"type\":\"uokktwhrdxwz\"},{\"properties\":{},\"id\":\"sm\",\"name\":\"surex\",\"type\":\"moryocfsfksym\"},{\"properties\":{},\"id\":\"stkiiuxhqyud\",\"name\":\"o\",\"type\":\"rq\"},{\"properties\":{},\"id\":\"oczvy\",\"name\":\"fqrvkdvjsllrmvvd\",\"type\":\"watkpnpulexxb\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"ruwiqzbqjvsov\",\"privateLinkResourceId\":\"yokacspkw\"},\"id\":\"zdobpxjmflbvvnch\",\"name\":\"kcciwwzjuqkhr\",\"type\":\"ajiwkuo\"},{\"properties\":{\"groupId\":\"skghsauuimj\",\"privateLinkResourceId\":\"vxieduugidyj\"},\"id\":\"f\",\"name\":\"y\",\"type\":\"osvexcsonpclhoc\"},{\"properties\":{\"groupId\":\"slkevle\",\"privateLinkResourceId\":\"gz\"},\"id\":\"u\",\"name\":\"fmvfaxkffeiit\",\"type\":\"lvmezyvshxmzsbbz\"},{\"properties\":{\"groupId\":\"gigr\",\"privateLinkResourceId\":\"wburvjxxjnspydpt\"},\"id\":\"enkouknvudw\",\"name\":\"iukbldngkpoci\",\"type\":\"azyxoegukg\"}],\"tls\":{\"clientCertEnabled\":true},\"hostNamePrefix\":\"cgygev\",\"liveTraceConfiguration\":{\"enabled\":\"typmrbpizcdrqjsd\",\"categories\":[{},{},{},{}]},\"resourceLogConfiguration\":{\"categories\":[{},{},{},{}]},\"networkACLs\":{\"defaultAction\":\"Allow\",\"publicNetwork\":{\"allow\":[\"RESTAPI\",\"ClientConnection\",\"RESTAPI\"],\"deny\":[\"Trace\"]},\"privateEndpoints\":[{\"name\":\"jttgzf\"},{\"name\":\"ishc\"},{\"name\":\"khaj\"}],\"ipRules\":[{},{},{},{}]},\"publicNetworkAccess\":\"a\",\"disableLocalAuth\":false,\"disableAadAuth\":true,\"regionEndpointEnabled\":\"alpbuxwgipwhon\",\"resourceStopped\":\"kgshwa\",\"socketIO\":{\"serviceMode\":\"xzbinjeputt\"}},\"kind\":\"WebPubSub\",\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"qqn\":{\"principalId\":\"ftiyqzrnkcq\",\"clientId\":\"xlwhzlsicoh\"},\"mqhgyxzkonocuk\":{\"principalId\":\"lryav\",\"clientId\":\"heun\"},\"eyp\":{\"principalId\":\"lyaxuc\",\"clientId\":\"uqszfk\"},\"frzpwvlqdqgb\":{\"principalId\":\"rmjmwvvjektc\",\"clientId\":\"enhwlrs\"}},\"principalId\":\"ylihkaetckt\",\"tenantId\":\"civfsnkymuctq\"},\"location\":\"fbebrjcxer\",\"tags\":{\"xepcyvahfn\":\"utttxfvjrbirp\",\"xjvuujqgidokg\":\"jky\",\"sncghkjeszz\":\"ljyoxgvcltb\"},\"id\":\"bijhtxfvgxbf\",\"name\":\"mxnehmp\",\"type\":\"ec\"},{\"sku\":{\"name\":\"odebfqkkrbmpu\",\"tier\":\"Standard\",\"size\":\"wflzlfbxzpuzy\",\"family\":\"spnqzahmgkb\",\"capacity\":567432535},\"properties\":{\"provisioningState\":\"Deleting\",\"externalIP\":\"bnuqqkpik\",\"hostName\":\"rgvtqag\",\"publicPort\":1873718862,\"serverPort\":855671205,\"version\":\"ijggmebfsiar\",\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"vpnazzm\",\"name\":\"jrunmpxtt\",\"type\":\"bh\"},{\"properties\":{},\"id\":\"l\",\"name\":\"nkxmyskpbhenbtk\",\"type\":\"xywnytnrsynlqidy\"},{\"properties\":{},\"id\":\"czfc\",\"name\":\"haaxdbabphl\",\"type\":\"rqlfktsthsucocmn\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"t\",\"privateLinkResourceId\":\"bt\"},\"id\":\"rq\",\"name\":\"uedck\",\"type\":\"ywbiexzfeyueax\"}],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"wbhqwal\",\"liveTraceConfiguration\":{\"enabled\":\"yoxa\",\"categories\":[{},{},{}]},\"resourceLogConfiguration\":{\"categories\":[{},{}]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"Trace\",\"ClientConnection\",\"RESTAPI\"],\"deny\":[\"ClientConnection\",\"ServerConnection\",\"ServerConnection\",\"ServerConnection\"]},\"privateEndpoints\":[{\"name\":\"djswztsdbp\"}],\"ipRules\":[{},{},{}]},\"publicNetworkAccess\":\"txhp\",\"disableLocalAuth\":false,\"disableAadAuth\":false,\"regionEndpointEnabled\":\"zabglcuhxwt\",\"resourceStopped\":\"yqiklbbovplwzb\",\"socketIO\":{\"serviceMode\":\"yuguosvmkfssx\"}},\"kind\":\"WebPubSub\",\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"xpkd\":{\"principalId\":\"gsxnkjzkdeslpv\",\"clientId\":\"pwiyig\"},\"ojnabckhsmtxpsie\":{\"principalId\":\"baiuebbaumny\",\"clientId\":\"ped\"},\"jdhtldwkyzxu\":{\"principalId\":\"fhvpesaps\",\"clientId\":\"dqmh\"}},\"principalId\":\"kn\",\"tenantId\":\"scwsv\"},\"location\":\"otogtwrupqs\",\"tags\":{\"notyfjfcnjbkcn\":\"micykvceoveilo\"},\"id\":\"dhbt\",\"name\":\"kphywpnvjto\",\"type\":\"nermcl\"},{\"sku\":{\"name\":\"lphox\",\"tier\":\"Basic\",\"size\":\"pabgyeps\",\"family\":\"tazqugxywpmueefj\",\"capacity\":1541291640},\"properties\":{\"provisioningState\":\"Deleting\",\"externalIP\":\"jidsuyonobglaoc\",\"hostName\":\"tcc\",\"publicPort\":528280521,\"serverPort\":1054992005,\"version\":\"ytlmoyrxvwfud\",\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"xhdzhlrqjbhckf\",\"name\":\"lhrxsbkyvpyc\",\"type\":\"n\"},{\"properties\":{},\"id\":\"p\",\"name\":\"kafkuwbcrnwbm\",\"type\":\"hhseyv\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"tslhspkdeem\",\"privateLinkResourceId\":\"ofmxagkvtmelmqkr\"},\"id\":\"hvljuahaquh\",\"name\":\"dhmdua\",\"type\":\"aex\"},{\"properties\":{\"groupId\":\"vfadmws\",\"privateLinkResourceId\":\"crgvxpvgom\"},\"id\":\"fmisg\",\"name\":\"bnbbeldawkz\",\"type\":\"ali\"},{\"properties\":{\"groupId\":\"rqhakauha\",\"privateLinkResourceId\":\"hsfwxosowzxcug\"},\"id\":\"jooxdjebw\",\"name\":\"ucww\",\"type\":\"vo\"},{\"properties\":{\"groupId\":\"vmeueci\",\"privateLinkResourceId\":\"yhz\"},\"id\":\"uojgj\",\"name\":\"wjue\",\"type\":\"otwmcdyt\"}],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"xnrj\",\"liveTraceConfiguration\":{\"enabled\":\"qwgxhniskx\",\"categories\":[{},{},{},{}]},\"resourceLogConfiguration\":{\"categories\":[{}]},\"networkACLs\":{\"defaultAction\":\"Allow\",\"publicNetwork\":{\"allow\":[\"ServerConnection\",\"RESTAPI\",\"ServerConnection\",\"Trace\"],\"deny\":[\"ServerConnection\",\"ServerConnection\",\"RESTAPI\",\"ClientConnection\"]},\"privateEndpoints\":[{\"name\":\"zbtd\"},{\"name\":\"xujznbmpowu\"}],\"ipRules\":[{},{}]},\"publicNetworkAccess\":\"qlveualupjmkh\",\"disableLocalAuth\":false,\"disableAadAuth\":false,\"regionEndpointEnabled\":\"sw\",\"resourceStopped\":\"tjrip\",\"socketIO\":{\"serviceMode\":\"pbewtghfgblcgwx\"}},\"kind\":\"SocketIO\",\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"wrtz\":{\"principalId\":\"egibtnmxiebww\",\"clientId\":\"oayqc\"},\"xongmtsavjcbpwxq\":{\"principalId\":\"zg\",\"clientId\":\"zmh\"}},\"principalId\":\"rknftguvriuhprwm\",\"tenantId\":\"vxqtayriwwroyqbe\"},\"location\":\"mcqibycnojv\",\"tags\":{\"qsgzvahapj\":\"e\",\"zlmwlxkvugfhz\":\"zhpvgqzcjrvxd\",\"hnnpr\":\"vawjvzunlu\",\"ultskzbbtdz\":\"xipeilpjzuaejx\"},\"id\":\"mv\",\"name\":\"ekg\",\"type\":\"wozuhkf\"},{\"sku\":{\"name\":\"sjyofdx\",\"tier\":\"Free\",\"size\":\"dttouwaboekqvkel\",\"family\":\"mvb\",\"capacity\":1393240700},\"properties\":{\"provisioningState\":\"Canceled\",\"externalIP\":\"hhcaal\",\"hostName\":\"ixisxyawjoy\",\"publicPort\":1772436776,\"serverPort\":1260853084,\"version\":\"jpkiidzyexznelix\",\"privateEndpointConnections\":[{\"properties\":{},\"id\":\"folhbnxknal\",\"name\":\"ulppggdtpnapnyir\",\"type\":\"pu\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"vpgylgqgitxmed\",\"privateLinkResourceId\":\"v\"},\"id\":\"lynqwwncwzzh\",\"name\":\"gktrmgucnapkte\",\"type\":\"ellwptfdy\"},{\"properties\":{\"groupId\":\"fqbuaceopzf\",\"privateLinkResourceId\":\"rhhuaopppcqeqx\"},\"id\":\"z\",\"name\":\"ahzxctobgbk\",\"type\":\"moizpos\"}],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"fbunrmfqjhhk\",\"liveTraceConfiguration\":{\"enabled\":\"vjymjhxxjyngud\",\"categories\":[{},{},{}]},\"resourceLogConfiguration\":{\"categories\":[{},{}]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"Trace\",\"ClientConnection\",\"RESTAPI\",\"RESTAPI\"],\"deny\":[\"ServerConnection\",\"ClientConnection\",\"Trace\"]},\"privateEndpoints\":[{\"name\":\"xivetvt\"},{\"name\":\"qaqtdoqmcbxvwvxy\"}],\"ipRules\":[{},{},{}]},\"publicNetworkAccess\":\"hsfxoblytkb\",\"disableLocalAuth\":false,\"disableAadAuth\":false,\"regionEndpointEnabled\":\"wfbkrvrns\",\"resourceStopped\":\"hqjohxcrsbfova\",\"socketIO\":{\"serviceMode\":\"uvwbhsqfs\"}},\"kind\":\"SocketIO\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"sotftpvj\":{\"principalId\":\"bpybsrfbjf\",\"clientId\":\"w\"},\"jhwqytjrybnw\":{\"principalId\":\"exilzznfqqnvwpmq\",\"clientId\":\"ruoujmk\"}},\"principalId\":\"wgdrjervnaenqp\",\"tenantId\":\"indoygmifthnzd\"},\"location\":\"sl\",\"tags\":{\"gynduha\":\"yq\",\"bgycduiertgccym\":\"hqlkthumaqo\",\"lqlfm\":\"aolps\"},\"id\":\"dnbbglzps\",\"name\":\"iydmcwyhzdxs\",\"type\":\"adbzmnvdfznud\"}],\"nextLink\":\"dvxzbncblylpst\"}")
            .toObject(WebPubSubResourceList.class);
        Assertions.assertEquals("fbebrjcxer", model.value().get(0).location());
        Assertions.assertEquals("utttxfvjrbirp", model.value().get(0).tags().get("xepcyvahfn"));
        Assertions.assertEquals("tpngjcrcczsqpjh", model.value().get(0).sku().name());
        Assertions.assertEquals(WebPubSubSkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals(1901274446, model.value().get(0).sku().capacity());
        Assertions.assertEquals(ServiceKind.WEB_PUB_SUB, model.value().get(0).kind());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals(true, model.value().get(0).tls().clientCertEnabled());
        Assertions.assertEquals("typmrbpizcdrqjsd", model.value().get(0).liveTraceConfiguration().enabled());
        Assertions.assertEquals(AclAction.ALLOW, model.value().get(0).networkACLs().defaultAction());
        Assertions.assertEquals(WebPubSubRequestType.RESTAPI,
            model.value().get(0).networkACLs().publicNetwork().allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.TRACE,
            model.value().get(0).networkACLs().publicNetwork().deny().get(0));
        Assertions.assertEquals("jttgzf", model.value().get(0).networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("a", model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals(false, model.value().get(0).disableLocalAuth());
        Assertions.assertEquals(true, model.value().get(0).disableAadAuth());
        Assertions.assertEquals("alpbuxwgipwhon", model.value().get(0).regionEndpointEnabled());
        Assertions.assertEquals("kgshwa", model.value().get(0).resourceStopped());
        Assertions.assertEquals("xzbinjeputt", model.value().get(0).socketIO().serviceMode());
        Assertions.assertEquals("dvxzbncblylpst", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebPubSubResourceList model
            = new WebPubSubResourceList()
                .withValue(
                    Arrays
                        .asList(
                            new WebPubSubResourceInner().withLocation("fbebrjcxer")
                                .withTags(mapOf("xepcyvahfn", "utttxfvjrbirp", "xjvuujqgidokg", "jky", "sncghkjeszz",
                                    "ljyoxgvcltb"))
                                .withSku(new ResourceSku().withName("tpngjcrcczsqpjh")
                                    .withTier(WebPubSubSkuTier.FREE)
                                    .withCapacity(1901274446))
                                .withKind(ServiceKind.WEB_PUB_SUB)
                                .withIdentity(new ManagedIdentity().withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                                    .withUserAssignedIdentities(mapOf("qqn", new UserAssignedIdentityProperty(),
                                        "mqhgyxzkonocuk", new UserAssignedIdentityProperty(), "eyp",
                                        new UserAssignedIdentityProperty(), "frzpwvlqdqgb",
                                        new UserAssignedIdentityProperty())))
                                .withTls(new WebPubSubTlsSettings().withClientCertEnabled(true))
                                .withLiveTraceConfiguration(new LiveTraceConfiguration().withEnabled("typmrbpizcdrqjsd")
                                    .withCategories(Arrays.asList(new LiveTraceCategory(), new LiveTraceCategory(),
                                        new LiveTraceCategory(), new LiveTraceCategory())))
                                .withResourceLogConfiguration(new ResourceLogConfiguration().withCategories(
                                    Arrays.asList(new ResourceLogCategory(), new ResourceLogCategory(),
                                        new ResourceLogCategory(), new ResourceLogCategory())))
                                .withNetworkACLs(new WebPubSubNetworkACLs().withDefaultAction(AclAction.ALLOW)
                                    .withPublicNetwork(new NetworkAcl()
                                        .withAllow(Arrays.asList(WebPubSubRequestType.RESTAPI,
                                            WebPubSubRequestType.CLIENT_CONNECTION, WebPubSubRequestType.RESTAPI))
                                        .withDeny(Arrays.asList(WebPubSubRequestType.TRACE)))
                                    .withPrivateEndpoints(Arrays.asList(
                                        new PrivateEndpointAcl().withName("jttgzf"),
                                        new PrivateEndpointAcl().withName("ishc"),
                                        new PrivateEndpointAcl().withName("khaj")))
                                    .withIpRules(Arrays.asList(new IpRule(), new IpRule(), new IpRule(), new IpRule())))
                                .withPublicNetworkAccess("a")
                                .withDisableLocalAuth(false)
                                .withDisableAadAuth(true)
                                .withRegionEndpointEnabled("alpbuxwgipwhon")
                                .withResourceStopped("kgshwa")
                                .withSocketIO(new WebPubSubSocketIOSettings().withServiceMode("xzbinjeputt")),
                            new WebPubSubResourceInner().withLocation("otogtwrupqs")
                                .withTags(mapOf("notyfjfcnjbkcn", "micykvceoveilo"))
                                .withSku(new ResourceSku().withName("odebfqkkrbmpu")
                                    .withTier(WebPubSubSkuTier.STANDARD)
                                    .withCapacity(567432535))
                                .withKind(ServiceKind.WEB_PUB_SUB)
                                .withIdentity(new ManagedIdentity().withType(ManagedIdentityType.NONE)
                                    .withUserAssignedIdentities(mapOf("xpkd", new UserAssignedIdentityProperty(),
                                        "ojnabckhsmtxpsie", new UserAssignedIdentityProperty(), "jdhtldwkyzxu",
                                        new UserAssignedIdentityProperty())))
                                .withTls(new WebPubSubTlsSettings().withClientCertEnabled(false))
                                .withLiveTraceConfiguration(new LiveTraceConfiguration()
                                    .withEnabled("yoxa")
                                    .withCategories(
                                        Arrays.asList(new LiveTraceCategory(), new LiveTraceCategory(),
                                            new LiveTraceCategory())))
                                .withResourceLogConfiguration(new ResourceLogConfiguration().withCategories(
                                    Arrays.asList(new ResourceLogCategory(), new ResourceLogCategory())))
                                .withNetworkACLs(new WebPubSubNetworkACLs().withDefaultAction(AclAction.DENY)
                                    .withPublicNetwork(new NetworkAcl()
                                        .withAllow(Arrays.asList(WebPubSubRequestType.TRACE,
                                            WebPubSubRequestType.CLIENT_CONNECTION, WebPubSubRequestType.RESTAPI))
                                        .withDeny(Arrays.asList(
                                            WebPubSubRequestType.CLIENT_CONNECTION,
                                            WebPubSubRequestType.SERVER_CONNECTION,
                                            WebPubSubRequestType.SERVER_CONNECTION,
                                            WebPubSubRequestType.SERVER_CONNECTION)))
                                    .withPrivateEndpoints(
                                        Arrays.asList(new PrivateEndpointAcl().withName("djswztsdbp")))
                                    .withIpRules(Arrays.asList(new IpRule(), new IpRule(), new IpRule())))
                                .withPublicNetworkAccess("txhp")
                                .withDisableLocalAuth(false)
                                .withDisableAadAuth(false)
                                .withRegionEndpointEnabled("zabglcuhxwt")
                                .withResourceStopped("yqiklbbovplwzb")
                                .withSocketIO(new WebPubSubSocketIOSettings().withServiceMode("yuguosvmkfssx")),
                            new WebPubSubResourceInner().withLocation("mcqibycnojv")
                                .withTags(mapOf("qsgzvahapj", "e", "zlmwlxkvugfhz", "zhpvgqzcjrvxd", "hnnpr",
                                    "vawjvzunlu", "ultskzbbtdz", "xipeilpjzuaejx"))
                                .withSku(new ResourceSku().withName("lphox")
                                    .withTier(WebPubSubSkuTier.BASIC)
                                    .withCapacity(1541291640))
                                .withKind(ServiceKind.SOCKET_IO)
                                .withIdentity(new ManagedIdentity()
                                    .withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                                    .withUserAssignedIdentities(mapOf("wrtz", new UserAssignedIdentityProperty(),
                                        "xongmtsavjcbpwxq", new UserAssignedIdentityProperty())))
                                .withTls(new WebPubSubTlsSettings().withClientCertEnabled(false))
                                .withLiveTraceConfiguration(new LiveTraceConfiguration()
                                    .withEnabled("qwgxhniskx")
                                    .withCategories(
                                        Arrays.asList(new LiveTraceCategory(), new LiveTraceCategory(),
                                            new LiveTraceCategory(), new LiveTraceCategory())))
                                .withResourceLogConfiguration(new ResourceLogConfiguration()
                                    .withCategories(Arrays.asList(new ResourceLogCategory())))
                                .withNetworkACLs(new WebPubSubNetworkACLs().withDefaultAction(AclAction.ALLOW)
                                    .withPublicNetwork(new NetworkAcl()
                                        .withAllow(Arrays.asList(WebPubSubRequestType.SERVER_CONNECTION,
                                            WebPubSubRequestType.RESTAPI, WebPubSubRequestType.SERVER_CONNECTION,
                                            WebPubSubRequestType.TRACE))
                                        .withDeny(
                                            Arrays.asList(WebPubSubRequestType.SERVER_CONNECTION,
                                                WebPubSubRequestType.SERVER_CONNECTION, WebPubSubRequestType.RESTAPI,
                                                WebPubSubRequestType.CLIENT_CONNECTION)))
                                    .withPrivateEndpoints(Arrays.asList(
                                        new PrivateEndpointAcl().withName("zbtd"),
                                        new PrivateEndpointAcl().withName("xujznbmpowu")))
                                    .withIpRules(Arrays.asList(new IpRule(), new IpRule())))
                                .withPublicNetworkAccess("qlveualupjmkh")
                                .withDisableLocalAuth(false)
                                .withDisableAadAuth(false)
                                .withRegionEndpointEnabled("sw")
                                .withResourceStopped("tjrip")
                                .withSocketIO(new WebPubSubSocketIOSettings().withServiceMode("pbewtghfgblcgwx")),
                            new WebPubSubResourceInner().withLocation("sl")
                                .withTags(mapOf("gynduha", "yq", "bgycduiertgccym", "hqlkthumaqo", "lqlfm", "aolps"))
                                .withSku(new ResourceSku().withName("sjyofdx")
                                    .withTier(WebPubSubSkuTier.FREE)
                                    .withCapacity(1393240700))
                                .withKind(ServiceKind.SOCKET_IO)
                                .withIdentity(new ManagedIdentity()
                                    .withType(ManagedIdentityType.USER_ASSIGNED)
                                    .withUserAssignedIdentities(mapOf("sotftpvj", new UserAssignedIdentityProperty(),
                                        "jhwqytjrybnw", new UserAssignedIdentityProperty())))
                                .withTls(new WebPubSubTlsSettings().withClientCertEnabled(false))
                                .withLiveTraceConfiguration(new LiveTraceConfiguration().withEnabled("vjymjhxxjyngud")
                                    .withCategories(Arrays.asList(new LiveTraceCategory(), new LiveTraceCategory(),
                                        new LiveTraceCategory())))
                                .withResourceLogConfiguration(new ResourceLogConfiguration().withCategories(
                                    Arrays.asList(new ResourceLogCategory(), new ResourceLogCategory())))
                                .withNetworkACLs(new WebPubSubNetworkACLs().withDefaultAction(AclAction.DENY)
                                    .withPublicNetwork(new NetworkAcl()
                                        .withAllow(Arrays.asList(WebPubSubRequestType.TRACE,
                                            WebPubSubRequestType.CLIENT_CONNECTION, WebPubSubRequestType.RESTAPI,
                                            WebPubSubRequestType.RESTAPI))
                                        .withDeny(Arrays.asList(WebPubSubRequestType.SERVER_CONNECTION,
                                            WebPubSubRequestType.CLIENT_CONNECTION, WebPubSubRequestType.TRACE)))
                                    .withPrivateEndpoints(Arrays.asList(new PrivateEndpointAcl().withName("xivetvt"),
                                        new PrivateEndpointAcl().withName("qaqtdoqmcbxvwvxy")))
                                    .withIpRules(Arrays.asList(new IpRule(), new IpRule(), new IpRule())))
                                .withPublicNetworkAccess("hsfxoblytkb")
                                .withDisableLocalAuth(false)
                                .withDisableAadAuth(false)
                                .withRegionEndpointEnabled("wfbkrvrns")
                                .withResourceStopped("hqjohxcrsbfova")
                                .withSocketIO(new WebPubSubSocketIOSettings().withServiceMode("uvwbhsqfs"))))
                .withNextLink("dvxzbncblylpst");
        model = BinaryData.fromObject(model).toObject(WebPubSubResourceList.class);
        Assertions.assertEquals("fbebrjcxer", model.value().get(0).location());
        Assertions.assertEquals("utttxfvjrbirp", model.value().get(0).tags().get("xepcyvahfn"));
        Assertions.assertEquals("tpngjcrcczsqpjh", model.value().get(0).sku().name());
        Assertions.assertEquals(WebPubSubSkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals(1901274446, model.value().get(0).sku().capacity());
        Assertions.assertEquals(ServiceKind.WEB_PUB_SUB, model.value().get(0).kind());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals(true, model.value().get(0).tls().clientCertEnabled());
        Assertions.assertEquals("typmrbpizcdrqjsd", model.value().get(0).liveTraceConfiguration().enabled());
        Assertions.assertEquals(AclAction.ALLOW, model.value().get(0).networkACLs().defaultAction());
        Assertions.assertEquals(WebPubSubRequestType.RESTAPI,
            model.value().get(0).networkACLs().publicNetwork().allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.TRACE,
            model.value().get(0).networkACLs().publicNetwork().deny().get(0));
        Assertions.assertEquals("jttgzf", model.value().get(0).networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("a", model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals(false, model.value().get(0).disableLocalAuth());
        Assertions.assertEquals(true, model.value().get(0).disableAadAuth());
        Assertions.assertEquals("alpbuxwgipwhon", model.value().get(0).regionEndpointEnabled());
        Assertions.assertEquals("kgshwa", model.value().get(0).resourceStopped());
        Assertions.assertEquals("xzbinjeputt", model.value().get(0).socketIO().serviceMode());
        Assertions.assertEquals("dvxzbncblylpst", model.nextLink());
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
