package com.test.evaluacion.repository;

import com.test.evaluacion.entity.Identification;
import org.springframework.data.repository.CrudRepository;

public interface IdentificationDAO extends CrudRepository<Identification,Integer> {
}
