// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Defines values for UserSourceType. */
public final class UserSourceType extends ExpandableStringEnum<UserSourceType> {
    /** Static value Jar for UserSourceType. */
    public static final UserSourceType JAR = fromString("Jar");

    /** Static value NetCoreZip for UserSourceType. */
    public static final UserSourceType NET_CORE_ZIP = fromString("NetCoreZip");

    /** Static value Source for UserSourceType. */
    public static final UserSourceType SOURCE = fromString("Source");

    /** Static value BuildResult for UserSourceType. */
    public static final UserSourceType BUILD_RESULT = fromString("BuildResult");

    /**
     * Creates or finds a UserSourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UserSourceType.
     */
    public static UserSourceType fromString(String name) {
        return fromString(name, UserSourceType.class);
    }

    /** @return known UserSourceType values. */
    public static Collection<UserSourceType> values() {
        return values(UserSourceType.class);
    }
}
