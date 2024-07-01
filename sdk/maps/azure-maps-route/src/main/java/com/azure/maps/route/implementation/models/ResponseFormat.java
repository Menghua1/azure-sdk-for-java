// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ResponseFormat.
 */
public final class ResponseFormat extends ExpandableStringEnum<ResponseFormat> {
    /**
     * [The JavaScript Object Notation Data Interchange Format](https://tools.ietf.org/html/rfc8259).
     */
    public static final ResponseFormat JSON = fromString("json");

    /**
     * [The Extensible Markup Language](https://www.w3.org/TR/xml/).
     */
    public static final ResponseFormat XML = fromString("xml");

    /**
     * Creates a new instance of ResponseFormat value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResponseFormat() {
    }

    /**
     * Creates or finds a ResponseFormat from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResponseFormat.
     */
    public static ResponseFormat fromString(String name) {
        return fromString(name, ResponseFormat.class);
    }

    /**
     * Gets known ResponseFormat values.
     * 
     * @return known ResponseFormat values.
     */
    public static Collection<ResponseFormat> values() {
        return values(ResponseFormat.class);
    }
}
