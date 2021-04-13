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
public class ProblemaUno {
    
    private static String TIPO_DOLAR = "dolar"; //constante
    private static String TIPO_EURO = "euro"; //constante

    private static double PORCENTAJE = 1.53; //



    public double convertidor(double unidad, String entrada, String salida) {

        double resultado = 0;

        if (entrada.equals(salida)) {
            //caso: que entrada y salida sean iguales
            resultado = unidad;
        } else {
            if (entrada.equals(TIPO_EURO)) {
                //caso: va a convertir de euro a dolar
                resultado = unidad * PORCENTAJE;
            }

            if (entrada.equals(TIPO_DOLAR)) {
                //caso: va a convertir de dolar a euro
                resultado = unidad / PORCENTAJE;
            }
        }

        return resultado;
    }

    public static void main(String args[]) {

        ProblemaUno convertidor = new ProblemaUno();

        System.out.println("Cien dolares a euros son: " + convertidor.convertidor(1, TIPO_DOLAR, TIPO_EURO));
        System.out.println("Cien euros a dolares son: " + convertidor.convertidor(100, TIPO_EURO, TIPO_DOLAR));
        System.out.println("Cien euros a euros son: " + convertidor.convertidor(100, TIPO_EURO, TIPO_EURO));


        

    }

}
