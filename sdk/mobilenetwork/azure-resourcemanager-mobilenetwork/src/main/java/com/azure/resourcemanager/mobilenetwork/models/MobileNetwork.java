// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.MobileNetworkInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of MobileNetwork.
 */
public interface MobileNetwork {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: The identity used to retrieve any private keys used for SUPI concealment from Azure
     * key vault.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the mobile network resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the publicLandMobileNetworkIdentifier property: The unique public land mobile network identifier for the
     * network. If both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified, then the
     * 'publicLandMobileNetworks' will take precedence.
     * 
     * @return the publicLandMobileNetworkIdentifier value.
     */
    PlmnId publicLandMobileNetworkIdentifier();

    /**
     * Gets the publicLandMobileNetworks property: A list of public land mobile networks including their identifiers. If
     * both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified, then the
     * 'publicLandMobileNetworks' will take precedence.
     * 
     * @return the publicLandMobileNetworks value.
     */
    List<PublicLandMobileNetwork> publicLandMobileNetworks();

    /**
     * Gets the serviceKey property: The mobile network resource identifier.
     * 
     * @return the serviceKey value.
     */
    String serviceKey();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.mobilenetwork.fluent.models.MobileNetworkInner object.
     * 
     * @return the inner object.
     */
    MobileNetworkInner innerModel();

    /**
     * The entirety of the MobileNetwork definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithLocation, DefinitionStages.WithResourceGroup,
        DefinitionStages.WithPublicLandMobileNetworkIdentifier, DefinitionStages.WithCreate {
    }

    /**
     * The MobileNetwork definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the MobileNetwork definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the MobileNetwork definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the MobileNetwork definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithPublicLandMobileNetworkIdentifier withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the MobileNetwork definition allowing to specify publicLandMobileNetworkIdentifier.
         */
        interface WithPublicLandMobileNetworkIdentifier {
            /**
             * Specifies the publicLandMobileNetworkIdentifier property: The unique public land mobile network
             * identifier for the network. If both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier'
             * are specified, then the 'publicLandMobileNetworks' will take precedence..
             * 
             * @param publicLandMobileNetworkIdentifier The unique public land mobile network identifier for the
             * network. If both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified, then
             * the 'publicLandMobileNetworks' will take precedence.
             * @return the next definition stage.
             */
            WithCreate withPublicLandMobileNetworkIdentifier(PlmnId publicLandMobileNetworkIdentifier);
        }

        /**
         * The stage of the MobileNetwork definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity,
            DefinitionStages.WithPublicLandMobileNetworks {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            MobileNetwork create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MobileNetwork create(Context context);
        }

        /**
         * The stage of the MobileNetwork definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MobileNetwork definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity used to retrieve any private keys used for SUPI concealment
             * from Azure key vault..
             * 
             * @param identity The identity used to retrieve any private keys used for SUPI concealment from Azure key
             * vault.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the MobileNetwork definition allowing to specify publicLandMobileNetworks.
         */
        interface WithPublicLandMobileNetworks {
            /**
             * Specifies the publicLandMobileNetworks property: A list of public land mobile networks including their
             * identifiers. If both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified,
             * then the 'publicLandMobileNetworks' will take precedence..
             * 
             * @param publicLandMobileNetworks A list of public land mobile networks including their identifiers. If
             * both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified, then the
             * 'publicLandMobileNetworks' will take precedence.
             * @return the next definition stage.
             */
            WithCreate withPublicLandMobileNetworks(List<PublicLandMobileNetwork> publicLandMobileNetworks);
        }
    }

    /**
     * Begins update for the MobileNetwork resource.
     * 
     * @return the stage of resource update.
     */
    MobileNetwork.Update update();

    /**
     * The template for MobileNetwork update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        MobileNetwork apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MobileNetwork apply(Context context);
    }

    /**
     * The MobileNetwork update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the MobileNetwork update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MobileNetwork update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identity associated with this resource..
             * 
             * @param identity The managed service identity associated with this resource.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    MobileNetwork refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MobileNetwork refresh(Context context);

    /**
     * Gets all the SIM groups assigned to a mobile network.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIM groups assigned to a mobile network as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SimGroup> listSimGroups();

    /**
     * Gets all the SIM groups assigned to a mobile network.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIM groups assigned to a mobile network as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SimGroup> listSimGroups(Context context);
}
