// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AggregationFunctionType.
 */
public final class AggregationFunctionType extends ExpandableStringEnum<AggregationFunctionType> {
    /**
     * Static value avg for AggregationFunctionType.
     */
    public static final AggregationFunctionType AVG = fromString("avg");

    /**
     * Static value min for AggregationFunctionType.
     */
    public static final AggregationFunctionType MIN = fromString("min");

    /**
     * Static value max for AggregationFunctionType.
     */
    public static final AggregationFunctionType MAX = fromString("max");

    /**
     * Static value stdev for AggregationFunctionType.
     */
    public static final AggregationFunctionType STDEV = fromString("stdev");

    /**
     * Static value sum for AggregationFunctionType.
     */
    public static final AggregationFunctionType SUM = fromString("sum");

    /**
     * Creates a new instance of AggregationFunctionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AggregationFunctionType() {
    }

    /**
     * Creates or finds a AggregationFunctionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AggregationFunctionType.
     */
    public static AggregationFunctionType fromString(String name) {
        return fromString(name, AggregationFunctionType.class);
    }

    /**
     * Gets known AggregationFunctionType values.
     * 
     * @return known AggregationFunctionType values.
     */
    public static Collection<AggregationFunctionType> values() {
        return values(AggregationFunctionType.class);
    }
}
