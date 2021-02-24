package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class ControladorInicio {
    private static final Logger log = LoggerFactory.getLogger(ControladorInicio.class);
   
    @GetMapping("/")
    public String inicio() {

        log.info("ejecutando el controlador rest");
        log.debug("mas detalle del controlador");

       return "Hola Mundo con Spring 2";       
    }

}//Fin de la clase 
