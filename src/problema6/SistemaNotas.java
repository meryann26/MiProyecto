/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

/**
 *
 * @author Meryan
 */
public class SistemaNotas {
    int maxRegistros;
    Examen[] examenes;
    int cont;
    
    public SistemaNotas(){
        maxRegistros=100;
        examenes = new Examen [maxRegistros];
        cont=0;
    }

    public SistemaNotas(int maxRegistros) {
        examenes = new Examen[maxRegistros];
        cont=0;
    }
    
    
    
    public boolean eliminiarEx(){
        boolean resultado=false;
        if(cont!=0){
            examenes[cont-1]=null;
            cont--;
            resultado=true;
        }
        return resultado;
    }
    
    public boolean agregarEx(Examen ex) {

        boolean resultado = false;
        if (cont < maxRegistros) {
            examenes[cont] = ex;
            cont++;
            resultado = true;
        }
        return resultado;
    }
    
    
    public void mostrarExamenes(){
        for (int i=0; i<cont;i++){
            if(examenes[i]!=null)
                System.out.println(examenes[i].toString());
        }
    }
    
    public float promedioNotas(){
        float retorno=0f;
        
        return retorno;
    }
    
   
    
}
