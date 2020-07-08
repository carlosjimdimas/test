package com.test.evaluacion.repository;

import com.test.evaluacion.entity.Identificacion;
import org.springframework.data.repository.CrudRepository;

public interface IdentificacionDAO extends CrudRepository<Identificacion,Integer> {
}
