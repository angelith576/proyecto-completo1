package com.example.proyecto.completo.proyecto.completo.controllers;

import com.example.proyecto.completo.proyecto.completo.service.InterfazSaludoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("saludodebienvenida")
public class SaludoControllers {

    private final InterfazSaludoService saludoService;

    public SaludoControllers(InterfazSaludoService saludoService) {
        this.saludoService = saludoService;
    }


    @GetMapping("/saludarusuario/{hora}")
    public ResponseEntity getSaludo(@PathVariable String hora) {
        return  saludoService.getSaludo(hora);
    }


    @GetMapping("/full-name")
    public ResponseEntity getSaludoFullName(@PathParam("nombre") String nombre, @PathParam("apellido") String apellido) {
        return saludoService.getSaludoFullname(nombre, apellido);
    }

    @GetMapping("/{nombre}")
    public ResponseEntity getSaludoFullName(@PathVariable String nombre) {
        return saludoService.getSaludoParamName(nombre);
    }

}


