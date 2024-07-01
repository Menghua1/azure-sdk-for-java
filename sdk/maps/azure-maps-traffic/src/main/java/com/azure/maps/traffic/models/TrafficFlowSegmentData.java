// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.traffic.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.maps.traffic.implementation.models.TrafficFlowSegmentDataFlowSegmentData;
import java.io.IOException;

/**
 * This object is returned from a successful Traffic Flow Segment call.
 */
@Immutable
public final class TrafficFlowSegmentData implements JsonSerializable<TrafficFlowSegmentData> {

    /*
     * Flow Segment Data property
     */
    private TrafficFlowSegmentDataFlowSegmentData flowSegmentData;

    /**
     * Set default constructor to private
     */
    private TrafficFlowSegmentData() {
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
     * Reads an instance of TrafficFlowSegmentData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrafficFlowSegmentData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrafficFlowSegmentData.
     */
    public static TrafficFlowSegmentData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrafficFlowSegmentData deserializedTrafficFlowSegmentData = new TrafficFlowSegmentData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("flowSegmentData".equals(fieldName)) {
                    deserializedTrafficFlowSegmentData.flowSegmentData
                        = TrafficFlowSegmentDataFlowSegmentData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedTrafficFlowSegmentData;
        });
    }

    /**
     * Get the functionalRoadClass property: Functional Road Class. This indicates the road type: 0: Motorway, freeway
     * or other major road. 1: Major road, less important than a motorway. 2: Other major road. 3: Secondary road. 4:
     * Local connecting road. 5: Local road of high importance. 6: Local road.
     *
     * @return the functionalRoadClass value.
     */
    public String getFunctionalRoadClass() {
        return this.flowSegmentData.getFunctionalRoadClass();
    }

    /**
     * Get the currentSpeed property: The current average speed at the selected point, in the units requested. This is
     * calculated from the currentTravelTime and the length of the selected segment.
     *
     * @return the currentSpeed value.
     */
    public Integer getCurrentSpeed() {
        return this.flowSegmentData.getCurrentSpeed();
    }

    /**
     * Get the freeFlowSpeed property: The free flow speed expected under ideal conditions, expressed in the units
     * requested. This is related to the freeFlowTravelTime.
     *
     * @return the freeFlowSpeed value.
     */
    public Integer getFreeFlowSpeed() {
        return this.flowSegmentData.getFreeFlowSpeed();
    }

    /**
     * Get the currentTravelTime property: Current travel time in seconds, across this traffic segment, based on fused
     * real-time measurements between the defined locations in the specified direction.
     *
     * @return the currentTravelTime value.
     */
    public Integer getCurrentTravelTime() {
        return this.flowSegmentData.getCurrentTravelTime();
    }

    /**
     * Get the freeFlowTravelTime property: The travel time in seconds, across this traffic segment, which would be
     * expected under ideal free flow conditions.
     *
     * @return the freeFlowTravelTime value.
     */
    public Integer getFreeFlowTravelTime() {
        return this.flowSegmentData.getFreeFlowTravelTime();
    }

    /**
     * Get the confidence property: The confidence is a measure of the quality of the provided travel time and speed. A
     * value of 1 means full confidence, that the response contains the highest quality data. Lower values indicate the
     * degree that the response may vary from the actual conditions on the road. Any value greater than 0.6 means the
     * information was based on real-time probe input. A value of 0.5 means the reported speed is based on historical
     * info. A value between 0.5 and 0.6 has a calculated weighted average between historical and live speeds.
     *
     * @return the confidence value.
     */
    public Float getConfidence() {
        return this.flowSegmentData.getConfidence();
    }

    /**
     * Get the coordinates property: Includes the coordinates describing the shape of the segment. Coordinates are
     * shifted from the road depending on the zoom level to support high quality visualization in every scale.
     *
     * @return the coordinates value.
     */
    public TrafficFlowSegmentDataPropertiesCoordinates getCoordinates() {
        return this.flowSegmentData.getCoordinates();
    }

    /**
     * Get the version property: This indicates the software version that generated the response.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.flowSegmentData.getVersion();
    }

    /**
     * Get the openLrCode property: OpenLR code for segment. See [OpenLR](https://en.wikipedia.org/wiki/OpenLR) for more
     * information on the use of Open LR codes.
     *
     * @return the openLrCode value.
     */
    public String getOpenLrCode() {
        return this.flowSegmentData.getOpenLrCode();
    }
}
