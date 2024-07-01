// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The subscription state. Possible values are Enabled, Warned, PastDue, Disabled, and Deleted.
 */
public enum SubscriptionState {
    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Warned.
     */
    WARNED("Warned"),

    /**
     * Enum value PastDue.
     */
    PAST_DUE("PastDue"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled"),

    /**
     * Enum value Deleted.
     */
    DELETED("Deleted");

    /**
     * The actual serialized value for a SubscriptionState instance.
     */
    private final String value;

    SubscriptionState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SubscriptionState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SubscriptionState object, or null if unable to parse.
     */
    @JsonCreator
    public static SubscriptionState fromString(String value) {
        if (value == null) {
            return null;
        }
        SubscriptionState[] items = SubscriptionState.values();
        for (SubscriptionState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
