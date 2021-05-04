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
public class Parlante {

    private boolean habilitado;
    private int volumen;
    private String direccionSonido;

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getDireccionSonido() {
        return direccionSonido;
    }

    public void setDireccionSonido(String direccionSonido) {
        this.direccionSonido = direccionSonido;
    }

 
    public Parlante(boolean habilitado, int volumen, String direccionSonido) {
        this.habilitado = habilitado;
        this.volumen = volumen;
        this.direccionSonido = direccionSonido;
    }

    public void sonar(String audioMusica) {
        System.out.println(audioMusica);
    }

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
