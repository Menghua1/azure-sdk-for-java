// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.models.InstanceFlexibility;
import com.azure.resourcemanager.billing.models.RenewPropertiesResponse;
import com.azure.resourcemanager.billing.models.ReservationAppliedScopeProperties;
import com.azure.resourcemanager.billing.models.ReservationBillingPlan;
import com.azure.resourcemanager.billing.models.ReservationExtendedStatusInfo;
import com.azure.resourcemanager.billing.models.ReservationMergeProperties;
import com.azure.resourcemanager.billing.models.ReservationSkuProperty;
import com.azure.resourcemanager.billing.models.ReservationSplitProperties;
import com.azure.resourcemanager.billing.models.ReservationSwapProperties;
import com.azure.resourcemanager.billing.models.ReservationUtilizationAggregates;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * The definition of the reservation.
 */
@Fluent
public final class ReservationInner extends ProxyResource {
    /*
     * The location of the reservation.
     */
    private String location;

    /*
     * The etag property.
     */
    private Integer etag;

    /*
     * The properties associated to this reservation
     */
    private ReservationProperty innerProperties;

    /*
     * Tags for this reservation
     */
    private Map<String, String> tags;

    /*
     * The sku information associated to this reservation
     */
    private ReservationSkuProperty sku;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ReservationInner class.
     */
    public ReservationInner() {
    }

    /**
     * Get the location property: The location of the reservation.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the reservation.
     * 
     * @param location the location value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the etag property: The etag property.
     * 
     * @return the etag value.
     */
    public Integer etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag property.
     * 
     * @param etag the etag value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withEtag(Integer etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: The properties associated to this reservation.
     * 
     * @return the innerProperties value.
     */
    private ReservationProperty innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Tags for this reservation.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags for this reservation.
     * 
     * @param tags the tags value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The sku information associated to this reservation.
     * 
     * @return the sku value.
     */
    public ReservationSkuProperty sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku information associated to this reservation.
     * 
     * @param sku the sku value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withSku(ReservationSkuProperty sku) {
        this.sku = sku;
        return this;
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
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
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
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the reservedResourceType property: The reserved source type of the reservation, e.g. virtual machine.
     * 
     * @return the reservedResourceType value.
     */
    public String reservedResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().reservedResourceType();
    }

    /**
     * Get the instanceFlexibility property: Allows reservation discount to be applied across skus within the same auto
     * fit group. Not all skus support instance size flexibility.
     * 
     * @return the instanceFlexibility value.
     */
    public InstanceFlexibility instanceFlexibility() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceFlexibility();
    }

