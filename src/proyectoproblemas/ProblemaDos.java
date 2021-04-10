package proyectoproblemas;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Scanner; 

/**
 *
 * @author Meryan
 */
public class ProblemaDos {
    
    private String tipoDolar = "dolar"; 
    private String tipoEuro = "euro"; 

    private double porcentaje = 1.53; 

    public String getTipoDolar() {
        return tipoDolar;
    }

    public void setTipoDolar(String tipoDolar) {
        this.tipoDolar = tipoDolar;
    }

    public String getTipoEuro() {
        return tipoEuro;
    }

    public void setTipoEuro(String tipoEuro) {
        this.tipoEuro = tipoEuro;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }



    public double convertidor(double unidad, String entrada, String salida) {

        double resultado = 0;

        if (entrada.equals(salida)) {
            //caso que entrada y salida sean iguales
            resultado = unidad;
        } else {
            if (entrada.equals(tipoEuro)) {
                //caso: va a convertir de euro a dolar
                resultado = unidad * porcentaje;
            }

            if (entrada.equals(tipoDolar)) {
                //caso: va a convertir de dolar a euro
                resultado = unidad / porcentaje;
            }
        }

        return resultado;
    }

    public static void main(String args[]) {

        ProblemaDos convertidor = new ProblemaDos();

        
        System.out.println("Cien dolares a euros son: " + convertidor.convertidor(100, "dolar", "euro"));
        convertidor.setPorcentaje(2); //seteando un nuevo tipo de cambio
        System.out.println("Cien dolares a euros son: " + convertidor.convertidor(100, convertidor.getTipoDolar(), convertidor.getTipoEuro()));

        
        System.out.println("Cien dolares a euros son: " + convertidor.convertidor(100, "dolar", convertidor.getTipoEuro()));
        convertidor.setTipoDolar("DOLLAR"); //seteando un nuevo string para el dolar
        System.out.println("Cien dolares a euros son: " + convertidor.convertidor(100, "DOLLAR", convertidor.getTipoEuro()));


    }

}

