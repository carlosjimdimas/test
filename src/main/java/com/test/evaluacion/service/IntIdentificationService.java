package com.test.evaluacion.service;

import com.test.evaluacion.entity.Identification;

import java.util.List;

public interface IntIdentificationService {
    public List<Identification> findAll();
    public Identification findById(Integer id);
    public Identification save(Identification identification);
    public void deleteById(Integer id);
}
