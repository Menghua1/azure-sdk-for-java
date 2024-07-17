// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies information about the operating system disk used by the virtual machine. For more information about disks,
 * see [About disks and VHDs for Azure virtual
 * machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
 */
@Fluent
public final class OSDisk {
    /*
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from
     * user-image or a specialized VHD. Possible values are: **Windows,** **Linux.**
     */
    @JsonProperty(value = "osType")
    private OperatingSystemTypes osType;

    /*
     * Specifies the encryption settings for the OS Disk. Minimum api-version: 2015-06-15.
     */
    @JsonProperty(value = "encryptionSettings")
    private DiskEncryptionSettings encryptionSettings;

    /*
     * The disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The virtual hard disk.
     */
    @JsonProperty(value = "vhd")
    private VirtualHardDisk vhd;

    /*
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the
     * virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     */
    @JsonProperty(value = "image")
    private VirtualHardDisk image;

    /*
     * Specifies the caching requirements. Possible values are: **None,** **ReadOnly,** **ReadWrite.** The defaulting
     * behavior is: **None for Standard storage. ReadOnly for Premium storage.**
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /*
     * Specifies the ephemeral Disk Settings for the operating system disk used by the virtual machine.
     */
    @JsonProperty(value = "diffDiskSettings")
    private DiffDiskSettings diffDiskSettings;

    /*
     * Specifies how the virtual machine disk should be created. Possible values are **Attach:** This value is used when
     * you are using a specialized disk to create the virtual machine. **FromImage:** This value is used when you are
     * using an image to create the virtual machine. If you are using a platform image, you should also use the
     * imageReference element described above. If you are using a marketplace image, you should also use the plan
     * element previously described.
     */
    @JsonProperty(value = "createOption", required = true)
    private DiskCreateOptionTypes createOption;

    /*
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk
     * in a virtual machine image. The property 'diskSizeGB' is the number of bytes x 1024^3 for the disk and the value
     * cannot be larger than 1023.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The managed disk parameters.
     */
    @JsonProperty(value = "managedDisk")
    private ManagedDiskParameters managedDisk;

    /*
     * Specifies whether OS Disk should be deleted or detached upon VM deletion. Possible values are: **Delete.** If
     * this value is used, the OS disk is deleted when VM is deleted. **Detach.** If this value is used, the os disk is
     * retained after VM is deleted. The default value is set to **Detach**. For an ephemeral OS Disk, the default value
     * is set to **Delete**. The user cannot change the delete option for an ephemeral OS Disk.
     */
    @JsonProperty(value = "deleteOption")
    private DiskDeleteOptionTypes deleteOption;

    /**
     * Creates an instance of OSDisk class.
     */
    public OSDisk() {
    }

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from user-image or a specialized VHD. Possible values are: **Windows,** **Linux.**.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from user-image or a specialized VHD. Possible values are: **Windows,** **Linux.**.
     * 
     * @param osType the osType value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the encryptionSettings property: Specifies the encryption settings for the OS Disk. Minimum api-version:
     * 2015-06-15.
     * 
     * @return the encryptionSettings value.
     */
    public DiskEncryptionSettings encryptionSettings() {
        return this.encryptionSettings;
    }

    /**
     * Set the encryptionSettings property: Specifies the encryption settings for the OS Disk. Minimum api-version:
     * 2015-06-15.
     * 
     * @param encryptionSettings the encryptionSettings value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withEncryptionSettings(DiskEncryptionSettings encryptionSettings) {
        this.encryptionSettings = encryptionSettings;
        return this;
    }

    /**
     * Get the name property: The disk name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The disk name.
     * 
     * @param name the name value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the vhd property: The virtual hard disk.
     * 
     * @return the vhd value.
     */
    public VirtualHardDisk vhd() {
        return this.vhd;
    }

    /**
     * Set the vhd property: The virtual hard disk.
     * 
     * @param vhd the vhd value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withVhd(VirtualHardDisk vhd) {
        this.vhd = vhd;
        return this;
    }

    /**
     * Get the image property: The source user image virtual hard disk. The virtual hard disk will be copied before
     * being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     * exist.
     * 
     * @return the image value.
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image property: The source user image virtual hard disk. The virtual hard disk will be copied before
     * being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     * exist.
     * 
     * @param image the image value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the caching property: Specifies the caching requirements. Possible values are: **None,** **ReadOnly,**
     * **ReadWrite.** The defaulting behavior is: **None for Standard storage. ReadOnly for Premium storage.**.
     * 
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements. Possible values are: **None,** **ReadOnly,**
     * **ReadWrite.** The defaulting behavior is: **None for Standard storage. ReadOnly for Premium storage.**.
     * 
     * @param caching the caching value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     * 
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     * 
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the diffDiskSettings property: Specifies the ephemeral Disk Settings for the operating system disk used by
     * the virtual machine.
     * 
     * @return the diffDiskSettings value.
     */
    public DiffDiskSettings diffDiskSettings() {
        return this.diffDiskSettings;
    }

    /**
     * Set the diffDiskSettings property: Specifies the ephemeral Disk Settings for the operating system disk used by
     * the virtual machine.
     * 
     * @param diffDiskSettings the diffDiskSettings value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withDiffDiskSettings(DiffDiskSettings diffDiskSettings) {
        this.diffDiskSettings = diffDiskSettings;
        return this;
    }

    /**
     * Get the createOption property: Specifies how the virtual machine disk should be created. Possible values are
     * **Attach:** This value is used when you are using a specialized disk to create the virtual machine.
     * **FromImage:** This value is used when you are using an image to create the virtual machine. If you are using a
     * platform image, you should also use the imageReference element described above. If you are using a marketplace
     * image, you should also use the plan element previously described.
     * 
     * @return the createOption value.
     */
    public DiskCreateOptionTypes createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption property: Specifies how the virtual machine disk should be created. Possible values are
     * **Attach:** This value is used when you are using a specialized disk to create the virtual machine.
     * **FromImage:** This value is used when you are using an image to create the virtual machine. If you are using a
     * platform image, you should also use the imageReference element described above. If you are using a marketplace
     * image, you should also use the plan element previously described.
     * 
     * @param createOption the createOption value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withCreateOption(DiskCreateOptionTypes createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. The property 'diskSizeGB' is the number of bytes x
     * 1024^3 for the disk and the value cannot be larger than 1023.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. The property 'diskSizeGB' is the number of bytes x
     * 1024^3 for the disk and the value cannot be larger than 1023.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     * 
     * @return the managedDisk value.
     */
    public ManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     * 
     * @param managedDisk the managedDisk value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withManagedDisk(ManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the deleteOption property: Specifies whether OS Disk should be deleted or detached upon VM deletion. Possible
     * values are: **Delete.** If this value is used, the OS disk is deleted when VM is deleted. **Detach.** If this
     * value is used, the os disk is retained after VM is deleted. The default value is set to **Detach**. For an
     * ephemeral OS Disk, the default value is set to **Delete**. The user cannot change the delete option for an
     * ephemeral OS Disk.
     * 
     * @return the deleteOption value.
     */
    public DiskDeleteOptionTypes deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specifies whether OS Disk should be deleted or detached upon VM deletion. Possible
     * values are: **Delete.** If this value is used, the OS disk is deleted when VM is deleted. **Detach.** If this
     * value is used, the os disk is retained after VM is deleted. The default value is set to **Detach**. For an
     * ephemeral OS Disk, the default value is set to **Delete**. The user cannot change the delete option for an
     * ephemeral OS Disk.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withDeleteOption(DiskDeleteOptionTypes deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptionSettings() != null) {
            encryptionSettings().validate();
        }
        if (vhd() != null) {
            vhd().validate();
        }
        if (image() != null) {
            image().validate();
        }
        if (diffDiskSettings() != null) {
            diffDiskSettings().validate();
        }
        if (createOption() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property createOption in model OSDisk"));
        }
        if (managedDisk() != null) {
            managedDisk().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OSDisk.class);
}
