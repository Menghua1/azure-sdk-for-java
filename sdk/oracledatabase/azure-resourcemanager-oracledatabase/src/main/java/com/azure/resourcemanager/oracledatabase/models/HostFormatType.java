// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Host format type enum.
 */
public final class HostFormatType extends ExpandableStringEnum<HostFormatType> {
    /**
     * Static value Fqdn for HostFormatType.
     */
    public static final HostFormatType FQDN = fromString("Fqdn");

    /**
     * Static value Ip for HostFormatType.
     */
    public static final HostFormatType IP = fromString("Ip");

    /**
     * Creates a new instance of HostFormatType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HostFormatType() {
    }

    /**
     * Creates or finds a HostFormatType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HostFormatType.
     */
    @JsonCreator
    public static HostFormatType fromString(String name) {
        return fromString(name, HostFormatType.class);
    }

    /**
     * Gets known HostFormatType values.
     * 
     * @return known HostFormatType values.
     */
    public static Collection<HostFormatType> values() {
        return values(HostFormatType.class);
    }
}
