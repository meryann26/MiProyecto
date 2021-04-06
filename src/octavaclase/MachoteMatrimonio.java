/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavaclase;

import java.util.Date;

/**
 *
 * @author Meryan
 */
public class MachoteMatrimonio {

    public String nombre1;
    public String nombre2;
    private int version = 202103;
    private String lugar;
    private String cedula1;
    private String cedula2;

    /**
     * Imprime el acta
     */
    public void imprimirTexto() {
        String texto = "El día de hoy se unen las personas " + nombre1 + " " + nombre2 + " " + version;
        System.out.println(texto);
        imprimirHoraActa();
    }

    /**
     * Imprime el acta con logo el cual es **
     */
    public void imprimirTextoConLogo() {
        String texto = " ** El día de hoy se unen las personas " + nombre1 + " " + nombre2 + " " + version;
        System.out.println(texto);
        imprimirHoraActa();
    }

    public void establecerVersion(int nuevoValor) {
        if (nuevoValor > version) {
            version = nuevoValor;
        } else {
            System.out.println("Error en el nuevo valor");
        }
    }

    private void imprimirHoraActa() {
        Date fecha = new Date();
        System.out.println("Fecha del acta: " + fecha);
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setCedula1(String cedula1) {
        if (cedula1.length() != 11) {
            System.out.println("Revise la cédula.");
        } else {
            this.cedula1 = cedula1;
        }
    }

    public void setCedula2(String cedula2) {
        if (cedula2.length() != 11) {
            System.out.println("Revise la cédula.");
        } else {
            this.cedula2 = cedula2;
        }
    }

    public String getCedula1() {
        return cedula1;
    }

    public String getCedula2() {
        return cedula2;
    }

}
