package com.test.evaluacion.controller;

import com.test.evaluacion.entity.Identification;
import com.test.evaluacion.service.IntIdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class IdentificationController {



        @Autowired
        private IntIdentificationService intIdentificationService;

        //metodos handlers
        @GetMapping("/identifications")
        public List<Identification> showAllIdentifications() {
            return intIdentificationService.findAll().stream().collect(Collectors.toList());
        }

        @GetMapping("/see-identificacion/{id}")
        public Identification showIdentification(@PathVariable Integer id) {

            return intIdentificationService.findById(id);
        }

        @PostMapping("/create-identification")
        @ResponseStatus(HttpStatus.CREATED)
        public Identification createIdentification(@Valid @RequestBody Identification identification){
            return intIdentificationService.save(identification);

        }

        @PutMapping("/update-identification/{id}")
        @ResponseStatus(HttpStatus.CREATED)
        public Identification updateIdentification(@RequestBody Identification identification, @PathVariable Integer id){
            Identification identificationDb = intIdentificationService.findById(id);
            identificationDb.setIdentificationName(identification.getIdentificationName());
            return  intIdentificationService.save(identificationDb);

        }

        @DeleteMapping("/delete-identification/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void deleteIdentification(@PathVariable Integer id){
            intIdentificationService.deleteById(id);
        }
}
