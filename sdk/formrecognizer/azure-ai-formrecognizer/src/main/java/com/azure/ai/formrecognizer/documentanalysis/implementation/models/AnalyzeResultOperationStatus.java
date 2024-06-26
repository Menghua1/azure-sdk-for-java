// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

/**
 * Operation status.
 */
public enum AnalyzeResultOperationStatus {
    /**
     * The operation has not started yet.
     */
    NOT_STARTED("notStarted"),

    /**
     * The operation is in progress.
     */
    RUNNING("running"),

    /**
     * The operation has failed.
     */
    FAILED("failed"),

    /**
     * The operation has succeeded.
     */
    SUCCEEDED("succeeded");

    /**
     * The actual serialized value for a AnalyzeResultOperationStatus instance.
     */
    private final String value;

    AnalyzeResultOperationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AnalyzeResultOperationStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AnalyzeResultOperationStatus object, or null if unable to parse.
     */
    public static AnalyzeResultOperationStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        AnalyzeResultOperationStatus[] items = AnalyzeResultOperationStatus.values();
        for (AnalyzeResultOperationStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
