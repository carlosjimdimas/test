package com.test.evaluacion.service;

import com.test.evaluacion.entity.Persona;
import com.test.evaluacion.model.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    PersonaDAO personaDAO;

    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return (List<Persona>) personaDAO.findAll();


    }

    @Transactional(readOnly = true)
    @Override
    public Persona findById(Integer id) {
        return personaDAO.findById(id).orElse(null);
    }

    @Override
    public Persona save(Persona persona) {
        return personaDAO.save(persona);
    }

    @Override
    public void deleteById(Integer id) {
        personaDAO.deleteById(id);
    }
}
