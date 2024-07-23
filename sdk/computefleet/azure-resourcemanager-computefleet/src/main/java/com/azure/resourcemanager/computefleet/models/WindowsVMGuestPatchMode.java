// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual
 * machines associated to virtual machine scale set with OrchestrationMode as
 * Flexible.
 */
public final class WindowsVMGuestPatchMode extends ExpandableStringEnum<WindowsVMGuestPatchMode> {
    /**
     * Static value Manual for WindowsVMGuestPatchMode.
     */
    public static final WindowsVMGuestPatchMode MANUAL = fromString("Manual");

    /**
     * Static value AutomaticByOS for WindowsVMGuestPatchMode.
     */
    public static final WindowsVMGuestPatchMode AUTOMATIC_BY_OS = fromString("AutomaticByOS");

    /**
     * Static value AutomaticByPlatform for WindowsVMGuestPatchMode.
     */
    public static final WindowsVMGuestPatchMode AUTOMATIC_BY_PLATFORM = fromString("AutomaticByPlatform");

    /**
     * Creates a new instance of WindowsVMGuestPatchMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WindowsVMGuestPatchMode() {
    }

    /**
     * Creates or finds a WindowsVMGuestPatchMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WindowsVMGuestPatchMode.
     */
    public static WindowsVMGuestPatchMode fromString(String name) {
        return fromString(name, WindowsVMGuestPatchMode.class);
    }

    /**
     * Gets known WindowsVMGuestPatchMode values.
     * 
     * @return known WindowsVMGuestPatchMode values.
     */
    public static Collection<WindowsVMGuestPatchMode> values() {
        return values(WindowsVMGuestPatchMode.class);
    }
}
