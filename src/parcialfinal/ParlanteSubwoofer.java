/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinal;

/**
 *
 * @author Meryan
 */
public class ParlanteSubwoofer {
    private boolean habilitado;
    private int volumen;
    
    public void subirVolumen() {
        volumen++;
    }

    public void bajarVolumen() {
        volumen--;
    }

    public void habilitar() {
        habilitado = true;
    }

    public void deshabilitar() {
        habilitado = false;
    }
    
    
    
    
}
