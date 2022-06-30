package com.example.proyecto.completo.proyecto.completo.service;

import org.springframework.http.ResponseEntity;

public interface InterfazCalculadoraCientificaService {

    ResponseEntity getRaizCuadrada(String numero);

    ResponseEntity getSeno(String numero);

    ResponseEntity getCoseno(String numero);

    ResponseEntity getTangente(String numero);

    ResponseEntity getMultiplos(String numero);


}

