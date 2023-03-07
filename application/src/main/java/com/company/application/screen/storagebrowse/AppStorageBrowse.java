package com.company.application.screen.storagebrowse;

import com.company.application.app.service.StorageService;
import com.company.application.entity.ExtStorage;
import com.company.inventorycontrolsystem.entity.Storage;
import com.company.inventorycontrolsystem.screen.storage.StorageBrowse;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import io.jmix.ui.screen.StandardLookup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("ics_Storage.browse")
@UiDescriptor("app-storage-browse.xml")
public class AppStorageBrowse extends StorageBrowse {
    private static final Logger log = LoggerFactory.getLogger(AppStorageBrowse.class);

    @Autowired
    private StorageService storageService;

    @Subscribe
    public void onInit(InitEvent event) {
        List<Storage> storages = storageService.fetchStorage();
        List<ExtStorage> extStorages = storageService.fetchExtStorage();

        log.info("");
    }
}