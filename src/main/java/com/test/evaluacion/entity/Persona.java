package com.test.evaluacion.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Persona")
public class Persona {

    @NotNull
    private String nombre;
    @NotNull
    private int edad;
    @Size(max = 1)
    private String sexo;
    private String codigo;
    private Date fecha_creacion;

    public  String code(){
        return "adfsd";
    }


}
