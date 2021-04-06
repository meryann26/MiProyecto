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
public class ParcialResuelto {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String nombre = "";
        String primerApellido = "";
        String segundoApellido = "";
        int edad = 0;
        char genero = 'F'; // 'F' Femenino, 'M' Masculino
        boolean tuvoCovid = false;
        boolean antecedentes = false; //nivel de salud: número del 1 al 10
        int nivelSaludActual = 0;
        int cantAsteriscos = 7;

        //contadores
        int citasAsignadas = 0;
        int casosCovid = 0;

        while (true) {
            System.out.println("MENÚ: \n1) Ingresar datos del paciente.\n2) Imprimir información completa del paciente."
                    + "\n3) Generar dos citas de vacunación.\n4) Ingresar otro paciente. \n5) Signo de la inyección COVID19."
                    + "\nPor favor digite una opción:");

            int opcionMenu = scn.nextInt();

            switch (opcionMenu) {

                case 1: {
                    System.out.println("Digite el nombre del paciente:");
                    nombre = scn.next();
                    System.out.println("Digite primer apellido del paciente:");
                    primerApellido = scn.next();
                    System.out.println("Digite segundo apellido del paciente:");
                    segundoApellido = scn.next();
                    System.out.println("Digite la edad del paciente:");
                    edad = scn.nextInt();
                    System.out.println("Indique género del paciente: (F=Femenino, M=Masculino)");
                    genero = scn.next().charAt(0);
                    System.out.println("¿El paciente tuvo COVID19?: (true= verdadero, false=falso)");
                    tuvoCovid = scn.nextBoolean();
                    if (tuvoCovid) {
                        casosCovid++;
                    }
                    System.out.println("¿El paciente tiene antecedentes?: (true= verdadero, false=falso)");
                    antecedentes = scn.nextBoolean();
                    System.out.println("Indique el estado de salud actual del paciente: (# del 1 al 10)");
                    nivelSaludActual = scn.nextInt();
                    System.out.println(" ");
                    break;
                }

                case 2: {
                    System.out.println("\nInformación completa del paciente:");
                    System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
                    System.out.println("Edad: " + edad + " años");
                    System.out.println("Género: " + genero);
                    System.out.println("¿El paciente tuvo COVID19?: " + tuvoCovid);
                    System.out.println("¿El paciente tiene antecedentes?: " + antecedentes);
                    System.out.println("Nivel de salud actual del paciente: " + nivelSaludActual + "\n");
                    alertas(edad, tuvoCovid, antecedentes);
                    System.out.println(" ");
                    break;
                }

                case 3: {
                    System.out.println("\nCitas de vacunación contra COVID19:");
                    generarCitas(edad, nivelSaludActual, citasAsignadas, tuvoCovid);
                    System.out.println(" ");
                    citasAsignadas++;
                    break;
                }

                case 4: {
                    nombre = "";
                    primerApellido = "";
                    segundoApellido = "";
                    edad = 0;
                    genero = 'F';
                    antecedentes = false;
                    tuvoCovid = false;
                    nivelSaludActual = 0;
                    System.out.println(" ");
                    break;
                }

                case 5: {
                    for (int i = 0; i < cantAsteriscos; i++) {
                        System.out.print("*\t");
                    }
                    System.out.println();

                    for (int i = 0; i < cantAsteriscos; i++) {
                        System.out.print("*\t");
                    }
                    System.out.println();

                    for (int i = 0; i < cantAsteriscos; i++) {
                        for (int j = 0; j < cantAsteriscos; j++) {
                            if (i == j) {
                                System.out.print("*\t");
                            } else {
                                System.out.print(" \t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
            }
        }
    }

    public static void alertas(int edad, boolean tuvoCovid, boolean antecedentes) {
        if (edad > 60 || tuvoCovid || antecedentes) {
            System.out.println("¡ALERTA!\n");
        }
    }

    /**
     * Metodo no se utiliza en el sistema, pero se implementa por requerimiento
     * sobrecarga
     *
     * @param edad
     * @param nivelSaludActual
     * @param citasAsignadas
     */
    public static void generarCitas(int edad, int nivelSaludActual, int citasAsignadas) {

        if (edad < 50) {
            int dia = nivelSaludActual + citasAsignadas;
            System.out.println("Su primera cita es el " + dia + " de agosto de 2021");
            System.out.println("Su segunda cita es el " + (dia + 10) + " de agosto de 2021");
        } else if (edad >= 50 && edad < 70) {
            int dia = nivelSaludActual + citasAsignadas;
            System.out.println("Su primera cita es el " + dia + " de julio de 2021");
            System.out.println("Su segunda cita es el " + (dia + 10) + " de julio de 2021");
        } else if (edad >= 70 && edad < 90) {
            int dia = nivelSaludActual + citasAsignadas;
            System.out.println("Su primera cita es el " + dia + " de junio de 2021");
            System.out.println("Su segunda cita es el " + (dia + 10) + " de junio de 2021");
        } else if (edad >= 90) {
            int dia = nivelSaludActual + citasAsignadas;
            System.out.println("Su primera cita es el " + dia + " de mayo de 2021");
            System.out.println("Su segunda cita es el " + (dia + 10) + " de mayo de 2021");
        }
    }

    /**
     * Método para generar las citas de vacunación
     *
     * @param edad
     * @param nivelSaludActual
     * @param citasAsignadas
     * @param tuvoCovid
     */
    public static void generarCitas(int edad, int nivelSaludActual, int citasAsignadas, boolean tuvoCovid) {
        int dia = nivelSaludActual + citasAsignadas;
        if (tuvoCovid == false && edad < 50) {
            System.out.println("Su primera cita es el  " + dia + " de agosto de 2021");
            System.out.println("Su segunda cita es el " + (dia + 10) + " de agosto de 2021");
        } else if (tuvoCovid == false && edad >= 50 && edad < 70) {
            System.out.println("Su primera cita es el " + dia + " de julio de 2021");
            System.out.println("Su segunda cita es el " + (dia + 10) + " de julio de 2021");
        } else if (tuvoCovid == false && edad >= 70 && edad < 90) {
            System.out.println("Su primera cita es el " + dia + " de junio de 2021");
            System.out.println("Su segunda cita es el " + (dia + 10) + " de junio de 2021");
        } else if (tuvoCovid == false && edad >= 90) {
            System.out.println("Su primera cita es el " + dia + " de mayo de 2021");
            System.out.println("Su segunda cita es el " + (dia + 10) + " de mayo de 2021");
        } else {
            if (tuvoCovid == true && edad < 50) {
                int diaCita = nivelSaludActual + 1;
                System.out.println("Su primera cita es el  " + diaCita + " de agosto de 2021");
                System.out.println("Su segunda cita es el " + (diaCita + 10) + " de agosto de 2021");
            } else if (tuvoCovid == true && edad >= 50 && edad < 70) {
                int diaCita = nivelSaludActual + 1;
                System.out.println("Su primera cita es el " + diaCita + " de julio de 2021");
                System.out.println("Su segunda cita es el " + (diaCita + 10) + " de julio de 2021");
            } else if (tuvoCovid == true && edad >= 70 && edad < 90) {
                int diaCita = nivelSaludActual + 1;
                System.out.println("Su primera cita es el " + diaCita + " de junio de 2021");
                System.out.println("Su segunda cita es el " + (diaCita + 10) + " de junio de 2021");
            } else if (tuvoCovid == true && edad >= 90) {
                int diaCita = nivelSaludActual + 1;
                System.out.println("Su primera cita es el " + diaCita + " de mayo de 2021");
                System.out.println("Su segunda cita es el " + (diaCita + 10) + " de mayo de 2021");
            }
        }
    }
}
