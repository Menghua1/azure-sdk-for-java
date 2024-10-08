// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Replication role of the mongo cluster.
 */
public final class ReplicationRole extends ExpandableStringEnum<ReplicationRole> {
    /**
     * Static value Primary for ReplicationRole.
     */
    public static final ReplicationRole PRIMARY = fromString("Primary");

    /**
     * Static value AsyncReplica for ReplicationRole.
     */
    public static final ReplicationRole ASYNC_REPLICA = fromString("AsyncReplica");

    /**
     * Static value GeoAsyncReplica for ReplicationRole.
     */
    public static final ReplicationRole GEO_ASYNC_REPLICA = fromString("GeoAsyncReplica");

    /**
     * Creates a new instance of ReplicationRole value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReplicationRole() {
    }

    /**
     * Creates or finds a ReplicationRole from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReplicationRole.
     */
    public static ReplicationRole fromString(String name) {
        return fromString(name, ReplicationRole.class);
    }

    /**
     * Gets known ReplicationRole values.
     * 
     * @return known ReplicationRole values.
     */
    public static Collection<ReplicationRole> values() {
        return values(ReplicationRole.class);
    }
}
