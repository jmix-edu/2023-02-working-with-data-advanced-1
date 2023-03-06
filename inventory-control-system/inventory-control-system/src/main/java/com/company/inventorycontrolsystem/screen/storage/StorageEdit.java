package com.company.inventorycontrolsystem.screen.storage;

import io.jmix.ui.screen.*;
import com.company.inventorycontrolsystem.entity.Storage;

@UiController("ics_Storage.edit")
@UiDescriptor("storage-edit.xml")
@EditedEntityContainer("storageDc")
public class StorageEdit extends StandardEditor<Storage> {
}