package com.test.evaluacion.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Random;


@Data
@Entity(name = "Person")
//Entity person with all attributes
@Table(name ="person", schema = "person_schema")
public class Person {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer idPerson;
    @NotEmpty (message = "the name cant empty")
    @ApiModelProperty(example = "juan Lopez" , required = true, value = "the person name")
    private String name;
    @NotEmpty(message = "the age cant empty")
    private int age;
    @Size(max = 1)
    @ApiModelProperty(example = "H or F" ,value = "gender")
    private String gender;
    private String code;
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    public String code() {
        //method for create de code 10 positions
        String letters= "abcdefghijklmnopqrstuvwxyz";
        Random letterNum= new Random();
        StringBuilder code= new StringBuilder();


        for(int i=0; i<10; i++){
            byte positionletter =  (byte)letterNum.nextInt(letters.length()-1);
             code.append(letters.charAt(positionletter));
        }
        code = new StringBuilder(code.toString().toUpperCase());
        return code.toString();


    }



}
