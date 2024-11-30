package com.example.databaseproject.service;

import com.example.databaseproject.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Optional<Person> findById(Integer id);
    List<Person> findAll();
    void save(Person person);
}
