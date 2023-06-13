package cat.barcelonactiva.itacademy.ex2_2.model.repository;

import cat.barcelonactiva.itacademy.ex2_2.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {}
