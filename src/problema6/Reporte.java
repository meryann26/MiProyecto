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
    SistemaNotasVista vista;

    public Reporte(SistemaNotas sistema, SistemaNotasVista v) {
        this.sn = sistema;
        this.vista= v;
    }

    public void generarReporteTodosExamenes() {
        String reporte = "";

        for (int i = 0; i < sn.cont; i++) {
            reporte += sn.getExamenes()[i].getAlumno().getNombre() + sn.examenes[i].getAlumno().getApellido() + "\n";
            reporte += sn.getExamenes()[i].toString() + "\n";
        }

        vista.mostrarMensajeInfo(reporte);
    }
    
    public void generarReporteTodosAlumnos() {
        String reporte = "";

        for (int i = 0; i < sn.cont; i++) {
            reporte += sn.getExamenes()[i].getAlumno().getNombre() + sn.examenes[i].getAlumno().getApellido() + "\n";
         //   reporte += sn.getExamenes()[i].toString() + "\n";
        }

        vista.mostrarMensajeInfo(reporte);
    }
    
    

    public void generarReporteAlumnosConNotaInferiorA(int nota) {
        String reporte = "";

        for (int i = 0; i < sn.cont; i++) {
            if (sn.getExamenes()[i].getNota() < nota) {
                reporte += sn.getExamenes()[i].getAlumno().getNombre() + sn.examenes[i].getAlumno().getApellido() + "\n";
           //     reporte +=sn.getExamenes()[i].toString() + "\n";
            }

            vista.mostrarMensajeInfo(reporte);
        }

    }

    public void generarReporteTodosExamenesOrdenadosPor(String propiedad) {
        if (propiedad.equals("nota")) {
        } else if (propiedad.equals("nombreMateria")) {

        } else if (propiedad.equals("puntosTotal")) {

        } else if (propiedad.equals("puntosObtenidos")) {
        }

    }
}
