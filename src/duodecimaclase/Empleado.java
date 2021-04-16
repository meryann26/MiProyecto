/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duodecimaclase;

import java.util.Date;

/**
 *
 * @author Meryan
 */
public class Empleado extends Persona {
    private String numEmpleado;
    private Date fechaInicio;
    private Date fechaTermino;
    
    public Empleado(String nombre, String apellidos, String numEmpleado, Date fechaInicio, Date fechaTermino) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numEmpleado = numEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public Empleado(String numEmpleado, Date fechaInicio, Date fechaTermino) {
        this.numEmpleado = numEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }
    
    
           
}
