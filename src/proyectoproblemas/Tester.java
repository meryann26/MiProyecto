/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoproblemas;

/**
 *
 * @author Meryan
 */
public class Tester {
    
    
    
    public static void main(String args[]) {
        
        MaquinaConvertidora1 conv = new MaquinaConvertidora1();
    
        Moneda1 mon = new Moneda1("dolar", 500);
    
        Moneda1 mon2 = new Moneda1 ("colon", 1);
        
        
        double resultado = conv.convertirMoneda(586, mon2, mon);
                
                System.out.println("En dolares serian " + resultado);
    }
            
            
    
    
    
}
