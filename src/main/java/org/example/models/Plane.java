package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Plane")
public class Plane extends Vehicle{
    //Для hybernate
    public Plane() {
    }

    public Plane(String model, int passengerCapacity) {
        super(model);
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
        return "Car { id=" + id + ", type=" + type + ", model=" + model + ", price="+ price +
                ", fuel type=" + fueltype+ ", passengerCapacity="+ passengerCapacity +" }";
    }
}
