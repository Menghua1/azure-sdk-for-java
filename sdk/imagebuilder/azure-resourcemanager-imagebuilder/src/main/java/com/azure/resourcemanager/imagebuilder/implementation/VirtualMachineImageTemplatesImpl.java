// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.imagebuilder.fluent.VirtualMachineImageTemplatesClient;
import com.azure.resourcemanager.imagebuilder.fluent.models.ImageTemplateInner;
import com.azure.resourcemanager.imagebuilder.fluent.models.RunOutputInner;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplate;
import com.azure.resourcemanager.imagebuilder.models.RunOutput;
import com.azure.resourcemanager.imagebuilder.models.VirtualMachineImageTemplates;

public final class VirtualMachineImageTemplatesImpl implements VirtualMachineImageTemplates {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineImageTemplatesImpl.class);

    private final VirtualMachineImageTemplatesClient innerClient;

    private final com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager;

    public VirtualMachineImageTemplatesImpl(VirtualMachineImageTemplatesClient innerClient,
        com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ImageTemplate> list() {
        PagedIterable<ImageTemplateInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ImageTemplateImpl(inner1, this.manager()));
    }

    public PagedIterable<ImageTemplate> list(Context context) {
        PagedIterable<ImageTemplateInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ImageTemplateImpl(inner1, this.manager()));
    }

    public PagedIterable<ImageTemplate> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ImageTemplateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ImageTemplateImpl(inner1, this.manager()));
    }

    public PagedIterable<ImageTemplate> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ImageTemplateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ImageTemplateImpl(inner1, this.manager()));
    }

    public Response<ImageTemplate> getByResourceGroupWithResponse(String resourceGroupName, String imageTemplateName,
        Context context) {
        Response<ImageTemplateInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, imageTemplateName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ImageTemplateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ImageTemplate getByResourceGroup(String resourceGroupName, String imageTemplateName) {
        ImageTemplateInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, imageTemplateName);
        if (inner != null) {
            return new ImageTemplateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String imageTemplateName) {
        this.serviceClient().delete(resourceGroupName, imageTemplateName);
    }

    public void delete(String resourceGroupName, String imageTemplateName, Context context) {
        this.serviceClient().delete(resourceGroupName, imageTemplateName, context);
    }

    public void run(String resourceGroupName, String imageTemplateName) {
        this.serviceClient().run(resourceGroupName, imageTemplateName);
    }

    public void run(String resourceGroupName, String imageTemplateName, Context context) {
        this.serviceClient().run(resourceGroupName, imageTemplateName, context);
    }

    public void cancel(String resourceGroupName, String imageTemplateName) {
        this.serviceClient().cancel(resourceGroupName, imageTemplateName);
    }

    public void cancel(String resourceGroupName, String imageTemplateName, Context context) {
        this.serviceClient().cancel(resourceGroupName, imageTemplateName, context);
    }

    public PagedIterable<RunOutput> listRunOutputs(String resourceGroupName, String imageTemplateName) {
        PagedIterable<RunOutputInner> inner = this.serviceClient().listRunOutputs(resourceGroupName, imageTemplateName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RunOutputImpl(inner1, this.manager()));
    }

    public PagedIterable<RunOutput> listRunOutputs(String resourceGroupName, String imageTemplateName,
        Context context) {
        PagedIterable<RunOutputInner> inner
            = this.serviceClient().listRunOutputs(resourceGroupName, imageTemplateName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RunOutputImpl(inner1, this.manager()));
    }

    public Response<RunOutput> getRunOutputWithResponse(String resourceGroupName, String imageTemplateName,
        String runOutputName, Context context) {
        Response<RunOutputInner> inner = this.serviceClient()
            .getRunOutputWithResponse(resourceGroupName, imageTemplateName, runOutputName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RunOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RunOutput getRunOutput(String resourceGroupName, String imageTemplateName, String runOutputName) {
        RunOutputInner inner = this.serviceClient().getRunOutput(resourceGroupName, imageTemplateName, runOutputName);
        if (inner != null) {
            return new RunOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ImageTemplate getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String imageTemplateName = ResourceManagerUtils.getValueFromIdByName(id, "imageTemplates");
        if (imageTemplateName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'imageTemplates'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, imageTemplateName, Context.NONE).getValue();
    }

    public Response<ImageTemplate> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String imageTemplateName = ResourceManagerUtils.getValueFromIdByName(id, "imageTemplates");
        if (imageTemplateName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'imageTemplates'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, imageTemplateName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String imageTemplateName = ResourceManagerUtils.getValueFromIdByName(id, "imageTemplates");
        if (imageTemplateName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'imageTemplates'.", id)));
        }
        this.delete(resourceGroupName, imageTemplateName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String imageTemplateName = ResourceManagerUtils.getValueFromIdByName(id, "imageTemplates");
        if (imageTemplateName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'imageTemplates'.", id)));
        }
        this.delete(resourceGroupName, imageTemplateName, context);
    }

    private VirtualMachineImageTemplatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager() {
        return this.serviceManager;
    }

    public ImageTemplateImpl define(String name) {
        return new ImageTemplateImpl(name, this.manager());
    }
}
