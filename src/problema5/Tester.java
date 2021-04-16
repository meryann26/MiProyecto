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
import java.util.*;

public class Tester {

    public static void main(String[] args) {

        CombinarArreglos arregloFinal = new CombinarArreglos();

        int[] arreglo1 = new int[]{1, 2, 3};
        int[] arreglo2 = new int[]{6, 4, 5};

        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        arregloFinal.llenarVector(arreglo1, arreglo2);

    }
}
