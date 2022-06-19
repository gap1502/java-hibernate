package ru.netology.hibernate.service;

import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.Repository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    public Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getPersonsByAge(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }
}
