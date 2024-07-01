// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.AvailabilityProperties;
import com.azure.resourcemanager.avs.models.Circuit;
import com.azure.resourcemanager.avs.models.DnsZoneType;
import com.azure.resourcemanager.avs.models.Encryption;
import com.azure.resourcemanager.avs.models.Endpoints;
import com.azure.resourcemanager.avs.models.IdentitySource;
import com.azure.resourcemanager.avs.models.InternetEnum;
import com.azure.resourcemanager.avs.models.ManagementCluster;
import com.azure.resourcemanager.avs.models.NsxPublicIpQuotaRaisedEnum;
import com.azure.resourcemanager.avs.models.PrivateCloudProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * The properties of a private cloud resource.
 */
@Fluent
public final class PrivateCloudProperties implements JsonSerializable<PrivateCloudProperties> {
    /*
     * The default cluster used for management
     */
    private ManagementCluster managementCluster;

    /*
     * Connectivity to internet is enabled or disabled
     */
    private InternetEnum internet;

    /*
     * vCenter Single Sign On Identity Sources
     */
    private List<IdentitySource> identitySources;

    /*
     * Properties describing how the cloud is distributed across availability zones
     */
    private AvailabilityProperties availability;

    /*
     * Customer managed key encryption, can be enabled or disabled
     */
    private Encryption encryption;

    /*
     * Array of additional networks noncontiguous with networkBlock. Networks must be
     * unique and non-overlapping across VNet in your subscription, on-premise, and
     * this privateCloud networkBlock attribute. Make sure the CIDR format conforms to
     * (A.B.C.D/X).
     */
    private List<String> extendedNetworkBlocks;

    /*
     * The provisioning state
     */
    private PrivateCloudProvisioningState provisioningState;

    /*
     * An ExpressRoute Circuit
     */
    private Circuit circuit;

    /*
     * The endpoints
     */
    private Endpoints endpoints;

    /*
     * The block of addresses should be unique across VNet in your subscription as
     * well as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where
     * A,B,C,D are between 0 and 255, and X is between 0 and 22
     */
    private String networkBlock;

    /*
     * Network used to access vCenter Server and NSX-T Manager
     */
    private String managementNetwork;

    /*
     * Used for virtual machine cold migration, cloning, and snapshot migration
     */
    private String provisioningNetwork;

    /*
     * Used for live migration of virtual machines
     */
    private String vmotionNetwork;

    /*
     * Optionally, set the vCenter admin password when the private cloud is created
     */
    private String vcenterPassword;

    /*
     * Optionally, set the NSX-T Manager password when the private cloud is created
     */
    private String nsxtPassword;

    /*
     * Thumbprint of the vCenter Server SSL certificate
     */
    private String vcenterCertificateThumbprint;

    /*
     * Thumbprint of the NSX-T Manager SSL certificate
     */
    private String nsxtCertificateThumbprint;

    /*
     * Array of cloud link IDs from other clouds that connect to this one
     */
    private List<String> externalCloudLinks;

    /*
     * A secondary expressRoute circuit from a separate AZ. Only present in a
     * stretched private cloud
     */
    private Circuit secondaryCircuit;

    /*
     * Flag to indicate whether the private cloud has the quota for provisioned NSX
     * Public IP count raised from 64 to 1024
     */
    private NsxPublicIpQuotaRaisedEnum nsxPublicIpQuotaRaised;

    /*
     * Azure resource ID of the virtual network
     */
    private String virtualNetworkId;

    /*
     * The type of DNS zone to use.
     */
    private DnsZoneType dnsZoneType;

    /**
     * Creates an instance of PrivateCloudProperties class.
     */
    public PrivateCloudProperties() {
    }

    /**
     * Get the managementCluster property: The default cluster used for management.
     * 
     * @return the managementCluster value.
     */
    public ManagementCluster managementCluster() {
        return this.managementCluster;
    }

    /**
     * Set the managementCluster property: The default cluster used for management.
     * 
     * @param managementCluster the managementCluster value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withManagementCluster(ManagementCluster managementCluster) {
        this.managementCluster = managementCluster;
        return this;
    }

    /**
     * Get the internet property: Connectivity to internet is enabled or disabled.
     * 
     * @return the internet value.
     */
    public InternetEnum internet() {
        return this.internet;
    }

