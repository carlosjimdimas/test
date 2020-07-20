package com.test.evaluacion.repository;

import com.test.evaluacion.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDAO extends CrudRepository<Person,Integer> {


}
