/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Meryan
 */
public class Moneda1 {
    
    private String nombre;
    private double tipoCambioColon;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTipoCambioColon() {
        return tipoCambioColon;
    }

    public void setTipoCambioColon(double tipoCambioColon) {
        this.tipoCambioColon = tipoCambioColon;
    }
    
 
    public Moneda1(String nombre) {
        this.nombre = nombre;
    }

    public Moneda1(String nombre, double tipoCambioColon) {
        this.nombre = nombre;
        this.tipoCambioColon = tipoCambioColon;
    }

    
    
    
    
}
