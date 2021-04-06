/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class Vacunacion {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String nombre;

        String apellidos;

        int edad;

        String genero;

        boolean covid;

        int antecedentes;

        System.out.println("Digite el nombre del paciente:");

        nombre = scn.next();

        System.out.println("Digite los apellidos del paciente:");

        apellidos = scn.next();

        System.out.println("Digite la edad del paciente:");

        edad = scn.nextInt();

        System.out.println("Digite el genero del paciente:");

        genero = scn.next();

        System.out.println("¿El paciente tuvo Covid19?");

        covid = scn.nextBoolean();

        System.out.println("Digite estado de salud actual del 1 al 10:");

        antecedentes = scn.nextInt();

        System.out.println("Digite 1 para ver la informacion completa del"
                + " paciente \nDigite 2 para generar dos citas de vacunacion");

        int menu = scn.nextInt();

        switch(menu){

            case 1: {

                System.out.println("Nombre:" + nombre);

                System.out.println("Apellidos:" + apellidos);

                System.out.println("Edad:" + edad);

                System.out.println("Genero:" + genero);

                System.out.println("¿El paciente tuvo covid?:" + covid);

                alertas(edad, covid, antecedentes);

                break;

            }

            case 2: {

                System.out.println("Su primera cita de vacunacion es:");
                primeraCita(edad, antecedentes);

                System.out.println("Su segunda cita de vacunacion es:");

            }

        }

    }

    public static void alertas(int edad, boolean covid, int antecedentes) {

        if (edad > 60) {

            System.out.println("El paciente tiene mas de 60 años");

        }
        if (covid == true) {

            System.out.println("El paciente tuvo covid");

        }
        if (antecedentes < 5) {

            System.out.println("El paciente tiene antecedentes");

        }

    }

    public static void primeraCita(int edad, int antecedentes) {
        int cita = 10;
        int dia = antecedentes + cita;

        if (edad > 90) {

            System.out.println("Su cita es el  " + dia + " de mayo de 2021");

        }
        if (edad < 90 && edad > 70) {

            System.out.println("Su cita es el  " + dia + " de junio de 2021");

        }
        if (edad < 70 && edad > 50) {

            System.out.println("Su cita es el  " + dia + " de julio de 2021");

        }
        if (edad < 50) {

            System.out.println("Su cita es el  " + dia + " de agosto de 2021");

        }

    }
}
