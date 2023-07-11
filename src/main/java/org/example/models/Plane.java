package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Plane")
public class Plane extends Vehicle{
    //Для hybernate
    public Plane() {
    }

    public Plane(String type, String model, BigDecimal price, String fueltype, int passengerCapacity) {
        super(type, model , price , fueltype);
        this.passengerCapacity = passengerCapacity;
    }

    @Column(name = "passengerCapacity",length = 50, nullable = false)
    private int passengerCapacity;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    protected void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Car { id="  + ", type=" + type + ", model=" + model + ", price="+ price +
                ", fuel type="+ ", passengerCapacity="+ passengerCapacity +" }";
    }
}
