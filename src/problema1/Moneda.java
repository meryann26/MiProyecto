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
public class Moneda {
    
    private String nombre;
    private double cambioColonDolar= 500;
    private double cambioColonEuro= 765;
    private double cambioDolarEuro= 1.53;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCambioColonDolar() {
        return cambioColonDolar;
    }

    public void setCambioColonDolar(double cambioColonDolar) {
        this.cambioColonDolar = cambioColonDolar;
    }

    public double getCambioColonEuro() {
        return cambioColonEuro;
    }

    public void setCambioColonEuro(double cambioColonEuro) {
        this.cambioColonEuro = cambioColonEuro;
    }

    public double getCambioDolarEuro() {
        return cambioDolarEuro;
    }

    public void setCambioDolarEuro(double cambioDolarEuro) {
        this.cambioDolarEuro = cambioDolarEuro;
    }

    public Moneda(String nombre) {
        this.nombre = nombre;
    }


    
   
}
    
    

  
   
    

   
 
 


    
    
    
    


