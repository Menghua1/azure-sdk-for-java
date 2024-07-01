// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.PhoenixAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Phoenix server linked service properties.
 */
@Fluent
public final class PhoenixLinkedServiceTypeProperties {
    /*
     * The IP address or host name of the Phoenix server. (i.e. 192.168.222.160)
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * The TCP port that the Phoenix server uses to listen for client connections. The default value is 8765.
     */
    @JsonProperty(value = "port")
    private Object port;

    /*
     * The partial URL corresponding to the Phoenix server. (i.e. /gateway/sandbox/phoenix/version). The default value
     * is hbasephoenix if using WindowsAzureHDInsightService.
     */
    @JsonProperty(value = "httpPath")
    private Object httpPath;

    /*
     * The authentication mechanism used to connect to the Phoenix server.
     */
    @JsonProperty(value = "authenticationType", required = true)
    private PhoenixAuthenticationType authenticationType;

    /*
     * The user name used to connect to the Phoenix server.
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * The password corresponding to the user name.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     */
    @JsonProperty(value = "enableSsl")
    private Object enableSsl;

    /*
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over
     * SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file
     * installed with the IR.
     */
    @JsonProperty(value = "trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default
     * value is false.
     */
    @JsonProperty(value = "useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when
     * connecting over SSL. The default value is false.
     */
    @JsonProperty(value = "allowHostNameCNMismatch")
    private Object allowHostnameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     */
    @JsonProperty(value = "allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of PhoenixLinkedServiceTypeProperties class.
     */
    public PhoenixLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: The IP address or host name of the Phoenix server. (i.e. 192.168.222.160).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The IP address or host name of the Phoenix server. (i.e. 192.168.222.160).
     * 
     * @param host the host value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Phoenix server uses to listen for client connections. The default
     * value is 8765.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Phoenix server uses to listen for client connections. The default
     * value is 8765.
     * 
     * @param port the port value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the httpPath property: The partial URL corresponding to the Phoenix server. (i.e.
     * /gateway/sandbox/phoenix/version). The default value is hbasephoenix if using WindowsAzureHDInsightService.
     * 
     * @return the httpPath value.
     */
    public Object httpPath() {
        return this.httpPath;
    }

    /**
     * Set the httpPath property: The partial URL corresponding to the Phoenix server. (i.e.
     * /gateway/sandbox/phoenix/version). The default value is hbasephoenix if using WindowsAzureHDInsightService.
     * 
     * @param httpPath the httpPath value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withHttpPath(Object httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication mechanism used to connect to the Phoenix server.
     * 
     * @return the authenticationType value.
     */
    public PhoenixAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication mechanism used to connect to the Phoenix server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withAuthenticationType(PhoenixAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the Phoenix server.
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name used to connect to the Phoenix server.
     * 
     * @param username the username value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name.
     * 
     * @param password the password value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     * 
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     * 
     * @return the trustedCertPath value.
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     * 
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     * 
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     * 
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     * 
     * @return the allowHostnameCNMismatch value.
     */
    public Object allowHostnameCNMismatch() {
        return this.allowHostnameCNMismatch;
    }

    /**
     * Set the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     * 
     * @param allowHostnameCNMismatch the allowHostnameCNMismatch value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withAllowHostnameCNMismatch(Object allowHostnameCNMismatch) {
        this.allowHostnameCNMismatch = allowHostnameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     * 
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     * 
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the PhoenixLinkedServiceTypeProperties object itself.
     */
    public PhoenixLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property host in model PhoenixLinkedServiceTypeProperties"));
        }
        if (authenticationType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property authenticationType in model PhoenixLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PhoenixLinkedServiceTypeProperties.class);
}
