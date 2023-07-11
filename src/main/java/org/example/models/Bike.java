package org.example.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.example.models.Vehicle;

@Entity
@Table(name = "Bike")
public class Bike extends Vehicle{


    protected Bike() {
    }




    @Override
    public String toString() {
        return "Car { id="  +  " }";
    }
}
