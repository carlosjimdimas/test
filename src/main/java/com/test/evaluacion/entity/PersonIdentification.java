package com.test.evaluacion.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity(name= "PersonIdentification")
@Data
public class PersonIdentification {

    private Integer idPersonIdentification;
    private Integer idPerson;
    private Integer idIdentification;
    @Transient
    private Person person;
    @Transient
    private Identification identification;

public PersonIdentification (Person person, Identification identification){
this.person=person;
this.identification=identification;
}


}
