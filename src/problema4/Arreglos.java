/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class Arreglos {

    public void imprimirArreglo(int[] numeros) {
        for (int x : numeros) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public int busquedaBinaria(int arreglo[], int elemento) {

        int centro;
        int primero = 0;
        int ultimo = arreglo.length - 1;
        int valorVector;

        Arrays.sort(arreglo);

        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorVector = arreglo[centro];

            if (elemento == valorVector) {
                return centro;
            } else if (elemento < valorVector) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }
        }
        return -1;

    }

    public void crearArreglo(Scanner scan) {
        int i, n;

        System.out.println("Introduce el número de elementos de la lista: ");
        n = scan.nextInt();
        int numeros[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("Introduce el número " + (i + 1) + " ; ");
            numeros[i] = scan.nextInt();
        }
        System.out.println("Imprimir los elementos del arreglo: ");
        //llamar busqueda
        imprimirArreglo(numeros);

        while (true) {
            System.out.println("Introduce el número a buscar: ");
            n = scan.nextInt();

            int indice = busquedaBinaria(numeros, n);
            if (indice != -1) {
                System.out.println("¡Sí se encontró el número!");
                System.out.println("");
            } else {
                System.out.println("¡No se encontró el número!");
                System.out.println("");
            }
        }
    }
}
