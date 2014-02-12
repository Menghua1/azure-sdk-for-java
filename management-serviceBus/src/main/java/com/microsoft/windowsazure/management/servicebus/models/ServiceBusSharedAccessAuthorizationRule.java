/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * An authorization rule.
 */
public class ServiceBusSharedAccessAuthorizationRule {
    private String claimType;

    /**
     * The type of the claim.
     * 
     * @return The ClaimType value.
     */
    public String getClaimType() {
        return this.claimType;
    }

    /**
     * The type of the claim.
     * 
     * @param claimTypeValue
     *            The ClaimType value.
     */
    public void setClaimType(final String claimTypeValue) {
        this.claimType = claimTypeValue;
    }

    private String claimValue;

    /**
     * The value of the claim.
     * 
     * @return The ClaimValue value.
     */
    public String getClaimValue() {
        return this.claimValue;
    }

    /**
     * The value of the claim.
     * 
     * @param claimValueValue
     *            The ClaimValue value.
     */
    public void setClaimValue(final String claimValueValue) {
        this.claimValue = claimValueValue;
    }

    private Calendar createdTime;

    /**
     * The time at which the authorization rule was created.
     * 
     * @return The CreatedTime value.
     */
    public Calendar getCreatedTime() {
        return this.createdTime;
    }

    /**
     * The time at which the authorization rule was created.
     * 
     * @param createdTimeValue
     *            The CreatedTime value.
     */
    public void setCreatedTime(final Calendar createdTimeValue) {
        this.createdTime = createdTimeValue;
    }

    private String keyName;

    /**
     * The name of the key that was used.
     * 
     * @return The KeyName value.
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * The name of the key that was used.
     * 
     * @param keyNameValue
     *            The KeyName value.
     */
    public void setKeyName(final String keyNameValue) {
        this.keyName = keyNameValue;
    }

    private Calendar modifiedTime;

    /**
     * The most recent time the rule was updated.
     * 
     * @return The ModifiedTime value.
     */
    public Calendar getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * The most recent time the rule was updated.
     * 
     * @param modifiedTimeValue
     *            The ModifiedTime value.
     */
    public void setModifiedTime(final Calendar modifiedTimeValue) {
        this.modifiedTime = modifiedTimeValue;
    }

    private String primaryKey;

    /**
     * The primary key that was used.
     * 
     * @return The PrimaryKey value.
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * The primary key that was used.
     * 
     * @param primaryKeyValue
     *            The PrimaryKey value.
     */
    public void setPrimaryKey(final String primaryKeyValue) {
        this.primaryKey = primaryKeyValue;
    }

    private int revision;

    /**
     * The revision number for the rule.
     * 
     * @return The Revision value.
     */
    public int getRevision() {
        return this.revision;
    }

    /**
     * The revision number for the rule.
     * 
     * @param revisionValue
     *            The Revision value.
     */
    public void setRevision(final int revisionValue) {
        this.revision = revisionValue;
    }

    private ArrayList<AccessRight> rights;

    /**
     * The rights associated with the rule.
     * 
     * @return The Rights value.
     */
    public ArrayList<AccessRight> getRights() {
        return this.rights;
    }

    /**
     * The rights associated with the rule.
     * 
     * @param rightsValue
     *            The Rights value.
     */
    public void setRights(final ArrayList<AccessRight> rightsValue) {
        this.rights = rightsValue;
    }

    private String secondaryKey;

    /**
     * The secondary key that was used.
     * 
     * @return The SecondaryKey value.
     */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    /**
     * The secondary key that was used.
     * 
     * @param secondaryKeyValue
     *            The SecondaryKey value.
     */
    public void setSecondaryKey(final String secondaryKeyValue) {
        this.secondaryKey = secondaryKeyValue;
    }

    /**
     * Initializes a new instance of the ServiceBusSharedAccessAuthorizationRule
     * class.
     * 
     */
    public ServiceBusSharedAccessAuthorizationRule() {
        this.rights = new ArrayList<AccessRight>();
    }
}
