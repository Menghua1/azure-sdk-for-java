// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The signed resource types that are accessible with the account SAS. Service (s): Access to service-level APIs;
 * Container (c): Access to container-level APIs; Object (o): Access to object-level APIs for blobs, queue messages,
 * table entities, and files.
 */
public final class SignedResourceTypes extends ExpandableStringEnum<SignedResourceTypes> {
    /**
     * Static value s for SignedResourceTypes.
     */
    public static final SignedResourceTypes S = fromString("s");

    /**
     * Static value c for SignedResourceTypes.
     */
    public static final SignedResourceTypes C = fromString("c");

    /**
     * Static value o for SignedResourceTypes.
     */
    public static final SignedResourceTypes O = fromString("o");

    /**
     * Creates a new instance of SignedResourceTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SignedResourceTypes() {
    }

    /**
     * Creates or finds a SignedResourceTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SignedResourceTypes.
     */
    @JsonCreator
    public static SignedResourceTypes fromString(String name) {
        return fromString(name, SignedResourceTypes.class);
    }

    /**
     * Gets known SignedResourceTypes values.
     * 
     * @return known SignedResourceTypes values.
     */
    public static Collection<SignedResourceTypes> values() {
        return values(SignedResourceTypes.class);
    }
}
