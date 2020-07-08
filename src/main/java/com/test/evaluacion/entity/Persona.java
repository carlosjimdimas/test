package com.test.evaluacion.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Random;


@Data
@Entity(name = "Persona")

@Table(name ="person", schema = "person_schema")
public class Persona {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer id;
    @NotEmpty (message = "no puede estar vacio el nombre")
    @Column(name = "name")
    private String nombre;
    @NotEmpty(message = "no puede estar vacia la edad")
    @Column(name = "age")
    private int edad;
    @Size(max = 1)
    @Column(name = "gender" )
    private String sexo;
    @Column(name = "code")
    private String codigo;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public String code() {
        String letras= new String("abcdefghijklmnopqrstuvwxyz");
        Random numeroletra= new Random();
        String code="";


        for(int i=0; i<10; i++){
            byte posletra =  (byte)numeroletra.nextInt(letras.length()-1);
             code+=letras.charAt(posletra);
        }
        code=code.toUpperCase();
        return  code;


    }



}
