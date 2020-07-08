package com.test.evaluacion.repository;

import com.test.evaluacion.entity.Persona;
import com.test.evaluacion.model.DBConnection;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

public class PersonaJdbc  {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
public PersonaJdbc() throws  ClassNotFoundException {
    dataSource= new DriverManagerDataSource(DBConnection.getURL());
}
public List<Persona> findALL(){
    String sql="select * from person_schema.person";
    List<Persona>personaList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Persona.class));
    return personaList;
}
}
