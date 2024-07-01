// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The property is for NFS share only. The default is NoRootSquash.
 */
public final class RootSquashType extends ExpandableStringEnum<RootSquashType> {
    /**
     * Static value NoRootSquash for RootSquashType.
     */
    public static final RootSquashType NO_ROOT_SQUASH = fromString("NoRootSquash");

    /**
     * Static value RootSquash for RootSquashType.
     */
    public static final RootSquashType ROOT_SQUASH = fromString("RootSquash");

    /**
     * Static value AllSquash for RootSquashType.
     */
    public static final RootSquashType ALL_SQUASH = fromString("AllSquash");

    /**
     * Creates a new instance of RootSquashType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RootSquashType() {
    }

    /**
     * Creates or finds a RootSquashType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RootSquashType.
     */
    @JsonCreator
    public static RootSquashType fromString(String name) {
        return fromString(name, RootSquashType.class);
    }

    /**
     * Gets known RootSquashType values.
     * 
     * @return known RootSquashType values.
     */
    public static Collection<RootSquashType> values() {
        return values(RootSquashType.class);
    }
}
