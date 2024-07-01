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
 * Represents various service level limits.
 */
@Fluent
public final class SearchServiceLimits implements JsonSerializable<SearchServiceLimits> {
    /*
     * The maximum allowed fields per index.
     */
    private Integer maxFieldsPerIndex;

    /*
     * The maximum depth which you can nest sub-fields in an index, including the top-level complex field. For example,
     * a/b/c has a nesting depth of 3.
     */
    private Integer maxFieldNestingDepthPerIndex;

    /*
     * The maximum number of fields of type Collection(Edm.ComplexType) allowed in an index.
     */
    private Integer maxComplexCollectionFieldsPerIndex;

    /*
     * The maximum number of objects in complex collections allowed per document.
     */
    private Integer maxComplexObjectsInCollectionsPerDocument;

    /*
     * The maximum amount of storage in bytes allowed per index.
     */
    private Long maxStoragePerIndexInBytes;

    /**
     * Creates an instance of SearchServiceLimits class.
     */
    public SearchServiceLimits() {
    }

    /**
     * Get the maxFieldsPerIndex property: The maximum allowed fields per index.
     * 
     * @return the maxFieldsPerIndex value.
     */
    public Integer getMaxFieldsPerIndex() {
        return this.maxFieldsPerIndex;
    }

    /**
     * Set the maxFieldsPerIndex property: The maximum allowed fields per index.
     * 
     * @param maxFieldsPerIndex the maxFieldsPerIndex value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits setMaxFieldsPerIndex(Integer maxFieldsPerIndex) {
        this.maxFieldsPerIndex = maxFieldsPerIndex;
        return this;
    }

    /**
     * Get the maxFieldNestingDepthPerIndex property: The maximum depth which you can nest sub-fields in an index,
     * including the top-level complex field. For example, a/b/c has a nesting depth of 3.
     * 
     * @return the maxFieldNestingDepthPerIndex value.
     */
    public Integer getMaxFieldNestingDepthPerIndex() {
        return this.maxFieldNestingDepthPerIndex;
    }

    /**
     * Set the maxFieldNestingDepthPerIndex property: The maximum depth which you can nest sub-fields in an index,
     * including the top-level complex field. For example, a/b/c has a nesting depth of 3.
     * 
     * @param maxFieldNestingDepthPerIndex the maxFieldNestingDepthPerIndex value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits setMaxFieldNestingDepthPerIndex(Integer maxFieldNestingDepthPerIndex) {
        this.maxFieldNestingDepthPerIndex = maxFieldNestingDepthPerIndex;
        return this;
    }

    /**
     * Get the maxComplexCollectionFieldsPerIndex property: The maximum number of fields of type
     * Collection(Edm.ComplexType) allowed in an index.
     * 
     * @return the maxComplexCollectionFieldsPerIndex value.
     */
    public Integer getMaxComplexCollectionFieldsPerIndex() {
        return this.maxComplexCollectionFieldsPerIndex;
    }

    /**
     * Set the maxComplexCollectionFieldsPerIndex property: The maximum number of fields of type
     * Collection(Edm.ComplexType) allowed in an index.
     * 
     * @param maxComplexCollectionFieldsPerIndex the maxComplexCollectionFieldsPerIndex value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits setMaxComplexCollectionFieldsPerIndex(Integer maxComplexCollectionFieldsPerIndex) {
        this.maxComplexCollectionFieldsPerIndex = maxComplexCollectionFieldsPerIndex;
        return this;
    }

    /**
     * Get the maxComplexObjectsInCollectionsPerDocument property: The maximum number of objects in complex collections
     * allowed per document.
     * 
     * @return the maxComplexObjectsInCollectionsPerDocument value.
     */
    public Integer getMaxComplexObjectsInCollectionsPerDocument() {
        return this.maxComplexObjectsInCollectionsPerDocument;
    }

    /**
     * Set the maxComplexObjectsInCollectionsPerDocument property: The maximum number of objects in complex collections
     * allowed per document.
     * 
     * @param maxComplexObjectsInCollectionsPerDocument the maxComplexObjectsInCollectionsPerDocument value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits
        setMaxComplexObjectsInCollectionsPerDocument(Integer maxComplexObjectsInCollectionsPerDocument) {
        this.maxComplexObjectsInCollectionsPerDocument = maxComplexObjectsInCollectionsPerDocument;
        return this;
    }

    /**
     * Get the maxStoragePerIndexInBytes property: The maximum amount of storage in bytes allowed per index.
     * 
     * @return the maxStoragePerIndexInBytes value.
     */
    public Long getMaxStoragePerIndexInBytes() {
        return this.maxStoragePerIndexInBytes;
    }

    /**
     * Set the maxStoragePerIndexInBytes property: The maximum amount of storage in bytes allowed per index.
     * 
     * @param maxStoragePerIndexInBytes the maxStoragePerIndexInBytes value to set.
     * @return the SearchServiceLimits object itself.
     */
    public SearchServiceLimits setMaxStoragePerIndexInBytes(Long maxStoragePerIndexInBytes) {
        this.maxStoragePerIndexInBytes = maxStoragePerIndexInBytes;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("maxFieldsPerIndex", this.maxFieldsPerIndex);
        jsonWriter.writeNumberField("maxFieldNestingDepthPerIndex", this.maxFieldNestingDepthPerIndex);
        jsonWriter.writeNumberField("maxComplexCollectionFieldsPerIndex", this.maxComplexCollectionFieldsPerIndex);
        jsonWriter.writeNumberField("maxComplexObjectsInCollectionsPerDocument",
            this.maxComplexObjectsInCollectionsPerDocument);
        jsonWriter.writeNumberField("maxStoragePerIndex", this.maxStoragePerIndexInBytes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchServiceLimits from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchServiceLimits if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SearchServiceLimits.
     */
    public static SearchServiceLimits fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SearchServiceLimits deserializedSearchServiceLimits = new SearchServiceLimits();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxFieldsPerIndex".equals(fieldName)) {
                    deserializedSearchServiceLimits.maxFieldsPerIndex = reader.getNullable(JsonReader::getInt);
                } else if ("maxFieldNestingDepthPerIndex".equals(fieldName)) {
                    deserializedSearchServiceLimits.maxFieldNestingDepthPerIndex
                        = reader.getNullable(JsonReader::getInt);
                } else if ("maxComplexCollectionFieldsPerIndex".equals(fieldName)) {
                    deserializedSearchServiceLimits.maxComplexCollectionFieldsPerIndex
                        = reader.getNullable(JsonReader::getInt);
                } else if ("maxComplexObjectsInCollectionsPerDocument".equals(fieldName)) {
                    deserializedSearchServiceLimits.maxComplexObjectsInCollectionsPerDocument
                        = reader.getNullable(JsonReader::getInt);
                } else if ("maxStoragePerIndex".equals(fieldName)) {
                    deserializedSearchServiceLimits.maxStoragePerIndexInBytes = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSearchServiceLimits;
        });
    }
}
