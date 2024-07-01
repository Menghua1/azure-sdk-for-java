// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Phoenix server linked service.
 */
@Fluent
public class PhoenixLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "Phoenix";

    /*
     * The IP address or host name of the Phoenix server. (i.e. 192.168.222.160)
     */
    private Object host;

    /*
     * The TCP port that the Phoenix server uses to listen for client connections. The default value is 8765.
     */
    private Object port;

    /*
     * The partial URL corresponding to the Phoenix server. (i.e. /gateway/sandbox/phoenix/version). The default value is hbasephoenix if using WindowsAzureHDInsightService.
     */
    private Object httpPath;

    /*
     * The authentication mechanism used to connect to the Phoenix server.
     */
    private PhoenixAuthenticationType authenticationType;

    /*
     * The user name used to connect to the Phoenix server.
     */
    private Object username;

    /*
     * The password corresponding to the user name.
     */
    private SecretBase password;

    /*
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     */
    private Object enableSsl;

    /*
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     */
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     */
    private Object useSystemTrustStore;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     */
    private Object allowHostNameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     */
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /**
     * Creates an instance of PhoenixLinkedService class.
     */
    public PhoenixLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the host property: The IP address or host name of the Phoenix server. (i.e. 192.168.222.160).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: The IP address or host name of the Phoenix server. (i.e. 192.168.222.160).
     * 
     * @param host the host value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Phoenix server uses to listen for client connections. The default
     * value is 8765.
     * 
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Phoenix server uses to listen for client connections. The default
     * value is 8765.
     * 
     * @param port the port value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the httpPath property: The partial URL corresponding to the Phoenix server. (i.e.
     * /gateway/sandbox/phoenix/version). The default value is hbasephoenix if using WindowsAzureHDInsightService.
     * 
     * @return the httpPath value.
     */
    public Object getHttpPath() {
        return this.httpPath;
    }

    /**
     * Set the httpPath property: The partial URL corresponding to the Phoenix server. (i.e.
     * /gateway/sandbox/phoenix/version). The default value is hbasephoenix if using WindowsAzureHDInsightService.
     * 
     * @param httpPath the httpPath value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setHttpPath(Object httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication mechanism used to connect to the Phoenix server.
     * 
     * @return the authenticationType value.
     */
    public PhoenixAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication mechanism used to connect to the Phoenix server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setAuthenticationType(PhoenixAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the Phoenix server.
     * 
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The user name used to connect to the Phoenix server.
     * 
     * @param username the username value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name.
     * 
     * @param password the password value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     * 
     * @return the enableSsl value.
     */
    public Object getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setEnableSsl(Object enableSsl) {
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
    public Object getTrustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     * 
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     * 
     * @return the useSystemTrustStore value.
     */
    public Object getUseSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     * 
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the allowHostNameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     * 
     * @return the allowHostNameCNMismatch value.
     */
    public Object getAllowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch;
    }

    /**
     * Set the allowHostNameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     * 
     * @param allowHostNameCNMismatch the allowHostNameCNMismatch value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setAllowHostNameCNMismatch(Object allowHostNameCNMismatch) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     * 
     * @return the allowSelfSignedServerCert value.
     */
    public Object getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     * 
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the PhoenixLinkedService object itself.
     */
    public PhoenixLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoenixLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoenixLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoenixLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoenixLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("connectVia", getConnectVia());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("type", this.type);
        if (host != null
            || port != null
            || httpPath != null
            || authenticationType != null
            || username != null
            || password != null
            || enableSsl != null
            || trustedCertPath != null
            || useSystemTrustStore != null
            || allowHostNameCNMismatch != null
            || allowSelfSignedServerCert != null
            || encryptedCredential != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("host", this.host);
            jsonWriter.writeUntypedField("port", this.port);
            jsonWriter.writeUntypedField("httpPath", this.httpPath);
            jsonWriter.writeStringField("authenticationType",
                this.authenticationType == null ? null : this.authenticationType.toString());
            jsonWriter.writeUntypedField("username", this.username);
            jsonWriter.writeJsonField("password", this.password);
            jsonWriter.writeUntypedField("enableSsl", this.enableSsl);
            jsonWriter.writeUntypedField("trustedCertPath", this.trustedCertPath);
            jsonWriter.writeUntypedField("useSystemTrustStore", this.useSystemTrustStore);
            jsonWriter.writeUntypedField("allowHostNameCNMismatch", this.allowHostNameCNMismatch);
            jsonWriter.writeUntypedField("allowSelfSignedServerCert", this.allowSelfSignedServerCert);
            jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PhoenixLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PhoenixLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PhoenixLinkedService.
     */
    public static PhoenixLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PhoenixLinkedService deserializedPhoenixLinkedService = new PhoenixLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedPhoenixLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedPhoenixLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedPhoenixLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedPhoenixLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedPhoenixLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("host".equals(fieldName)) {
                            deserializedPhoenixLinkedService.host = reader.readUntyped();
                        } else if ("port".equals(fieldName)) {
                            deserializedPhoenixLinkedService.port = reader.readUntyped();
                        } else if ("httpPath".equals(fieldName)) {
                            deserializedPhoenixLinkedService.httpPath = reader.readUntyped();
                        } else if ("authenticationType".equals(fieldName)) {
                            deserializedPhoenixLinkedService.authenticationType
                                = PhoenixAuthenticationType.fromString(reader.getString());
                        } else if ("username".equals(fieldName)) {
                            deserializedPhoenixLinkedService.username = reader.readUntyped();
                        } else if ("password".equals(fieldName)) {
                            deserializedPhoenixLinkedService.password = SecretBase.fromJson(reader);
                        } else if ("enableSsl".equals(fieldName)) {
                            deserializedPhoenixLinkedService.enableSsl = reader.readUntyped();
                        } else if ("trustedCertPath".equals(fieldName)) {
                            deserializedPhoenixLinkedService.trustedCertPath = reader.readUntyped();
                        } else if ("useSystemTrustStore".equals(fieldName)) {
                            deserializedPhoenixLinkedService.useSystemTrustStore = reader.readUntyped();
                        } else if ("allowHostNameCNMismatch".equals(fieldName)) {
                            deserializedPhoenixLinkedService.allowHostNameCNMismatch = reader.readUntyped();
                        } else if ("allowSelfSignedServerCert".equals(fieldName)) {
                            deserializedPhoenixLinkedService.allowSelfSignedServerCert = reader.readUntyped();
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedPhoenixLinkedService.encryptedCredential = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedPhoenixLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedPhoenixLinkedService;
        });
    }
}
