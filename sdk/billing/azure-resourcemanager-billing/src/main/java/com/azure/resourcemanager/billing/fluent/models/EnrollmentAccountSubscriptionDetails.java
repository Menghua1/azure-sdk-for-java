// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.models.SubscriptionEnrollmentAccountStatus;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The billing properties that can be modified. Available only for the Enterprise Agreement Type.
 */
@Immutable
public final class EnrollmentAccountSubscriptionDetails
    implements JsonSerializable<EnrollmentAccountSubscriptionDetails> {
    /*
     * The enrollment Account and the subscription association start date. This field is available only for the
     * Enterprise Agreement Type.
     */
    private OffsetDateTime enrollmentAccountStartDate;

    /*
     * The current enrollment account status of the subscription. This field is available only for the Enterprise
     * Agreement Type.
     */
    private SubscriptionEnrollmentAccountStatus subscriptionEnrollmentAccountStatus;

    /**
     * Creates an instance of EnrollmentAccountSubscriptionDetails class.
     */
    public EnrollmentAccountSubscriptionDetails() {
    }

    /**
     * Get the enrollmentAccountStartDate property: The enrollment Account and the subscription association start date.
     * This field is available only for the Enterprise Agreement Type.
     * 
     * @return the enrollmentAccountStartDate value.
     */
    public OffsetDateTime enrollmentAccountStartDate() {
        return this.enrollmentAccountStartDate;
    }

    /**
     * Get the subscriptionEnrollmentAccountStatus property: The current enrollment account status of the subscription.
     * This field is available only for the Enterprise Agreement Type.
     * 
     * @return the subscriptionEnrollmentAccountStatus value.
     */
    public SubscriptionEnrollmentAccountStatus subscriptionEnrollmentAccountStatus() {
        return this.subscriptionEnrollmentAccountStatus;
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
     * Reads an instance of EnrollmentAccountSubscriptionDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnrollmentAccountSubscriptionDetails if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EnrollmentAccountSubscriptionDetails.
     */
    public static EnrollmentAccountSubscriptionDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnrollmentAccountSubscriptionDetails deserializedEnrollmentAccountSubscriptionDetails
                = new EnrollmentAccountSubscriptionDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enrollmentAccountStartDate".equals(fieldName)) {
                    deserializedEnrollmentAccountSubscriptionDetails.enrollmentAccountStartDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("subscriptionEnrollmentAccountStatus".equals(fieldName)) {
                    deserializedEnrollmentAccountSubscriptionDetails.subscriptionEnrollmentAccountStatus
                        = SubscriptionEnrollmentAccountStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnrollmentAccountSubscriptionDetails;
        });
    }
}
