package com.test.evaluacion.controller;

import com.test.evaluacion.entity.Person;
import com.test.evaluacion.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PersonController {


    @Autowired
    private IPersonService personService;

    //metodos handlers
    @GetMapping("/all-people")
    public List<Person> allPeople() {
        return personService.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/see-person/{id}")
    public Person seePerson(@PathVariable Integer id) {

        return personService.findById(id);
    }

    @PostMapping("/create-person")
    @ResponseStatus(HttpStatus.CREATED)
    public Person newPerson(@Valid  @RequestBody Person person){

        person.setCode(person.code());

        return personService.save(person);

    }

    @PutMapping("/update-person/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Person updatePerson(@RequestBody Person person, @PathVariable Integer id){
        Person personDb = personService.findById(id);
        personDb.setAge(person.getAge());
        return  personService.save(personDb);

    }

    @DeleteMapping("/delete-person/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePerson(@PathVariable Integer id){
        personService.deleteById(id);
    }
}
