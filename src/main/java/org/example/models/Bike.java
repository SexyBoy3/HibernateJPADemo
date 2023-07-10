package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bike")
public class Bike extends Vehicle{
    //Для hybernate
    protected Bike() {
    }

    public Bike(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return "Car { id=" + id + ", type=" + type + ", model=" + model + ", price="+ price +
                ", fuel type=" + fueltype +" }";
    }
}
