// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitServiceProviderProperties;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.ServiceProviderProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Properties of ExpressRouteCircuit.
 */
@Fluent
public final class ExpressRouteCircuitPropertiesFormat {
    /*
     * Allow classic operations.
     */
    @JsonProperty(value = "allowClassicOperations")
    private Boolean allowClassicOperations;

    /*
     * The CircuitProvisioningState state of the resource.
     */
    @JsonProperty(value = "circuitProvisioningState")
    private String circuitProvisioningState;

    /*
     * The ServiceProviderProvisioningState state of the resource.
     */
    @JsonProperty(value = "serviceProviderProvisioningState")
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /*
     * The list of authorizations.
     */
    @JsonProperty(value = "authorizations")
    private List<ExpressRouteCircuitAuthorizationInner> authorizations;

    /*
     * The list of peerings.
     */
    @JsonProperty(value = "peerings")
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /*
     * The ServiceKey.
     */
    @JsonProperty(value = "serviceKey")
    private String serviceKey;

    /*
     * The ServiceProviderNotes.
     */
    @JsonProperty(value = "serviceProviderNotes")
    private String serviceProviderNotes;

    /*
     * The ServiceProviderProperties.
     */
    @JsonProperty(value = "serviceProviderProperties")
    private ExpressRouteCircuitServiceProviderProperties serviceProviderProperties;

    /*
     * The reference to the ExpressRoutePort resource when the circuit is provisioned on an ExpressRoutePort resource.
     */
    @JsonProperty(value = "expressRoutePort")
    private SubResource expressRoutePort;

    /*
     * The bandwidth of the circuit when the circuit is provisioned on an ExpressRoutePort resource.
     */
    @JsonProperty(value = "bandwidthInGbps")
    private Float bandwidthInGbps;

    /*
     * The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     */
    @JsonProperty(value = "stag", access = JsonProperty.Access.WRITE_ONLY)
    private Integer stag;

    /*
     * The provisioning state of the express route circuit resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "gatewayManagerEtag")
    private String gatewayManagerEtag;

    /*
     * Flag denoting global reach status.
     */
    @JsonProperty(value = "globalReachEnabled")
    private Boolean globalReachEnabled;

    /*
     * The authorizationKey.
     */
    @JsonProperty(value = "authorizationKey")
    private String authorizationKey;

    /*
     * The authorization status of the Circuit.
     */
    @JsonProperty(value = "authorizationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String authorizationStatus;

    /*
     * Flag denoting rate-limiting status of the ExpressRoute direct-port circuit.
     */
    @JsonProperty(value = "enableDirectPortRateLimit")
    private Boolean enableDirectPortRateLimit;

    /**
     * Creates an instance of ExpressRouteCircuitPropertiesFormat class.
     */
    public ExpressRouteCircuitPropertiesFormat() {
    }

    /**
     * Get the allowClassicOperations property: Allow classic operations.
     *
     * @return the allowClassicOperations value.
     */
    public Boolean allowClassicOperations() {
        return this.allowClassicOperations;
    }

    /**
     * Set the allowClassicOperations property: Allow classic operations.
     *
     * @param allowClassicOperations the allowClassicOperations value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withAllowClassicOperations(Boolean allowClassicOperations) {
        this.allowClassicOperations = allowClassicOperations;
        return this;
    }

    /**
     * Get the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     *
     * @return the circuitProvisioningState value.
     */
    public String circuitProvisioningState() {
        return this.circuitProvisioningState;
    }

    /**
     * Set the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     *
     * @param circuitProvisioningState the circuitProvisioningState value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withCircuitProvisioningState(String circuitProvisioningState) {
        this.circuitProvisioningState = circuitProvisioningState;
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     *
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat
        withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get the authorizations property: The list of authorizations.
     *
     * @return the authorizations value.
     */
    public List<ExpressRouteCircuitAuthorizationInner> authorizations() {
        return this.authorizations;
    }

    /**
     * Set the authorizations property: The list of authorizations.
     *
     * @param authorizations the authorizations value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat
        withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations) {
        this.authorizations = authorizations;
        return this;
    }

    /**
     * Get the peerings property: The list of peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the peerings property: The list of peerings.
     *
     * @param peerings the peerings value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
    }

    /**
     * Get the serviceKey property: The ServiceKey.
     *
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.serviceKey;
    }

    /**
     * Set the serviceKey property: The ServiceKey.
     *
     * @param serviceKey the serviceKey value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
        return this;
    }

    /**
     * Get the serviceProviderNotes property: The ServiceProviderNotes.
     *
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the serviceProviderNotes property: The ServiceProviderNotes.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
    }

    /**
     * Get the serviceProviderProperties property: The ServiceProviderProperties.
     *
     * @return the serviceProviderProperties value.
     */
    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return this.serviceProviderProperties;
    }

