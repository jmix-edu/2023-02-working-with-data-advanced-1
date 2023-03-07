package com.company.application.entity;

import com.company.inventorycontrolsystem.entity.Storage;
import io.jmix.core.entity.annotation.ReplaceEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalTime;

@JmixEntity
@Entity(name = "app_ExtStorage")
@ReplaceEntity(Storage.class)
public class ExtStorage extends Storage {

    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "WORK_FROM")
    private LocalTime workFrom;

    @Column(name = "WORK_TO")
    private LocalTime workTo;

    public void setWorkFrom(LocalTime workFrom) {
        this.workFrom = workFrom;
    }

    public LocalTime getWorkFrom() {
        return workFrom;
    }

    public void setWorkTo(LocalTime workTo) {
        this.workTo = workTo;
    }

    public LocalTime getWorkTo() {
        return workTo;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}