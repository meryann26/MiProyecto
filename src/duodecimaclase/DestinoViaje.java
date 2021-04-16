/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duodecimaclase;

import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class DestinoViaje  {
    String pais;
    double precio;
    float distancia;
    int numHorasDuracion;
    String aerolinea;
 
    public void solicitarDatosDestino(){
        Scanner s = new Scanner(System.in);
        System.out.println("Favor digite el nombre del pais: ");
        this.pais = s.next();
        System.out.println("Favor digite el precio: ");
        this.precio = s.nextDouble();
        System.out.println("Favor digite la distancia: ");
        this.distancia = s.nextFloat();
        System.out.println("Favor digite la numero de horas duracion: ");
        this.numHorasDuracion = s.nextInt();
        System.out.println("Favor digite la aerolinea: ");
        this.aerolinea = s.next();
        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getNumHorasDuracion() {
        return numHorasDuracion;
    }

    public void setNumHorasDuracion(int numHorasDuracion) {
        this.numHorasDuracion = numHorasDuracion;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    @Override
    public String toString() {
        return "DestinoViaje{" + "pais=" + pais + ", precio=" + precio + ", distancia=" + distancia + ", numHorasDuracion=" + numHorasDuracion + ", aerolinea=" + aerolinea + '}';
    }
  
}
