// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The selector kind.
 */
public final class SelectorKind extends ExpandableStringEnum<SelectorKind> {
    /**
     * Static value resourceLocation for SelectorKind.
     */
    public static final SelectorKind RESOURCE_LOCATION = fromString("resourceLocation");

    /**
     * Static value resourceType for SelectorKind.
     */
    public static final SelectorKind RESOURCE_TYPE = fromString("resourceType");

    /**
     * Static value resourceWithoutLocation for SelectorKind.
     */
    public static final SelectorKind RESOURCE_WITHOUT_LOCATION = fromString("resourceWithoutLocation");

    /**
     * Static value policyDefinitionReferenceId for SelectorKind.
     */
    public static final SelectorKind POLICY_DEFINITION_REFERENCE_ID = fromString("policyDefinitionReferenceId");

    /**
     * Creates a new instance of SelectorKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SelectorKind() {
    }

    /**
     * Creates or finds a SelectorKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SelectorKind.
     */
    @JsonCreator
    public static SelectorKind fromString(String name) {
        return fromString(name, SelectorKind.class);
    }

    /**
     * Gets known SelectorKind values.
     * 
     * @return known SelectorKind values.
     */
    public static Collection<SelectorKind> values() {
        return values(SelectorKind.class);
    }
}
