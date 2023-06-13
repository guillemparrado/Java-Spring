package cat.barcelonactiva.itacademy.ex2_1.model.repository;

import cat.barcelonactiva.itacademy.ex2_1.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {}
