// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.document.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Document Status Response.
 */
@Immutable
public final class DocumentStatus {

    /*
     * Location of the document or folder
     */
    @Generated
    @JsonProperty(value = "path")
    private String path;

    /*
     * Location of the source document
     */
    @Generated
    @JsonProperty(value = "sourcePath")
    private final String sourcePath;

    /*
     * Operation created date time
     */
    @Generated
    @JsonProperty(value = "createdDateTimeUtc")
    private final OffsetDateTime createdDateTimeUtc;

    /*
     * Date time in which the operation's status has been updated
     */
    @Generated
    @JsonProperty(value = "lastActionDateTimeUtc")
    private final OffsetDateTime lastActionDateTimeUtc;

    /*
     * List of possible statuses for job or document
     */
    @Generated
    @JsonProperty(value = "status")
    private final Status status;

    /*
     * To language
     */
    @Generated
    @JsonProperty(value = "to")
    private final String to;

    /*
     * This contains an outer error with error code, message, details, target and an
     * inner error with more descriptive details.
     */
    @Generated
    @JsonProperty(value = "error")
    private TranslationError error;

    /*
     * Progress of the translation if available
     */
    @Generated
    @JsonProperty(value = "progress")
    private final double progress;

    /*
     * Document Id
     */
    @Generated
    @JsonProperty(value = "id")
    private final String id;

    /*
     * Character charged by the API
     */
    @Generated
    @JsonProperty(value = "characterCharged")
    private Integer characterCharged;

    /**
     * Creates an instance of DocumentStatus class.
     *
     * @param sourcePath the sourcePath value to set.
     * @param createdDateTimeUtc the createdDateTimeUtc value to set.
     * @param lastActionDateTimeUtc the lastActionDateTimeUtc value to set.
     * @param status the status value to set.
     * @param to the to value to set.
     * @param progress the progress value to set.
     * @param id the id value to set.
     */
    @Generated
    @JsonCreator
    private DocumentStatus(@JsonProperty(value = "sourcePath") String sourcePath,
        @JsonProperty(value = "createdDateTimeUtc") OffsetDateTime createdDateTimeUtc,
        @JsonProperty(value = "lastActionDateTimeUtc") OffsetDateTime lastActionDateTimeUtc,
        @JsonProperty(value = "status") Status status, @JsonProperty(value = "to") String to,
        @JsonProperty(value = "progress") double progress, @JsonProperty(value = "id") String id) {
        this.sourcePath = sourcePath;
        this.createdDateTimeUtc = createdDateTimeUtc;
        this.lastActionDateTimeUtc = lastActionDateTimeUtc;
        this.status = status;
        this.to = to;
        this.progress = progress;
        this.id = id;
    }

    /**
     * Get the path property: Location of the document or folder.
     *
     * @return the path value.
     */
    @Generated
    public String getPath() {
        return this.path;
    }

    /**
     * Get the sourcePath property: Location of the source document.
     *
     * @return the sourcePath value.
     */
    @Generated
    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * Get the createdDateTimeUtc property: Operation created date time.
     *
     * @return the createdDateTimeUtc value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTimeUtc() {
        return this.createdDateTimeUtc;
    }

    /**
     * Get the lastActionDateTimeUtc property: Date time in which the operation's status has been updated.
     *
     * @return the lastActionDateTimeUtc value.
     */
    @Generated
    public OffsetDateTime getLastActionDateTimeUtc() {
        return this.lastActionDateTimeUtc;
    }

    /**
     * Get the status property: List of possible statuses for job or document.
     *
     * @return the status value.
     */
    @Generated
    public Status getStatus() {
        return this.status;
    }

    /**
     * Get the to property: To language.
     *
     * @return the to value.
     */
    @Generated
    public String getTo() {
        return this.to;
    }

    /**
     * Get the error property: This contains an outer error with error code, message, details, target and an
     * inner error with more descriptive details.
     *
     * @return the error value.
     */
    @Generated
    public TranslationError getError() {
        return this.error;
    }

    /**
     * Get the progress property: Progress of the translation if available.
     *
     * @return the progress value.
     */
    @Generated
    public double getProgress() {
        return this.progress;
    }

    /**
     * Get the id property: Document Id.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the characterCharged property: Character charged by the API.
     *
     * @return the characterCharged value.
     */
    @Generated
    public Integer getCharacterCharged() {
        return this.characterCharged;
    }
}