    /**
     * Set the instanceFlexibility property: Allows reservation discount to be applied across skus within the same auto
     * fit group. Not all skus support instance size flexibility.
     * 
     * @param instanceFlexibility the instanceFlexibility value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withInstanceFlexibility(InstanceFlexibility instanceFlexibility) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withInstanceFlexibility(instanceFlexibility);
        return this;
    }

    /**
     * Get the displayName property: The display name of the reservation.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the appliedScopes property: The array of applied scopes of a reservation. Will be null if the reservation is
     * in Shared scope.
     * 
     * @return the appliedScopes value.
     */
    public List<String> appliedScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().appliedScopes();
    }

    /**
     * Set the appliedScopes property: The array of applied scopes of a reservation. Will be null if the reservation is
     * in Shared scope.
     * 
     * @param appliedScopes the appliedScopes value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withAppliedScopes(List<String> appliedScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withAppliedScopes(appliedScopes);
        return this;
    }

    /**
     * Get the appliedScopeType property: The applied scope type of the reservation.
     * 
     * @return the appliedScopeType value.
     */
    public String appliedScopeType() {
        return this.innerProperties() == null ? null : this.innerProperties().appliedScopeType();
    }

    /**
     * Get the archived property: Indicates if the reservation is archived.
     * 
     * @return the archived value.
     */
    public Boolean archived() {
        return this.innerProperties() == null ? null : this.innerProperties().archived();
    }

    /**
     * Set the archived property: Indicates if the reservation is archived.
     * 
     * @param archived the archived value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withArchived(Boolean archived) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withArchived(archived);
        return this;
    }

    /**
     * Get the capabilities property: Capabilities of the reservation.
     * 
     * @return the capabilities value.
     */
    public String capabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().capabilities();
    }

    /**
     * Set the capabilities property: Capabilities of the reservation.
     * 
     * @param capabilities the capabilities value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withCapabilities(String capabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withCapabilities(capabilities);
        return this;
    }

    /**
     * Get the quantity property: The number of the reservation.
     * 
     * @return the quantity value.
     */
    public Float quantity() {
        return this.innerProperties() == null ? null : this.innerProperties().quantity();
    }

    /**
     * Get the provisioningState property: The provisioning state of the reservation, e.g. Succeeded.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the effectiveDateTime property: The effective date time of the reservation.
     * 
     * @return the effectiveDateTime value.
     */
    public OffsetDateTime effectiveDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().effectiveDateTime();
    }

    /**
     * Get the benefitStartTime property: This is the DateTime when the reservation benefit started.
     * 
     * @return the benefitStartTime value.
     */
    public OffsetDateTime benefitStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().benefitStartTime();
    }

    /**
     * Set the benefitStartTime property: This is the DateTime when the reservation benefit started.
     * 
     * @param benefitStartTime the benefitStartTime value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withBenefitStartTime(OffsetDateTime benefitStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withBenefitStartTime(benefitStartTime);
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: DateTime of the last time the reservation was updated.
     * 
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime lastUpdatedDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedDateTime();
    }

    /**
     * Get the expiryDate property: The expiry date of the reservation.
     * 
     * @return the expiryDate value.
     */
    public String expiryDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expiryDate();
    }

    /**
     * Get the expiryDateTime property: This is the date-time when the reservation will expire.
     * 
     * @return the expiryDateTime value.
     */
    public OffsetDateTime expiryDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expiryDateTime();
    }

    /**
     * Set the expiryDateTime property: This is the date-time when the reservation will expire.
     * 
     * @param expiryDateTime the expiryDateTime value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withExpiryDateTime(OffsetDateTime expiryDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withExpiryDateTime(expiryDateTime);
        return this;
    }

    /**
     * Get the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     * 
     * @return the reviewDateTime value.
     */
    public OffsetDateTime reviewDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().reviewDateTime();
    }

    /**
     * Set the reviewDateTime property: This is the date-time when the Azure Hybrid Benefit needs to be reviewed.
     * 
     * @param reviewDateTime the reviewDateTime value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withReviewDateTime(OffsetDateTime reviewDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withReviewDateTime(reviewDateTime);
        return this;
    }

    /**
     * Get the skuDescription property: The sku description of the reservation.
     * 
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().skuDescription();
    }

    /**
     * Get the extendedStatusInfo property: The message giving detailed information about the status code.
     * 
     * @return the extendedStatusInfo value.
     */
    public ReservationExtendedStatusInfo extendedStatusInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedStatusInfo();
    }

    /**
     * Set the extendedStatusInfo property: The message giving detailed information about the status code.
     * 
     * @param extendedStatusInfo the extendedStatusInfo value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withExtendedStatusInfo(ReservationExtendedStatusInfo extendedStatusInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withExtendedStatusInfo(extendedStatusInfo);
        return this;
    }

    /**
     * Get the billingPlan property: The billing plan options available for this sku.
     * 
     * @return the billingPlan value.
     */
    public ReservationBillingPlan billingPlan() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPlan();
    }

    /**
     * Set the billingPlan property: The billing plan options available for this sku.
     * 
     * @param billingPlan the billingPlan value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withBillingPlan(ReservationBillingPlan billingPlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withBillingPlan(billingPlan);
        return this;
    }

    /**
     * Get the displayProvisioningState property: The provisioning state of the reservation for display, e.g. Succeeded.
     * 
     * @return the displayProvisioningState value.
     */
    public String displayProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().displayProvisioningState();
    }

    /**
     * Get the provisioningSubState property: The provisioning state of the reservation, e.g. Succeeded.
     * 
     * @return the provisioningSubState value.
     */
    public String provisioningSubState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningSubState();
    }

    /**
     * Get the purchaseDate property: This is the date when the reservation was purchased.
     * 
     * @return the purchaseDate value.
     */
    public LocalDate purchaseDate() {
        return this.innerProperties() == null ? null : this.innerProperties().purchaseDate();
    }

    /**
     * Set the purchaseDate property: This is the date when the reservation was purchased.
     * 
     * @param purchaseDate the purchaseDate value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withPurchaseDate(LocalDate purchaseDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withPurchaseDate(purchaseDate);
        return this;
    }

    /**
     * Get the purchaseDateTime property: This is the date-time when the reservation was purchased.
     * 
     * @return the purchaseDateTime value.
     */
    public OffsetDateTime purchaseDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().purchaseDateTime();
    }

    /**
     * Set the purchaseDateTime property: This is the date-time when the reservation was purchased.
     * 
     * @param purchaseDateTime the purchaseDateTime value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withPurchaseDateTime(OffsetDateTime purchaseDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withPurchaseDateTime(purchaseDateTime);
        return this;
    }

    /**
     * Get the splitProperties property: Properties of reservation split.
     * 
     * @return the splitProperties value.
     */
    public ReservationSplitProperties splitProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().splitProperties();
    }

    /**
     * Set the splitProperties property: Properties of reservation split.
     * 
     * @param splitProperties the splitProperties value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withSplitProperties(ReservationSplitProperties splitProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withSplitProperties(splitProperties);
        return this;
    }

    /**
     * Get the mergeProperties property: Properties of reservation merge.
     * 
     * @return the mergeProperties value.
     */
    public ReservationMergeProperties mergeProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().mergeProperties();
    }

    /**
     * Set the mergeProperties property: Properties of reservation merge.
     * 
     * @param mergeProperties the mergeProperties value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withMergeProperties(ReservationMergeProperties mergeProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withMergeProperties(mergeProperties);
        return this;
    }

    /**
     * Get the swapProperties property: Properties of reservation swap.
     * 
     * @return the swapProperties value.
     */
    public ReservationSwapProperties swapProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().swapProperties();
    }

    /**
     * Set the swapProperties property: Properties of reservation swap.
     * 
     * @param swapProperties the swapProperties value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withSwapProperties(ReservationSwapProperties swapProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withSwapProperties(swapProperties);
        return this;
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable. Required and need to provide tenantId and managementGroupId if AppliedScopeType is ManagementGroup.
     * 
     * @return the appliedScopeProperties value.
     */
    public ReservationAppliedScopeProperties appliedScopeProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().appliedScopeProperties();
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable. Required and need to provide tenantId and managementGroupId if AppliedScopeType is ManagementGroup.
     * 
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withAppliedScopeProperties(ReservationAppliedScopeProperties appliedScopeProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withAppliedScopeProperties(appliedScopeProperties);
        return this;
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing reservation or savings plan.
     * 
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingScopeId();
    }

    /**
     * Get the renew property: The renew state of the reservation.
     * 
     * @return the renew value.
     */
    public Boolean renew() {
        return this.innerProperties() == null ? null : this.innerProperties().renew();
    }

    /**
     * Get the renewSource property: The renew source of the reservation.
     * 
     * @return the renewSource value.
     */
    public String renewSource() {
        return this.innerProperties() == null ? null : this.innerProperties().renewSource();
    }

    /**
     * Get the renewDestination property: Reservation Id of the reservation which is purchased because of renew. Format
     * of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     * 
     * @return the renewDestination value.
     */
    public String renewDestination() {
        return this.innerProperties() == null ? null : this.innerProperties().renewDestination();
    }

    /**
     * Set the renewDestination property: Reservation Id of the reservation which is purchased because of renew. Format
     * of the resource Id is
     * /providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     * 
     * @param renewDestination the renewDestination value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withRenewDestination(String renewDestination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withRenewDestination(renewDestination);
        return this;
    }

    /**
     * Get the renewProperties property: The renew properties for a reservation.
     * 
     * @return the renewProperties value.
     */
    public RenewPropertiesResponse renewProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().renewProperties();
    }

    /**
     * Set the renewProperties property: The renew properties for a reservation.
     * 
     * @param renewProperties the renewProperties value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withRenewProperties(RenewPropertiesResponse renewProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withRenewProperties(renewProperties);
        return this;
    }

    /**
     * Get the term property: The term of the reservation, e.g. P1Y.
     * 
     * @return the term value.
     */
    public String term() {
        return this.innerProperties() == null ? null : this.innerProperties().term();
    }

    /**
     * Get the userFriendlyAppliedScopeType property: The applied scope type of the reservation for display, e.g.
     * Shared.
     * 
     * @return the userFriendlyAppliedScopeType value.
     */
    public String userFriendlyAppliedScopeType() {
        return this.innerProperties() == null ? null : this.innerProperties().userFriendlyAppliedScopeType();
    }

    /**
     * Get the userFriendlyRenewState property: The renew state of the reservation for display, e.g. On.
     * 
     * @return the userFriendlyRenewState value.
     */
    public String userFriendlyRenewState() {
        return this.innerProperties() == null ? null : this.innerProperties().userFriendlyRenewState();
    }

    /**
     * Get the productCode property: Represents UPN.
     * 
     * @return the productCode value.
     */
    public String productCode() {
        return this.innerProperties() == null ? null : this.innerProperties().productCode();
    }

    /**
     * Set the productCode property: Represents UPN.
     * 
     * @param productCode the productCode value to set.
     * @return the ReservationInner object itself.
     */
    public ReservationInner withProductCode(String productCode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReservationProperty();
        }
        this.innerProperties().withProductCode(productCode);
        return this;
    }

    /**
     * Get the trend property: last 7 day utilization trend for a reservation.
     * 
     * @return the trend value.
     */
    public String trend() {
        return this.innerProperties() == null ? null : this.innerProperties().trend();
    }

    /**
     * Get the aggregates property: The array of aggregates of a reservation's utilization.
     * 
     * @return the aggregates value.
     */
    public List<ReservationUtilizationAggregates> aggregates() {
        return this.innerProperties() == null ? null : this.innerProperties().aggregates();
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
        if (sku() != null) {
            sku().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeNumberField("etag", this.etag);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReservationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReservationInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ReservationInner.
     */
    public static ReservationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReservationInner deserializedReservationInner = new ReservationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedReservationInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedReservationInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedReservationInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedReservationInner.location = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedReservationInner.etag = reader.getNullable(JsonReader::getInt);
                } else if ("properties".equals(fieldName)) {
                    deserializedReservationInner.innerProperties = ReservationProperty.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedReservationInner.tags = tags;
                } else if ("sku".equals(fieldName)) {
                    deserializedReservationInner.sku = ReservationSkuProperty.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedReservationInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReservationInner;
        });
    }
}
