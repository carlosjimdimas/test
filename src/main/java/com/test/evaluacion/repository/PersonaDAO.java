package com.test.evaluacion.repository;

import com.test.evaluacion.entity.Persona;
import org.springframework.data.repository.CrudRepository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDAO extends CrudRepository<Persona,Integer> {


}
