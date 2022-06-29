package com.example.proyecto.completo.proyecto.completo.service.Impl;

import  com.example.proyecto.completo.service.InterfazCalculaCientifService;
import  org.springframework.beans.factory.annotation.Value;
import  org.springframework.http.ResponseEntity;
import  org.springframework.stereotype.Service;


public class CalculadoraCientificaImpl {
    @Service
    public class CalculaCientifImpl implements InterfazCalculaCientifService {

        @Value("${multiplos.numero}")
        private int valorMaximo;
    }

    @Override
    public ResponseEntity getRaizCuadrada(String numero){
        String mensaje = "";
        if(Validacion.esNumero(numero)){
            if(Double.parseDouble(numero) < 0.0){
                mensaje = "Número complejo";
            }else {
                double num1 = Math.sqrt(Double.parseDouble(numero));
                mensaje = '\u221A'+numero+" = "+num1;
            }
        }else {
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getSeno(String numero){
        String mensaje = "";
        if(Validacion.esNumero(numero)){
            double num1 = Math.toRadians(Double.parseDouble(numero));
            double resultado = Math.sen(num1);
            mensaje = "sen("+numero+") = "+ String.format("%.2f",resultado);
        }else{
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getCoseno(String numero){
        String mensaje = "";
        if(Validacion.esNumero(numero)){
            double num1 = Math.toRadians(Double.parseDouble(numero));
            double resultado = Math.cos(num1);
            mensaje = "cos("+numero+") = "+ String.format("%.2f",resultado);
        }else{
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getTangente(String numero){
        String mensaje = "";
        if(Validacion.esNumero(numero)){
            double num1 = Math.toRadians(Double.parseDouble(numero));
            double resultado = Math.tan(num1);
            mensaje = "tan("+numero+") = "+ String.format("%.2f",resultado);
        }else{
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getMultiplos(String numero){
        String mensaje = "";
        if(Validacion.esNumero(numero)){
            double num1 = Double.parseDouble(numero);
            for(double i = 1.0; i <= valorMaximo; i++){
                double resultado = num1 * i;
                mensaje += num1 + " * " + i + " = " + resultado + "\n";
            }
        }else{
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }






}