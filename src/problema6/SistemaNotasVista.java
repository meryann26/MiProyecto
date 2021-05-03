/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class SistemaNotasVista {
    SistemaNotas sn;
    
    public int mostrarMenu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Menú\n1 Agregar examen\n 2 Eliminar examen"
                + "\n3 Reporte todos exámenes\n4 Reporte todos alumnos"
                + "\n4 Reporte alumnos con nota inferior A\n5 Reporte exámenes ordenados por");
        
        int opcionSeleccionada = s.nextInt();
        
        return opcionSeleccionada;
    }
    
    public SistemaNotasVista (SistemaNotas sn){
        this.sn = sn;
    }
    
    public void mostrarMensajeInfo(String msj){
        System.out.println(msj);
    }
    
    
    
}
