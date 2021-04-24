/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimotercerclase;

/**
 *
 * @author Meryan
 */
public class Controlador {
    Modelo modelo;
    Vista vista;
    
    public Controlador(){}
    
    public void iniciar(){
        modelo = new Modelo();
        vista = new Vista(modelo);
        int resultado=0;
        
        while(true){
        
            int opcion = vista.mostrarMenu();
            
            switch(opcion){
                case 1:{
                    vista.soliciteDosNumeros();
                    break;
                }
                
                case 2:{
                    resultado = modelo.sumar();
                    break;
                }
                
                case 3:{
                    resultado = modelo.resta();
                    break;
                }
                
                case 4:{
                    vista.mostrarResultado(resultado);
                    break;
                }
            
            }
            
        }
    }
    
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }
    
    
}
