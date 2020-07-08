package com.test.evaluacion.repository;

import com.test.evaluacion.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona,Integer> {


}
