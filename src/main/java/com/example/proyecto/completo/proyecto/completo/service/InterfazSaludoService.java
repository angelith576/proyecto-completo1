package com.example.proyecto.completo.proyecto.completo.service;

import org.springframework.http.ResponseEntity;

public interface InterfazSaludoService {

    ResponseEntity getSaludoFullname( String nombre, String apellido);

    ResponseEntity  getSaludoParamName(String nombre);
    ResponseEntity getSaludo(String hora);

        ResponseEntity getOperaciones();
    }




