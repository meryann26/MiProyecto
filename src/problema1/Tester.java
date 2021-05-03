/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Meryan
 */
public class Tester {

    public static void main(String args[]) {

        MaquinaConvertidora conv = new MaquinaConvertidora();

        Moneda mon1 = new Moneda("dolar");
        Moneda mon2 = new Moneda("colon");
        Moneda mon3 = new Moneda("euro");

        double resultado = conv.convertir(1, mon2, mon3);
        double resultado1 = conv.convertir(1, mon3, mon1);
        double resultado2 = conv.convertir(100, mon1, mon2);

        System.out.println("Un colon equivale a " + resultado + " euros");
        System.out.println("Un euro equivale a " + resultado1 + " dolares");
        System.out.println("Cien dolares equivale a " + resultado2 + " colones");
        
    }
}
