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
public class Reporte {

    SistemaNotas sn;

    public Reporte(SistemaNotas sistema) {
        sn = sistema;
    }

    public void generarReporteTodosExamenes() {
        //String reporte = "";
        
        for(int i=0;i<sn.cont;i++){
                System.out.println(sn.getExamenes()[i].getAlumno().getNombre() + sn.examenes[i].getAlumno().getApellido());
                System.out.println(sn.getExamenes()[i].toString());
            }
   
        //System.out.println(reporte);
    }

}
