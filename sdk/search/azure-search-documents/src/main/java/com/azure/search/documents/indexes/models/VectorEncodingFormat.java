// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The encoding format for interpreting vector field contents.
 */
public final class VectorEncodingFormat extends ExpandableStringEnum<VectorEncodingFormat> {
    /**
     * Encoding format representing bits packed into a wider data type.
     */
    public static final VectorEncodingFormat PACKED_BIT = fromString("packedBit");

    /**
     * Creates a new instance of VectorEncodingFormat value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VectorEncodingFormat() {
    }

    /**
     * Creates or finds a VectorEncodingFormat from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VectorEncodingFormat.
     */
    public static VectorEncodingFormat fromString(String name) {
        return fromString(name, VectorEncodingFormat.class);
    }

    /**
     * Gets known VectorEncodingFormat values.
     * 
     * @return known VectorEncodingFormat values.
     */
    public static Collection<VectorEncodingFormat> values() {
        return values(VectorEncodingFormat.class);
    }
}
