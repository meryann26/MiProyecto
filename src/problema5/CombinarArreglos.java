/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

/**
 *
 * @author Meryan
 */
public class CombinarArreglos {

    public int[] llenarVector(int arreglo1[], int arreglo2[]) {

        int tamVector1 = arreglo1.length;
        int tamVector2 = arreglo2.length;
        int tamVF = tamVector1 + tamVector2;

        int[] arregloFinal = new int[tamVF];

        // Mezclar arreglo1 y arreglo2 en el arregloFinal
        // Utilizaré el iterador i para arreglo1 y arreglo2
        // y el iterador j para el arregloFinal
        int j = 0;

        for (int i = 0; i < tamVector1; i++) {
            arregloFinal[j] = arreglo1[i];
            j++;
            arregloFinal[j] = arreglo2[i];
            j++;

        }

        System.out.println("El arreglo final es: ");
        for (int i = 0; i < tamVF; i++) {
            System.out.print(arregloFinal[i] + " ");
        }
        System.out.println(" ");

        return arregloFinal;
    }

}
