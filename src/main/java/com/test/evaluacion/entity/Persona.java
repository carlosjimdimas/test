package com.test.evaluacion.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
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
    @ApiModelProperty(example = "juan Lopez" , required = true, value = "the person name")
    private String nombre;
    @NotEmpty(message = "no puede estar vacia la edad")
    @Column(name = "age")
    private int edad;
    @Size(max = 1)
    @ApiModelProperty(example = "H or F" ,value = "gender")
    @Column(name = "gender")
    private String sexo;
    @Column(name = "code")
    private String codigo;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public String code() {
        String letras= "abcdefghijklmnopqrstuvwxyz";
        Random numeroletra= new Random();
        StringBuilder code= new StringBuilder();


        for(int i=0; i<10; i++){
            byte posletra =  (byte)numeroletra.nextInt(letras.length()-1);
             code.append(letras.charAt(posletra));
        }
        code = new StringBuilder(code.toString().toUpperCase());
        return code.toString();


    }



}
