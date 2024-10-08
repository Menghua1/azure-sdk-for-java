// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.azurestackhci.fluent.models.OfferInner;
import com.azure.resourcemanager.azurestackhci.models.Offer;
import com.azure.resourcemanager.azurestackhci.models.SkuMappings;
import java.util.Collections;
import java.util.List;

public final class OfferImpl implements Offer {
    private OfferInner innerObject;

    private final com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager;

    OfferImpl(OfferInner innerObject, com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String publisherId() {
        return this.innerModel().publisherId();
    }

    public String content() {
        return this.innerModel().content();
    }

    public String contentVersion() {
        return this.innerModel().contentVersion();
    }

    public List<SkuMappings> skuMappings() {
        List<SkuMappings> inner = this.innerModel().skuMappings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OfferInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager() {
        return this.serviceManager;
    }
}
