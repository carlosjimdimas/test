package com.test.evaluacion.service;

import com.test.evaluacion.entity.Identificacion;
import com.test.evaluacion.repository.IdentificacionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class IdentificacionServiceImpl implements IntIdentificacionService {
    @Autowired
    IdentificacionDAO identificacionDAO;

    @Transactional(readOnly = true)
    public List<Identificacion> findAll() {
        return (List<Identificacion>) identificacionDAO.findAll();


    }

    @Transactional(readOnly = true)
    @Override
    public Identificacion findById(Integer id) {
        return identificacionDAO.findById(id).orElse(null);
    }

    @Override
    public Identificacion save(Identificacion identificacion) {
        return identificacionDAO.save(identificacion);
    }

    @Override
    public void deleteById(Integer id) {
        identificacionDAO.deleteById(id);
    }
}
