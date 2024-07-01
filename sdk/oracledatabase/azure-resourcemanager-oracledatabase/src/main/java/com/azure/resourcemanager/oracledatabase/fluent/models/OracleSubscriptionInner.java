// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.oracledatabase.models.OracleSubscriptionProperties;
import com.azure.resourcemanager.oracledatabase.models.Plan;
import java.io.IOException;

/**
 * OracleSubscription resource definition.
 */
@Fluent
public final class OracleSubscriptionInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private OracleSubscriptionProperties properties;

    /*
     * Details of the resource plan.
     */
    private Plan plan;

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
     * Creates an instance of OracleSubscriptionInner class.
     */
    public OracleSubscriptionInner() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public OracleSubscriptionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the OracleSubscriptionInner object itself.
     */
    public OracleSubscriptionInner withProperties(OracleSubscriptionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the plan property: Details of the resource plan.
     * 
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Details of the resource plan.
     * 
     * @param plan the plan value to set.
     * @return the OracleSubscriptionInner object itself.
     */
    public OracleSubscriptionInner withPlan(Plan plan) {
        this.plan = plan;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (plan() != null) {
            plan().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeJsonField("plan", this.plan);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OracleSubscriptionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OracleSubscriptionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OracleSubscriptionInner.
     */
    public static OracleSubscriptionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OracleSubscriptionInner deserializedOracleSubscriptionInner = new OracleSubscriptionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedOracleSubscriptionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedOracleSubscriptionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedOracleSubscriptionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedOracleSubscriptionInner.properties = OracleSubscriptionProperties.fromJson(reader);
                } else if ("plan".equals(fieldName)) {
                    deserializedOracleSubscriptionInner.plan = Plan.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedOracleSubscriptionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOracleSubscriptionInner;
        });
    }
}
