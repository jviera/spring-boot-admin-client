package dev.jviera.metrics_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola desde Spring Boot!";
    }
}