    /**
     * Set the internet property: Connectivity to internet is enabled or disabled.
     * 
     * @param internet the internet value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withInternet(InternetEnum internet) {
        this.internet = internet;
        return this;
    }

    /**
     * Get the identitySources property: vCenter Single Sign On Identity Sources.
     * 
     * @return the identitySources value.
     */
    public List<IdentitySource> identitySources() {
        return this.identitySources;
    }

    /**
     * Set the identitySources property: vCenter Single Sign On Identity Sources.
     * 
     * @param identitySources the identitySources value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withIdentitySources(List<IdentitySource> identitySources) {
        this.identitySources = identitySources;
        return this;
    }

    /**
     * Get the availability property: Properties describing how the cloud is distributed across availability zones.
     * 
     * @return the availability value.
     */
    public AvailabilityProperties availability() {
        return this.availability;
    }

    /**
     * Set the availability property: Properties describing how the cloud is distributed across availability zones.
     * 
     * @param availability the availability value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withAvailability(AvailabilityProperties availability) {
        this.availability = availability;
        return this;
    }

    /**
     * Get the encryption property: Customer managed key encryption, can be enabled or disabled.
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Customer managed key encryption, can be enabled or disabled.
     * 
     * @param encryption the encryption value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the extendedNetworkBlocks property: Array of additional networks noncontiguous with networkBlock. Networks
     * must be
     * unique and non-overlapping across VNet in your subscription, on-premise, and
     * this privateCloud networkBlock attribute. Make sure the CIDR format conforms to
     * (A.B.C.D/X).
     * 
     * @return the extendedNetworkBlocks value.
     */
    public List<String> extendedNetworkBlocks() {
        return this.extendedNetworkBlocks;
    }

    /**
     * Set the extendedNetworkBlocks property: Array of additional networks noncontiguous with networkBlock. Networks
     * must be
     * unique and non-overlapping across VNet in your subscription, on-premise, and
     * this privateCloud networkBlock attribute. Make sure the CIDR format conforms to
     * (A.B.C.D/X).
     * 
     * @param extendedNetworkBlocks the extendedNetworkBlocks value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withExtendedNetworkBlocks(List<String> extendedNetworkBlocks) {
        this.extendedNetworkBlocks = extendedNetworkBlocks;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    public PrivateCloudProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the circuit property: An ExpressRoute Circuit.
     * 
     * @return the circuit value.
     */
    public Circuit circuit() {
        return this.circuit;
    }

    /**
     * Set the circuit property: An ExpressRoute Circuit.
     * 
     * @param circuit the circuit value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withCircuit(Circuit circuit) {
        this.circuit = circuit;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints.
     * 
     * @return the endpoints value.
     */
    public Endpoints endpoints() {
        return this.endpoints;
    }

    /**
     * Get the networkBlock property: The block of addresses should be unique across VNet in your subscription as
     * well as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where
     * A,B,C,D are between 0 and 255, and X is between 0 and 22.
     * 
     * @return the networkBlock value.
     */
    public String networkBlock() {
        return this.networkBlock;
    }

    /**
     * Set the networkBlock property: The block of addresses should be unique across VNet in your subscription as
     * well as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where
     * A,B,C,D are between 0 and 255, and X is between 0 and 22.
     * 
     * @param networkBlock the networkBlock value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withNetworkBlock(String networkBlock) {
        this.networkBlock = networkBlock;
        return this;
    }

    /**
     * Get the managementNetwork property: Network used to access vCenter Server and NSX-T Manager.
     * 
     * @return the managementNetwork value.
     */
    public String managementNetwork() {
        return this.managementNetwork;
    }

    /**
     * Get the provisioningNetwork property: Used for virtual machine cold migration, cloning, and snapshot migration.
     * 
     * @return the provisioningNetwork value.
     */
    public String provisioningNetwork() {
        return this.provisioningNetwork;
    }

    /**
     * Get the vmotionNetwork property: Used for live migration of virtual machines.
     * 
     * @return the vmotionNetwork value.
     */
    public String vmotionNetwork() {
        return this.vmotionNetwork;
    }

    /**
     * Get the vcenterPassword property: Optionally, set the vCenter admin password when the private cloud is created.
     * 
     * @return the vcenterPassword value.
     */
    public String vcenterPassword() {
        return this.vcenterPassword;
    }

