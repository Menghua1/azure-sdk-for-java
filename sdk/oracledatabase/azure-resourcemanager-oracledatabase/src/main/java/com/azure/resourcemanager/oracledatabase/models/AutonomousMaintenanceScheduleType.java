// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Autonomous database maintenance schedule type enum.
 */
public final class AutonomousMaintenanceScheduleType extends ExpandableStringEnum<AutonomousMaintenanceScheduleType> {
    /**
     * Static value Early for AutonomousMaintenanceScheduleType.
     */
    public static final AutonomousMaintenanceScheduleType EARLY = fromString("Early");

    /**
     * Static value Regular for AutonomousMaintenanceScheduleType.
     */
    public static final AutonomousMaintenanceScheduleType REGULAR = fromString("Regular");

    /**
     * Creates a new instance of AutonomousMaintenanceScheduleType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutonomousMaintenanceScheduleType() {
    }

    /**
     * Creates or finds a AutonomousMaintenanceScheduleType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AutonomousMaintenanceScheduleType.
     */
    @JsonCreator
    public static AutonomousMaintenanceScheduleType fromString(String name) {
        return fromString(name, AutonomousMaintenanceScheduleType.class);
    }

    /**
     * Gets known AutonomousMaintenanceScheduleType values.
     * 
     * @return known AutonomousMaintenanceScheduleType values.
     */
    public static Collection<AutonomousMaintenanceScheduleType> values() {
        return values(AutonomousMaintenanceScheduleType.class);
    }
}
