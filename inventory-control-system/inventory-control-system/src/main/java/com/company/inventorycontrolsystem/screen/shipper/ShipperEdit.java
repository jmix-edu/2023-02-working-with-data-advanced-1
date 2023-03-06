package com.company.inventorycontrolsystem.screen.shipper;

import io.jmix.ui.screen.*;
import com.company.inventorycontrolsystem.entity.Shipper;

@UiController("ics_Shipper.edit")
@UiDescriptor("shipper-edit.xml")
@EditedEntityContainer("shipperDc")
public class ShipperEdit extends StandardEditor<Shipper> {
}