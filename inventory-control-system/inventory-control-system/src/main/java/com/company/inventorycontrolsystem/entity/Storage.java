package com.company.inventorycontrolsystem.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "ICS_STORAGE")
@Entity(name = "ics_Storage")
public class Storage {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull
    @InstanceName
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @JoinTable(name = "ICS_RP_S_LINK",
            joinColumns = @JoinColumn(name = "STORAGE_ID"),
            inverseJoinColumns = @JoinColumn(name = "RECEIPT_DOCUMENT_ID"))
    @ManyToMany
    private List<ReceiptDocument> receiptDocuments;

    public List<ReceiptDocument> getReceiptDocuments() {
        return receiptDocuments;
    }

    public void setReceiptDocuments(List<ReceiptDocument> receiptDocuments) {
        this.receiptDocuments = receiptDocuments;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}