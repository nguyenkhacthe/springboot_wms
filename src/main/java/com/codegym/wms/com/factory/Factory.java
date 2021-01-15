package com.codegym.wms.com.factory;

import com.codegym.wms.com.emp.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Factory {
    @Id
    private String factoryId;
    private String factoryName;
    private String factoryAddress;

    public Factory() {
    }

    public Factory(String factoryId, String factoryName, String factoryAddress) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.factoryAddress = factoryAddress;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }
}
