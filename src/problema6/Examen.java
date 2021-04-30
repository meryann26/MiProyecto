/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Date;

/**
 *
 * @author Meryan
 */
public class Examen {

    private Alumno alumno;

    private String asignatura;
    private double puntajeTotal;
    private double puntosObtenidos;
    private double calificacion;
    private Date fecha;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(double puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public double getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(double puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
