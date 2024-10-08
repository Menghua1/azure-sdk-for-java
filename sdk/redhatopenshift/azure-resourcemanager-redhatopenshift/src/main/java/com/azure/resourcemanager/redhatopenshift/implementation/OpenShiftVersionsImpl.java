// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redhatopenshift.fluent.OpenShiftVersionsClient;
import com.azure.resourcemanager.redhatopenshift.fluent.models.OpenShiftVersionInner;
import com.azure.resourcemanager.redhatopenshift.models.OpenShiftVersion;
import com.azure.resourcemanager.redhatopenshift.models.OpenShiftVersions;

public final class OpenShiftVersionsImpl implements OpenShiftVersions {
    private static final ClientLogger LOGGER = new ClientLogger(OpenShiftVersionsImpl.class);

    private final OpenShiftVersionsClient innerClient;

    private final com.azure.resourcemanager.redhatopenshift.RedHatOpenShiftManager serviceManager;

    public OpenShiftVersionsImpl(OpenShiftVersionsClient innerClient,
        com.azure.resourcemanager.redhatopenshift.RedHatOpenShiftManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OpenShiftVersion> list(String location) {
        PagedIterable<OpenShiftVersionInner> inner = this.serviceClient().list(location);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OpenShiftVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<OpenShiftVersion> list(String location, Context context) {
        PagedIterable<OpenShiftVersionInner> inner = this.serviceClient().list(location, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OpenShiftVersionImpl(inner1, this.manager()));
    }

    private OpenShiftVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.redhatopenshift.RedHatOpenShiftManager manager() {
        return this.serviceManager;
    }
}
