/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undecimaclase;

/**
 *
 * @author Meryan
 */
public class EjemploArreglos {
    public static void main(String[] args){
    
        //int[] enteros;
        //int[] enteros = {1,3,63,46,88};
        long varNumSuperGrande = 9223372;
        
        int[] enteros = new int[5];
        
        enteros[3] = 233;
        enteros[4] = 555;
        enteros[1] = 7;
        // enteros[15] = 7; ArrayIndexOutOfBoundsException
        
        System.out.println(enteros.length);
        System.out.println(enteros[3]);
        
        int[] arregloGrande = new int[100];
        
        for(int i=0;i<100;i++){
            arregloGrande[i]=1;
        }
        
        for(int i=0;i<100;i++){
            System.out.println(arregloGrande[i]);
        }
        
        
    }
}
