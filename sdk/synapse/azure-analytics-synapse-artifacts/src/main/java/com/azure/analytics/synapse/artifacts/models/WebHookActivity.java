// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * WebHook activity.
 */
@Fluent
public class WebHookActivity extends ControlActivity {
    /*
     * Type of activity.
     */
    private String type = "WebHook";

    /*
     * Rest API method for target endpoint.
     */
    private WebHookActivityMethod method;

    /*
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     */
    private Object url;

    /*
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    private String timeout;

    /*
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     */
    private Object headers;

    /*
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     */
    private Object body;

    /*
     * Authentication method used for calling the endpoint.
     */
    private WebActivityAuthentication authentication;

    /*
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode >= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     */
    private Object reportStatusOnCallBack;

    /**
     * Creates an instance of WebHookActivity class.
     */
    public WebHookActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the method property: Rest API method for target endpoint.
     * 
     * @return the method value.
     */
    public WebHookActivityMethod getMethod() {
        return this.method;
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     * 
     * @param method the method value to set.
     * @return the WebHookActivity object itself.
     */
    public WebHookActivity setMethod(WebHookActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the url property: WebHook activity target endpoint and path. Type: string (or Expression with resultType
     * string).
     * 
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: WebHook activity target endpoint and path. Type: string (or Expression with resultType
     * string).
     * 
     * @param url the url value to set.
     * @return the WebHookActivity object itself.
     */
    public WebHookActivity setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the timeout property: The timeout within which the webhook should be called back. If there is no value
     * specified, it defaults to 10 minutes. Type: string. Pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the timeout value.
     */
    public String getTimeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The timeout within which the webhook should be called back. If there is no value
     * specified, it defaults to 10 minutes. Type: string. Pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param timeout the timeout value to set.
     * @return the WebHookActivity object itself.
     */
    public WebHookActivity setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     * 
     * @return the headers value.
     */
    public Object getHeaders() {
        return this.headers;
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     * 
     * @param headers the headers value to set.
     * @return the WebHookActivity object itself.
     */
    public WebHookActivity setHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     * 
     * @return the body value.
     */
    public Object getBody() {
        return this.body;
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     * 
     * @param body the body value to set.
     * @return the WebHookActivity object itself.
     */
    public WebHookActivity setBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get the authentication property: Authentication method used for calling the endpoint.
     * 
     * @return the authentication value.
     */
    public WebActivityAuthentication getAuthentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Authentication method used for calling the endpoint.
     * 
     * @param authentication the authentication value to set.
     * @return the WebHookActivity object itself.
     */
    public WebHookActivity setAuthentication(WebActivityAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the reportStatusOnCallBack property: When set to true, statusCode, output and error in callback request body
     * will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback
     * request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the reportStatusOnCallBack value.
     */
    public Object getReportStatusOnCallBack() {
        return this.reportStatusOnCallBack;
    }

    /**
     * Set the reportStatusOnCallBack property: When set to true, statusCode, output and error in callback request body
     * will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback
     * request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param reportStatusOnCallBack the reportStatusOnCallBack value to set.
     * @return the WebHookActivity object itself.
     */
    public WebHookActivity setReportStatusOnCallBack(Object reportStatusOnCallBack) {
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebHookActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebHookActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebHookActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebHookActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebHookActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebHookActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("state", getState() == null ? null : getState().toString());
        jsonWriter.writeStringField("onInactiveMarkAs",
            getOnInactiveMarkAs() == null ? null : getOnInactiveMarkAs().toString());
        jsonWriter.writeArrayField("dependsOn", getDependsOn(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("userProperties", getUserProperties(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("type", this.type);
        if (method != null
            || url != null
            || timeout != null
            || headers != null
            || body != null
            || authentication != null
            || reportStatusOnCallBack != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeStringField("method", this.method == null ? null : this.method.toString());
            jsonWriter.writeUntypedField("url", this.url);
            jsonWriter.writeStringField("timeout", this.timeout);
            jsonWriter.writeUntypedField("headers", this.headers);
            jsonWriter.writeUntypedField("body", this.body);
            jsonWriter.writeJsonField("authentication", this.authentication);
            jsonWriter.writeUntypedField("reportStatusOnCallBack", this.reportStatusOnCallBack);
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebHookActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebHookActivity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebHookActivity.
     */
    public static WebHookActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebHookActivity deserializedWebHookActivity = new WebHookActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedWebHookActivity.setName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedWebHookActivity.setDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedWebHookActivity.setState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedWebHookActivity
                        .setOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedWebHookActivity.setDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedWebHookActivity.setUserProperties(userProperties);
                } else if ("type".equals(fieldName)) {
                    deserializedWebHookActivity.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("method".equals(fieldName)) {
                            deserializedWebHookActivity.method = WebHookActivityMethod.fromString(reader.getString());
                        } else if ("url".equals(fieldName)) {
                            deserializedWebHookActivity.url = reader.readUntyped();
                        } else if ("timeout".equals(fieldName)) {
                            deserializedWebHookActivity.timeout = reader.getString();
                        } else if ("headers".equals(fieldName)) {
                            deserializedWebHookActivity.headers = reader.readUntyped();
                        } else if ("body".equals(fieldName)) {
                            deserializedWebHookActivity.body = reader.readUntyped();
                        } else if ("authentication".equals(fieldName)) {
                            deserializedWebHookActivity.authentication = WebActivityAuthentication.fromJson(reader);
                        } else if ("reportStatusOnCallBack".equals(fieldName)) {
                            deserializedWebHookActivity.reportStatusOnCallBack = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedWebHookActivity.setAdditionalProperties(additionalProperties);

            return deserializedWebHookActivity;
        });
    }
}
