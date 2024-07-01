// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.resourcemanager.informaticadatamanagement.models.AdvancedCustomProperties;
import com.azure.resourcemanager.informaticadatamanagement.models.ApplicationConfigs;
import com.azure.resourcemanager.informaticadatamanagement.models.ApplicationType;
import com.azure.resourcemanager.informaticadatamanagement.models.CdiConfigProps;
import com.azure.resourcemanager.informaticadatamanagement.models.InformaticaServerlessRuntimeResource;
import com.azure.resourcemanager.informaticadatamanagement.models.NetworkInterfaceConfigurationUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.PlatformType;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeConfigPropertiesUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeNetworkProfileUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimePropertiesCustomUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeTag;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeUserContextPropertiesUpdate;
import java.util.Arrays;

/**
 * Samples for ServerlessRuntimes Update.
 */
public final class ServerlessRuntimesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/Informatica.DataManagement/examples/2024-05-08/ServerlessRuntimes_Update_MaximumSet_Gen
     * .json
     */
    /**
     * Sample code: ServerlessRuntimes_Update.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesUpdate(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        InformaticaServerlessRuntimeResource resource = manager.serverlessRuntimes()
            .getWithResponse("rgopenapi", "W5", "t_", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(
                new ServerlessRuntimePropertiesCustomUpdate().withDescription("ocprslpljoikxyduackzqnkuhyzrh")
                    .withPlatform(PlatformType.AZURE)
                    .withApplicationType(ApplicationType.CDI)
                    .withComputeUnits("uncwbpu")
                    .withExecutionTimeout("tjyfytuywriabt")
                    .withServerlessAccountLocation("goaugkyfanqfnvcmntreibqrswfpis")
                    .withServerlessRuntimeNetworkProfile(
                        new ServerlessRuntimeNetworkProfileUpdate().withNetworkInterfaceConfiguration(
                            new NetworkInterfaceConfigurationUpdate().withVnetId("tnsqwwoxydeqqffumdnxlkkb")
                                .withSubnetId("dctcuhgttxhcarwcrgdmsfwksyrzj")
                                .withVnetResourceGuid("5328d299-1462-4be0-bef1-303a28e556a0")))
                    .withAdvancedCustomProperties(Arrays.asList(
                        new AdvancedCustomProperties().withKey("fakeTokenPlaceholder").withValue("unraxmnohdmvutt")))
                    .withSupplementaryFileLocation("csxaqzpxu")
                    .withServerlessRuntimeConfig(new ServerlessRuntimeConfigPropertiesUpdate()
                        .withCdiConfigProps(
                            Arrays.asList(new CdiConfigProps().withEngineName("hngsdqvtjdhwqlbqfotipaiwjuys")
                                .withEngineVersion("zlrlbg")
                                .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("lw")
                                    .withName("upfvjrqcrwwedfujkmsodeinw")
                                    .withValue("mozgsetpwjmtyl")
                                    .withPlatform("dixfyeobngivyvf")
                                    .withCustomized("j")
                                    .withDefaultValue("zvgkqwmi")))))
                        .withCdieConfigProps(
                            Arrays.asList(new CdiConfigProps().withEngineName("hngsdqvtjdhwqlbqfotipaiwjuys")
                                .withEngineVersion("zlrlbg")
                                .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("lw")
                                    .withName("upfvjrqcrwwedfujkmsodeinw")
                                    .withValue("mozgsetpwjmtyl")
                                    .withPlatform("dixfyeobngivyvf")
                                    .withCustomized("j")
                                    .withDefaultValue("zvgkqwmi"))))))
                    .withServerlessRuntimeTags(
                        Arrays.asList(new ServerlessRuntimeTag().withName("korveuycuwhs").withValue("uyiuegxnkgp")))
                    .withServerlessRuntimeUserContextProperties(new ServerlessRuntimeUserContextPropertiesUpdate()
                        .withUserContextToken("fakeTokenPlaceholder")))
            .apply();
    }
}
