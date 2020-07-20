package com.test.evaluacion.service;

import com.test.evaluacion.entity.Identification;
import com.test.evaluacion.repository.IdentificationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
//service, implementation of identificationservice methods

public class IdentificationServiceImpl implements IntIdentificationService {
    @Autowired
    IdentificationDAO identificationDAO;

    @Transactional(readOnly = true)
    public List<Identification> findAll() {
        return (List<Identification>) identificationDAO.findAll();


    }

    @Transactional(readOnly = true)
    @Override
    public Identification findById(Integer id) {
        return identificationDAO.findById(id).orElse(null);
    }

    @Override
    public Identification save(Identification identification) {
        return identificationDAO.save(identification);
    }

    @Override
    public void deleteById(Integer id) {
        identificationDAO.deleteById(id);
    }
}
