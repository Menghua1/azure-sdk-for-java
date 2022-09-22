// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** There can be multiple identifiers of different type per alert, this field specify the identifier type. */
public final class ResourceIdentifierType extends ExpandableStringEnum<ResourceIdentifierType> {
    /** Static value AzureResource for ResourceIdentifierType. */
    public static final ResourceIdentifierType AZURE_RESOURCE = fromString("AzureResource");

    /** Static value LogAnalytics for ResourceIdentifierType. */
    public static final ResourceIdentifierType LOG_ANALYTICS = fromString("LogAnalytics");

    /**
     * Creates or finds a ResourceIdentifierType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceIdentifierType.
     */
    @JsonCreator
    public static ResourceIdentifierType fromString(String name) {
        return fromString(name, ResourceIdentifierType.class);
    }

    /**
     * Gets known ResourceIdentifierType values.
     *
     * @return known ResourceIdentifierType values.
     */
    public static Collection<ResourceIdentifierType> values() {
        return values(ResourceIdentifierType.class);
    }
}
