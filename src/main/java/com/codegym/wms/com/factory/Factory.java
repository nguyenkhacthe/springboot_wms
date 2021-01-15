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
    @JoinColumn(name = "manager_id")
    @OneToOne
    private Employee manager;
}
