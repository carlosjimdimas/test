package com.test.evaluacion.service;

import com.test.evaluacion.entity.Identificacion;

import java.util.List;

public interface IntIdentificacionService {
    public List<Identificacion> findAll();
    public Identificacion findById(Integer id);
    public Identificacion save(Identificacion identificacion);
    public void deleteById(Integer id);
}
