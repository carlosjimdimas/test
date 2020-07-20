package com.test.evaluacion.service;

import com.test.evaluacion.entity.Identification;
import com.test.evaluacion.entity.Person;
import com.test.evaluacion.entity.PersonIdentification;
import com.test.evaluacion.repository.PersonIdentificationDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonIdentificationImpl implements PersonIdentificationService {
    @Autowired
    PersonIdentificationDAO personIdentificationDAO;
    @Override
    public List<PersonIdentification> findAll() {
       return (List<PersonIdentification>) personIdentificationDAO.findAll();
    }

    @Override
    public PersonIdentification findById(Integer idPerson, Integer idIdentification) {
        return null;
    }

    @Override
    public PersonIdentification save(Person person, Identification identification) {
        return null;
    }
}
