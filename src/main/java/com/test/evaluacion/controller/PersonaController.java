package com.test.evaluacion.controller;

import com.test.evaluacion.entity.Persona;
import com.test.evaluacion.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PersonaController   {


    @Autowired
    private IPersonaService personaService;

    //metodos handlers
    @GetMapping("/all-People")
    public List<Persona> allPeople() {
        return personaService.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/ver/{id}")
    public Persona verPersona(@PathVariable Integer id) { //cuando sea buscado por id en automatico Spring toma esta variable
        // y la usa como argumento
        Persona persona = personaService.findById(id);

        return persona;
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona nuevaPersona(@Valid  @RequestBody Persona persona){

        persona.setCodigo(persona.code());

        return personaService.save(persona);

    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona update(@RequestBody Persona persona , @PathVariable Integer id){
        Persona personaDb = personaService.findById(id);
        personaDb.setEdad(persona.getEdad());
        return  personaService.save(personaDb);

    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        personaService.deleteById(id);
    }
}
