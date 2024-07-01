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
 * Shopify Service linked service.
 */
@Fluent
public class ShopifyLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "Shopify";

    /*
     * The endpoint of the Shopify server. (i.e. mystore.myshopify.com)
     */
    private Object host;

    /*
     * The API access token that can be used to access Shopify’s data. The token won't expire if it is offline mode.
     */
    private SecretBase accessToken;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     */
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     */
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     */
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /**
     * Creates an instance of ShopifyLinkedService class.
     */
    public ShopifyLinkedService() {
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
     * Get the host property: The endpoint of the Shopify server. (i.e. mystore.myshopify.com).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: The endpoint of the Shopify server. (i.e. mystore.myshopify.com).
     * 
     * @param host the host value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the accessToken property: The API access token that can be used to access Shopify’s data. The token won't
     * expire if it is offline mode.
     * 
     * @return the accessToken value.
     */
    public SecretBase getAccessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: The API access token that can be used to access Shopify’s data. The token won't
     * expire if it is offline mode.
     * 
     * @param accessToken the accessToken value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService setAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService setUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object getUseHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService setUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @return the usePeerVerification value.
     */
    public Object getUsePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService setUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the ShopifyLinkedService object itself.
     */
    public ShopifyLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopifyLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopifyLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopifyLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopifyLinkedService setAnnotations(List<Object> annotations) {
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
            || accessToken != null
            || useEncryptedEndpoints != null
            || useHostVerification != null
            || usePeerVerification != null
            || encryptedCredential != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("host", this.host);
            jsonWriter.writeJsonField("accessToken", this.accessToken);
            jsonWriter.writeUntypedField("useEncryptedEndpoints", this.useEncryptedEndpoints);
            jsonWriter.writeUntypedField("useHostVerification", this.useHostVerification);
            jsonWriter.writeUntypedField("usePeerVerification", this.usePeerVerification);
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
     * Reads an instance of ShopifyLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ShopifyLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ShopifyLinkedService.
     */
    public static ShopifyLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ShopifyLinkedService deserializedShopifyLinkedService = new ShopifyLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedShopifyLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedShopifyLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedShopifyLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedShopifyLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedShopifyLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("host".equals(fieldName)) {
                            deserializedShopifyLinkedService.host = reader.readUntyped();
                        } else if ("accessToken".equals(fieldName)) {
                            deserializedShopifyLinkedService.accessToken = SecretBase.fromJson(reader);
                        } else if ("useEncryptedEndpoints".equals(fieldName)) {
                            deserializedShopifyLinkedService.useEncryptedEndpoints = reader.readUntyped();
                        } else if ("useHostVerification".equals(fieldName)) {
                            deserializedShopifyLinkedService.useHostVerification = reader.readUntyped();
                        } else if ("usePeerVerification".equals(fieldName)) {
                            deserializedShopifyLinkedService.usePeerVerification = reader.readUntyped();
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedShopifyLinkedService.encryptedCredential = reader.readUntyped();
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
            deserializedShopifyLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedShopifyLinkedService;
        });
    }
}
