package com.example.nombre_microservicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreController {

    @GetMapping("/nombre")
    public String obtenerNombre() {
        return "María Guzmán";
    }
}