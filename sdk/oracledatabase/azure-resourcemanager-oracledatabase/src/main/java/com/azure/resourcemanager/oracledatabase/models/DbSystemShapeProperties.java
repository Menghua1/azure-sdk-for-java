// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * DbSystemShape resource model.
 */
@Immutable
public final class DbSystemShapeProperties implements JsonSerializable<DbSystemShapeProperties> {
    /*
     * The family of the shape used for the DB system.
     */
    private String shapeFamily;

    /*
     * The maximum number of CPU cores that can be enabled on the DB system for this shape.
     */
    private int availableCoreCount;

    /*
     * The minimum number of CPU cores that can be enabled on the DB system for this shape.
     */
    private Integer minimumCoreCount;

    /*
     * The runtime minimum number of CPU cores that can be enabled on the DB system for this shape.
     */
    private Integer runtimeMinimumCoreCount;

    /*
     * The discrete number by which the CPU core count for this shape can be increased or decreased.
     */
    private Integer coreCountIncrement;

    /*
     * The minimum number of Exadata storage servers available for the Exadata infrastructure.
     */
    private Integer minStorageCount;

    /*
     * The maximum number of Exadata storage servers available for the Exadata infrastructure.
     */
    private Integer maxStorageCount;

    /*
     * The maximum data storage available per storage server for this shape. Only applicable to ExaCC Elastic shapes.
     */
    private Double availableDataStoragePerServerInTbs;

    /*
     * The maximum memory available per database node for this shape. Only applicable to ExaCC Elastic shapes.
     */
    private Integer availableMemoryPerNodeInGbs;

    /*
     * The maximum Db Node storage available per database node for this shape. Only applicable to ExaCC Elastic shapes.
     */
    private Integer availableDbNodePerNodeInGbs;

    /*
     * The minimum number of CPU cores that can be enabled per node for this shape.
     */
    private Integer minCoreCountPerNode;

    /*
     * The maximum memory that can be enabled for this shape.
     */
    private Integer availableMemoryInGbs;

    /*
     * The minimum memory that need be allocated per node for this shape.
     */
    private Integer minMemoryPerNodeInGbs;

    /*
     * The maximum Db Node storage that can be enabled for this shape.
     */
    private Integer availableDbNodeStorageInGbs;

    /*
     * The minimum Db Node storage that need be allocated per node for this shape.
     */
    private Integer minDbNodeStoragePerNodeInGbs;

    /*
     * The maximum DATA storage that can be enabled for this shape.
     */
    private Integer availableDataStorageInTbs;

    /*
     * The minimum data storage that need be allocated for this shape.
     */
    private Integer minDataStorageInTbs;

    /*
     * The minimum number of database nodes available for this shape.
     */
    private Integer minimumNodeCount;

    /*
     * The maximum number of database nodes available for this shape.
     */
    private Integer maximumNodeCount;

    /*
     * The maximum number of CPU cores per database node that can be enabled for this shape. Only applicable to the flex
     * Exadata shape and ExaCC Elastic shapes.
     */
    private Integer availableCoreCountPerNode;

    /**
     * Creates an instance of DbSystemShapeProperties class.
     */
    public DbSystemShapeProperties() {
    }

    /**
     * Get the shapeFamily property: The family of the shape used for the DB system.
     * 
     * @return the shapeFamily value.
     */
    public String shapeFamily() {
        return this.shapeFamily;
    }

    /**
     * Get the availableCoreCount property: The maximum number of CPU cores that can be enabled on the DB system for
     * this shape.
     * 
     * @return the availableCoreCount value.
     */
    public int availableCoreCount() {
        return this.availableCoreCount;
    }

    /**
     * Get the minimumCoreCount property: The minimum number of CPU cores that can be enabled on the DB system for this
     * shape.
     * 
     * @return the minimumCoreCount value.
     */
    public Integer minimumCoreCount() {
        return this.minimumCoreCount;
    }

