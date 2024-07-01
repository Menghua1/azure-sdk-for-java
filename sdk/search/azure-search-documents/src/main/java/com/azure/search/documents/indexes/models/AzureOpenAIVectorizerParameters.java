// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies the parameters for connecting to the Azure OpenAI resource.
 */
@Fluent
public class AzureOpenAIVectorizerParameters implements JsonSerializable<AzureOpenAIVectorizerParameters> {
    /*
     * The resource URI of the Azure OpenAI resource.
     */
    private String resourceUrl;

    /*
     * ID of the Azure OpenAI model deployment on the designated resource.
     */
    private String deploymentName;

    /*
     * API key of the designated Azure OpenAI resource.
     */
    private String apiKey;

    /*
     * The user-assigned managed identity used for outbound connections.
     */
    private SearchIndexerDataIdentity authIdentity;

    /*
     * The name of the embedding model that is deployed at the provided deploymentId path.
     */
    private AzureOpenAIModelName modelName;

    /**
     * Creates an instance of AzureOpenAIVectorizerParameters class.
     */
    public AzureOpenAIVectorizerParameters() {
    }

    /**
     * Get the resourceUrl property: The resource URI of the Azure OpenAI resource.
     * 
     * @return the resourceUrl value.
     */
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    /**
     * Set the resourceUrl property: The resource URI of the Azure OpenAI resource.
     * 
     * @param resourceUrl the resourceUrl value to set.
     * @return the AzureOpenAIVectorizerParameters object itself.
     */
    public AzureOpenAIVectorizerParameters setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }

    /**
     * Get the deploymentName property: ID of the Azure OpenAI model deployment on the designated resource.
     * 
     * @return the deploymentName value.
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: ID of the Azure OpenAI model deployment on the designated resource.
     * 
     * @param deploymentName the deploymentName value to set.
     * @return the AzureOpenAIVectorizerParameters object itself.
     */
    public AzureOpenAIVectorizerParameters setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * Get the apiKey property: API key of the designated Azure OpenAI resource.
     * 
     * @return the apiKey value.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: API key of the designated Azure OpenAI resource.
     * 
     * @param apiKey the apiKey value to set.
     * @return the AzureOpenAIVectorizerParameters object itself.
     */
    public AzureOpenAIVectorizerParameters setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the authIdentity property: The user-assigned managed identity used for outbound connections.
     * 
     * @return the authIdentity value.
     */
    public SearchIndexerDataIdentity getAuthIdentity() {
        return this.authIdentity;
    }

    /**
     * Set the authIdentity property: The user-assigned managed identity used for outbound connections.
     * 
     * @param authIdentity the authIdentity value to set.
     * @return the AzureOpenAIVectorizerParameters object itself.
     */
    public AzureOpenAIVectorizerParameters setAuthIdentity(SearchIndexerDataIdentity authIdentity) {
        this.authIdentity = authIdentity;
        return this;
    }

    /**
     * Get the modelName property: The name of the embedding model that is deployed at the provided deploymentId path.
     * 
     * @return the modelName value.
     */
    public AzureOpenAIModelName getModelName() {
        return this.modelName;
    }

    /**
     * Set the modelName property: The name of the embedding model that is deployed at the provided deploymentId path.
     * 
     * @param modelName the modelName value to set.
     * @return the AzureOpenAIVectorizerParameters object itself.
     */
    public AzureOpenAIVectorizerParameters setModelName(AzureOpenAIModelName modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceUri", this.resourceUrl);
        jsonWriter.writeStringField("deploymentId", this.deploymentName);
        jsonWriter.writeStringField("apiKey", this.apiKey);
        jsonWriter.writeJsonField("authIdentity", this.authIdentity);
        jsonWriter.writeStringField("modelName", this.modelName == null ? null : this.modelName.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureOpenAIVectorizerParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureOpenAIVectorizerParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureOpenAIVectorizerParameters.
     */
    public static AzureOpenAIVectorizerParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureOpenAIVectorizerParameters deserializedAzureOpenAIVectorizerParameters
                = new AzureOpenAIVectorizerParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceUri".equals(fieldName)) {
                    deserializedAzureOpenAIVectorizerParameters.resourceUrl = reader.getString();
                } else if ("deploymentId".equals(fieldName)) {
                    deserializedAzureOpenAIVectorizerParameters.deploymentName = reader.getString();
                } else if ("apiKey".equals(fieldName)) {
                    deserializedAzureOpenAIVectorizerParameters.apiKey = reader.getString();
                } else if ("authIdentity".equals(fieldName)) {
                    deserializedAzureOpenAIVectorizerParameters.authIdentity
                        = SearchIndexerDataIdentity.fromJson(reader);
                } else if ("modelName".equals(fieldName)) {
                    deserializedAzureOpenAIVectorizerParameters.modelName
                        = AzureOpenAIModelName.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureOpenAIVectorizerParameters;
        });
    }
}
