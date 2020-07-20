package com.test.evaluacion.repository;

import com.test.evaluacion.entity.PersonIdentification;
import org.springframework.data.repository.CrudRepository;

public interface PersonIdentificationDAO extends CrudRepository<PersonIdentification, Integer> {
}
