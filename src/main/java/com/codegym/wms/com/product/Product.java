package com.codegym.wms.com.product;

import com.codegym.wms.com.factory.Factory;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    private String productCode;
    @Id
    @JoinColumn(name = "factory_id")
    @ManyToOne
    private Factory factory;
    private String productName;
    private String vendor;
    private String unit;
    private double width;
    private double height;
    private double length;
    private double weight;
    private double unitPrice;

    public Product() {
    }

    public Product(String productCode, Factory factory, String productName, String vendor, String unit, double width, double height, double length, double weight, double unitPrice) {
        this.productCode = productCode;
        this.factory = factory;
        this.productName = productName;
        this.vendor = vendor;
        this.unit = unit;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.unitPrice = unitPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
