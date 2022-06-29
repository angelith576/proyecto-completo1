package com.example.proyecto.completo.proyecto.completo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraControllers {


    @GetMapping("/suma/{num1}/{num2}")
    public double getSuma(@PathVariable double num1, @PathVariable double num2) {
        double resultado = num1 + num2;
        return resultado;

    }

    @GetMapping("/resta")
    public double getResta(@PathParam("num1") double num1, @PathParam("num2") double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    @GetMapping("/multiplicacion")
    public ResponseEntity getMultiplicacion(@PathParam("num1") double num1, @PathParam("num2") double num2) {
        double resultado = num1 * num2;
        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/dividir")
    public ResponseEntity getDivicion(@PathParam("num1") double num1, @PathParam("num2") double num2) {
        double resultado = num1 / num2;
        return ResponseEntity.ok(resultado);

    }



    }
