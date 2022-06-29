package com.example.proyecto.completo.proyecto.completo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadoracientifica")

public class CalculadoraCientificaControllers {


    @GetMapping("/raizcuadrada{numero}")
    public ResponseEntity getRaizCuadrada(String resultado) {
        return ResponseEntity.ok(resultado);
    }

     // ejemplo #1
    //coseno de un ángulo en grados

    @GetMapping("/seno/{numero}")
    public ResponseEntity getSeno(@PathVariable String resultado) {
        return ResponseEntity.ok(resultado);

    }

    // ejemplo #2
    @GetMapping("/coseno/{numero}")
    public ResponseEntity getCoseno(@PathVariable String resultado) {
        return ResponseEntity.ok(resultado);

    }

    //  // ejemplo #3
    @GetMapping("/tangente/{numero}")
    public ResponseEntity getTangente(@PathVariable String resultado) {
        return ResponseEntity.ok(resultado);
    }
    @GetMapping("/multiplos/{numero}")
    public ResponseEntity getMultiplos(@PathVariable String numero){
     return ResponseEntity.ok(numero);
    }

}