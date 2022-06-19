package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.service.Service;


import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getProduct(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getByAge(@RequestParam("age") int age) {
        return service.getPersonsByAge(age);
    }

    @GetMapping("/persons/by-name-surname")
    public Optional<Person> getNameAndSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return service.getPersonsByNameAndSurname(name, surname);
    }
}
