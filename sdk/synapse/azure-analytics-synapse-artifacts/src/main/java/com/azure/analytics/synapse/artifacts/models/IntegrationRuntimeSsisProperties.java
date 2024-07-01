// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * SSIS properties for managed integration runtime.
 */
@Fluent
public final class IntegrationRuntimeSsisProperties implements JsonSerializable<IntegrationRuntimeSsisProperties> {
    /*
     * Catalog information for managed dedicated integration runtime.
     */
    private IntegrationRuntimeSsisCatalogInfo catalogInfo;

    /*
     * License type for bringing your own license scenario.
     */
    private IntegrationRuntimeLicenseType licenseType;

    /*
     * Custom setup script properties for a managed dedicated integration runtime.
     */
    private IntegrationRuntimeCustomSetupScriptProperties customSetupScriptProperties;

    /*
     * Data proxy properties for a managed dedicated integration runtime.
     */
    private IntegrationRuntimeDataProxyProperties dataProxyProperties;

    /*
     * The edition for the SSIS Integration Runtime
     */
    private IntegrationRuntimeEdition edition;

    /*
     * Custom setup without script properties for a SSIS integration runtime.
     */
    private List<CustomSetupBase> expressCustomSetupProperties;

    /*
     * SSIS properties for managed integration runtime.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of IntegrationRuntimeSsisProperties class.
     */
    public IntegrationRuntimeSsisProperties() {
    }

    /**
     * Get the catalogInfo property: Catalog information for managed dedicated integration runtime.
     * 
     * @return the catalogInfo value.
     */
    public IntegrationRuntimeSsisCatalogInfo getCatalogInfo() {
        return this.catalogInfo;
    }

    /**
     * Set the catalogInfo property: Catalog information for managed dedicated integration runtime.
     * 
     * @param catalogInfo the catalogInfo value to set.
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties setCatalogInfo(IntegrationRuntimeSsisCatalogInfo catalogInfo) {
        this.catalogInfo = catalogInfo;
        return this;
    }

    /**
     * Get the licenseType property: License type for bringing your own license scenario.
     * 
     * @return the licenseType value.
     */
    public IntegrationRuntimeLicenseType getLicenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: License type for bringing your own license scenario.
     * 
     * @param licenseType the licenseType value to set.
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties setLicenseType(IntegrationRuntimeLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the customSetupScriptProperties property: Custom setup script properties for a managed dedicated integration
     * runtime.
     * 
     * @return the customSetupScriptProperties value.
     */
    public IntegrationRuntimeCustomSetupScriptProperties getCustomSetupScriptProperties() {
        return this.customSetupScriptProperties;
    }

    /**
     * Set the customSetupScriptProperties property: Custom setup script properties for a managed dedicated integration
     * runtime.
     * 
     * @param customSetupScriptProperties the customSetupScriptProperties value to set.
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties
        setCustomSetupScriptProperties(IntegrationRuntimeCustomSetupScriptProperties customSetupScriptProperties) {
        this.customSetupScriptProperties = customSetupScriptProperties;
        return this;
    }

    /**
     * Get the dataProxyProperties property: Data proxy properties for a managed dedicated integration runtime.
     * 
     * @return the dataProxyProperties value.
     */
    public IntegrationRuntimeDataProxyProperties getDataProxyProperties() {
        return this.dataProxyProperties;
    }

    /**
     * Set the dataProxyProperties property: Data proxy properties for a managed dedicated integration runtime.
     * 
     * @param dataProxyProperties the dataProxyProperties value to set.
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties
        setDataProxyProperties(IntegrationRuntimeDataProxyProperties dataProxyProperties) {
        this.dataProxyProperties = dataProxyProperties;
        return this;
    }

    /**
     * Get the edition property: The edition for the SSIS Integration Runtime.
     * 
     * @return the edition value.
     */
    public IntegrationRuntimeEdition getEdition() {
        return this.edition;
    }

    /**
     * Set the edition property: The edition for the SSIS Integration Runtime.
     * 
     * @param edition the edition value to set.
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties setEdition(IntegrationRuntimeEdition edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get the expressCustomSetupProperties property: Custom setup without script properties for a SSIS integration
     * runtime.
     * 
     * @return the expressCustomSetupProperties value.
     */
    public List<CustomSetupBase> getExpressCustomSetupProperties() {
        return this.expressCustomSetupProperties;
    }

    /**
     * Set the expressCustomSetupProperties property: Custom setup without script properties for a SSIS integration
     * runtime.
     * 
     * @param expressCustomSetupProperties the expressCustomSetupProperties value to set.
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties
        setExpressCustomSetupProperties(List<CustomSetupBase> expressCustomSetupProperties) {
        this.expressCustomSetupProperties = expressCustomSetupProperties;
        return this;
    }

    /**
     * Get the additionalProperties property: SSIS properties for managed integration runtime.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: SSIS properties for managed integration runtime.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("catalogInfo", this.catalogInfo);
        jsonWriter.writeStringField("licenseType", this.licenseType == null ? null : this.licenseType.toString());
        jsonWriter.writeJsonField("customSetupScriptProperties", this.customSetupScriptProperties);
        jsonWriter.writeJsonField("dataProxyProperties", this.dataProxyProperties);
        jsonWriter.writeStringField("edition", this.edition == null ? null : this.edition.toString());
        jsonWriter.writeArrayField("expressCustomSetupProperties", this.expressCustomSetupProperties,
            (writer, element) -> writer.writeJson(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationRuntimeSsisProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationRuntimeSsisProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IntegrationRuntimeSsisProperties.
     */
    public static IntegrationRuntimeSsisProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationRuntimeSsisProperties deserializedIntegrationRuntimeSsisProperties
                = new IntegrationRuntimeSsisProperties();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("catalogInfo".equals(fieldName)) {
                    deserializedIntegrationRuntimeSsisProperties.catalogInfo
                        = IntegrationRuntimeSsisCatalogInfo.fromJson(reader);
                } else if ("licenseType".equals(fieldName)) {
                    deserializedIntegrationRuntimeSsisProperties.licenseType
                        = IntegrationRuntimeLicenseType.fromString(reader.getString());
                } else if ("customSetupScriptProperties".equals(fieldName)) {
                    deserializedIntegrationRuntimeSsisProperties.customSetupScriptProperties
                        = IntegrationRuntimeCustomSetupScriptProperties.fromJson(reader);
                } else if ("dataProxyProperties".equals(fieldName)) {
                    deserializedIntegrationRuntimeSsisProperties.dataProxyProperties
                        = IntegrationRuntimeDataProxyProperties.fromJson(reader);
                } else if ("edition".equals(fieldName)) {
                    deserializedIntegrationRuntimeSsisProperties.edition
                        = IntegrationRuntimeEdition.fromString(reader.getString());
                } else if ("expressCustomSetupProperties".equals(fieldName)) {
                    List<CustomSetupBase> expressCustomSetupProperties
                        = reader.readArray(reader1 -> CustomSetupBase.fromJson(reader1));
                    deserializedIntegrationRuntimeSsisProperties.expressCustomSetupProperties
                        = expressCustomSetupProperties;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedIntegrationRuntimeSsisProperties.additionalProperties = additionalProperties;

            return deserializedIntegrationRuntimeSsisProperties;
        });
    }
}
