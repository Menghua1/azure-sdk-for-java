// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The partition mechanism that will be used for teradata read in parallel.
 */
public final class TeradataPartitionOption extends ExpandableStringEnum<TeradataPartitionOption> {
    /**
     * Static value None for TeradataPartitionOption.
     */
    public static final TeradataPartitionOption NONE = fromString("None");

    /**
     * Static value Hash for TeradataPartitionOption.
     */
    public static final TeradataPartitionOption HASH = fromString("Hash");

    /**
     * Static value DynamicRange for TeradataPartitionOption.
     */
    public static final TeradataPartitionOption DYNAMIC_RANGE = fromString("DynamicRange");

    /**
     * Creates a new instance of TeradataPartitionOption value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TeradataPartitionOption() {
    }

    /**
     * Creates or finds a TeradataPartitionOption from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TeradataPartitionOption.
     */
    public static TeradataPartitionOption fromString(String name) {
        return fromString(name, TeradataPartitionOption.class);
    }

    /**
     * Gets known TeradataPartitionOption values.
     * 
     * @return known TeradataPartitionOption values.
     */
    public static Collection<TeradataPartitionOption> values() {
        return values(TeradataPartitionOption.class);
    }
}
