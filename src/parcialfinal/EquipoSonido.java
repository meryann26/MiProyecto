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
    int maxRegistros;
    String[] listaReproduccion;
    int cont;

    Parlante parlantederecho = new Parlante(true, 0, "parlantederecho");
    Parlante parlanteizquierdo = new Parlante(true, 0, "parlanteizquierdo");
    ParlanteSubwoofer bajos = new ParlanteSubwoofer();
    
    public EquipoSonido() {
        maxRegistros = 1000;
        listaReproduccion = new String[maxRegistros];
        cont = 0;
    }
    
    private void imprimirListaReproduccion(){
        for(String elem : listaReproduccion){
            System.out.print(elem);
        }
    }
    
    public void  listaEnOrden(){
        Arrays.sort(listaReproduccion);
        imprimirListaReproduccion();
    }
    
    public void listaAleatoria(){
        
    }
    
    public void listaCompleta(){
        for (int i = 0; i < cont; i++) {
            System.out.print(listaReproduccion[i] + ", ");
        }

    }
        
    
    
    public boolean agregarAudio(String nuevoAudio){
        boolean resultado = false;
        if (cont < maxRegistros) {
            listaReproduccion[cont] = nuevoAudio;
            cont++;
            resultado = true;
        }
        return resultado;
        
    }
    
    public boolean eliminarAudio(){
        boolean resultado = false;
        if (cont != 0) {
            cont--;
            listaReproduccion[cont - 1] = null;
            resultado = true;
        }
        return resultado;
    }

}
