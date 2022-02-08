// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.networktraversal.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A relay configuration containing the STUN/TURN URLs and credentials. */
@Fluent
public final class CommunicationRelayConfiguration {
    /*
     * The date for which the username and credentials are not longer valid.
     * Will be 48 hours from request time.
     */
    @JsonProperty(value = "expiresOn", required = true)
    private OffsetDateTime expiresOn;

    /*
     * An array representing the credentials and the STUN/TURN server URLs for
     * use in ICE negotiations.
     */
    @JsonProperty(value = "iceServers", required = true)
    private List<CommunicationIceServer> iceServers;

    /**
     * Get the expiresOn property: The date for which the username and credentials are not longer valid. Will be 48
     * hours from request time.
     *
     * @return the expiresOn value.
     */
    public OffsetDateTime getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the expiresOn property: The date for which the username and credentials are not longer valid. Will be 48
     * hours from request time.
     *
     * @param expiresOn the expiresOn value to set.
     * @return the CommunicationRelayConfiguration object itself.
     */
    public CommunicationRelayConfiguration setExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Get the iceServers property: An array representing the credentials and the STUN/TURN server URLs for use in ICE
     * negotiations.
     *
     * @return the iceServers value.
     */
    public List<CommunicationIceServer> getIceServers() {
        return this.iceServers;
    }

    /**
     * Set the iceServers property: An array representing the credentials and the STUN/TURN server URLs for use in ICE
     * negotiations.
     *
     * @param iceServers the iceServers value to set.
     * @return the CommunicationRelayConfiguration object itself.
     */
    public CommunicationRelayConfiguration setIceServers(List<CommunicationIceServer> iceServers) {
        this.iceServers = iceServers;
        return this;
    }
}
