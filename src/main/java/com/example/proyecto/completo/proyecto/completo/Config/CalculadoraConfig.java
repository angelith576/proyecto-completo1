package com.example.proyecto.completo.proyecto.completo.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "proyectocompleto")

public class CalculadoraConfig {

    public static final String MANANA = "manana";
    public static final String TARDE = "tarde";
    public static final String NOCHE = "noche";
    public static final String SUMA = "tipo1";
    public static final String RESTA = "tipo2";
    public static final String MULTIPLICACION = "tipo3";
    public static final String DIVISION = "tipo4";
    public static final String MULTIPLOS = "tipo5";
    public static final String RAIZ_CUADRADA = "tipo6";
    public static final String SENO = "tipo7";
    public static final String COSENO = "tipo8";
    public static final String TANGENTE = "tipo9";
    private Map<String,String> saludo;

    private Map<String,String> calculadora;

    public String getValorSaludo(String hora){
        return saludo.get(hora);
    }

    public String getValorOperacion(String op){
        return calculadora.get(op);
    }

    public Map<String, String> getSaludo() {
        return saludo;
    }

    public void setSaludo(Map<String, String> saludo) {
        this.saludo = saludo;
    }

    public Map<String, String> getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Map<String, String> calculadora) {
        this.calculadora = calculadora;
    }
}





