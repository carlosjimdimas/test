package com.test.evaluacion;

import com.test.evaluacion.model.DBConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class EvaluacionApplication {


    public static void main(String[] args) {
        SpringApplication.run(EvaluacionApplication.class, args);


    }


}
