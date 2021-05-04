/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinal;

import java.util.Arrays;

/**
 *
 * @author Meryan
 */
public class EquipoSonido {

    String[] listaReproduccion = new String[1000];

    Parlante parlantederecho = new Parlante(true, 0, "parlantederecho");
    Parlante parlanteizquierdo = new Parlante(true, 0, "parlanteizquierdo");
    ParlanteSubwoofer bajos = new ParlanteSubwoofer();
    
    private void imprimirListaReproduccion(){
        for(String elem : listaReproduccion){
            System.out.print(elem);
        }
    }
    
    public void  listaEnOrden(){
        Arrays.sort(listaReproduccion);
        
        
        
        imprimirArreglo();
    }
    
    public listaAleatoria(){
    }
    
    public listaCompleta(){
        
    }
    
    public agregarAudio(String nuevoAudio){
        
    }
    
    public eliminarAudio(String)

}
