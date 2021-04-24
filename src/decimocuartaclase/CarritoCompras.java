/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimocuartaclase;

import java.util.Date;


/**
 *
 * @author Meryan
 */
public class CarritoCompras {
    private Date created;
    private LineaItem[] lineas;
    lineas = new LineaItem[100];
    contadorLineas=0;
    public Date getCreated() {
        return created;
    }
    public void agregarLinea(){
    
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    
    /**
     * inicializa la fecha de creacion del carrito e inicializa el arreglo de lineas hasta 100 lineas
     *
     */
    public CarritoCompras(){
       
        created = new Date();
        lineas = new LineaItem[100];
    }

    void agregarLinea(LineaItem lineaItem2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
