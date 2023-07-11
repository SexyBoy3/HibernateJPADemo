package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Truck")
public class Truck extends Vehicle{
    //Для hybernate
    protected Truck() {
    }



    @Column(name = "loadCapacity",length = 50, nullable = false)
    private Double loadCapacity;

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    protected void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String toString() {
        return "Car { id="  + ", type=" + type + ", model=" + model + ", price="+ price +
                ", fuel type=" + ", loadCapacity="+ loadCapacity +" }";
    }
}
