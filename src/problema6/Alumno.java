/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

/**
 *
 * @author Meryan
 */
public class Alumno {

    PadreFamilia padre;
    String nombre;
    String apellido;
    int carne;

    public Alumno() {
    }

    public Alumno(PadreFamilia padre, String nombre, String apellido, int carne) {
        this.padre = padre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }

    public Alumno(String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }

    public void mostrardatos() {
        System.out.println(nombre + " " + apellido + " " + carne);
    }

    public void imprimirPadreFamilia() {
        System.out.println(padre.getNombre() + " " + padre.getApellidos());
        System.out.println(padre);
    }

    public PadreFamilia getPadre() {
        return padre;
    }

    public void setPadre(PadreFamilia padre) {
        this.padre = padre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

}
