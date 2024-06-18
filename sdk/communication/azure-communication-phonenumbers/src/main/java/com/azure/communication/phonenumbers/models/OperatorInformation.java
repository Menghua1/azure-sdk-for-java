// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents metadata about a phone number that is controlled/provided by that phone number's operator.
 */
@Immutable
public final class OperatorInformation implements JsonSerializable<OperatorInformation> {
    /*
     * E.164 formatted string representation of the phone number
     */
    private String phoneNumber;

    /*
     * National format of the phone number
     */
    private String nationalFormat;

    /*
     * International format of the phone number
     */
    private String internationalFormat;

    /*
     * ISO 3166-1 two character ('alpha-2') code associated with the phone number.
     */
    private String isoCountryCode;

    /*
     * Type of service associated with the phone number
     */
    private OperatorNumberType numberType;

    /*
     * Represents metadata describing the operator of a phone number
     */
    private OperatorDetails operatorDetails;

    /**
     * Creates an instance of OperatorInformation class.
     */
    public OperatorInformation() {
    }

    /**
     * Get the phoneNumber property: E.164 formatted string representation of the phone number.
     * 
     * @return the phoneNumber value.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Get the nationalFormat property: National format of the phone number.
     * 
     * @return the nationalFormat value.
     */
    public String getNationalFormat() {
        return this.nationalFormat;
    }

    /**
     * Get the internationalFormat property: International format of the phone number.
     * 
     * @return the internationalFormat value.
     */
    public String getInternationalFormat() {
        return this.internationalFormat;
    }

    /**
     * Get the isoCountryCode property: ISO 3166-1 two character ('alpha-2') code associated with the phone number.
     * 
     * @return the isoCountryCode value.
     */
    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * Get the numberType property: Type of service associated with the phone number.
     * 
     * @return the numberType value.
     */
    public OperatorNumberType getNumberType() {
        return this.numberType;
    }

    /**
     * Get the operatorDetails property: Represents metadata describing the operator of a phone number.
     * 
     * @return the operatorDetails value.
     */
    public OperatorDetails getOperatorDetails() {
        return this.operatorDetails;
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
     * Reads an instance of OperatorInformation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperatorInformation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OperatorInformation.
     */
    public static OperatorInformation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperatorInformation deserializedOperatorInformation = new OperatorInformation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("phoneNumber".equals(fieldName)) {
                    deserializedOperatorInformation.phoneNumber = reader.getString();
                } else if ("nationalFormat".equals(fieldName)) {
                    deserializedOperatorInformation.nationalFormat = reader.getString();
                } else if ("internationalFormat".equals(fieldName)) {
                    deserializedOperatorInformation.internationalFormat = reader.getString();
                } else if ("isoCountryCode".equals(fieldName)) {
                    deserializedOperatorInformation.isoCountryCode = reader.getString();
                } else if ("numberType".equals(fieldName)) {
                    deserializedOperatorInformation.numberType = OperatorNumberType.fromString(reader.getString());
                } else if ("operatorDetails".equals(fieldName)) {
                    deserializedOperatorInformation.operatorDetails = OperatorDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperatorInformation;
        });
    }
}
