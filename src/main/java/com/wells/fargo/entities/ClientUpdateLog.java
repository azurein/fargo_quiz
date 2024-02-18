package com.wells.fargo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClientUpdateLog {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String beforeUpdate;
    private String afterUpdate;
    private String clientId;
    private String createdBy;
    private String createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeforeUpdate() {
        return beforeUpdate;
    }

    public void setBeforeUpdate(String beforeUpdate) {
        this.beforeUpdate = beforeUpdate;
    }

    public String getAfterUpdate() {
        return afterUpdate;
    }

    public void setAfterUpdate(String afterUpdate) {
        this.afterUpdate = afterUpdate;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ClientUpdateLog(int id, String beforeUpdate, String afterUpdate, String clientId, String createdBy, String createdAt) {
        this.id = id;
        this.beforeUpdate = beforeUpdate;
        this.afterUpdate = afterUpdate;
        this.clientId = clientId;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }
}
