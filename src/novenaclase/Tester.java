/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenaclase;

import java.lang.reflect.Method;

/**
 *
 * @author Meryan
 */
public class Tester {
    public static void main(String[] args){
        Repaso t = new Repaso();
        
        t.sumarComoSiDebeSerFormaConExcepciones(4, 5);
        
        Method[] arreglo = t.getClass().getMethods();
        for(Method m : arreglo){
            System.out.println(m.getName());
        }
        
        System.out.println("Info del toString() es:");
        System.out.println(t.toString());
        
    }
}
