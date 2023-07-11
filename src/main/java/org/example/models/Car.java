package org.example.models;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "Car")
public class Car extends Vehicle {

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
        return "Car { id="  + ", type=" + type + ", model=" + model + ", price="+ price +
                ", fuel type=" + ", seats="+ seats +" }";
    }


}
