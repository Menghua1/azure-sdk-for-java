// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Represents the identity type: systemAssigned, userAssigned, None.
 */
public final class ManagedIdentityType extends ExpandableStringEnum<ManagedIdentityType> {
    /**
     * Static value None for ManagedIdentityType.
     */
    public static final ManagedIdentityType NONE = fromString("None");

    /**
     * Static value SystemAssigned for ManagedIdentityType.
     */
    public static final ManagedIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /**
     * Static value UserAssigned for ManagedIdentityType.
     */
    public static final ManagedIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Creates a new instance of ManagedIdentityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedIdentityType() {
    }

    /**
     * Creates or finds a ManagedIdentityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagedIdentityType.
     */
    public static ManagedIdentityType fromString(String name) {
        return fromString(name, ManagedIdentityType.class);
    }

    /**
     * Gets known ManagedIdentityType values.
     * 
     * @return known ManagedIdentityType values.
     */
    public static Collection<ManagedIdentityType> values() {
        return values(ManagedIdentityType.class);
    }
}
