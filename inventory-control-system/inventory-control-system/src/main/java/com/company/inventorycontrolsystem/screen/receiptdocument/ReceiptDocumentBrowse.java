package com.company.inventorycontrolsystem.screen.receiptdocument;

import io.jmix.ui.screen.*;
import com.company.inventorycontrolsystem.entity.ReceiptDocument;

@UiController("ics_ReceiptDocument.browse")
@UiDescriptor("receipt-document-browse.xml")
@LookupComponent("receiptDocumentsTable")
public class ReceiptDocumentBrowse extends StandardLookup<ReceiptDocument> {
}