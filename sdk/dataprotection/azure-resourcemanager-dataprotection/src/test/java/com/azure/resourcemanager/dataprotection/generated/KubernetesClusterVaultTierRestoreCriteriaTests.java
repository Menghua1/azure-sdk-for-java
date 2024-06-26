// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ExistingResourcePolicy;
import com.azure.resourcemanager.dataprotection.models.KubernetesClusterVaultTierRestoreCriteria;
import com.azure.resourcemanager.dataprotection.models.NamespacedNameResource;
import com.azure.resourcemanager.dataprotection.models.PersistentVolumeRestoreMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class KubernetesClusterVaultTierRestoreCriteriaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesClusterVaultTierRestoreCriteria model = BinaryData.fromString(
            "{\"objectType\":\"KubernetesClusterVaultTierRestoreCriteria\",\"includeClusterScopeResources\":false,\"includedNamespaces\":[\"rds\",\"tujbazpju\",\"hminyflnorwmduv\",\"pklvxw\"],\"excludedNamespaces\":[\"dxpgpqchiszepnnb\",\"crxgibb\"],\"includedResourceTypes\":[\"confozauors\",\"kokwbqplhlvnu\",\"epzl\"],\"excludedResourceTypes\":[\"wzsoldweyuqdunv\"],\"labelSelectors\":[\"rwrbi\",\"rk\",\"alywjhhgdn\"],\"persistentVolumeRestoreMode\":\"RestoreWithVolumeData\",\"conflictPolicy\":\"Patch\",\"namespaceMappings\":{\"ox\":\"omi\",\"euzaof\":\"gdufiqnd\",\"cubiipuipw\":\"chvcyyysfgdo\"},\"restoreHookReferences\":[{\"name\":\"macjekn\",\"namespace\":\"shqvcimpev\"},{\"name\":\"mblrrilbywd\",\"namespace\":\"miccwrwfscjfnyn\"},{\"name\":\"qujizdvo\",\"namespace\":\"tiby\"}],\"stagingResourceGroupId\":\"bblgyavut\",\"stagingStorageAccountId\":\"hjoxo\"}")
            .toObject(KubernetesClusterVaultTierRestoreCriteria.class);
        Assertions.assertEquals(false, model.includeClusterScopeResources());
        Assertions.assertEquals("rds", model.includedNamespaces().get(0));
        Assertions.assertEquals("dxpgpqchiszepnnb", model.excludedNamespaces().get(0));
        Assertions.assertEquals("confozauors", model.includedResourceTypes().get(0));
        Assertions.assertEquals("wzsoldweyuqdunv", model.excludedResourceTypes().get(0));
        Assertions.assertEquals("rwrbi", model.labelSelectors().get(0));
        Assertions.assertEquals(PersistentVolumeRestoreMode.RESTORE_WITH_VOLUME_DATA,
            model.persistentVolumeRestoreMode());
        Assertions.assertEquals(ExistingResourcePolicy.PATCH, model.conflictPolicy());
        Assertions.assertEquals("omi", model.namespaceMappings().get("ox"));
        Assertions.assertEquals("macjekn", model.restoreHookReferences().get(0).name());
        Assertions.assertEquals("shqvcimpev", model.restoreHookReferences().get(0).namespace());
        Assertions.assertEquals("bblgyavut", model.stagingResourceGroupId());
        Assertions.assertEquals("hjoxo", model.stagingStorageAccountId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesClusterVaultTierRestoreCriteria model
            = new KubernetesClusterVaultTierRestoreCriteria().withIncludeClusterScopeResources(false)
                .withIncludedNamespaces(Arrays.asList("rds", "tujbazpju", "hminyflnorwmduv", "pklvxw"))
                .withExcludedNamespaces(Arrays.asList("dxpgpqchiszepnnb", "crxgibb"))
                .withIncludedResourceTypes(Arrays.asList("confozauors", "kokwbqplhlvnu", "epzl"))
                .withExcludedResourceTypes(Arrays.asList("wzsoldweyuqdunv"))
                .withLabelSelectors(Arrays.asList("rwrbi", "rk", "alywjhhgdn"))
                .withPersistentVolumeRestoreMode(PersistentVolumeRestoreMode.RESTORE_WITH_VOLUME_DATA)
                .withConflictPolicy(ExistingResourcePolicy.PATCH)
                .withNamespaceMappings(mapOf("ox", "omi", "euzaof", "gdufiqnd", "cubiipuipw", "chvcyyysfgdo"))
                .withRestoreHookReferences(
                    Arrays.asList(new NamespacedNameResource().withName("macjekn").withNamespace("shqvcimpev"),
                        new NamespacedNameResource().withName("mblrrilbywd").withNamespace("miccwrwfscjfnyn"),
                        new NamespacedNameResource().withName("qujizdvo").withNamespace("tiby")))
                .withStagingResourceGroupId("bblgyavut").withStagingStorageAccountId("hjoxo");
        model = BinaryData.fromObject(model).toObject(KubernetesClusterVaultTierRestoreCriteria.class);
        Assertions.assertEquals(false, model.includeClusterScopeResources());
        Assertions.assertEquals("rds", model.includedNamespaces().get(0));
        Assertions.assertEquals("dxpgpqchiszepnnb", model.excludedNamespaces().get(0));
        Assertions.assertEquals("confozauors", model.includedResourceTypes().get(0));
        Assertions.assertEquals("wzsoldweyuqdunv", model.excludedResourceTypes().get(0));
        Assertions.assertEquals("rwrbi", model.labelSelectors().get(0));
        Assertions.assertEquals(PersistentVolumeRestoreMode.RESTORE_WITH_VOLUME_DATA,
            model.persistentVolumeRestoreMode());
        Assertions.assertEquals(ExistingResourcePolicy.PATCH, model.conflictPolicy());
        Assertions.assertEquals("omi", model.namespaceMappings().get("ox"));
        Assertions.assertEquals("macjekn", model.restoreHookReferences().get(0).name());
        Assertions.assertEquals("shqvcimpev", model.restoreHookReferences().get(0).namespace());
        Assertions.assertEquals("bblgyavut", model.stagingResourceGroupId());
        Assertions.assertEquals("hjoxo", model.stagingStorageAccountId());
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
