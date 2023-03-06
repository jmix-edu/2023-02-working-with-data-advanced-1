package com.company.inventorycontrolsystem.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "ICS_RECEIPT_DOCUMENT", indexes = {
        @Index(name = "IDX_ICSRECEIPTDOCUMENT_SHIPPER", columnList = "SHIPPER_ID")
})
@Entity(name = "ics_ReceiptDocument")
public class ReceiptDocument {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull
    @InstanceName
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "DATE_", nullable = false)
    private LocalDateTime date;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "TOTAL_SUM", precision = 19, scale = 2)
    private BigDecimal totalSum;

    @JoinColumn(name = "SHIPPER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Shipper shipper;

    @JoinTable(name = "ICS_RP_S_LINK",
            joinColumns = @JoinColumn(name = "RECEIPT_DOCUMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "STORAGE_ID"))
    @ManyToMany
    private List<Storage> storages;

    public List<Storage> getStorages() {
        return storages;
    }

    public void setStorages(List<Storage> storages) {
        this.storages = storages;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    public ReceiptType getType() {
        return type == null ? null : ReceiptType.fromId(type);
    }

    public void setType(ReceiptType type) {
        this.type = type == null ? null : type.getId();
    }

    public BigDecimal getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(BigDecimal totalSum) {
        this.totalSum = totalSum;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
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