    /**
     * Get the runtimeMinimumCoreCount property: The runtime minimum number of CPU cores that can be enabled on the DB
     * system for this shape.
     * 
     * @return the runtimeMinimumCoreCount value.
     */
    public Integer runtimeMinimumCoreCount() {
        return this.runtimeMinimumCoreCount;
    }

    /**
     * Get the coreCountIncrement property: The discrete number by which the CPU core count for this shape can be
     * increased or decreased.
     * 
     * @return the coreCountIncrement value.
     */
    public Integer coreCountIncrement() {
        return this.coreCountIncrement;
    }

    /**
     * Get the minStorageCount property: The minimum number of Exadata storage servers available for the Exadata
     * infrastructure.
     * 
     * @return the minStorageCount value.
     */
    public Integer minStorageCount() {
        return this.minStorageCount;
    }

    /**
     * Get the maxStorageCount property: The maximum number of Exadata storage servers available for the Exadata
     * infrastructure.
     * 
     * @return the maxStorageCount value.
     */
    public Integer maxStorageCount() {
        return this.maxStorageCount;
    }

    /**
     * Get the availableDataStoragePerServerInTbs property: The maximum data storage available per storage server for
     * this shape. Only applicable to ExaCC Elastic shapes.
     * 
     * @return the availableDataStoragePerServerInTbs value.
     */
    public Double availableDataStoragePerServerInTbs() {
        return this.availableDataStoragePerServerInTbs;
    }

    /**
     * Get the availableMemoryPerNodeInGbs property: The maximum memory available per database node for this shape. Only
     * applicable to ExaCC Elastic shapes.
     * 
     * @return the availableMemoryPerNodeInGbs value.
     */
    public Integer availableMemoryPerNodeInGbs() {
        return this.availableMemoryPerNodeInGbs;
    }

    /**
     * Get the availableDbNodePerNodeInGbs property: The maximum Db Node storage available per database node for this
     * shape. Only applicable to ExaCC Elastic shapes.
     * 
     * @return the availableDbNodePerNodeInGbs value.
     */
    public Integer availableDbNodePerNodeInGbs() {
        return this.availableDbNodePerNodeInGbs;
    }

    /**
     * Get the minCoreCountPerNode property: The minimum number of CPU cores that can be enabled per node for this
     * shape.
     * 
     * @return the minCoreCountPerNode value.
     */
    public Integer minCoreCountPerNode() {
        return this.minCoreCountPerNode;
    }

    /**
     * Get the availableMemoryInGbs property: The maximum memory that can be enabled for this shape.
     * 
     * @return the availableMemoryInGbs value.
     */
    public Integer availableMemoryInGbs() {
        return this.availableMemoryInGbs;
    }

    /**
     * Get the minMemoryPerNodeInGbs property: The minimum memory that need be allocated per node for this shape.
     * 
     * @return the minMemoryPerNodeInGbs value.
     */
    public Integer minMemoryPerNodeInGbs() {
        return this.minMemoryPerNodeInGbs;
    }

    /**
     * Get the availableDbNodeStorageInGbs property: The maximum Db Node storage that can be enabled for this shape.
     * 
     * @return the availableDbNodeStorageInGbs value.
     */
    public Integer availableDbNodeStorageInGbs() {
        return this.availableDbNodeStorageInGbs;
    }

    /**
     * Get the minDbNodeStoragePerNodeInGbs property: The minimum Db Node storage that need be allocated per node for
     * this shape.
     * 
     * @return the minDbNodeStoragePerNodeInGbs value.
     */
    public Integer minDbNodeStoragePerNodeInGbs() {
        return this.minDbNodeStoragePerNodeInGbs;
    }

    /**
     * Get the availableDataStorageInTbs property: The maximum DATA storage that can be enabled for this shape.
     * 
     * @return the availableDataStorageInTbs value.
     */
    public Integer availableDataStorageInTbs() {
        return this.availableDataStorageInTbs;
    }

