package com.test.evaluacion.service;


import com.test.evaluacion.entity.Identification;
import com.test.evaluacion.entity.Person;
import com.test.evaluacion.entity.PersonIdentification;

import java.util.List;

public interface PersonIdentificationService {

    public List<PersonIdentification> findAll();

    public PersonIdentification findById(Integer idPerson, Integer idIdentification);
    public PersonIdentification save(Person person, Identification identification);

}