    /**
     * Set the vcenterPassword property: Optionally, set the vCenter admin password when the private cloud is created.
     * 
     * @param vcenterPassword the vcenterPassword value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withVcenterPassword(String vcenterPassword) {
        this.vcenterPassword = vcenterPassword;
        return this;
    }

    /**
     * Get the nsxtPassword property: Optionally, set the NSX-T Manager password when the private cloud is created.
     * 
     * @return the nsxtPassword value.
     */
    public String nsxtPassword() {
        return this.nsxtPassword;
    }

    /**
     * Set the nsxtPassword property: Optionally, set the NSX-T Manager password when the private cloud is created.
     * 
     * @param nsxtPassword the nsxtPassword value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withNsxtPassword(String nsxtPassword) {
        this.nsxtPassword = nsxtPassword;
        return this;
    }

    /**
     * Get the vcenterCertificateThumbprint property: Thumbprint of the vCenter Server SSL certificate.
     * 
     * @return the vcenterCertificateThumbprint value.
     */
    public String vcenterCertificateThumbprint() {
        return this.vcenterCertificateThumbprint;
    }

    /**
     * Get the nsxtCertificateThumbprint property: Thumbprint of the NSX-T Manager SSL certificate.
     * 
     * @return the nsxtCertificateThumbprint value.
     */
    public String nsxtCertificateThumbprint() {
        return this.nsxtCertificateThumbprint;
    }

    /**
     * Get the externalCloudLinks property: Array of cloud link IDs from other clouds that connect to this one.
     * 
     * @return the externalCloudLinks value.
     */
    public List<String> externalCloudLinks() {
        return this.externalCloudLinks;
    }

    /**
     * Get the secondaryCircuit property: A secondary expressRoute circuit from a separate AZ. Only present in a
     * stretched private cloud.
     * 
     * @return the secondaryCircuit value.
     */
    public Circuit secondaryCircuit() {
        return this.secondaryCircuit;
    }

    /**
     * Set the secondaryCircuit property: A secondary expressRoute circuit from a separate AZ. Only present in a
     * stretched private cloud.
     * 
     * @param secondaryCircuit the secondaryCircuit value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withSecondaryCircuit(Circuit secondaryCircuit) {
        this.secondaryCircuit = secondaryCircuit;
        return this;
    }

    /**
     * Get the nsxPublicIpQuotaRaised property: Flag to indicate whether the private cloud has the quota for provisioned
     * NSX
     * Public IP count raised from 64 to 1024.
     * 
     * @return the nsxPublicIpQuotaRaised value.
     */
    public NsxPublicIpQuotaRaisedEnum nsxPublicIpQuotaRaised() {
        return this.nsxPublicIpQuotaRaised;
    }

