/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import problema1.Moneda;

/**
 *
 * @author Meryan
 */
public class Tester {

    public static void main(String args[]) {

        CambiadoraMonedas conv = new CambiadoraMonedas();

        Moneda mon1 = new Moneda("dolar");
        mon1.setNombre("euro");
        Moneda mon2 = new Moneda("euro");
        mon2.setNombre("dolar");
        Moneda mon3 = new Moneda("colon");

        conv.setCambioEuroDolar(2);

        double resultado = conv.convertir(1, mon1, mon2);

        System.out.println("Un euro equivale a " + resultado + " dolares");
    }
}
