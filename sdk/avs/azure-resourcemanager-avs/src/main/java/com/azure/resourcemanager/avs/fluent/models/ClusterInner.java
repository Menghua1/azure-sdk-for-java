// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.ClusterProvisioningState;
import com.azure.resourcemanager.avs.models.Sku;
import java.io.IOException;
import java.util.List;

/**
 * A cluster resource.
 */
@Fluent
public final class ClusterInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private ClusterProperties innerProperties;

    /*
     * The SKU (Stock Keeping Unit) assigned to this resource.
     */
    private Sku sku;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ClusterInner class.
     */
    public ClusterInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private ClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: The SKU (Stock Keeping Unit) assigned to this resource.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU (Stock Keeping Unit) assigned to this resource.
     * 
     * @param sku the sku value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the clusterSize property: The cluster size.
     * 
     * @return the clusterSize value.
     */
    public Integer clusterSize() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterSize();
    }

    /**
     * Set the clusterSize property: The cluster size.
     * 
     * @param clusterSize the clusterSize value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClusterSize(Integer clusterSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withClusterSize(clusterSize);
        return this;
    }

    /**
     * Get the provisioningState property: The state of the cluster provisioning.
     * 
     * @return the provisioningState value.
     */
    public ClusterProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the clusterId property: The identity.
     * 
     * @return the clusterId value.
     */
    public Integer clusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterId();
    }

    /**
     * Get the hosts property: The hosts.
     * 
     * @return the hosts value.
     */
    public List<String> hosts() {
        return this.innerProperties() == null ? null : this.innerProperties().hosts();
    }

    /**
     * Set the hosts property: The hosts.
     * 
     * @param hosts the hosts value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withHosts(List<String> hosts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withHosts(hosts);
        return this;
    }

    /**
     * Get the vsanDatastoreName property: Name of the vsan datastore associated with the cluster.
     * 
     * @return the vsanDatastoreName value.
     */
    public String vsanDatastoreName() {
        return this.innerProperties() == null ? null : this.innerProperties().vsanDatastoreName();
    }

    /**
     * Set the vsanDatastoreName property: Name of the vsan datastore associated with the cluster.
     * 
     * @param vsanDatastoreName the vsanDatastoreName value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVsanDatastoreName(String vsanDatastoreName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withVsanDatastoreName(vsanDatastoreName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model ClusterInner"));
        } else {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterInner.
     */
    public static ClusterInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterInner deserializedClusterInner = new ClusterInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedClusterInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedClusterInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedClusterInner.type = reader.getString();
                } else if ("sku".equals(fieldName)) {
                    deserializedClusterInner.sku = Sku.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedClusterInner.innerProperties = ClusterProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedClusterInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterInner;
        });
    }
}
