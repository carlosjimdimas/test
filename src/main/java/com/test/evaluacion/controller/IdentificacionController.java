package com.test.evaluacion.controller;

import com.test.evaluacion.entity.Identificacion;
import com.test.evaluacion.service.IntIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class IdentificacionController {



        @Autowired
        private IntIdentificacionService intIdentificacionService;

        //metodos handlers
        @GetMapping("/identificaciones")
        public List<Identificacion> mostrarTodo() {
            return intIdentificacionService.findAll().stream().collect(Collectors.toList());
        }

        @GetMapping("/identificacion/{id}")
        public Identificacion mostrarIdentificacion(@PathVariable Integer id) {
            Identificacion identificacion = intIdentificacionService.findById(id);

            return identificacion;
        }

        @PostMapping("/crear-identificacion")
        @ResponseStatus(HttpStatus.CREATED)
        public Identificacion crear(@Valid @RequestBody Identificacion identificacion){
            return intIdentificacionService.save(identificacion);

        }

        @PutMapping("/actualizar-identificacion/{id}")
        @ResponseStatus(HttpStatus.CREATED)
        public Identificacion update(@RequestBody Identificacion identificacion , @PathVariable Integer id){
            Identificacion identificacionDb = intIdentificacionService.findById(id);
            identificacionDb.setIdentificacionName(identificacion.getIdentificacionName());
            return  intIdentificacionService.save(identificacionDb);

        }

        @DeleteMapping("/eliminar-identificacion/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void eliminar(@PathVariable Integer id){
            intIdentificacionService.deleteById(id);
        }
}
