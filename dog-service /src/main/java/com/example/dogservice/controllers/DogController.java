package com.example.dogservice.controllers;

import com.example.dogservice.models.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class DogController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @GetMapping("/api/v1/dogs")
  public List<Dog> getAllDogs() {
    logger.info("Getting all the dogs!");
    Dog d1 = new Dog("Bob", 2);
    Dog d2 = new Dog("Fluffy", 5);
    Dog d3 = new Dog("Holie", 4);
    return Arrays.asList(d1, d2, d3);
  }

  @GetMapping("/api/v1/dogs/{dogId}")
  public Dog getDogById(@PathVariable String dogId) {
    logger.info("Getting a dog!");
    Dog d1 = new Dog("Bob", 2);
    return d1;
  }
}
