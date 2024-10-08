// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cluster pool available upgrade properties.
 */
@Immutable
public class ClusterPoolAvailableUpgradeProperties implements JsonSerializable<ClusterPoolAvailableUpgradeProperties> {
    /*
     * Type of upgrade.
     */
    private ClusterPoolAvailableUpgradeType upgradeType
        = ClusterPoolAvailableUpgradeType.fromString("ClusterPoolAvailableUpgradeProperties");

    /**
     * Creates an instance of ClusterPoolAvailableUpgradeProperties class.
     */
    public ClusterPoolAvailableUpgradeProperties() {
    }

    /**
     * Get the upgradeType property: Type of upgrade.
     * 
     * @return the upgradeType value.
     */
    public ClusterPoolAvailableUpgradeType upgradeType() {
        return this.upgradeType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("upgradeType", this.upgradeType == null ? null : this.upgradeType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPoolAvailableUpgradeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPoolAvailableUpgradeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterPoolAvailableUpgradeProperties.
     */
    public static ClusterPoolAvailableUpgradeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("upgradeType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AKSPatchUpgrade".equals(discriminatorValue)) {
                    return ClusterPoolAvailableUpgradeAksPatchUpgradeProperties.fromJson(readerToUse.reset());
                } else if ("NodeOsUpgrade".equals(discriminatorValue)) {
                    return ClusterPoolAvailableUpgradeNodeOsUpgradeProperties.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ClusterPoolAvailableUpgradeProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPoolAvailableUpgradeProperties deserializedClusterPoolAvailableUpgradeProperties
                = new ClusterPoolAvailableUpgradeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("upgradeType".equals(fieldName)) {
                    deserializedClusterPoolAvailableUpgradeProperties.upgradeType
                        = ClusterPoolAvailableUpgradeType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPoolAvailableUpgradeProperties;
        });
    }
}
