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
public class SistemaNotasReporte {

    Examen[] baseDatos;

    public SistemaNotasReporte(Examen[] examenes) {
        this.baseDatos = examenes;
    }

    //muestra información únicamente de exámenes
    public void generarReporteTodosExamenes() {

        for (Examen ex : baseDatos) {
            System.out.println(ex.getAsignatura() + " TotalPts: " + ex.getPuntajeTotal() + " PtsObt: " + ex.getPuntosObtenidos() + " Calificación: " + ex.getCalificacion());
        }

    }

    //muestra información únicamente de alummnos
    public void generarReporteTodosAlumnos() {

        for (Examen ex : baseDatos) {
            System.out.println(ex.getAlumno().getNombre() + ex.getAlumno().getPrimerApellido() + ex.getAlumno().getSegundoApellido() + "Carnet: " + ex.getAlumno().getCarnet());
        }

    }

    //muestra información del alumno
    public void generarReporteAlumnosConNotaInferiorA(double nota) {

        for (Examen ex : baseDatos) {

            if (nota > ex.getCalificacion()) {
                System.out.println(ex.getAlumno().getNombre() + ex.getAlumno().getPrimerApellido() + ex.getAlumno().getSegundoApellido());
            }
        }

    }
    /*
    //Muestra información del examen y el alumno, ordenado por alguna propiedad del examen
    public void generarReporteTodosExamenesOrdenadosPor(String propiedad) {
        
        Arrays.sort(books, new Comparator<Book>() {
   public int compare(Book b1, Book b2) {
      return if b1 is greater return +1, if b2 is smaller return -1 otherwise 0
   }
});
        
        for(Examen ex : baseDatos){
            
            if(propiedad == "calificacion"){
                
            }
                System.out.println()
        }
    }*/

}
