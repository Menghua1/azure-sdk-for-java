// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.chat.models;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Content of a chat message.
 */
@Fluent
public final class ChatMessageContent {

    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "topic")
    private String topic;

    @JsonProperty(value = "participants")
    private Iterable<ChatParticipant> participants;

    @JsonProperty(value = "attachments")
    private Iterable<ChatAttachment> attachments;

    @JsonProperty(value = "initiatorCommunicationIdentifier")
    private CommunicationIdentifier initiator;

    /**
     * Constructs a new ChatMessageContent
     *
     * @param message The message
     * @param topic The topic
     * @param participants The participants
     * @param initiator The initiator
     */
    public ChatMessageContent(
            String message, String topic, Iterable<ChatParticipant> participants, CommunicationIdentifier initiator) {

        this.message = message;
        this.topic = topic;
        this.participants = participants;
        this.initiator = initiator;
    }

    /**
     * Get the message property: Chat message content for messages of types text or
     * html.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the topic property: Chat message content for messages of type
     * topicUpdated.
     *
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Get the participants property: Chat message content for messages of types
     * participantAdded or participantRemoved.
     *
     * @return the participants value.
     */
    public Iterable<ChatParticipant> getParticipants() {
        return this.participants;
    }

    /**
     * Get the attachment property: Chat message content for messages of type
     * attachments
     *
     * @return the attachments value.
     */
    public Iterable<ChatAttachment> getAttachments() {
        return this.attachments;
    }

    /**
     * Set the attachments property: List of attachments for this message.
     *
     * @param attachments the attachments value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setAttachments(Iterable<ChatAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * Get the initiator property: Chat message content for messages of types
     * participantAdded or participantRemoved.
     *
     * @return the initiator value.
     */
    public CommunicationIdentifier getInitiator() {
        return this.initiator;
    }

}
