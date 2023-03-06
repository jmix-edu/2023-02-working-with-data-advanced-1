package com.company.inventorycontrolsystem.screen.shipper;

import io.jmix.ui.screen.*;
import com.company.inventorycontrolsystem.entity.Shipper;

@UiController("ics_Shipper.browse")
@UiDescriptor("shipper-browse.xml")
@LookupComponent("shippersTable")
public class ShipperBrowse extends StandardLookup<Shipper> {
}