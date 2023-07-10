package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.*;



import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_jpa_demo");
             EntityManager em = emf.createEntityManager()) {


            Car c1 = new Car("BMW X1",7 );
            Bike b1 = new Bike("BMX");
            Car c2 = new Car("Jiguli", 4);
            Plane p1 = new Plane("Mr.Beast", 100);
            Truck t1 = new Truck("Scania R1", 12.9);


            System.out.printf("Car: %s%n", c2);
            System.out.printf("Car: %s%n", c1);
            System.out.printf("Plane: %s%n", p1);
            System.out.printf("Truck: %s%n", t1);
            System.out.printf("Truck: %s%n", b1);




            try {
                em.getTransaction().begin();
                em.persist(p1);
                em.persist(b1);
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }



            try {
                em.getTransaction().begin();
                Truck result = (Truck) em.find(Truck.class, 1);
                em.getTransaction().commit();
                System.out.printf("Truck: %s%n", result);
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }






        } // session.close()




    }
}