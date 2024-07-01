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
 * Rest Service linked service.
 */
@Fluent
public class RestServiceLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "RestService";

    /*
     * The base URL of the REST service.
     */
    private Object url;

    /*
     * Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     */
    private Object enableServerCertificateValidation;

    /*
     * Type of authentication used to connect to the REST service.
     */
    private RestServiceAuthenticationType authenticationType;

    /*
     * The user name used in Basic authentication type.
     */
    private Object userName;

    /*
     * The password used in Basic authentication type.
     */
    private SecretBase password;

    /*
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     */
    private Object authHeaders;

    /*
     * The application's client ID used in AadServicePrincipal authentication type.
     */
    private Object servicePrincipalId;

    /*
     * The application's key used in AadServicePrincipal authentication type.
     */
    private SecretBase servicePrincipalKey;

    /*
     * The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     */
    private Object tenant;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     */
    private Object azureCloudType;

    /*
     * The resource you are requesting authorization to use.
     */
    private Object aadResourceId;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    private CredentialReference credential;

    /*
     * The client ID associated with your application. Type: string (or Expression with resultType string).
     */
    private Object clientId;

    /*
     * The client secret associated with your application.
     */
    private SecretBase clientSecret;

    /*
     * The token endpoint of the authorization server to acquire access token. Type: string (or Expression with resultType string).
     */
    private Object tokenEndpoint;

    /*
     * The target service or resource to which the access will be requested. Type: string (or Expression with resultType string).
     */
    private Object resource;

    /*
     * The scope of the access required. It describes what kind of access will be requested. Type: string (or Expression with resultType string).
     */
    private Object scope;

    /**
     * Creates an instance of RestServiceLinkedService class.
     */
    public RestServiceLinkedService() {
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
     * Get the url property: The base URL of the REST service.
     * 
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The base URL of the REST service.
     * 
     * @param url the url value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the enableServerCertificateValidation property: Whether to validate server side SSL certificate when
     * connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableServerCertificateValidation value.
     */
    public Object getEnableServerCertificateValidation() {
        return this.enableServerCertificateValidation;
    }

    /**
     * Set the enableServerCertificateValidation property: Whether to validate server side SSL certificate when
     * connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the REST service.
     * 
     * @return the authenticationType value.
     */
    public RestServiceAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Type of authentication used to connect to the REST service.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setAuthenticationType(RestServiceAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the userName property: The user name used in Basic authentication type.
     * 
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: The user name used in Basic authentication type.
     * 
     * @param userName the userName value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: The password used in Basic authentication type.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password used in Basic authentication type.
     * 
     * @param password the password value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: object (or Expression with resultType object).
     * 
     * @return the authHeaders value.
     */
    public Object getAuthHeaders() {
        return this.authHeaders;
    }

    /**
     * Set the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: object (or Expression with resultType object).
     * 
     * @param authHeaders the authHeaders value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setAuthHeaders(Object authHeaders) {
        this.authHeaders = authHeaders;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The application's client ID used in AadServicePrincipal authentication type.
     * 
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The application's client ID used in AadServicePrincipal authentication type.
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The application's key used in AadServicePrincipal authentication type.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The application's key used in AadServicePrincipal authentication type.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The tenant information (domain name or tenant ID) used in AadServicePrincipal
     * authentication type under which your application resides.
     * 
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The tenant information (domain name or tenant ID) used in AadServicePrincipal
     * authentication type under which your application resides.
     * 
     * @param tenant the tenant value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     * 
     * @return the azureCloudType value.
     */
    public Object getAzureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     * 
     * @param azureCloudType the azureCloudType value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the aadResourceId property: The resource you are requesting authorization to use.
     * 
     * @return the aadResourceId value.
     */
    public Object getAadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set the aadResourceId property: The resource you are requesting authorization to use.
     * 
     * @param aadResourceId the aadResourceId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
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
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setEncryptedCredential(Object encryptedCredential) {
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
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the clientId property: The client ID associated with your application. Type: string (or Expression with
     * resultType string).
     * 
     * @return the clientId value.
     */
    public Object getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID associated with your application. Type: string (or Expression with
     * resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with your application.
     * 
     * @return the clientSecret value.
     */
    public SecretBase getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret associated with your application.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the tokenEndpoint property: The token endpoint of the authorization server to acquire access token. Type:
     * string (or Expression with resultType string).
     * 
     * @return the tokenEndpoint value.
     */
    public Object getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * Set the tokenEndpoint property: The token endpoint of the authorization server to acquire access token. Type:
     * string (or Expression with resultType string).
     * 
     * @param tokenEndpoint the tokenEndpoint value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setTokenEndpoint(Object tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * Get the resource property: The target service or resource to which the access will be requested. Type: string (or
     * Expression with resultType string).
     * 
     * @return the resource value.
     */
    public Object getResource() {
        return this.resource;
    }

    /**
     * Set the resource property: The target service or resource to which the access will be requested. Type: string (or
     * Expression with resultType string).
     * 
     * @param resource the resource value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setResource(Object resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the scope property: The scope of the access required. It describes what kind of access will be requested.
     * Type: string (or Expression with resultType string).
     * 
     * @return the scope value.
     */
    public Object getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the access required. It describes what kind of access will be requested.
     * Type: string (or Expression with resultType string).
     * 
     * @param scope the scope value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setScope(Object scope) {
        this.scope = scope;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestServiceLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestServiceLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestServiceLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestServiceLinkedService setAnnotations(List<Object> annotations) {
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
        if (url != null
            || enableServerCertificateValidation != null
            || authenticationType != null
            || userName != null
            || password != null
            || authHeaders != null
            || servicePrincipalId != null
            || servicePrincipalKey != null
            || tenant != null
            || azureCloudType != null
            || aadResourceId != null
            || encryptedCredential != null
            || credential != null
            || clientId != null
            || clientSecret != null
            || tokenEndpoint != null
            || resource != null
            || scope != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("url", this.url);
            jsonWriter.writeUntypedField("enableServerCertificateValidation", this.enableServerCertificateValidation);
            jsonWriter.writeStringField("authenticationType",
                this.authenticationType == null ? null : this.authenticationType.toString());
            jsonWriter.writeUntypedField("userName", this.userName);
            jsonWriter.writeJsonField("password", this.password);
            jsonWriter.writeUntypedField("authHeaders", this.authHeaders);
            jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
            jsonWriter.writeJsonField("servicePrincipalKey", this.servicePrincipalKey);
            jsonWriter.writeUntypedField("tenant", this.tenant);
            jsonWriter.writeUntypedField("azureCloudType", this.azureCloudType);
            jsonWriter.writeUntypedField("aadResourceId", this.aadResourceId);
            jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
            jsonWriter.writeJsonField("credential", this.credential);
            jsonWriter.writeUntypedField("clientId", this.clientId);
            jsonWriter.writeJsonField("clientSecret", this.clientSecret);
            jsonWriter.writeUntypedField("tokenEndpoint", this.tokenEndpoint);
            jsonWriter.writeUntypedField("resource", this.resource);
            jsonWriter.writeUntypedField("scope", this.scope);
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
     * Reads an instance of RestServiceLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestServiceLinkedService if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RestServiceLinkedService.
     */
    public static RestServiceLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestServiceLinkedService deserializedRestServiceLinkedService = new RestServiceLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedRestServiceLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedRestServiceLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedRestServiceLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedRestServiceLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedRestServiceLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("url".equals(fieldName)) {
                            deserializedRestServiceLinkedService.url = reader.readUntyped();
                        } else if ("enableServerCertificateValidation".equals(fieldName)) {
                            deserializedRestServiceLinkedService.enableServerCertificateValidation
                                = reader.readUntyped();
                        } else if ("authenticationType".equals(fieldName)) {
                            deserializedRestServiceLinkedService.authenticationType
                                = RestServiceAuthenticationType.fromString(reader.getString());
                        } else if ("userName".equals(fieldName)) {
                            deserializedRestServiceLinkedService.userName = reader.readUntyped();
                        } else if ("password".equals(fieldName)) {
                            deserializedRestServiceLinkedService.password = SecretBase.fromJson(reader);
                        } else if ("authHeaders".equals(fieldName)) {
                            deserializedRestServiceLinkedService.authHeaders = reader.readUntyped();
                        } else if ("servicePrincipalId".equals(fieldName)) {
                            deserializedRestServiceLinkedService.servicePrincipalId = reader.readUntyped();
                        } else if ("servicePrincipalKey".equals(fieldName)) {
                            deserializedRestServiceLinkedService.servicePrincipalKey = SecretBase.fromJson(reader);
                        } else if ("tenant".equals(fieldName)) {
                            deserializedRestServiceLinkedService.tenant = reader.readUntyped();
                        } else if ("azureCloudType".equals(fieldName)) {
                            deserializedRestServiceLinkedService.azureCloudType = reader.readUntyped();
                        } else if ("aadResourceId".equals(fieldName)) {
                            deserializedRestServiceLinkedService.aadResourceId = reader.readUntyped();
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedRestServiceLinkedService.encryptedCredential = reader.readUntyped();
                        } else if ("credential".equals(fieldName)) {
                            deserializedRestServiceLinkedService.credential = CredentialReference.fromJson(reader);
                        } else if ("clientId".equals(fieldName)) {
                            deserializedRestServiceLinkedService.clientId = reader.readUntyped();
                        } else if ("clientSecret".equals(fieldName)) {
                            deserializedRestServiceLinkedService.clientSecret = SecretBase.fromJson(reader);
                        } else if ("tokenEndpoint".equals(fieldName)) {
                            deserializedRestServiceLinkedService.tokenEndpoint = reader.readUntyped();
                        } else if ("resource".equals(fieldName)) {
                            deserializedRestServiceLinkedService.resource = reader.readUntyped();
                        } else if ("scope".equals(fieldName)) {
                            deserializedRestServiceLinkedService.scope = reader.readUntyped();
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
            deserializedRestServiceLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedRestServiceLinkedService;
        });
    }
}
