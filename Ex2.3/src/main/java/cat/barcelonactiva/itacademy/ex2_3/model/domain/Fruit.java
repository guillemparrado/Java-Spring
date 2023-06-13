package cat.barcelonactiva.itacademy.ex2_3.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Fruit")
public class Fruit {

    @Id
    private String id;

    private String name;

    private double quantityKilos;

    public Fruit() {}

    public String getId() {
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
