package com.globomatics.bike.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer,handler"})
public class Bike
{
    public Bike() {
    }

    public String getName() {
        return name;
    }

    public Bike setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Bike setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Bike setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Bike setModel(String model) {
        this.model = model;
        return this;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public Bike setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
        return this;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public Bike setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Bike setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    public boolean isContact() {
        return contact;
    }

    public Bike setContact(boolean contact) {
        this.contact = contact;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Bike setId(Long id) {
        this.id = id;
        return this;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String model;
    private String SerialNumber;
    private BigDecimal purchasePrice;
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "MM-dd-yyyy")
    private Date purchaseDate;
    private boolean contact;




}
