// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.DiagnosticsPackagesClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.DiagnosticsPackageInner;
import com.azure.resourcemanager.mobilenetwork.models.DiagnosticsPackage;
import com.azure.resourcemanager.mobilenetwork.models.DiagnosticsPackages;

public final class DiagnosticsPackagesImpl implements DiagnosticsPackages {
    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticsPackagesImpl.class);

    private final DiagnosticsPackagesClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public DiagnosticsPackagesImpl(DiagnosticsPackagesClient innerClient,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DiagnosticsPackage createOrUpdate(String resourceGroupName, String packetCoreControlPlaneName,
        String diagnosticsPackageName) {
        DiagnosticsPackageInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, packetCoreControlPlaneName, diagnosticsPackageName);
        if (inner != null) {
            return new DiagnosticsPackageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DiagnosticsPackage createOrUpdate(String resourceGroupName, String packetCoreControlPlaneName,
        String diagnosticsPackageName, Context context) {
        DiagnosticsPackageInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, packetCoreControlPlaneName, diagnosticsPackageName, context);
        if (inner != null) {
            return new DiagnosticsPackageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticsPackage> getWithResponse(String resourceGroupName, String packetCoreControlPlaneName,
        String diagnosticsPackageName, Context context) {
        Response<DiagnosticsPackageInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, packetCoreControlPlaneName, diagnosticsPackageName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiagnosticsPackageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticsPackage get(String resourceGroupName, String packetCoreControlPlaneName,
        String diagnosticsPackageName) {
        DiagnosticsPackageInner inner
            = this.serviceClient().get(resourceGroupName, packetCoreControlPlaneName, diagnosticsPackageName);
        if (inner != null) {
            return new DiagnosticsPackageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName) {
        this.serviceClient().delete(resourceGroupName, packetCoreControlPlaneName, diagnosticsPackageName);
    }

    public void delete(String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, packetCoreControlPlaneName, diagnosticsPackageName, context);
    }

    public PagedIterable<DiagnosticsPackage> listByPacketCoreControlPlane(String resourceGroupName,
        String packetCoreControlPlaneName) {
        PagedIterable<DiagnosticsPackageInner> inner
            = this.serviceClient().listByPacketCoreControlPlane(resourceGroupName, packetCoreControlPlaneName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DiagnosticsPackageImpl(inner1, this.manager()));
    }

    public PagedIterable<DiagnosticsPackage> listByPacketCoreControlPlane(String resourceGroupName,
        String packetCoreControlPlaneName, Context context) {
        PagedIterable<DiagnosticsPackageInner> inner
            = this.serviceClient().listByPacketCoreControlPlane(resourceGroupName, packetCoreControlPlaneName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DiagnosticsPackageImpl(inner1, this.manager()));
    }

    private DiagnosticsPackagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }
}
