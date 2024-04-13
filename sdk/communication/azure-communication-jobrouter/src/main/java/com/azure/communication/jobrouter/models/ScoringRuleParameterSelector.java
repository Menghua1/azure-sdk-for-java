// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Supported parameters for scoring workers used with BestWorkerMode.
 */
public final class ScoringRuleParameterSelector extends ExpandableStringEnum<ScoringRuleParameterSelector> {

    /**
     * Parameter to add job labels to scoring payload. Property is sent as `job`.
     */
    @Generated
    public static final ScoringRuleParameterSelector JOB_LABELS = fromString("jobLabels");

    /**
     * Parameter to add worker selectors from a job to scoring payload. Property is sent as `selectors`.
     */
    @Generated
    public static final ScoringRuleParameterSelector WORKER_SELECTORS = fromString("workerSelectors");

    /**
     * Creates a new instance of ScoringRuleParameterSelector value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ScoringRuleParameterSelector() {
    }

    /**
     * Creates or finds a ScoringRuleParameterSelector from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScoringRuleParameterSelector.
     */
    @Generated
    @JsonCreator
    public static ScoringRuleParameterSelector fromString(String name) {
        return fromString(name, ScoringRuleParameterSelector.class);
    }

    /**
     * Gets known ScoringRuleParameterSelector values.
     *
     * @return known ScoringRuleParameterSelector values.
     */
    @Generated
    public static Collection<ScoringRuleParameterSelector> values() {
        return values(ScoringRuleParameterSelector.class);
    }
}
