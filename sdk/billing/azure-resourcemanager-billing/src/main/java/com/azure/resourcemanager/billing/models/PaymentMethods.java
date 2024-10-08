// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of PaymentMethods.
 */
public interface PaymentMethods {
    /**
     * Lists payment methods attached to a billing profile. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of payment method links as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PaymentMethodLink> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists payment methods attached to a billing profile. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of payment method links as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PaymentMethodLink> listByBillingProfile(String billingAccountName, String billingProfileName,
        Context context);

    /**
     * Gets a payment method linked with a billing profile. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param paymentMethodName The ID that uniquely identifies a payment method.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a payment method linked with a billing profile along with {@link Response}.
     */
    Response<PaymentMethodLink> getByBillingProfileWithResponse(String billingAccountName, String billingProfileName,
        String paymentMethodName, Context context);

    /**
     * Gets a payment method linked with a billing profile. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param paymentMethodName The ID that uniquely identifies a payment method.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a payment method linked with a billing profile.
     */
    PaymentMethodLink getByBillingProfile(String billingAccountName, String billingProfileName,
        String paymentMethodName);

    /**
     * Lists the payment methods available for a billing account. Along with the payment methods owned by the caller,
     * these payment methods can be attached to a billing profile to make payments. The operation is supported only for
     * billing accounts with agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of payment methods as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PaymentMethod> listByBillingAccount(String billingAccountName);

    /**
     * Lists the payment methods available for a billing account. Along with the payment methods owned by the caller,
     * these payment methods can be attached to a billing profile to make payments. The operation is supported only for
     * billing accounts with agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of payment methods as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PaymentMethod> listByBillingAccount(String billingAccountName, Context context);

    /**
     * Gets a payment method available for a billing account. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param paymentMethodName The ID that uniquely identifies a payment method.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a payment method available for a billing account along with {@link Response}.
     */
    Response<PaymentMethod> getByBillingAccountWithResponse(String billingAccountName, String paymentMethodName,
        Context context);

    /**
     * Gets a payment method available for a billing account. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param paymentMethodName The ID that uniquely identifies a payment method.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a payment method available for a billing account.
     */
    PaymentMethod getByBillingAccount(String billingAccountName, String paymentMethodName);

    /**
     * Lists the payment methods owned by the caller.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of payment methods as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PaymentMethod> listByUser();

    /**
     * Lists the payment methods owned by the caller.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of payment methods as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PaymentMethod> listByUser(Context context);

    /**
     * Deletes a payment method owned by the caller.
     * 
     * @param paymentMethodName The ID that uniquely identifies a payment method.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByUserWithResponse(String paymentMethodName, Context context);

    /**
     * Deletes a payment method owned by the caller.
     * 
     * @param paymentMethodName The ID that uniquely identifies a payment method.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByUser(String paymentMethodName);

    /**
     * Gets a payment method owned by the caller.
     * 
     * @param paymentMethodName The ID that uniquely identifies a payment method.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a payment method owned by the caller along with {@link Response}.
     */
    Response<PaymentMethod> getByUserWithResponse(String paymentMethodName, Context context);

    /**
     * Gets a payment method owned by the caller.
     * 
     * @param paymentMethodName The ID that uniquely identifies a payment method.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a payment method owned by the caller.
     */
    PaymentMethod getByUser(String paymentMethodName);
}
