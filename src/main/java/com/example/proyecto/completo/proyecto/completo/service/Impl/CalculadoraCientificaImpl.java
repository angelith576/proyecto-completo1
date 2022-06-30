package com.example.proyecto.completo.proyecto.completo.service.Impl;


import com.example.proyecto.completo.proyecto.completo.service.InterfazCalculadoraCientificaService;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraCientificaImpl implements InterfazCalculadoraCientificaService {



    private int valorMaximo;


    @Override
    public ResponseEntity getRaizCuadrada(String numero) {
        String mensaje = "";
        Validacion validacion;
        if (Validacion.esNumero(numero)) {
            if (Double.parseDouble(numero) < 0.0) {
                mensaje = "Número";
            } else {
                double num1 = Math.sqrt(Double.parseDouble(numero));
                mensaje = '\u221A' + numero + " = " + num1;
            }
        } else {
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getSeno(String numero) {
        String mensaje = "";
        if (Validacion.esNumero(numero)) {
            double num1 = Math.toRadians(Double.parseDouble(numero));
            double resultado = Math.sin(num1);
            mensaje = "sen(" + numero + ") = " + String.format("%.2f", resultado);
        } else {
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getCoseno(String numero) {
        String mensaje = "";
        if (Validacion.esNumero(numero)) {
            double num1 = Math.toRadians(Double.parseDouble(numero));
            double resultado = Math.cos(num1);
            mensaje = "cos(" + numero + ") = " + String.format("%.2f", resultado);
        } else {
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getTangente(String numero1) {
        String mensaje = "";
        if (Validacion.esNumero(numero1)) {
            double num1 = Math.toRadians(Double.parseDouble(numero1));
            double resultado = Math.tan(num1);
            mensaje = "tan(" + numero1 + ") = " + String.format("%.2f", resultado);
        } else {
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getMultiplos(String numero) {
        String mensaje = "";
        Validacion Validacion = null;
        if (Validacion.esNumero(numero)) {
            double num1 = Double.parseDouble(numero);
            for (double i = 1.0; i <= valorMaximo; i++) {
                double resultado = num1 * i;
                mensaje += num1 + " * " + i + " = " + resultado + "\n";
            }
        } else {
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

}
