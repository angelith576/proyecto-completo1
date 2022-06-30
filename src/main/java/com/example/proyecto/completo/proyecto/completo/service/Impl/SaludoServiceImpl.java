package com.example.proyecto.completo.proyecto.completo.service.Impl;


import com.example.proyecto.completo.proyecto.completo.Config.CalculadoraConfig;
import com.example.proyecto.completo.proyecto.completo.service.InterfazSaludoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.*;
@Service
public class SaludoServiceImpl implements InterfazSaludoService {



    private final CalculadoraConfig calculadoraConfig;

        public SaludoServiceImpl(CalculadoraConfig configCalculadora){
            this.calculadoraConfig = configCalculadora;
        }

    @Override
    public ResponseEntity getSaludoFullname(String nombre, String apellido) {
        return null;
    }

    @Override
    public ResponseEntity getSaludoParamName(String nombre) {
        return null;
    }

    @Override
        public ResponseEntity getSaludo(String hora) {
            int horaNum = Integer.parseInt(hora);
            String mensaje;
            if(horaNum >= 6 && horaNum < 12){
                mensaje = calculadoraConfig.getValorSaludo(calculadoraConfig.MANANA);
            }else if(horaNum >= 12 && horaNum < 19){
                mensaje = calculadoraConfig.getValorSaludo(calculadoraConfig.TARDE);
            }else if(horaNum >= 19 && horaNum <= 23 || horaNum >= 0 && horaNum < 6){
                mensaje= calculadoraConfig.getValorSaludo(calculadoraConfig.NOCHE);
            }else{
                mensaje = "El número ingresado no es válido";
            }
            return ResponseEntity.ok(mensaje);
        }

        @Override
        public ResponseEntity getOperaciones(){
            String mensaje = "Las operaciones disponibles son: "+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.SUMA)+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.RESTA)+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.MULTIPLICACION)+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.DIVISION)+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.MULTIPLOS)+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.RAIZ_CUADRADA)+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.SENO)+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.COSENO)+
                    "\n"+calculadoraConfig.getValorOperacion(CalculadoraConfig.TANGENTE);

            return ResponseEntity.ok(mensaje);
        }
    }


