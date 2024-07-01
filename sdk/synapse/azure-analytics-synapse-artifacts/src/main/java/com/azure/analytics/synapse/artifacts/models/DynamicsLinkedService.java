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
 * Dynamics linked service.
 */
@Fluent
public class DynamicsLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "Dynamics";

    /*
     * The deployment type of the Dynamics instance. 'Online' for Dynamics Online and 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     */
    private Object deploymentType;

    /*
     * The host name of the on-premises Dynamics server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     */
    private Object hostName;

    /*
     * The port of on-premises Dynamics server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     */
    private Object port;

    /*
     * The URL to the Microsoft Dynamics server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     */
    private Object serviceUri;

    /*
     * The organization name of the Dynamics instance. The property is required for on-prem and required for online when there are more than one Dynamics instances associated with the user. Type: string (or Expression with resultType string).
     */
    private Object organizationName;

    /*
     * The authentication type to connect to Dynamics server. 'Office365' for online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
     */
    private Object authenticationType;

    /*
     * User name to access the Dynamics instance. Type: string (or Expression with resultType string).
     */
    private Object username;

    /*
     * Password to access the Dynamics instance.
     */
    private SecretBase password;

    /*
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     */
    private Object servicePrincipalId;

    /*
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     */
    private Object servicePrincipalCredentialType;

    /*
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     */
    private SecretBase servicePrincipalCredential;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    private CredentialReference credential;

    /**
     * Creates an instance of DynamicsLinkedService class.
     */
    public DynamicsLinkedService() {
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
     * Get the deploymentType property: The deployment type of the Dynamics instance. 'Online' for Dynamics Online and
     * 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     * @return the deploymentType value.
     */
    public Object getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: The deployment type of the Dynamics instance. 'Online' for Dynamics Online and
     * 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     * @param deploymentType the deploymentType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setDeploymentType(Object deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the hostName property: The host name of the on-premises Dynamics server. The property is required for on-prem
     * and not allowed for online. Type: string (or Expression with resultType string).
     * 
     * @return the hostName value.
     */
    public Object getHostName() {
        return this.hostName;
    }

    /**
     * Set the hostName property: The host name of the on-premises Dynamics server. The property is required for on-prem
     * and not allowed for online. Type: string (or Expression with resultType string).
     * 
     * @param hostName the hostName value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setHostName(Object hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the port property: The port of on-premises Dynamics server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The port of on-premises Dynamics server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param port the port value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the serviceUri property: The URL to the Microsoft Dynamics server. The property is required for on-line and
     * not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     * @return the serviceUri value.
     */
    public Object getServiceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The URL to the Microsoft Dynamics server. The property is required for on-line and
     * not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     * @param serviceUri the serviceUri value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setServiceUri(Object serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the organizationName property: The organization name of the Dynamics instance. The property is required for
     * on-prem and required for online when there are more than one Dynamics instances associated with the user. Type:
     * string (or Expression with resultType string).
     * 
     * @return the organizationName value.
     */
    public Object getOrganizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organization name of the Dynamics instance. The property is required for
     * on-prem and required for online when there are more than one Dynamics instances associated with the user. Type:
     * string (or Expression with resultType string).
     * 
     * @param organizationName the organizationName value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setOrganizationName(Object organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario. Type: string (or Expression with resultType string).
     * 
     * @return the authenticationType value.
     */
    public Object getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario. Type: string (or Expression with resultType string).
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: User name to access the Dynamics instance. Type: string (or Expression with resultType
     * string).
     * 
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: User name to access the Dynamics instance. Type: string (or Expression with resultType
     * string).
     * 
     * @param username the username value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the Dynamics instance.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the Dynamics instance.
     * 
     * @param password the password value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     * 
     * @return the servicePrincipalCredentialType value.
     */
    public Object getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType;
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     * 
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setServicePrincipalCredentialType(Object servicePrincipalCredentialType) {
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @return the servicePrincipalCredential value.
     */
    public SecretBase getServicePrincipalCredential() {
        return this.servicePrincipalCredential;
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
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
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicsLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicsLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicsLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicsLinkedService setAnnotations(List<Object> annotations) {
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
        if (deploymentType != null
            || hostName != null
            || port != null
            || serviceUri != null
            || organizationName != null
            || authenticationType != null
            || username != null
            || password != null
            || servicePrincipalId != null
            || servicePrincipalCredentialType != null
            || servicePrincipalCredential != null
            || encryptedCredential != null
            || credential != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("deploymentType", this.deploymentType);
            jsonWriter.writeUntypedField("hostName", this.hostName);
            jsonWriter.writeUntypedField("port", this.port);
            jsonWriter.writeUntypedField("serviceUri", this.serviceUri);
            jsonWriter.writeUntypedField("organizationName", this.organizationName);
            jsonWriter.writeUntypedField("authenticationType", this.authenticationType);
            jsonWriter.writeUntypedField("username", this.username);
            jsonWriter.writeJsonField("password", this.password);
            jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
            jsonWriter.writeUntypedField("servicePrincipalCredentialType", this.servicePrincipalCredentialType);
            jsonWriter.writeJsonField("servicePrincipalCredential", this.servicePrincipalCredential);
            jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
            jsonWriter.writeJsonField("credential", this.credential);
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
     * Reads an instance of DynamicsLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DynamicsLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DynamicsLinkedService.
     */
    public static DynamicsLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DynamicsLinkedService deserializedDynamicsLinkedService = new DynamicsLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedDynamicsLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedDynamicsLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedDynamicsLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedDynamicsLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedDynamicsLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("deploymentType".equals(fieldName)) {
                            deserializedDynamicsLinkedService.deploymentType = reader.readUntyped();
                        } else if ("hostName".equals(fieldName)) {
                            deserializedDynamicsLinkedService.hostName = reader.readUntyped();
                        } else if ("port".equals(fieldName)) {
                            deserializedDynamicsLinkedService.port = reader.readUntyped();
                        } else if ("serviceUri".equals(fieldName)) {
                            deserializedDynamicsLinkedService.serviceUri = reader.readUntyped();
                        } else if ("organizationName".equals(fieldName)) {
                            deserializedDynamicsLinkedService.organizationName = reader.readUntyped();
                        } else if ("authenticationType".equals(fieldName)) {
                            deserializedDynamicsLinkedService.authenticationType = reader.readUntyped();
                        } else if ("username".equals(fieldName)) {
                            deserializedDynamicsLinkedService.username = reader.readUntyped();
                        } else if ("password".equals(fieldName)) {
                            deserializedDynamicsLinkedService.password = SecretBase.fromJson(reader);
                        } else if ("servicePrincipalId".equals(fieldName)) {
                            deserializedDynamicsLinkedService.servicePrincipalId = reader.readUntyped();
                        } else if ("servicePrincipalCredentialType".equals(fieldName)) {
                            deserializedDynamicsLinkedService.servicePrincipalCredentialType = reader.readUntyped();
                        } else if ("servicePrincipalCredential".equals(fieldName)) {
                            deserializedDynamicsLinkedService.servicePrincipalCredential = SecretBase.fromJson(reader);
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedDynamicsLinkedService.encryptedCredential = reader.readUntyped();
                        } else if ("credential".equals(fieldName)) {
                            deserializedDynamicsLinkedService.credential = CredentialReference.fromJson(reader);
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
            deserializedDynamicsLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedDynamicsLinkedService;
        });
    }
}
