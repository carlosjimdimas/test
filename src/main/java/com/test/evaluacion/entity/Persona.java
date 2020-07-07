package com.test.evaluacion.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Data
@Entity(name = "Persona")

@Table(name ="Person", schema = "person_schema")
public class Persona {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer id;
    @NotNull
    @Column(name = "name")
    private String nombre;
    @NotNull
    @Column(name = "age")
    private int edad;
    @Size(max = 1)
    @Column(name = "gender")
    private String sexo;
    @Column(name = "code")
    private String codigo;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public String code() {
        return "adfsd";
    }


}
