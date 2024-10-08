// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status of billing request.
 */
public final class BillingRequestStatus extends ExpandableStringEnum<BillingRequestStatus> {
    /**
     * Static value Other for BillingRequestStatus.
     */
    public static final BillingRequestStatus OTHER = fromString("Other");

    /**
     * Static value Pending for BillingRequestStatus.
     */
    public static final BillingRequestStatus PENDING = fromString("Pending");

    /**
     * Static value Approved for BillingRequestStatus.
     */
    public static final BillingRequestStatus APPROVED = fromString("Approved");

    /**
     * Static value Declined for BillingRequestStatus.
     */
    public static final BillingRequestStatus DECLINED = fromString("Declined");

    /**
     * Static value Cancelled for BillingRequestStatus.
     */
    public static final BillingRequestStatus CANCELLED = fromString("Cancelled");

    /**
     * Static value Completed for BillingRequestStatus.
     */
    public static final BillingRequestStatus COMPLETED = fromString("Completed");

    /**
     * Static value Expired for BillingRequestStatus.
     */
    public static final BillingRequestStatus EXPIRED = fromString("Expired");

    /**
     * Creates a new instance of BillingRequestStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BillingRequestStatus() {
    }

    /**
     * Creates or finds a BillingRequestStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BillingRequestStatus.
     */
    public static BillingRequestStatus fromString(String name) {
        return fromString(name, BillingRequestStatus.class);
    }

    /**
     * Gets known BillingRequestStatus values.
     * 
     * @return known BillingRequestStatus values.
     */
    public static Collection<BillingRequestStatus> values() {
        return values(BillingRequestStatus.class);
    }
}
