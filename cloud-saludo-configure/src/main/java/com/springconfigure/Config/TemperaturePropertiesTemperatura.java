package com.springconfigure.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temperature")
public class TemperaturePropertiesTemperatura {


    private double temperatura = 0;
    private String tipo = "Celsius";

    public double getTemperature() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
