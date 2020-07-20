package com.test.evaluacion.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Data
@Table(name ="identification", schema = "identificacion_schema")
public class Identification {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer idIdentification;
    @NotNull
    private String identificationName;
    @NotNull
    private int description;
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}
