package cat.barcelonactiva.itacademy.ex2_2.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double quantityKilos;

    public Fruit() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantityKilos() {
        return quantityKilos;
    }

    public void setQuantityKilos(double quantityKilos) {
        this.quantityKilos = quantityKilos;
    }
}
