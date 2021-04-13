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
    
        Moneda mon = new Moneda("dolar");
    
        Moneda mon2 = new Moneda ("colon");
        
        Moneda mon3 = new Moneda ("euro");
        
        
        double result1 = conv.convertirColonADolar(1, mon2, mon);
                
                System.out.println("Un colon equivale a " + result1 + " dolares");
                
        
        double result2 = conv.convertirDolarAColon(1, mon2, mon);
                
                System.out.println("Un dolar equivale a " + result2 + " colones");
                
                
        double result3 = conv.convertirColonAEuro(1, mon2, mon);
                
                System.out.println("Un colon equivale a " + result3 + " euros");
                
        double result4 = conv.convertirEuroAColon(1, mon2, mon);
                
                System.out.println("Un euro equivale a " + result4 + " colones");
                
                
        double result5 = conv.convertirDolarAEuro(1, mon2, mon);
                
                System.out.println("Un dolar equivale a " + result5 + " euros");
                
        double result6 = conv.convertirEuroADolar(1, mon2, mon);
                
                System.out.println("Un euro equivale a " + result6 + " dolares");
    }
            
            
    
    
    
}

