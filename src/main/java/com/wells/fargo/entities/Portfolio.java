package com.wells.fargo.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private BigDecimal totalValue;
    private int clientId;
    private String createdAt;
    private String updatedAt;
    @OneToMany
    @JoinColumn(name = "portfolioId", referencedColumnName = "id")
    private List<Security> securityList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Security> getSecurityList() {
        return securityList;
    }

    public void setSecurityList(List<Security> securityList) {
        this.securityList = securityList;
    }

    public Portfolio(int id, BigDecimal totalValue, int clientId, String createdAt, String updatedAt, List<Security> securityList) {
        this.id = id;
        this.totalValue = totalValue;
        this.clientId = clientId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.securityList = securityList;
    }
}
