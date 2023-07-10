package org.example.models;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "Car")
public class Car extends Vehicle {
    public Car(String model, int seats) {
        super(model);
        this.seats = seats;
    }

    // Для hybernate
    protected Car() {

    }
    @Column(name = "seats",length = 50, nullable = false)
    private int seats;

    public int getSeats() {
        return seats;
    }

    protected void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car { id=" + id + ", type=" + type + ", model=" + model + ", price="+ price +
                ", fuel type=" + fueltype+ ", seats="+ seats +" }";
    }


}
