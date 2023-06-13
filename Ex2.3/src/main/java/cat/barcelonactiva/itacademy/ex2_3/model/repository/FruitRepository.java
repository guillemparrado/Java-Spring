package cat.barcelonactiva.itacademy.ex2_3.model.repository;

import cat.barcelonactiva.itacademy.ex2_3.model.domain.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FruitRepository extends MongoRepository<Fruit, String> {}
