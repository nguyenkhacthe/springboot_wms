package com.codegym.wms.com.emp;

import com.codegym.wms.com.factory.Factory;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
    @Id
    private String empId;
    private String empName;
    @JoinColumn(name = "factory_id")
    @ManyToOne
    private Factory factory;

    public Employee() {
    }

    public Employee(String empId, String empName, Factory factory) {
        this.empId = empId;
        this.empName = empName;
        this.factory = factory;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }
}
