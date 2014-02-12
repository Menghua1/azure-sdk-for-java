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

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The List Role Sizes operation response.
 */
public class RoleSizeListResponse extends OperationResponse implements
        Iterable<RoleSizeListResponse.RoleSize> {
    private ArrayList<RoleSizeListResponse.RoleSize> roleSizes;

    /**
     * The role sizes that are valid for your subscription.
     * 
     * @return The RoleSizes value.
     */
    public ArrayList<RoleSizeListResponse.RoleSize> getRoleSizes() {
        return this.roleSizes;
    }

    /**
     * The role sizes that are valid for your subscription.
     * 
     * @param roleSizesValue
     *            The RoleSizes value.
     */
    public void setRoleSizes(
            final ArrayList<RoleSizeListResponse.RoleSize> roleSizesValue) {
        this.roleSizes = roleSizesValue;
    }

    /**
     * Initializes a new instance of the RoleSizeListResponse class.
     * 
     */
    public RoleSizeListResponse() {
        super();
        this.roleSizes = new ArrayList<RoleSizeListResponse.RoleSize>();
    }

    /**
     * Gets the sequence of RoleSizes.
     * 
     */
    public Iterator<RoleSizeListResponse.RoleSize> iterator() {
        return this.getRoleSizes().iterator();
    }

    /**
     * A role size that is valid for your subscription.
     */
    public static class RoleSize {
        private int cores;

        /**
         * Number of cores available for the role size.
         * 
         * @return The Cores value.
         */
        public int getCores() {
            return this.cores;
        }

        /**
         * Number of cores available for the role size.
         * 
         * @param coresValue
         *            The Cores value.
         */
        public void setCores(final int coresValue) {
            this.cores = coresValue;
        }

        private String label;

        /**
         * Localized label of the role size.
         * 
         * @return The Label value.
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * Localized label of the role size.
         * 
         * @param labelValue
         *            The Label value.
         */
        public void setLabel(final String labelValue) {
            this.label = labelValue;
        }

        private int memoryInMb;

        /**
         * Memory available for the role size.
         * 
         * @return The MemoryInMb value.
         */
        public int getMemoryInMb() {
            return this.memoryInMb;
        }

        /**
         * Memory available for the role size.
         * 
         * @param memoryInMbValue
         *            The MemoryInMb value.
         */
        public void setMemoryInMb(final int memoryInMbValue) {
            this.memoryInMb = memoryInMbValue;
        }

        private String name;

        /**
         * The name of a role size that is valid for your subscription.
         * 
         * @return The Name value.
         */
        public String getName() {
            return this.name;
        }

        /**
         * The name of a role size that is valid for your subscription.
         * 
         * @param nameValue
         *            The Name value.
         */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }

        private boolean supportedByVirtualMachines;

        /**
         * Indicating if the role size is supported by VMs.
         * 
         * @return The SupportedByVirtualMachines value.
         */
        public boolean isSupportedByVirtualMachines() {
            return this.supportedByVirtualMachines;
        }

        /**
         * Indicating if the role size is supported by VMs.
         * 
         * @param supportedByVirtualMachinesValue
         *            The SupportedByVirtualMachines value.
         */
        public void setSupportedByVirtualMachines(
                final boolean supportedByVirtualMachinesValue) {
            this.supportedByVirtualMachines = supportedByVirtualMachinesValue;
        }

        private boolean supportedByWebWorkerRoles;

        /**
         * Indicating if the role size is supported by web/worker roles.
         * 
         * @return The SupportedByWebWorkerRoles value.
         */
        public boolean isSupportedByWebWorkerRoles() {
            return this.supportedByWebWorkerRoles;
        }

        /**
         * Indicating if the role size is supported by web/worker roles.
         * 
         * @param supportedByWebWorkerRolesValue
         *            The SupportedByWebWorkerRoles value.
         */
        public void setSupportedByWebWorkerRoles(
                final boolean supportedByWebWorkerRolesValue) {
            this.supportedByWebWorkerRoles = supportedByWebWorkerRolesValue;
        }
    }
}
