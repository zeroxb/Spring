package com.example.demo;


import com.example.demo.domain.Persona;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {
    private static final Logger log = LoggerFactory.getLogger(ControladorInicio.class);

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {

        String mensaje = "Hola Mundo con thymeleaf";
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Patiño");
        persona.setEmail("juanpatiño@gmail.com");
        persona.setTelefono("5546344578");

        log.info("ejecutando el controlador SpringMVC");//Log de ejecución de Inicio
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);

       return "index";       
    }

}//Fin de la clase 
