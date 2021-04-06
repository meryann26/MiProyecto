/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenaclase;

/**
 *
 * @author Meryan
 */
public class Repaso {
    
    /**
     * Método que suma pero no admite ceros
     * Si recibe ceros se retorna un -1 para indicar que es un error
     * @param num1
     * @param num2
     * @return
     */
    public int sumarComoNoDebeSer(int num1, int num2){
       
        if(num1==0)
            return -1;
        
        if(num2==0)
            return -1;
        
        int resultado = 0;
        if(num1>100){
            resultado = num1 + num2;
        }
        
        return resultado;
    }
    
    /**
     * No ingresar ceros
     * @param num1
     * @param num2
     * @return
     */
    public int sumarComoSiDebeSerFormaSinExcepciones(int num1, int num2){
        int resultado = 0;
        
        if(num1!=0 && num2!=0){
            if(num1>100){
                resultado = num1 + num2;
            }
        }
        else{
            resultado = -1;
        }
        
        return resultado;
    }
    
    /**
     * A este método no se deben pasar ceros
     * @param num1
     * @param num2
     * @return
     */
    public int sumarComoSiDebeSerFormaConExcepciones(int num1, int num2){
        int resultado = 0;
        
        if(num1==0 || num2==0)
            throw new IllegalArgumentException(
                    "El numero 1 y numero 2 no deben ser ceros");
        
        if(num1>100){
            resultado = num1 + num2;
        }
        
        return resultado;
    }
    
}