    /**
     * Get the minDataStorageInTbs property: The minimum data storage that need be allocated for this shape.
     * 
     * @return the minDataStorageInTbs value.
     */
    public Integer minDataStorageInTbs() {
        return this.minDataStorageInTbs;
    }

    /**
     * Get the minimumNodeCount property: The minimum number of database nodes available for this shape.
     * 
     * @return the minimumNodeCount value.
     */
    public Integer minimumNodeCount() {
        return this.minimumNodeCount;
    }

    /**
     * Get the maximumNodeCount property: The maximum number of database nodes available for this shape.
     * 
     * @return the maximumNodeCount value.
     */
    public Integer maximumNodeCount() {
        return this.maximumNodeCount;
    }

    /**
     * Get the availableCoreCountPerNode property: The maximum number of CPU cores per database node that can be enabled
     * for this shape. Only applicable to the flex Exadata shape and ExaCC Elastic shapes.
     * 
     * @return the availableCoreCountPerNode value.
     */
    public Integer availableCoreCountPerNode() {
        return this.availableCoreCountPerNode;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DbSystemShapeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DbSystemShapeProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DbSystemShapeProperties.
     */
    public static DbSystemShapeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DbSystemShapeProperties deserializedDbSystemShapeProperties = new DbSystemShapeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("availableCoreCount".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.availableCoreCount = reader.getInt();
                } else if ("shapeFamily".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.shapeFamily = reader.getString();
                } else if ("minimumCoreCount".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.minimumCoreCount = reader.getNullable(JsonReader::getInt);
                } else if ("runtimeMinimumCoreCount".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.runtimeMinimumCoreCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("coreCountIncrement".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.coreCountIncrement = reader.getNullable(JsonReader::getInt);
                } else if ("minStorageCount".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.minStorageCount = reader.getNullable(JsonReader::getInt);
                } else if ("maxStorageCount".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.maxStorageCount = reader.getNullable(JsonReader::getInt);
                } else if ("availableDataStoragePerServerInTbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.availableDataStoragePerServerInTbs
                        = reader.getNullable(JsonReader::getDouble);
                } else if ("availableMemoryPerNodeInGbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.availableMemoryPerNodeInGbs
                        = reader.getNullable(JsonReader::getInt);
                } else if ("availableDbNodePerNodeInGbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.availableDbNodePerNodeInGbs
                        = reader.getNullable(JsonReader::getInt);
                } else if ("minCoreCountPerNode".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.minCoreCountPerNode = reader.getNullable(JsonReader::getInt);
                } else if ("availableMemoryInGbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.availableMemoryInGbs = reader.getNullable(JsonReader::getInt);
                } else if ("minMemoryPerNodeInGbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.minMemoryPerNodeInGbs = reader.getNullable(JsonReader::getInt);
                } else if ("availableDbNodeStorageInGbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.availableDbNodeStorageInGbs
                        = reader.getNullable(JsonReader::getInt);
                } else if ("minDbNodeStoragePerNodeInGbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.minDbNodeStoragePerNodeInGbs
                        = reader.getNullable(JsonReader::getInt);
                } else if ("availableDataStorageInTbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.availableDataStorageInTbs
                        = reader.getNullable(JsonReader::getInt);
                } else if ("minDataStorageInTbs".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.minDataStorageInTbs = reader.getNullable(JsonReader::getInt);
                } else if ("minimumNodeCount".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.minimumNodeCount = reader.getNullable(JsonReader::getInt);
                } else if ("maximumNodeCount".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.maximumNodeCount = reader.getNullable(JsonReader::getInt);
                } else if ("availableCoreCountPerNode".equals(fieldName)) {
                    deserializedDbSystemShapeProperties.availableCoreCountPerNode
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDbSystemShapeProperties;
        });
    }
}
