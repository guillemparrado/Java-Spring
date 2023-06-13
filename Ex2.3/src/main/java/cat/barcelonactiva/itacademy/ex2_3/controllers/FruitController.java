package cat.barcelonactiva.itacademy.ex2_3.controllers;

import cat.barcelonactiva.itacademy.ex2_3.model.domain.Fruit;
import cat.barcelonactiva.itacademy.ex2_3.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private FruitRepository fruitRepository;

    @GetMapping("")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        try {
            List<Fruit> fruits = fruitRepository.findAll();
            return new ResponseEntity<>(fruits, HttpStatus.OK);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable String id) {
        try {
            Fruit fruit = fruitRepository.findById(id).orElse(null);
            if (fruit == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(fruit, HttpStatus.OK);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("")
    public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit) {
        try {
            Fruit savedFruit = fruitRepository.save(fruit);
            return new ResponseEntity<>(savedFruit, HttpStatus.CREATED);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable String id, @RequestBody Fruit fruit) {
        try {
            Fruit existingFruit = fruitRepository.findById(id).orElse(null);
            if (existingFruit == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            existingFruit.setName(fruit.getName());
            existingFruit.setQuantityKilos(fruit.getQuantityKilos());
            Fruit updatedFruit = fruitRepository.save(existingFruit);
            return new ResponseEntity<>(updatedFruit, HttpStatus.OK);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable String id) {
        try {
            Fruit existingFruit = fruitRepository.findById(id).orElse(null);
            if (existingFruit == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            fruitRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

