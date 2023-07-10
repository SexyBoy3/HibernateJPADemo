package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@MappedSuperclass
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected int id;

    public Vehicle(String model) {
        this.model = model;
    }
    //Для hybernate
    protected Vehicle(){

    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    @Column(name = "type"  ,length = 50, nullable = false)
    protected String type;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
    @Column(name = "model",length = 50, nullable = false)
    protected String model;

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    @Column(name = "price",length = 50, nullable = false)
    protected BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    protected void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "fueltype",length = 50, nullable = false)
    protected String fueltype;

    public String getFueltype() {
        return fueltype;
    }

    protected void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }
}