    /**
     * Set the serviceProviderProperties property: The ServiceProviderProperties.
     *
     * @param serviceProviderProperties the serviceProviderProperties value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat
        withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        this.serviceProviderProperties = serviceProviderProperties;
        return this;
    }

    /**
     * Get the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is provisioned
     * on an ExpressRoutePort resource.
     *
     * @return the expressRoutePort value.
     */
    public SubResource expressRoutePort() {
        return this.expressRoutePort;
    }

    /**
     * Set the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is provisioned
     * on an ExpressRoutePort resource.
     *
     * @param expressRoutePort the expressRoutePort value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withExpressRoutePort(SubResource expressRoutePort) {
        this.expressRoutePort = expressRoutePort;
        return this;
    }

    /**
     * Get the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     *
     * @return the bandwidthInGbps value.
     */
    public Float bandwidthInGbps() {
        return this.bandwidthInGbps;
    }

    /**
     * Set the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     *
     * @param bandwidthInGbps the bandwidthInGbps value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withBandwidthInGbps(Float bandwidthInGbps) {
        this.bandwidthInGbps = bandwidthInGbps;
        return this;
    }

    /**
     * Get the stag property: The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     *
     * @return the stag value.
     */
    public Integer stag() {
        return this.stag;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route circuit resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get the globalReachEnabled property: Flag denoting global reach status.
     *
     * @return the globalReachEnabled value.
     */
    public Boolean globalReachEnabled() {
        return this.globalReachEnabled;
    }

    /**
     * Set the globalReachEnabled property: Flag denoting global reach status.
     *
     * @param globalReachEnabled the globalReachEnabled value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withGlobalReachEnabled(Boolean globalReachEnabled) {
        this.globalReachEnabled = globalReachEnabled;
        return this;
    }

    /**
     * Get the authorizationKey property: The authorizationKey.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorizationKey.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the authorizationStatus property: The authorization status of the Circuit.
     *
     * @return the authorizationStatus value.
     */
    public String authorizationStatus() {
        return this.authorizationStatus;
    }

    /**
     * Get the enableDirectPortRateLimit property: Flag denoting rate-limiting status of the ExpressRoute direct-port
     * circuit.
     *
     * @return the enableDirectPortRateLimit value.
     */
    public Boolean enableDirectPortRateLimit() {
        return this.enableDirectPortRateLimit;
    }

    /**
     * Set the enableDirectPortRateLimit property: Flag denoting rate-limiting status of the ExpressRoute direct-port
     * circuit.
     *
     * @param enableDirectPortRateLimit the enableDirectPortRateLimit value to set.
     * @return the ExpressRouteCircuitPropertiesFormat object itself.
     */
    public ExpressRouteCircuitPropertiesFormat withEnableDirectPortRateLimit(Boolean enableDirectPortRateLimit) {
        this.enableDirectPortRateLimit = enableDirectPortRateLimit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorizations() != null) {
            authorizations().forEach(e -> e.validate());
        }
        if (peerings() != null) {
            peerings().forEach(e -> e.validate());
        }
        if (serviceProviderProperties() != null) {
            serviceProviderProperties().validate();
        }
    }
}
