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
 * Linked service for MongoDb data source.
 */
@Fluent
public class MongoDbLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "MongoDb";

    /*
     * The IP address or server name of the MongoDB server. Type: string (or Expression with resultType string).
     */
    private Object server;

    /*
     * The authentication type to be used to connect to the MongoDB database.
     */
    private MongoDbAuthenticationType authenticationType;

    /*
     * The name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     */
    private Object databaseName;

    /*
     * Username for authentication. Type: string (or Expression with resultType string).
     */
    private Object username;

    /*
     * Password for authentication.
     */
    private SecretBase password;

    /*
     * Database to verify the username and password. Type: string (or Expression with resultType string).
     */
    private Object authSource;

    /*
     * The TCP port number that the MongoDB server uses to listen for client connections. The default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     */
    private Object port;

    /*
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false. Type: boolean (or Expression with resultType boolean).
     */
    private Object enableSsl;

    /*
     * Specifies whether to allow self-signed certificates from the server. The default value is false. Type: boolean (or Expression with resultType boolean).
     */
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /**
     * Creates an instance of MongoDbLinkedService class.
     */
    public MongoDbLinkedService() {
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
     * Get the server property: The IP address or server name of the MongoDB server. Type: string (or Expression with
     * resultType string).
     * 
     * @return the server value.
     */
    public Object getServer() {
        return this.server;
    }

    /**
     * Set the server property: The IP address or server name of the MongoDB server. Type: string (or Expression with
     * resultType string).
     * 
     * @param server the server value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the MongoDB database.
     * 
     * @return the authenticationType value.
     */
    public MongoDbAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the MongoDB database.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setAuthenticationType(MongoDbAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the databaseName property: The name of the MongoDB database that you want to access. Type: string (or
     * Expression with resultType string).
     * 
     * @return the databaseName value.
     */
    public Object getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the MongoDB database that you want to access. Type: string (or
     * Expression with resultType string).
     * 
     * @param databaseName the databaseName value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setDatabaseName(Object databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for authentication.
     * 
     * @param password the password value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the authSource property: Database to verify the username and password. Type: string (or Expression with
     * resultType string).
     * 
     * @return the authSource value.
     */
    public Object getAuthSource() {
        return this.authSource;
    }

    /**
     * Set the authSource property: Database to verify the username and password. Type: string (or Expression with
     * resultType string).
     * 
     * @param authSource the authSource value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setAuthSource(Object authSource) {
        this.authSource = authSource;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the MongoDB server uses to listen for client connections. The
     * default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the MongoDB server uses to listen for client connections. The
     * default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param port the port value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableSsl value.
     */
    public Object getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the allowSelfSignedServerCert value.
     */
    public Object getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
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
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbLinkedService setAnnotations(List<Object> annotations) {
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
        if (server != null
            || authenticationType != null
            || databaseName != null
            || username != null
            || password != null
            || authSource != null
            || port != null
            || enableSsl != null
            || allowSelfSignedServerCert != null
            || encryptedCredential != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("server", this.server);
            jsonWriter.writeStringField("authenticationType",
                this.authenticationType == null ? null : this.authenticationType.toString());
            jsonWriter.writeUntypedField("databaseName", this.databaseName);
            jsonWriter.writeUntypedField("username", this.username);
            jsonWriter.writeJsonField("password", this.password);
            jsonWriter.writeUntypedField("authSource", this.authSource);
            jsonWriter.writeUntypedField("port", this.port);
            jsonWriter.writeUntypedField("enableSsl", this.enableSsl);
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
     * Reads an instance of MongoDbLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoDbLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MongoDbLinkedService.
     */
    public static MongoDbLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoDbLinkedService deserializedMongoDbLinkedService = new MongoDbLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedMongoDbLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedMongoDbLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedMongoDbLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedMongoDbLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedMongoDbLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("server".equals(fieldName)) {
                            deserializedMongoDbLinkedService.server = reader.readUntyped();
                        } else if ("authenticationType".equals(fieldName)) {
                            deserializedMongoDbLinkedService.authenticationType
                                = MongoDbAuthenticationType.fromString(reader.getString());
                        } else if ("databaseName".equals(fieldName)) {
                            deserializedMongoDbLinkedService.databaseName = reader.readUntyped();
                        } else if ("username".equals(fieldName)) {
                            deserializedMongoDbLinkedService.username = reader.readUntyped();
                        } else if ("password".equals(fieldName)) {
                            deserializedMongoDbLinkedService.password = SecretBase.fromJson(reader);
                        } else if ("authSource".equals(fieldName)) {
                            deserializedMongoDbLinkedService.authSource = reader.readUntyped();
                        } else if ("port".equals(fieldName)) {
                            deserializedMongoDbLinkedService.port = reader.readUntyped();
                        } else if ("enableSsl".equals(fieldName)) {
                            deserializedMongoDbLinkedService.enableSsl = reader.readUntyped();
                        } else if ("allowSelfSignedServerCert".equals(fieldName)) {
                            deserializedMongoDbLinkedService.allowSelfSignedServerCert = reader.readUntyped();
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedMongoDbLinkedService.encryptedCredential = reader.readUntyped();
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
            deserializedMongoDbLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedMongoDbLinkedService;
        });
    }
}
