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

/**
 * A response to a request for a particular namespace.
 */
public class NamespaceDescription {
    private String authorizationType;

    /**
     * The authorization type.
     * 
     * @return The AuthorizationType value.
     */
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * The authorization type.
     * 
     * @param authorizationTypeValue
     *            The AuthorizationType value.
     */
    public void setAuthorizationType(final String authorizationTypeValue) {
        this.authorizationType = authorizationTypeValue;
    }

    private String connectionString;

    /**
     * Namespace connection string. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
     * more information)
     * 
     * @return The ConnectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Namespace connection string. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
     * more information)
     * 
     * @param connectionStringValue
     *            The ConnectionString value.
     */
    public void setConnectionString(final String connectionStringValue) {
        this.connectionString = connectionStringValue;
    }

    private String keyName;

    /**
     * Default ACS access key to generate the access token. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
     * more information)
     * 
     * @return The KeyName value.
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * Default ACS access key to generate the access token. (see
     * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
     * more information)
     * 
     * @param keyNameValue
     *            The KeyName value.
     */
    public void setKeyName(final String keyNameValue) {
        this.keyName = keyNameValue;
    }

    private ArrayList<AccessRight> rights;

    /**
     * The rights associated with a namespace.
     * 
     * @return The Rights value.
     */
    public ArrayList<AccessRight> getRights() {
        return this.rights;
    }

    /**
     * The rights associated with a namespace.
     * 
     * @param rightsValue
     *            The Rights value.
     */
    public void setRights(final ArrayList<AccessRight> rightsValue) {
        this.rights = rightsValue;
    }

    private String secondaryConnectionString;

    /**
     * Secondary namespace connection string.
     * 
     * @return The SecondaryConnectionString value.
     */
    public String getSecondaryConnectionString() {
        return this.secondaryConnectionString;
    }

    /**
     * Secondary namespace connection string.
     * 
     * @param secondaryConnectionStringValue
     *            The SecondaryConnectionString value.
     */
    public void setSecondaryConnectionString(
            final String secondaryConnectionStringValue) {
        this.secondaryConnectionString = secondaryConnectionStringValue;
    }

    /**
     * Initializes a new instance of the NamespaceDescription class.
     * 
     */
    public NamespaceDescription() {
        this.rights = new ArrayList<AccessRight>();
    }
}
