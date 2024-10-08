// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.implementation.http.rest;

/**
 * A Substitution is a value that can be used to replace placeholder values in a URI. Placeholders look like:
 * "http://{host}.com/{fileName}.html", where "{host}" and "{fileName}" are the placeholders.
 */
public class Substitution {
    private final String uriParameterName;
    private final int methodParameterIndex;
    private final boolean shouldEncode;

    /**
     * Create a new Substitution.
     *
     * @param uriParameterName The name that is used between curly quotes as a placeholder in the target URI.
     * @param methodParameterIndex The index of the parameter in the original interface method where the value for the
     * placeholder is.
     * @param shouldEncode Whether the value from the method's argument should be encoded when the substitution is
     * taking place.
     */
    public Substitution(String uriParameterName, int methodParameterIndex, boolean shouldEncode) {
        this.uriParameterName = uriParameterName;
        this.methodParameterIndex = methodParameterIndex;
        this.shouldEncode = shouldEncode;
    }

    /**
     * Get the placeholder's name.
     *
     * @return The name of the placeholder.
     */
    public String getUriParameterName() {
        return uriParameterName;
    }

    /**
     * Get the index of the method parameter where the replacement value is.
     *
     * @return The index of the method parameter where the replacement value is.
     */
    public int getMethodParameterIndex() {
        return methodParameterIndex;
    }

    /**
     * Whether the replacement value from the method argument needs to be encoded when the substitution is taking
     * place.
     *
     * @return Whether the replacement value from the method argument needs to be encoded when the substitution is
     * taking place.
     */
    public boolean shouldEncode() {
        return shouldEncode;
    }
}
