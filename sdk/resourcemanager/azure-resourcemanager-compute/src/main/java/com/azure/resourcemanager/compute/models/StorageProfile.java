// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifies the storage settings for the virtual machine disks.
 */
@Fluent
public final class StorageProfile {
    /*
     * Specifies information about the image to use. You can specify information about platform images, marketplace
     * images, or virtual machine images. This element is required when you want to use a platform image, marketplace
     * image, or virtual machine image, but is not used in other creation operations.
     */
    @JsonProperty(value = "imageReference")
    private ImageReference imageReference;

    /*
     * Specifies information about the operating system disk used by the virtual machine. For more information about
     * disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     */
    @JsonProperty(value = "osDisk")
    private OSDisk osDisk;

    /*
     * Specifies the parameters that are used to add a data disk to a virtual machine. For more information about disks,
     * see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     */
    @JsonProperty(value = "dataDisks")
    private List<DataDisk> dataDisks;

    /*
     * Specifies the disk controller type configured for the VM. **Note:** This property will be set to the default disk
     * controller type if not specified provided virtual machine is being created with 'hyperVGeneration' set to V2
     * based on the capabilities of the operating system disk and VM size from the the specified minimum api version.
     * You need to deallocate the VM before updating its disk controller type unless you are updating the VM size in the
     * VM configuration which implicitly deallocates and reallocates the VM. Minimum api-version: 2022-08-01.
     */
    @JsonProperty(value = "diskControllerType")
    private DiskControllerTypes diskControllerType;

    /**
     * Creates an instance of StorageProfile class.
     */
    public StorageProfile() {
    }

    /**
     * Get the imageReference property: Specifies information about the image to use. You can specify information about
     * platform images, marketplace images, or virtual machine images. This element is required when you want to use a
     * platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     * @return the imageReference value.
     */
    public ImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: Specifies information about the image to use. You can specify information about
     * platform images, marketplace images, or virtual machine images. This element is required when you want to use a
     * platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     * @param imageReference the imageReference value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the osDisk property: Specifies information about the operating system disk used by the virtual machine. For
     * more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @return the osDisk value.
     */
    public OSDisk osDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: Specifies information about the operating system disk used by the virtual machine. For
     * more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @param osDisk the osDisk value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withOsDisk(OSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * Get the dataDisks property: Specifies the parameters that are used to add a data disk to a virtual machine. For
     * more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @return the dataDisks value.
     */
    public List<DataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: Specifies the parameters that are used to add a data disk to a virtual machine. For
     * more information about disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     * @param dataDisks the dataDisks value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the diskControllerType property: Specifies the disk controller type configured for the VM. **Note:** This
     * property will be set to the default disk controller type if not specified provided virtual machine is being
     * created with 'hyperVGeneration' set to V2 based on the capabilities of the operating system disk and VM size from
     * the the specified minimum api version. You need to deallocate the VM before updating its disk controller type
     * unless you are updating the VM size in the VM configuration which implicitly deallocates and reallocates the VM.
     * Minimum api-version: 2022-08-01.
     * 
     * @return the diskControllerType value.
     */
    public DiskControllerTypes diskControllerType() {
        return this.diskControllerType;
    }

    /**
     * Set the diskControllerType property: Specifies the disk controller type configured for the VM. **Note:** This
     * property will be set to the default disk controller type if not specified provided virtual machine is being
     * created with 'hyperVGeneration' set to V2 based on the capabilities of the operating system disk and VM size from
     * the the specified minimum api version. You need to deallocate the VM before updating its disk controller type
     * unless you are updating the VM size in the VM configuration which implicitly deallocates and reallocates the VM.
     * Minimum api-version: 2022-08-01.
     * 
     * @param diskControllerType the diskControllerType value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withDiskControllerType(DiskControllerTypes diskControllerType) {
        this.diskControllerType = diskControllerType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageReference() != null) {
            imageReference().validate();
        }
        if (osDisk() != null) {
            osDisk().validate();
        }
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
    }
}
