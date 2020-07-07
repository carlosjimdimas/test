package com.test.evaluacion.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Data
@Table(name ="Identificacion", schema = "identificacion_schema")
public class Identificacion {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_identificacion")
    private Integer id;
    @NotNull
    @Column(name = "identificacion_name")
    private String identificacionName;
    @NotNull
    @Column(name = "decription")
    private int descripcion;

    @Column(name = "created_at")
    private Date createdAt;
}
