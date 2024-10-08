// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the eligibility status of the payment terms.
 */
public final class PaymentTermsEligibilityStatus extends ExpandableStringEnum<PaymentTermsEligibilityStatus> {
    /**
     * Static value Other for PaymentTermsEligibilityStatus.
     */
    public static final PaymentTermsEligibilityStatus OTHER = fromString("Other");

    /**
     * Static value Valid for PaymentTermsEligibilityStatus.
     */
    public static final PaymentTermsEligibilityStatus VALID = fromString("Valid");

    /**
     * Static value Invalid for PaymentTermsEligibilityStatus.
     */
    public static final PaymentTermsEligibilityStatus INVALID = fromString("Invalid");

    /**
     * Creates a new instance of PaymentTermsEligibilityStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PaymentTermsEligibilityStatus() {
    }

    /**
     * Creates or finds a PaymentTermsEligibilityStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PaymentTermsEligibilityStatus.
     */
    public static PaymentTermsEligibilityStatus fromString(String name) {
        return fromString(name, PaymentTermsEligibilityStatus.class);
    }

    /**
     * Gets known PaymentTermsEligibilityStatus values.
     * 
     * @return known PaymentTermsEligibilityStatus values.
     */
    public static Collection<PaymentTermsEligibilityStatus> values() {
        return values(PaymentTermsEligibilityStatus.class);
    }
}
