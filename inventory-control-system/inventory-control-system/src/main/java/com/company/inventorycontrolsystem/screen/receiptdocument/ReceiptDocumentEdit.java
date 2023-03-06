package com.company.inventorycontrolsystem.screen.receiptdocument;

import io.jmix.ui.screen.*;
import com.company.inventorycontrolsystem.entity.ReceiptDocument;

@UiController("ics_ReceiptDocument.edit")
@UiDescriptor("receipt-document-edit.xml")
@EditedEntityContainer("receiptDocumentDc")
public class ReceiptDocumentEdit extends StandardEditor<ReceiptDocument> {
}