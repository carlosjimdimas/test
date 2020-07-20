package com.test.evaluacion.service;

import com.test.evaluacion.entity.Person;

import java.util.List;

public interface IPersonService {
    public List<Person> findAll();
    public Person findById(Integer id);
    public Person save(Person person);
    public void deleteById(Integer id);
}
