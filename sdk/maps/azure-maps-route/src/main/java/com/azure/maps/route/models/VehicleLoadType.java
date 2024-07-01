// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for VehicleLoadType.
 */
public final class VehicleLoadType extends ExpandableStringEnum<VehicleLoadType> {

    /**
     * Explosives.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS1 = fromString("USHazmatClass1");

    /**
     * Compressed gas.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS2 = fromString("USHazmatClass2");

    /**
     * Flammable liquids.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS3 = fromString("USHazmatClass3");

    /**
     * Flammable solids.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS4 = fromString("USHazmatClass4");

    /**
     * Oxidizers.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS5 = fromString("USHazmatClass5");

    /**
     * Poisons.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS6 = fromString("USHazmatClass6");

    /**
     * Radioactive.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS7 = fromString("USHazmatClass7");

    /**
     * Corrosives.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS8 = fromString("USHazmatClass8");

    /**
     * Miscellaneous.
     */
    public static final VehicleLoadType US_HAZMAT_CLASS9 = fromString("USHazmatClass9");

    /**
     * Explosives.
     */
    public static final VehicleLoadType OTHER_HAZMAT_EXPLOSIVE = fromString("otherHazmatExplosive");

    /**
     * Miscellaneous.
     */
    public static final VehicleLoadType OTHER_HAZMAT_GENERAL = fromString("otherHazmatGeneral");

    /**
     * Harmful to water.
     */
    public static final VehicleLoadType OTHER_HAZMAT_HARMFUL_TO_WATER = fromString("otherHazmatHarmfulToWater");

    /**
     * Creates a new instance of VehicleLoadType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VehicleLoadType() {
    }

    /**
     * Creates or finds a VehicleLoadType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VehicleLoadType.
     */
    public static VehicleLoadType fromString(String name) {
        return fromString(name, VehicleLoadType.class);
    }

    /**
     * Gets known VehicleLoadType values.
     *
     * @return known VehicleLoadType values.
     */
    public static Collection<VehicleLoadType> values() {
        return values(VehicleLoadType.class);
    }
}