    /**
     * Get the virtualNetworkId property: Azure resource ID of the virtual network.
     * 
     * @return the virtualNetworkId value.
     */
    public String virtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     * Set the virtualNetworkId property: Azure resource ID of the virtual network.
     * 
     * @param virtualNetworkId the virtualNetworkId value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withVirtualNetworkId(String virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * Get the dnsZoneType property: The type of DNS zone to use.
     * 
     * @return the dnsZoneType value.
     */
    public DnsZoneType dnsZoneType() {
        return this.dnsZoneType;
    }

    /**
     * Set the dnsZoneType property: The type of DNS zone to use.
     * 
     * @param dnsZoneType the dnsZoneType value to set.
     * @return the PrivateCloudProperties object itself.
     */
    public PrivateCloudProperties withDnsZoneType(DnsZoneType dnsZoneType) {
        this.dnsZoneType = dnsZoneType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managementCluster() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property managementCluster in model PrivateCloudProperties"));
        } else {
            managementCluster().validate();
        }
        if (identitySources() != null) {
            identitySources().forEach(e -> e.validate());
        }
        if (availability() != null) {
            availability().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (circuit() != null) {
            circuit().validate();
        }
        if (endpoints() != null) {
            endpoints().validate();
        }
        if (networkBlock() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property networkBlock in model PrivateCloudProperties"));
        }
        if (secondaryCircuit() != null) {
            secondaryCircuit().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateCloudProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("managementCluster", this.managementCluster);
        jsonWriter.writeStringField("networkBlock", this.networkBlock);
        jsonWriter.writeStringField("internet", this.internet == null ? null : this.internet.toString());
        jsonWriter.writeArrayField("identitySources", this.identitySources,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("availability", this.availability);
        jsonWriter.writeJsonField("encryption", this.encryption);
        jsonWriter.writeArrayField("extendedNetworkBlocks", this.extendedNetworkBlocks,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("circuit", this.circuit);
        jsonWriter.writeStringField("vcenterPassword", this.vcenterPassword);
        jsonWriter.writeStringField("nsxtPassword", this.nsxtPassword);
        jsonWriter.writeJsonField("secondaryCircuit", this.secondaryCircuit);
        jsonWriter.writeStringField("virtualNetworkId", this.virtualNetworkId);
        jsonWriter.writeStringField("dnsZoneType", this.dnsZoneType == null ? null : this.dnsZoneType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateCloudProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateCloudProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrivateCloudProperties.
     */
    public static PrivateCloudProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateCloudProperties deserializedPrivateCloudProperties = new PrivateCloudProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("managementCluster".equals(fieldName)) {
                    deserializedPrivateCloudProperties.managementCluster = ManagementCluster.fromJson(reader);
                } else if ("networkBlock".equals(fieldName)) {
                    deserializedPrivateCloudProperties.networkBlock = reader.getString();
                } else if ("internet".equals(fieldName)) {
                    deserializedPrivateCloudProperties.internet = InternetEnum.fromString(reader.getString());
                } else if ("identitySources".equals(fieldName)) {
                    List<IdentitySource> identitySources
                        = reader.readArray(reader1 -> IdentitySource.fromJson(reader1));
                    deserializedPrivateCloudProperties.identitySources = identitySources;
                } else if ("availability".equals(fieldName)) {
                    deserializedPrivateCloudProperties.availability = AvailabilityProperties.fromJson(reader);
                } else if ("encryption".equals(fieldName)) {
                    deserializedPrivateCloudProperties.encryption = Encryption.fromJson(reader);
                } else if ("extendedNetworkBlocks".equals(fieldName)) {
                    List<String> extendedNetworkBlocks = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateCloudProperties.extendedNetworkBlocks = extendedNetworkBlocks;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedPrivateCloudProperties.provisioningState
                        = PrivateCloudProvisioningState.fromString(reader.getString());
                } else if ("circuit".equals(fieldName)) {
                    deserializedPrivateCloudProperties.circuit = Circuit.fromJson(reader);
                } else if ("endpoints".equals(fieldName)) {
                    deserializedPrivateCloudProperties.endpoints = Endpoints.fromJson(reader);
                } else if ("managementNetwork".equals(fieldName)) {
                    deserializedPrivateCloudProperties.managementNetwork = reader.getString();
                } else if ("provisioningNetwork".equals(fieldName)) {
                    deserializedPrivateCloudProperties.provisioningNetwork = reader.getString();
                } else if ("vmotionNetwork".equals(fieldName)) {
                    deserializedPrivateCloudProperties.vmotionNetwork = reader.getString();
                } else if ("vcenterPassword".equals(fieldName)) {
                    deserializedPrivateCloudProperties.vcenterPassword = reader.getString();
                } else if ("nsxtPassword".equals(fieldName)) {
                    deserializedPrivateCloudProperties.nsxtPassword = reader.getString();
                } else if ("vcenterCertificateThumbprint".equals(fieldName)) {
                    deserializedPrivateCloudProperties.vcenterCertificateThumbprint = reader.getString();
                } else if ("nsxtCertificateThumbprint".equals(fieldName)) {
                    deserializedPrivateCloudProperties.nsxtCertificateThumbprint = reader.getString();
                } else if ("externalCloudLinks".equals(fieldName)) {
                    List<String> externalCloudLinks = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateCloudProperties.externalCloudLinks = externalCloudLinks;
                } else if ("secondaryCircuit".equals(fieldName)) {
                    deserializedPrivateCloudProperties.secondaryCircuit = Circuit.fromJson(reader);
                } else if ("nsxPublicIpQuotaRaised".equals(fieldName)) {
                    deserializedPrivateCloudProperties.nsxPublicIpQuotaRaised
                        = NsxPublicIpQuotaRaisedEnum.fromString(reader.getString());
                } else if ("virtualNetworkId".equals(fieldName)) {
                    deserializedPrivateCloudProperties.virtualNetworkId = reader.getString();
                } else if ("dnsZoneType".equals(fieldName)) {
                    deserializedPrivateCloudProperties.dnsZoneType = DnsZoneType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateCloudProperties;
        });
    }
}
