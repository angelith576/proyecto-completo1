package com.example.proyecto.completo.proyecto.completo.service.Impl;

import com.example.proyecto.completo.proyecto.completo.constants.AppConstants;
import com.example.proyecto.completo.proyecto.completo.service.InterfazCalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements InterfazCalculadoraService {

    public ResponseEntity getSuma(String num1, String num2){
        String mensaje = "";
        if(Validacion.esNumero(num1) && Validacion.esNumero(num2)){
            double resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
            mensaje = num1+" + "+num2+" = "+resultado;
        }else{
            mensaje = AppConstants.ENTRADA_INVALIDA;
        }
        return ResponseEntity.ok(mensaje);
    }

    public ResponseEntity getResta(String num1, String num2){
        String mensaje = "";
        if(Validacion.esNumero(num1) && Validacion.esNumero(num2)){
            double resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
            mensaje = num1+" - "+num2+" = "+resultado;
        }else{
            mensaje = AppConstants.ENTRADA_INVALIDA;
        }
        return ResponseEntity.ok(mensaje);
    }

    public ResponseEntity getMultiplicacion(String num1, String num2){
        String mensaje = "";
        if(Validacion.esNumero(num1) && Validacion.esNumero(num2)){
            double resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
            mensaje = num1+" * "+num2+" = "+resultado;
        }else{
            mensaje = AppConstants.ENTRADA_INVALIDA;
        }
        return ResponseEntity.ok(mensaje);
    }

    public ResponseEntity getDivision(String num1, String num2){
        String mensaje = "";
        if(Validacion.esNumero(num1) && Validacion.esNumero(num2)){
            if(Double.parseDouble(num2)==0){
                mensaje = AppConstants.DIVISION_POR_CERO;
            }else{
                double resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
                mensaje = num1+" / "+num2+" = "+resultado;
            }
        }else{
            mensaje = AppConstants.ENTRADA_INVALIDA;
        }
        return ResponseEntity.ok(mensaje);
    }

}
