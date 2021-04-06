/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavaclase;

/**
 *
 * @author Meryan
 */
public class EjemplosCasting {

    public static void main(String[] args) {

        //EJEMPLO 1
        /*
        byte edad = 127;
        int sumatoria = 1000;
        
        //sumatoria = edad;
        edad = (byte)sumatoria;
        System.out.println(edad);
         */
        //EJEMPLO 2
        int edad = 70;
        int anno = 2021;
        int nivelSalud = 5;

        sumarEdad((byte) edad, (short) anno, (byte) nivelSalud);

        //EJEMPLO 3
        int numConsecutivo = 1000;
        long numMax = numConsecutivo;
        numConsecutivo = (int) numMax;

        float precioArt1 = 33000f;
        float precioArt2 = 33000f;
        double pagoTotal = precioArt1 + precioArt2;
        precioArt1 = (float) pagoTotal;

        //EJEMPLO 4
        double total = 580.578;
        int num = (int) total;
        System.out.println("Número sin decimales es: " + num);

    }

    public static void sumarEdad(byte edadPersona, short annoNac, byte nivel) {

        if (nivel < 10) {
            System.out.println(annoNac + edadPersona);
        }
    }
}
