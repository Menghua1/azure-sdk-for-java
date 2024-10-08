// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * OS type
 * 
 * Operating system type used by the VM.
 */
public final class VMPriceOSType extends ExpandableStringEnum<VMPriceOSType> {
    /**
     * Static value Linux for VMPriceOSType.
     */
    public static final VMPriceOSType LINUX = fromString("Linux");

    /**
     * Static value Windows for VMPriceOSType.
     */
    public static final VMPriceOSType WINDOWS = fromString("Windows");

    /**
     * Creates a new instance of VMPriceOSType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VMPriceOSType() {
    }

    /**
     * Creates or finds a VMPriceOSType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VMPriceOSType.
     */
    public static VMPriceOSType fromString(String name) {
        return fromString(name, VMPriceOSType.class);
    }

    /**
     * Gets known VMPriceOSType values.
     * 
     * @return known VMPriceOSType values.
     */
    public static Collection<VMPriceOSType> values() {
        return values(VMPriceOSType.class);
    }
}
