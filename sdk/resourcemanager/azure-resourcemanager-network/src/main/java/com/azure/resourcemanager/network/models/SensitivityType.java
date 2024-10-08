// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the sensitivity for the rule.
 */
public final class SensitivityType extends ExpandableStringEnum<SensitivityType> {
    /**
     * Static value None for SensitivityType.
     */
    public static final SensitivityType NONE = fromString("None");

    /**
     * Static value Low for SensitivityType.
     */
    public static final SensitivityType LOW = fromString("Low");

    /**
     * Static value Medium for SensitivityType.
     */
    public static final SensitivityType MEDIUM = fromString("Medium");

    /**
     * Static value High for SensitivityType.
     */
    public static final SensitivityType HIGH = fromString("High");

    /**
     * Creates a new instance of SensitivityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SensitivityType() {
    }

    /**
     * Creates or finds a SensitivityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SensitivityType.
     */
    public static SensitivityType fromString(String name) {
        return fromString(name, SensitivityType.class);
    }

    /**
     * Gets known SensitivityType values.
     * 
     * @return known SensitivityType values.
     */
    public static Collection<SensitivityType> values() {
        return values(SensitivityType.class);
    }
}
