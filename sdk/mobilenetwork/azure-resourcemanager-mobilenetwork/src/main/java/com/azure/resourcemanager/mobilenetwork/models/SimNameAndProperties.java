// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * SIM name and properties.
 */
@Fluent
public final class SimNameAndProperties {
    /*
     * The name of the SIM.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * SIM Properties.
     */
    @JsonProperty(value = "properties", required = true)
    private SimPropertiesFormat innerProperties = new SimPropertiesFormat();

    /**
     * Creates an instance of SimNameAndProperties class.
     */
    public SimNameAndProperties() {
    }

    /**
     * Get the name property: The name of the SIM.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SIM.
     * 
     * @param name the name value to set.
     * @return the SimNameAndProperties object itself.
     */
    public SimNameAndProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: SIM Properties.
     * 
     * @return the innerProperties value.
     */
    private SimPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the authenticationKey property: The Ki value for the SIM.
     * 
     * @return the authenticationKey value.
     */
    public String authenticationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationKey();
    }

    /**
     * Set the authenticationKey property: The Ki value for the SIM.
     * 
     * @param authenticationKey the authenticationKey value to set.
     * @return the SimNameAndProperties object itself.
     */
    public SimNameAndProperties withAuthenticationKey(String authenticationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPropertiesFormat();
        }
        this.innerProperties().withAuthenticationKey(authenticationKey);
        return this;
    }

    /**
     * Get the operatorKeyCode property: The Opc value for the SIM.
     * 
     * @return the operatorKeyCode value.
     */
    public String operatorKeyCode() {
        return this.innerProperties() == null ? null : this.innerProperties().operatorKeyCode();
    }

    /**
     * Set the operatorKeyCode property: The Opc value for the SIM.
     * 
     * @param operatorKeyCode the operatorKeyCode value to set.
     * @return the SimNameAndProperties object itself.
     */
    public SimNameAndProperties withOperatorKeyCode(String operatorKeyCode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPropertiesFormat();
        }
        this.innerProperties().withOperatorKeyCode(operatorKeyCode);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the SIM resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the simState property: The state of the SIM resource.
     * 
     * @return the simState value.
     */
    public SimState simState() {
        return this.innerProperties() == null ? null : this.innerProperties().simState();
    }

    /**
     * Get the siteProvisioningState property: A dictionary of sites to the provisioning state of this SIM on that site.
     * 
     * @return the siteProvisioningState value.
     */
    public Map<String, SiteProvisioningState> siteProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().siteProvisioningState();
    }

    /**
     * Get the internationalMobileSubscriberIdentity property: The international mobile subscriber identity (IMSI) for
     * the SIM.
     * 
     * @return the internationalMobileSubscriberIdentity value.
     */
    public String internationalMobileSubscriberIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().internationalMobileSubscriberIdentity();
    }

    /**
     * Set the internationalMobileSubscriberIdentity property: The international mobile subscriber identity (IMSI) for
     * the SIM.
     * 
     * @param internationalMobileSubscriberIdentity the internationalMobileSubscriberIdentity value to set.
     * @return the SimNameAndProperties object itself.
     */
    public SimNameAndProperties
        withInternationalMobileSubscriberIdentity(String internationalMobileSubscriberIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPropertiesFormat();
        }
        this.innerProperties().withInternationalMobileSubscriberIdentity(internationalMobileSubscriberIdentity);
        return this;
    }

    /**
     * Get the integratedCircuitCardIdentifier property: The integrated circuit card ID (ICCID) for the SIM.
     * 
     * @return the integratedCircuitCardIdentifier value.
     */
    public String integratedCircuitCardIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().integratedCircuitCardIdentifier();
    }

    /**
     * Set the integratedCircuitCardIdentifier property: The integrated circuit card ID (ICCID) for the SIM.
     * 
     * @param integratedCircuitCardIdentifier the integratedCircuitCardIdentifier value to set.
     * @return the SimNameAndProperties object itself.
     */
    public SimNameAndProperties withIntegratedCircuitCardIdentifier(String integratedCircuitCardIdentifier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPropertiesFormat();
        }
        this.innerProperties().withIntegratedCircuitCardIdentifier(integratedCircuitCardIdentifier);
        return this;
    }

    /**
     * Get the deviceType property: An optional free-form text field that can be used to record the device type this SIM
     * is associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped and filtered based on
     * this value.
     * 
     * @return the deviceType value.
     */
    public String deviceType() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceType();
    }

    /**
     * Set the deviceType property: An optional free-form text field that can be used to record the device type this SIM
     * is associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped and filtered based on
     * this value.
     * 
     * @param deviceType the deviceType value to set.
     * @return the SimNameAndProperties object itself.
     */
    public SimNameAndProperties withDeviceType(String deviceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPropertiesFormat();
        }
        this.innerProperties().withDeviceType(deviceType);
        return this;
    }

    /**
     * Get the simPolicy property: The SIM policy used by this SIM. The SIM policy must be in the same location as the
     * SIM.
     * 
     * @return the simPolicy value.
     */
    public SimPolicyResourceId simPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().simPolicy();
    }

    /**
     * Set the simPolicy property: The SIM policy used by this SIM. The SIM policy must be in the same location as the
     * SIM.
     * 
     * @param simPolicy the simPolicy value to set.
     * @return the SimNameAndProperties object itself.
     */
    public SimNameAndProperties withSimPolicy(SimPolicyResourceId simPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPropertiesFormat();
        }
        this.innerProperties().withSimPolicy(simPolicy);
        return this;
    }

    /**
     * Get the staticIpConfiguration property: A list of static IP addresses assigned to this SIM. Each address is
     * assigned at a defined network scope, made up of {attached data network, slice}.
     * 
     * @return the staticIpConfiguration value.
     */
    public List<SimStaticIpProperties> staticIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().staticIpConfiguration();
    }

    /**
     * Set the staticIpConfiguration property: A list of static IP addresses assigned to this SIM. Each address is
     * assigned at a defined network scope, made up of {attached data network, slice}.
     * 
     * @param staticIpConfiguration the staticIpConfiguration value to set.
     * @return the SimNameAndProperties object itself.
     */
    public SimNameAndProperties withStaticIpConfiguration(List<SimStaticIpProperties> staticIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimPropertiesFormat();
        }
        this.innerProperties().withStaticIpConfiguration(staticIpConfiguration);
        return this;
    }

    /**
     * Get the vendorName property: The name of the SIM vendor who provided this SIM, if any.
     * 
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.innerProperties() == null ? null : this.innerProperties().vendorName();
    }

    /**
     * Get the vendorKeyFingerprint property: The public key fingerprint of the SIM vendor who provided this SIM, if
     * any.
     * 
     * @return the vendorKeyFingerprint value.
     */
    public String vendorKeyFingerprint() {
        return this.innerProperties() == null ? null : this.innerProperties().vendorKeyFingerprint();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model SimNameAndProperties"));
        }
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model SimNameAndProperties"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SimNameAndProperties.class);
}
