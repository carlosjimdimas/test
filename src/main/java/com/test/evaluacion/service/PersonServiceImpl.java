package com.test.evaluacion.service;

import com.test.evaluacion.entity.Person;
import com.test.evaluacion.repository.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    PersonaDAO personaDAO;

    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return (List<Person>) personaDAO.findAll();


    }

    @Transactional(readOnly = true)
    @Override
    public Person findById(Integer id) {
        return personaDAO.findById(id).orElse(null);
    }

    @Override
    public Person save(Person persona) {
        return personaDAO.save(persona);
    }

    @Override
    public void deleteById(Integer id) {
        personaDAO.deleteById(id);
    }
}
