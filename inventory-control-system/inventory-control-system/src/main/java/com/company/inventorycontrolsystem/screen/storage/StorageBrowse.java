package com.company.inventorycontrolsystem.screen.storage;

import io.jmix.ui.screen.*;
import com.company.inventorycontrolsystem.entity.Storage;

@UiController("ics_Storage.browse")
@UiDescriptor("storage-browse.xml")
@LookupComponent("storagesTable")
public class StorageBrowse extends StandardLookup<Storage> {
}