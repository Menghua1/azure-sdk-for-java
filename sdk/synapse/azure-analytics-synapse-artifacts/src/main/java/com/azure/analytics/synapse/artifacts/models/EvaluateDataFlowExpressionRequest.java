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

/**
 * Request body structure for data flow expression preview.
 */
@Fluent
public final class EvaluateDataFlowExpressionRequest implements JsonSerializable<EvaluateDataFlowExpressionRequest> {
    /*
     * The ID of data flow debug session.
     */
    private String sessionId;

    /*
     * The data flow which contains the debug session.
     */
    private String dataFlowName;

    /*
     * The output stream name.
     */
    private String streamName;

    /*
     * The row limit for preview request.
     */
    private Integer rowLimits;

    /*
     * The expression for preview.
     */
    private String expression;

    /**
     * Creates an instance of EvaluateDataFlowExpressionRequest class.
     */
    public EvaluateDataFlowExpressionRequest() {
    }

    /**
     * Get the sessionId property: The ID of data flow debug session.
     * 
     * @return the sessionId value.
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     * 
     * @param sessionId the sessionId value to set.
     * @return the EvaluateDataFlowExpressionRequest object itself.
     */
    public EvaluateDataFlowExpressionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the dataFlowName property: The data flow which contains the debug session.
     * 
     * @return the dataFlowName value.
     */
    public String getDataFlowName() {
        return this.dataFlowName;
    }

    /**
     * Set the dataFlowName property: The data flow which contains the debug session.
     * 
     * @param dataFlowName the dataFlowName value to set.
     * @return the EvaluateDataFlowExpressionRequest object itself.
     */
    public EvaluateDataFlowExpressionRequest setDataFlowName(String dataFlowName) {
        this.dataFlowName = dataFlowName;
        return this;
    }

    /**
     * Get the streamName property: The output stream name.
     * 
     * @return the streamName value.
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * Set the streamName property: The output stream name.
     * 
     * @param streamName the streamName value to set.
     * @return the EvaluateDataFlowExpressionRequest object itself.
     */
    public EvaluateDataFlowExpressionRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * Get the rowLimits property: The row limit for preview request.
     * 
     * @return the rowLimits value.
     */
    public Integer getRowLimits() {
        return this.rowLimits;
    }

    /**
     * Set the rowLimits property: The row limit for preview request.
     * 
     * @param rowLimits the rowLimits value to set.
     * @return the EvaluateDataFlowExpressionRequest object itself.
     */
    public EvaluateDataFlowExpressionRequest setRowLimits(Integer rowLimits) {
        this.rowLimits = rowLimits;
        return this;
    }

    /**
     * Get the expression property: The expression for preview.
     * 
     * @return the expression value.
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * Set the expression property: The expression for preview.
     * 
     * @param expression the expression value to set.
     * @return the EvaluateDataFlowExpressionRequest object itself.
     */
    public EvaluateDataFlowExpressionRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sessionId", this.sessionId);
        jsonWriter.writeStringField("dataFlowName", this.dataFlowName);
        jsonWriter.writeStringField("streamName", this.streamName);
        jsonWriter.writeNumberField("rowLimits", this.rowLimits);
        jsonWriter.writeStringField("expression", this.expression);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EvaluateDataFlowExpressionRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EvaluateDataFlowExpressionRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EvaluateDataFlowExpressionRequest.
     */
    public static EvaluateDataFlowExpressionRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EvaluateDataFlowExpressionRequest deserializedEvaluateDataFlowExpressionRequest
                = new EvaluateDataFlowExpressionRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sessionId".equals(fieldName)) {
                    deserializedEvaluateDataFlowExpressionRequest.sessionId = reader.getString();
                } else if ("dataFlowName".equals(fieldName)) {
                    deserializedEvaluateDataFlowExpressionRequest.dataFlowName = reader.getString();
                } else if ("streamName".equals(fieldName)) {
                    deserializedEvaluateDataFlowExpressionRequest.streamName = reader.getString();
                } else if ("rowLimits".equals(fieldName)) {
                    deserializedEvaluateDataFlowExpressionRequest.rowLimits = reader.getNullable(JsonReader::getInt);
                } else if ("expression".equals(fieldName)) {
                    deserializedEvaluateDataFlowExpressionRequest.expression = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEvaluateDataFlowExpressionRequest;
        });
    }
}
