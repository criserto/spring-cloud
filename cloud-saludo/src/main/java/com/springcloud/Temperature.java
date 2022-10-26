package com.springcloud;


public class Temperature {

    private String tipo;
    private double temperatura;

    public Temperature(String tipo, double temperatura) {
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

    public String obtenerTemperatura() {
        String resultado = "";

        switch (tipo) {
            case "Celsius":
                resultado = "La temperatura " + this.temperatura + " en celsius es " + (((this.temperatura ) * 9/5) +32);
                break;

            //POR DEFECTO RETORNARÁ EL VALOR EN FAHRENHEIT
            default:
                resultado = "La temperatura " + this.temperatura + " en Fahrenheit es " + ((this.temperatura - 32) / 1.8);
                break;

        }
        return resultado;
    }

    public String decirHola(){
        return "Hola";
    }
}
