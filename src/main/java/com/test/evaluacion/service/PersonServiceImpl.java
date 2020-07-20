package com.test.evaluacion.service;

import com.test.evaluacion.entity.Person;
import com.test.evaluacion.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    PersonDAO personDAO;

    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return (List<Person>) personDAO.findAll();


    }

    @Transactional(readOnly = true)
    @Override
    public Person findById(Integer id) {
        return personDAO.findById(id).orElse(null);
    }

    @Override
    public Person save(Person person) {
        return personDAO.save(person);
    }

    @Override
    public void deleteById(Integer id) {
        personDAO.deleteById(id);
    }
}
