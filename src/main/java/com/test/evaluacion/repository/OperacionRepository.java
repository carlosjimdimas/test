package com.test.evaluacion.repository;

import com.test.evaluacion.entity.Persona;
import org.springframework.jdbc.core.JdbcTemplate;

public class OperacionRepository {
    public JdbcTemplate jdbcTemplate;

    public OperacionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int update(Persona persona){
jdbcTemplate.update("UPDATE");
        return 1;

    }
}
