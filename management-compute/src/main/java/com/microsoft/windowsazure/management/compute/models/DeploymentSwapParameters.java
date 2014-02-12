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

package com.microsoft.windowsazure.management.compute.models;

/**
 * Parameters supplied to the Swap Deployment operation.
 */
public class DeploymentSwapParameters {
    private String productionDeployment;

    /**
     * The optional name of the production deployment.
     * 
     * @return The ProductionDeployment value.
     */
    public String getProductionDeployment() {
        return this.productionDeployment;
    }

    /**
     * The optional name of the production deployment.
     * 
     * @param productionDeploymentValue
     *            The ProductionDeployment value.
     */
    public void setProductionDeployment(final String productionDeploymentValue) {
        this.productionDeployment = productionDeploymentValue;
    }

    private String sourceDeployment;

    /**
     * Required. The name of the source deployment.
     * 
     * @return The SourceDeployment value.
     */
    public String getSourceDeployment() {
        return this.sourceDeployment;
    }

    /**
     * Required. The name of the source deployment.
     * 
     * @param sourceDeploymentValue
     *            The SourceDeployment value.
     */
    public void setSourceDeployment(final String sourceDeploymentValue) {
        this.sourceDeployment = sourceDeploymentValue;
    }
}
