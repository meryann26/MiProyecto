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
public class MaquinaConvertidora {
    
    private double cambioDolarColon= 500;
    private double cambioEuroColon= 765;
    private double cambioEuroDolar= 1.53;

    public double getCambioDolarColon() {
        return cambioDolarColon;
    }

    public void setCambioDolarColon(double cambioDolarColon) {
        this.cambioDolarColon = cambioDolarColon;
    }

    public double getCambioEuroColon() {
        return cambioEuroColon;
    }

    public void setCambioEuroColon(double cambioEuroColon) {
        this.cambioEuroColon = cambioEuroColon;
    }

    public double getCambioEuroDolar() {
        return cambioEuroDolar;
    }

    public void setCambioEuroDolar(double cambioEuroDolar) {
        this.cambioEuroDolar = cambioEuroDolar;
    }
    
    public double convertir(double cantidad, Moneda monedaEntrada, Moneda monedaSalida) {
        
        if(monedaEntrada.getNombre().equals("colon")& monedaSalida.getNombre().equals("dolar"))
            return cantidad / cambioDolarColon;
        
        if(monedaEntrada.getNombre().equals("dolar")& monedaSalida.getNombre().equals("colon"))
            return cantidad * cambioDolarColon;
        
        if(monedaEntrada.getNombre().equals("colon")& monedaSalida.getNombre().equals("euro"))
            return cantidad / cambioEuroColon;
        
        if(monedaEntrada.getNombre().equals("euro")& monedaSalida.getNombre().equals("colon"))
            return cantidad * cambioEuroColon;
        
        if(monedaEntrada.getNombre().equals("dolar")& monedaSalida.getNombre().equals("euro"))
            return cantidad / cambioEuroDolar;
        
        if(monedaEntrada.getNombre().equals("euro")& monedaSalida.getNombre().equals("dolar"))
            return cantidad * cambioEuroDolar;
      
        else{
            return cantidad;
        }
    }
}
