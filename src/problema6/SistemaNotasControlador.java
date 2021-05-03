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
public class SistemaNotasControlador {
    SistemaNotas sn = new SistemaNotas();
    SistemaNotasVista vista = new SistemaNotasVista(sn);
   
    public void iniciar(){
        while(true){
            int opcion = vista.mostrarMenu();
            
            switch(opcion){
                case 1:{
                    Examen ex = new Examen();
                    vista.solicitarDatosExamen(ex);
                    sn.agregarEx(ex);
                
                    break;
                }
                case 2:{
                    break;
                }
                case 3 :{
                    break;
                
                }
                case 4 :{
                    break;
                
                }
        }
    }
}
