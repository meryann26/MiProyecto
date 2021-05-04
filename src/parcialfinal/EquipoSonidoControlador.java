/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinal;

import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class EquipoSonidoControlador {
    EquipoSonido equipo = new EquipoSonido();
    EquipoSonidoVista vista = new EquipoSonidoVista(equipo);
    
    public void iniciar(){
        while(true){
            int opcion = vista.mostrarMenu();
            
            switch(opcion){
                case 1:{
                    equipo.listaEnOrden();
                    
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    Scanner s = new Scanner(System.in);
                    String nuevoAudio = s.next();
                    equipo.agregarAudio(nuevoAudio);
                    break;
                }
                case 5:{
                    equipo.eliminarAudio();
                    break;
                }
            }
        }
    }
}
