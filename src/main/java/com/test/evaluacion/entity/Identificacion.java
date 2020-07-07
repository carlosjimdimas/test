package com.test.evaluacion.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity (name = "identificacion")
@Data
public class Identificacion {
    @NotNull
    private String identificacionName;
    @NotNull
    private int identificacion;
    private Date createdAt;
}
