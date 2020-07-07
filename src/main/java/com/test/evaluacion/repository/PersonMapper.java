package com.test.evaluacion.repository;

import com.test.evaluacion.entity.Persona;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper <Persona>{
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
        Persona persona= new Persona();
        persona.setNombre(rs.getString("name"));
        persona.setCodigo(rs.getString("code"));
        persona.setSexo(rs.getString("gender"));
        persona.setEdad(rs.getInt("age"));
        persona.setFechaCreacion(rs.getDate("created_at"));
        return persona;
    }


}
