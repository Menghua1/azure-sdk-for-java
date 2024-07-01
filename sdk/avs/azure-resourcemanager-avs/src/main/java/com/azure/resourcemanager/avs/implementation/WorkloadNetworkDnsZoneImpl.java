// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkDnsZoneInner;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsZone;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsZoneProvisioningState;
import java.util.Collections;
import java.util.List;

public final class WorkloadNetworkDnsZoneImpl
    implements WorkloadNetworkDnsZone, WorkloadNetworkDnsZone.Definition, WorkloadNetworkDnsZone.Update {
    private WorkloadNetworkDnsZoneInner innerObject;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

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

    public String displayName() {
        return this.innerModel().displayName();
    }

    public List<String> domain() {
        List<String> inner = this.innerModel().domain();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> dnsServerIps() {
        List<String> inner = this.innerModel().dnsServerIps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String sourceIp() {
        return this.innerModel().sourceIp();
    }

    public Long dnsServices() {
        return this.innerModel().dnsServices();
    }

    public WorkloadNetworkDnsZoneProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Long revision() {
        return this.innerModel().revision();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public WorkloadNetworkDnsZoneInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String privateCloudName;

    private String dnsZoneId;

    public WorkloadNetworkDnsZoneImpl withExistingPrivateCloud(String resourceGroupName, String privateCloudName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        return this;
    }

    public WorkloadNetworkDnsZone create() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .createDnsZone(resourceGroupName, privateCloudName, dnsZoneId, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadNetworkDnsZone create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .createDnsZone(resourceGroupName, privateCloudName, dnsZoneId, this.innerModel(), context);
        return this;
    }

    WorkloadNetworkDnsZoneImpl(String name, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = new WorkloadNetworkDnsZoneInner();
        this.serviceManager = serviceManager;
        this.dnsZoneId = name;
    }

    public WorkloadNetworkDnsZoneImpl update() {
        return this;
    }

    public WorkloadNetworkDnsZone apply() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .updateDnsZone(resourceGroupName, privateCloudName, dnsZoneId, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadNetworkDnsZone apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .updateDnsZone(resourceGroupName, privateCloudName, dnsZoneId, this.innerModel(), context);
        return this;
    }

    WorkloadNetworkDnsZoneImpl(WorkloadNetworkDnsZoneInner innerObject,
        com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.privateCloudName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateClouds");
        this.dnsZoneId = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "dnsZones");
    }

    public WorkloadNetworkDnsZone refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .getDnsZoneWithResponse(resourceGroupName, privateCloudName, dnsZoneId, Context.NONE)
            .getValue();
        return this;
    }

    public WorkloadNetworkDnsZone refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .getDnsZoneWithResponse(resourceGroupName, privateCloudName, dnsZoneId, context)
            .getValue();
        return this;
    }

    public WorkloadNetworkDnsZoneImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public WorkloadNetworkDnsZoneImpl withDomain(List<String> domain) {
        this.innerModel().withDomain(domain);
        return this;
    }

    public WorkloadNetworkDnsZoneImpl withDnsServerIps(List<String> dnsServerIps) {
        this.innerModel().withDnsServerIps(dnsServerIps);
        return this;
    }

    public WorkloadNetworkDnsZoneImpl withSourceIp(String sourceIp) {
        this.innerModel().withSourceIp(sourceIp);
        return this;
    }

    public WorkloadNetworkDnsZoneImpl withDnsServices(Long dnsServices) {
        this.innerModel().withDnsServices(dnsServices);
        return this;
    }

    public WorkloadNetworkDnsZoneImpl withRevision(Long revision) {
        this.innerModel().withRevision(revision);
        return this;
    }
}
