package com.example.proyecto.completo.proyecto.completo.service.Impl;

import com.example.proyecto.completo.config.CalculadoraConfig;
import com.example.proyecto.completo.controller.SaludoController;
import com.example.proyecto.completo.services.InterfazSaludoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.*;

public class SaludoServiceImpl {



    @Service
    public class SaludoServiceImpl implements InterfazSaludoService {

        private final ConfigCalculadora configCalculadora;

        public SaludoServiceImpl(ConfigCalculadora configCalculadora){
            this.configCalculadora = configCalculadora;
        }

        @Override
        public ResponseEntity getSaludo(String hora) {
            int horaNum = Integer.parseInt(hora);
            String mensaje;
            if(horaNum >= 6 && horaNum < 12){
                mensaje = configCalculadora.getValorSaludo(ConfigCalculadora.MANANA);
            }else if(horaNum >= 12 && horaNum < 19){
                mensaje = configCalculadora.getValorSaludo(ConfigCalculadora.TARDE);
            }else if(horaNum >= 19 && horaNum <= 23 || horaNum >= 0 && horaNum < 6){
                mensaje = configCalculadora.getValorSaludo(ConfigCalculadora.NOCHE);
            }else{
                mensaje = "El número ingresado no es válido";
            }
            return ResponseEntity.ok(mensaje);
        }

        @Override
        public ResponseEntity getOperaciones(){
            String mensaje = "Las operaciones disponibles son: "+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.SUMA)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.RESTA)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.MULTIPLICACION)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.DIVISION)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.FACTORIAL)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.MULTIPLOS)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.COSENO)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.RAIZ_CUADRADA)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.AREA_CIRCULO)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.VOLUMEN_ESFERA)+
                    "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.ECUACION_CUADRATICA);
            return ResponseEntity.ok(mensaje);
        }
    }

}
