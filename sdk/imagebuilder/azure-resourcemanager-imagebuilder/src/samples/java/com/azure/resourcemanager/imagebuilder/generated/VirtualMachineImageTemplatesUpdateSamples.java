// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.resourcemanager.imagebuilder.models.ImageTemplate;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateIdentity;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateUpdateParametersProperties;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateVmProfile;
import com.azure.resourcemanager.imagebuilder.models.ResourceIdentityType;
import com.azure.resourcemanager.imagebuilder.models.VirtualNetworkConfig;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for VirtualMachineImageTemplates Update.
 */
public final class VirtualMachineImageTemplatesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/imagebuilder/resource-manager/Microsoft.VirtualMachineImages/stable/2024-02-01/examples/
     * UpdateImageTemplateToRemoveIdentities.json
     */
    /**
     * Sample code: Remove identities for an Image Template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        removeIdentitiesForAnImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        ImageTemplate resource = manager.virtualMachineImageTemplates()
            .getByResourceGroupWithResponse("myResourceGroup", "myImageTemplate", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withIdentity(new ImageTemplateIdentity().withType(ResourceIdentityType.NONE)).apply();
    }

    /*
     * x-ms-original-file:
     * specification/imagebuilder/resource-manager/Microsoft.VirtualMachineImages/stable/2024-02-01/examples/
     * UpdateImageTemplateVmProfile.json
     */
    /**
     * Sample code: Update parameters for vm profile.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        updateParametersForVmProfile(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        ImageTemplate resource = manager.virtualMachineImageTemplates()
            .getByResourceGroupWithResponse("myResourceGroup", "myImageTemplate", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new ImageTemplateUpdateParametersProperties().withVmProfile(new ImageTemplateVmProfile()
                .withVmSize("{updated_vmsize}")
                .withOsDiskSizeGB(127)
                .withVnetConfig(new VirtualNetworkConfig().withSubnetId("{updated_aci_subnet}")
                    .withContainerInstanceSubnetId(
                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/vnetname/subnets/subnetname"))))
            .apply();
    }

    /*
     * x-ms-original-file:
     * specification/imagebuilder/resource-manager/Microsoft.VirtualMachineImages/stable/2024-02-01/examples/
     * UpdateImageTemplateTags.json
     */
    /**
     * Sample code: Update the tags for an Image Template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        updateTheTagsForAnImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        ImageTemplate resource = manager.virtualMachineImageTemplates()
            .getByResourceGroupWithResponse("myResourceGroup", "myImageTemplate", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("new-tag", "new-value")).apply();
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
