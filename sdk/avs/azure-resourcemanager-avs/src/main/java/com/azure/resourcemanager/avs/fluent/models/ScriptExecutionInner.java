// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.ScriptExecutionParameter;
import com.azure.resourcemanager.avs.models.ScriptExecutionProvisioningState;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An instance of a script executed by a user - custom or AVS.
 */
@Fluent
public final class ScriptExecutionInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private ScriptExecutionProperties innerProperties;

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
     * Creates an instance of ScriptExecutionInner class.
     */
    public ScriptExecutionInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private ScriptExecutionProperties innerProperties() {
        return this.innerProperties;
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
     * Get the scriptCmdletId property: A reference to the script cmdlet resource if user is running a AVS script.
     * 
     * @return the scriptCmdletId value.
     */
    public String scriptCmdletId() {
        return this.innerProperties() == null ? null : this.innerProperties().scriptCmdletId();
    }

    /**
     * Set the scriptCmdletId property: A reference to the script cmdlet resource if user is running a AVS script.
     * 
     * @param scriptCmdletId the scriptCmdletId value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withScriptCmdletId(String scriptCmdletId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScriptExecutionProperties();
        }
        this.innerProperties().withScriptCmdletId(scriptCmdletId);
        return this;
    }

    /**
     * Get the parameters property: Parameters the script will accept.
     * 
     * @return the parameters value.
     */
    public List<ScriptExecutionParameter> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Parameters the script will accept.
     * 
     * @param parameters the parameters value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withParameters(List<ScriptExecutionParameter> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScriptExecutionProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the hiddenParameters property: Parameters that will be hidden/not visible to ARM, such as passwords and
     * credentials.
     * 
     * @return the hiddenParameters value.
     */
    public List<ScriptExecutionParameter> hiddenParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().hiddenParameters();
    }

    /**
     * Set the hiddenParameters property: Parameters that will be hidden/not visible to ARM, such as passwords and
     * credentials.
     * 
     * @param hiddenParameters the hiddenParameters value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withHiddenParameters(List<ScriptExecutionParameter> hiddenParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScriptExecutionProperties();
        }
        this.innerProperties().withHiddenParameters(hiddenParameters);
        return this;
    }

    /**
     * Get the failureReason property: Error message if the script was able to run, but if the script itself had
     * errors or powershell threw an exception.
     * 
     * @return the failureReason value.
     */
    public String failureReason() {
        return this.innerProperties() == null ? null : this.innerProperties().failureReason();
    }

    /**
     * Set the failureReason property: Error message if the script was able to run, but if the script itself had
     * errors or powershell threw an exception.
     * 
     * @param failureReason the failureReason value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withFailureReason(String failureReason) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScriptExecutionProperties();
        }
        this.innerProperties().withFailureReason(failureReason);
        return this;
    }

    /**
     * Get the timeout property: Time limit for execution.
     * 
     * @return the timeout value.
     */
    public String timeout() {
        return this.innerProperties() == null ? null : this.innerProperties().timeout();
    }

    /**
     * Set the timeout property: Time limit for execution.
     * 
     * @param timeout the timeout value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withTimeout(String timeout) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScriptExecutionProperties();
        }
        this.innerProperties().withTimeout(timeout);
        return this;
    }

    /**
     * Get the retention property: Time to live for the resource. If not provided, will be available for 60 days.
     * 
     * @return the retention value.
     */
    public String retention() {
        return this.innerProperties() == null ? null : this.innerProperties().retention();
    }

    /**
     * Set the retention property: Time to live for the resource. If not provided, will be available for 60 days.
     * 
     * @param retention the retention value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withRetention(String retention) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScriptExecutionProperties();
        }
        this.innerProperties().withRetention(retention);
        return this;
    }

    /**
     * Get the submittedAt property: Time the script execution was submitted.
     * 
     * @return the submittedAt value.
     */
    public OffsetDateTime submittedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().submittedAt();
    }

    /**
     * Get the startedAt property: Time the script execution was started.
     * 
     * @return the startedAt value.
     */
    public OffsetDateTime startedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().startedAt();
    }

    /**
     * Get the finishedAt property: Time the script execution was finished.
     * 
     * @return the finishedAt value.
     */
    public OffsetDateTime finishedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().finishedAt();
    }

    /**
     * Get the provisioningState property: The state of the script execution resource.
     * 
     * @return the provisioningState value.
     */
    public ScriptExecutionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the output property: Standard output stream from the powershell execution.
     * 
     * @return the output value.
     */
    public List<String> output() {
        return this.innerProperties() == null ? null : this.innerProperties().output();
    }

    /**
     * Set the output property: Standard output stream from the powershell execution.
     * 
     * @param output the output value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withOutput(List<String> output) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScriptExecutionProperties();
        }
        this.innerProperties().withOutput(output);
        return this;
    }

    /**
     * Get the namedOutputs property: User-defined dictionary.
     * 
     * @return the namedOutputs value.
     */
    public Map<String, Object> namedOutputs() {
        return this.innerProperties() == null ? null : this.innerProperties().namedOutputs();
    }

    /**
     * Set the namedOutputs property: User-defined dictionary.
     * 
     * @param namedOutputs the namedOutputs value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withNamedOutputs(Map<String, Object> namedOutputs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScriptExecutionProperties();
        }
        this.innerProperties().withNamedOutputs(namedOutputs);
        return this;
    }

    /**
     * Get the information property: Standard information out stream from the powershell execution.
     * 
     * @return the information value.
     */
    public List<String> information() {
        return this.innerProperties() == null ? null : this.innerProperties().information();
    }

    /**
     * Get the warnings property: Standard warning out stream from the powershell execution.
     * 
     * @return the warnings value.
     */
    public List<String> warnings() {
        return this.innerProperties() == null ? null : this.innerProperties().warnings();
    }

    /**
     * Get the errors property: Standard error output stream from the powershell execution.
     * 
     * @return the errors value.
     */
    public List<String> errors() {
        return this.innerProperties() == null ? null : this.innerProperties().errors();
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScriptExecutionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScriptExecutionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScriptExecutionInner.
     */
    public static ScriptExecutionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScriptExecutionInner deserializedScriptExecutionInner = new ScriptExecutionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedScriptExecutionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedScriptExecutionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedScriptExecutionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedScriptExecutionInner.innerProperties = ScriptExecutionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedScriptExecutionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScriptExecutionInner;
        });
    }
}
