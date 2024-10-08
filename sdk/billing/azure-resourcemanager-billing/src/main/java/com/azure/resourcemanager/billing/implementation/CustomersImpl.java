// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.CustomersClient;
import com.azure.resourcemanager.billing.fluent.models.CustomerInner;
import com.azure.resourcemanager.billing.models.Customer;
import com.azure.resourcemanager.billing.models.Customers;

public final class CustomersImpl implements Customers {
    private static final ClientLogger LOGGER = new ClientLogger(CustomersImpl.class);

    private final CustomersClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public CustomersImpl(CustomersClient innerClient, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Customer> getWithResponse(String billingAccountName, String billingProfileName, String customerName,
        Context context) {
        Response<CustomerInner> inner
            = this.serviceClient().getWithResponse(billingAccountName, billingProfileName, customerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CustomerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Customer get(String billingAccountName, String billingProfileName, String customerName) {
        CustomerInner inner = this.serviceClient().get(billingAccountName, billingProfileName, customerName);
        if (inner != null) {
            return new CustomerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Customer> listByBillingProfile(String billingAccountName, String billingProfileName) {
        PagedIterable<CustomerInner> inner
            = this.serviceClient().listByBillingProfile(billingAccountName, billingProfileName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CustomerImpl(inner1, this.manager()));
    }

    public PagedIterable<Customer> listByBillingProfile(String billingAccountName, String billingProfileName,
        String expand, String filter, String orderBy, Long top, Long skip, Boolean count, String search,
        Context context) {
        PagedIterable<CustomerInner> inner = this.serviceClient()
            .listByBillingProfile(billingAccountName, billingProfileName, expand, filter, orderBy, top, skip, count,
                search, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CustomerImpl(inner1, this.manager()));
    }

    public Response<Customer> getByBillingAccountWithResponse(String billingAccountName, String customerName,
        Context context) {
        Response<CustomerInner> inner
            = this.serviceClient().getByBillingAccountWithResponse(billingAccountName, customerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CustomerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Customer getByBillingAccount(String billingAccountName, String customerName) {
        CustomerInner inner = this.serviceClient().getByBillingAccount(billingAccountName, customerName);
        if (inner != null) {
            return new CustomerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Customer> listByBillingAccount(String billingAccountName) {
        PagedIterable<CustomerInner> inner = this.serviceClient().listByBillingAccount(billingAccountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CustomerImpl(inner1, this.manager()));
    }

    public PagedIterable<Customer> listByBillingAccount(String billingAccountName, String expand, String filter,
        String orderBy, Long top, Long skip, Boolean count, String search, Context context) {
        PagedIterable<CustomerInner> inner = this.serviceClient()
            .listByBillingAccount(billingAccountName, expand, filter, orderBy, top, skip, count, search, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CustomerImpl(inner1, this.manager()));
    }

    private CustomersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
