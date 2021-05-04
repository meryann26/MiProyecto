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
public class EquipoSonidoVista {
     private EquipoSonido equipo;

    public EquipoSonidoVista(EquipoSonido equipo) {
        this.equipo = equipo;
    }
     
     
    
    
    
    public int mostrarMenu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Menú\n1 Reproducir la lista en orden \n2 Reproducir lista en fomma aleatoria"
                + "\n3 Mostrar lista completa \n4 Agregar nuevo audio \n5 Eliminar audio");
        
        int opcionSeleccionada = s.nextInt();
        
        return opcionSeleccionada;
    }
    
}
