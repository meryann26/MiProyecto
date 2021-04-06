/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenaclase;

/**
 *
 * @author Meryan
 */
public class TiposComplejos {
    public void main(String[] args){
        boolean siTodaNocheProgramando = true;
        Boolean siTodoFinProgramando = true;
        
        short codigoBarra = 10022;
        Short codBarra = 22234;
        
        int numEjercicioImplementarHoy = 100;
        Integer numEjercicioFinSemana = 1000;
        
        float miSalarioProgramador = 5000.20f;
        Float miSalarioAnual = 10000000.5f;
        
        double ii = 0.1222;
        Double jj = 33.4;
        
        byte edad = 10;
        Byte edadPadre = 50;
        
        // El objeto Short se converte a primitivo short
        // Asigna un valor primitivo a una variable primitiva
        short variableCualquiera = numEjercicioFinSemana.shortValue();
        
        // El objeto Boolean se converte a primitivo boolean
        // Asigna un valor primitivo a una variable primitiva
        boolean otraVarBooleana = siTodoFinProgramando.booleanValue(); 

        //Estamos asignando un objeto a una variable primitiva
        short otraVarMas2 = codBarra; //unboxing
        
        //Asigna una variable primitiva a un objeto
        Short otraPrueba = codigoBarra; //autoboxing
        
        //En este caso shortValue() no es necesario ya que se podria hacer un unboxing
        short otraVarMas1 = codBarra.shortValue();;
    }
    
    
}
