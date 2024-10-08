// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * OneLake (Trident) datastore configuration.
 */
@Fluent
public final class OneLakeDatastore extends DatastoreProperties {
    /*
     * [Required] Storage type backing the datastore.
     */
    private DatastoreType datastoreType = DatastoreType.ONE_LAKE;

    /*
     * [Required] OneLake artifact backing the datastore.
     */
    private OneLakeArtifact artifact;

    /*
     * [Required] OneLake workspace name.
     */
    private String oneLakeWorkspaceName;

    /*
     * OneLake endpoint to use for the datastore.
     */
    private String endpoint;

    /*
     * Indicates which identity to use to authenticate service data access to customer's storage.
     */
    private ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity;

    /*
     * Readonly property to indicate if datastore is the workspace default datastore
     */
    private Boolean isDefault;

    /**
     * Creates an instance of OneLakeDatastore class.
     */
    public OneLakeDatastore() {
    }

    /**
     * Get the datastoreType property: [Required] Storage type backing the datastore.
     * 
     * @return the datastoreType value.
     */
    @Override
    public DatastoreType datastoreType() {
        return this.datastoreType;
    }

    /**
     * Get the artifact property: [Required] OneLake artifact backing the datastore.
     * 
     * @return the artifact value.
     */
    public OneLakeArtifact artifact() {
        return this.artifact;
    }

    /**
     * Set the artifact property: [Required] OneLake artifact backing the datastore.
     * 
     * @param artifact the artifact value to set.
     * @return the OneLakeDatastore object itself.
     */
    public OneLakeDatastore withArtifact(OneLakeArtifact artifact) {
        this.artifact = artifact;
        return this;
    }

    /**
     * Get the oneLakeWorkspaceName property: [Required] OneLake workspace name.
     * 
     * @return the oneLakeWorkspaceName value.
     */
    public String oneLakeWorkspaceName() {
        return this.oneLakeWorkspaceName;
    }

    /**
     * Set the oneLakeWorkspaceName property: [Required] OneLake workspace name.
     * 
     * @param oneLakeWorkspaceName the oneLakeWorkspaceName value to set.
     * @return the OneLakeDatastore object itself.
     */
    public OneLakeDatastore withOneLakeWorkspaceName(String oneLakeWorkspaceName) {
        this.oneLakeWorkspaceName = oneLakeWorkspaceName;
        return this;
    }

    /**
     * Get the endpoint property: OneLake endpoint to use for the datastore.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: OneLake endpoint to use for the datastore.
     * 
     * @param endpoint the endpoint value to set.
     * @return the OneLakeDatastore object itself.
     */
    public OneLakeDatastore withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the serviceDataAccessAuthIdentity property: Indicates which identity to use to authenticate service data
     * access to customer's storage.
     * 
     * @return the serviceDataAccessAuthIdentity value.
     */
    public ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity() {
        return this.serviceDataAccessAuthIdentity;
    }

    /**
     * Set the serviceDataAccessAuthIdentity property: Indicates which identity to use to authenticate service data
     * access to customer's storage.
     * 
     * @param serviceDataAccessAuthIdentity the serviceDataAccessAuthIdentity value to set.
     * @return the OneLakeDatastore object itself.
     */
    public OneLakeDatastore
        withServiceDataAccessAuthIdentity(ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity) {
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        return this;
    }

    /**
     * Get the isDefault property: Readonly property to indicate if datastore is the workspace default datastore.
     * 
     * @return the isDefault value.
     */
    @Override
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OneLakeDatastore withCredentials(DatastoreCredentials credentials) {
        super.withCredentials(credentials);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OneLakeDatastore withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OneLakeDatastore withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OneLakeDatastore withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (artifact() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property artifact in model OneLakeDatastore"));
        } else {
            artifact().validate();
        }
        if (oneLakeWorkspaceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property oneLakeWorkspaceName in model OneLakeDatastore"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OneLakeDatastore.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("credentials", credentials());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("properties", properties(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("artifact", this.artifact);
        jsonWriter.writeStringField("oneLakeWorkspaceName", this.oneLakeWorkspaceName);
        jsonWriter.writeStringField("datastoreType", this.datastoreType == null ? null : this.datastoreType.toString());
        jsonWriter.writeStringField("endpoint", this.endpoint);
        jsonWriter.writeStringField("serviceDataAccessAuthIdentity",
            this.serviceDataAccessAuthIdentity == null ? null : this.serviceDataAccessAuthIdentity.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OneLakeDatastore from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OneLakeDatastore if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OneLakeDatastore.
     */
    public static OneLakeDatastore fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OneLakeDatastore deserializedOneLakeDatastore = new OneLakeDatastore();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("credentials".equals(fieldName)) {
                    deserializedOneLakeDatastore.withCredentials(DatastoreCredentials.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedOneLakeDatastore.withDescription(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedOneLakeDatastore.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedOneLakeDatastore.withProperties(properties);
                } else if ("isDefault".equals(fieldName)) {
                    deserializedOneLakeDatastore.isDefault = reader.getNullable(JsonReader::getBoolean);
                } else if ("artifact".equals(fieldName)) {
                    deserializedOneLakeDatastore.artifact = OneLakeArtifact.fromJson(reader);
                } else if ("oneLakeWorkspaceName".equals(fieldName)) {
                    deserializedOneLakeDatastore.oneLakeWorkspaceName = reader.getString();
                } else if ("datastoreType".equals(fieldName)) {
                    deserializedOneLakeDatastore.datastoreType = DatastoreType.fromString(reader.getString());
                } else if ("endpoint".equals(fieldName)) {
                    deserializedOneLakeDatastore.endpoint = reader.getString();
                } else if ("serviceDataAccessAuthIdentity".equals(fieldName)) {
                    deserializedOneLakeDatastore.serviceDataAccessAuthIdentity
                        = ServiceDataAccessAuthIdentity.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOneLakeDatastore;
        });
    }
}
