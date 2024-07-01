// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Defines values for RecordingKind. */
public final class RecordingKind extends ExpandableStringEnum<RecordingKind> {
    /** Static value AzureCommunicationServices for RecordingKind. */
    public static final RecordingKind AZURE_COMMUNICATION_SERVICES = fromString("AzureCommunicationServices");

    /** Static value Teams for RecordingKind. */
    public static final RecordingKind TEAMS = fromString("Teams");

    /** Static value TeamsCompliance for RecordingKind. */
    public static final RecordingKind TEAMS_COMPLIANCE = fromString("TeamsCompliance");

    /**
     * Creates a new instance of RecordingKind value.
     */
    public RecordingKind() {}

    /**
     * Creates or finds a RecordingKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecordingKind.
     */
    public static RecordingKind fromString(String name) {
        return fromString(name, RecordingKind.class);
    }

    /**
     * Gets known RecordingKind values.
     *
     * @return known RecordingKind values.
     */
    public static Collection<RecordingKind> values() {
        return values(RecordingKind.class);
    }
}
