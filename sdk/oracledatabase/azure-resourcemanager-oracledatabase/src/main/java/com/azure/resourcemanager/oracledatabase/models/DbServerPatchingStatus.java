// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * DB Server patching status enum.
 */
public final class DbServerPatchingStatus extends ExpandableStringEnum<DbServerPatchingStatus> {
    /**
     * Static value Scheduled for DbServerPatchingStatus.
     */
    public static final DbServerPatchingStatus SCHEDULED = fromString("Scheduled");

    /**
     * Static value MaintenanceInProgress for DbServerPatchingStatus.
     */
    public static final DbServerPatchingStatus MAINTENANCE_IN_PROGRESS = fromString("MaintenanceInProgress");

    /**
     * Static value Failed for DbServerPatchingStatus.
     */
    public static final DbServerPatchingStatus FAILED = fromString("Failed");

    /**
     * Static value Complete for DbServerPatchingStatus.
     */
    public static final DbServerPatchingStatus COMPLETE = fromString("Complete");

    /**
     * Creates a new instance of DbServerPatchingStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DbServerPatchingStatus() {
    }

    /**
     * Creates or finds a DbServerPatchingStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DbServerPatchingStatus.
     */
    @JsonCreator
    public static DbServerPatchingStatus fromString(String name) {
        return fromString(name, DbServerPatchingStatus.class);
    }

    /**
     * Gets known DbServerPatchingStatus values.
     * 
     * @return known DbServerPatchingStatus values.
     */
    public static Collection<DbServerPatchingStatus> values() {
        return values(DbServerPatchingStatus.class);
    }
}
