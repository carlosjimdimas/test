package com.test.evaluacion.service;

import com.test.evaluacion.entity.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> findAll();
    public Persona findById(Integer id);
    public Persona save(Persona persona);
    public void deleteById(Integer id);
}
