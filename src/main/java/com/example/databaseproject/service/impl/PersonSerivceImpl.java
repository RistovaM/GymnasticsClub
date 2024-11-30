package com.example.databaseproject.service.impl;

import com.example.databaseproject.model.Person;
import com.example.databaseproject.repository.PersonRepository;
import com.example.databaseproject.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonSerivceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonSerivceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<Person> findById(Integer id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }
}
