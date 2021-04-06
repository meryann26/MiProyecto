/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quintaclase;

/**
 *
 * @author Meryan
 */
public class MiProgramaCiclos {

    public static void main(String[] args) {
        imprimirCompugrama2(10);
    }

    public static void imprimirCompugrama1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-	");
        }

        System.out.println(">");
    }
    
    public static void imprimirCompugrama2(int n) {
        for(int j = 0; j < 3; j++){
        
            for (int i = 0; i < n; i++) {
                System.out.print("-	");
            }

            System.out.println(">");
        }
    }    

    public static void cicloDentroCiclo() {

        //primera forma
        boolean par = true;
        for (int num = 0; num <= 100; num++) {

            if (par) {

                System.out.println("El numero " + num);
                par = false;

                for (int n = 0; n <= 10; n++) {
                    System.out.print(n + "-");
                }

            } else {
                par = true;
            }

        }

    }
}