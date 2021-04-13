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

    public double convertirColonADolar(double cantidad, Moneda monedaEntrada, Moneda monedaSalida) {

        return cantidad / monedaSalida.getCambioColonDolar();

    }
    
    public double convertirDolarAColon(double cantidad, Moneda monedaEntrada, Moneda monedaSalida) {

        return cantidad * monedaSalida.getCambioColonDolar();

    }
    
    public double convertirColonAEuro(double cantidad, Moneda monedaEntrada, Moneda monedaSalida) {

        return cantidad / monedaSalida.getCambioColonEuro();

    }
    
    public double convertirEuroAColon(double cantidad, Moneda monedaEntrada, Moneda monedaSalida) {

        return cantidad * monedaSalida.getCambioColonEuro();

    }
    
    public double convertirDolarAEuro(double cantidad, Moneda monedaEntrada, Moneda monedaSalida) {

        return cantidad / monedaSalida.getCambioDolarEuro();

    }
    
    public double convertirEuroADolar(double cantidad, Moneda monedaEntrada, Moneda monedaSalida) {

        return cantidad * monedaSalida.getCambioDolarEuro();

    }
    
    
    

}
