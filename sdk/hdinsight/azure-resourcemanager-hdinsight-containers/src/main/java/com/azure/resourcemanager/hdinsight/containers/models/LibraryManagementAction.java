// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The library management action.
 */
public final class LibraryManagementAction extends ExpandableStringEnum<LibraryManagementAction> {
    /**
     * Static value Install for LibraryManagementAction.
     */
    public static final LibraryManagementAction INSTALL = fromString("Install");

    /**
     * Static value Uninstall for LibraryManagementAction.
     */
    public static final LibraryManagementAction UNINSTALL = fromString("Uninstall");

    /**
     * Creates a new instance of LibraryManagementAction value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LibraryManagementAction() {
    }

    /**
     * Creates or finds a LibraryManagementAction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LibraryManagementAction.
     */
    public static LibraryManagementAction fromString(String name) {
        return fromString(name, LibraryManagementAction.class);
    }

    /**
     * Gets known LibraryManagementAction values.
     * 
     * @return known LibraryManagementAction values.
     */
    public static Collection<LibraryManagementAction> values() {
        return values(LibraryManagementAction.class);
    }
}
