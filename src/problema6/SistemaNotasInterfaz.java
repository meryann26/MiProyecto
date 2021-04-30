/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class SistemaNotasInterfaz {

    Examen examen;

    boolean modoGrafico = true;
    SistemaNotas nota = new SistemaNotas(2);
    NotaVista nv = new NotaVista(nota);

    public void arrancarModoInterfaz(int tipo) {

        Examen examen1 = new Examen();
        examen1.setAsignatura("Matemática ");
        examen1.setPuntosObtenidos(50);
        examen1.setPuntajeTotal(60);
        examen1.setCalificacion(83);

        Examen examen2 = new Examen();
        examen2.setAsignatura("Química ");
        examen2.setPuntosObtenidos(85);
        examen2.setPuntajeTotal(100);
        examen2.setCalificacion(85);

        Examen examen3 = new Examen();
        examen3.setAsignatura("Química ");
        examen3.setPuntosObtenidos(65);
        examen3.setPuntajeTotal(100);
        examen3.setCalificacion(65);

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Alicia ");
        alumno1.setPrimerApellido("Abarca ");
        alumno1.setSegundoApellido("Lopez. ");
        alumno1.setCarnet("20215698");

        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Carlos ");
        alumno2.setPrimerApellido("Gómez ");
        alumno2.setSegundoApellido("Mora. ");
        alumno2.setCarnet("20245322");

        Alumno alumno3 = new Alumno();
        alumno3.setNombre("María ");
        alumno3.setPrimerApellido("Rojas ");
        alumno3.setSegundoApellido("Arias. ");
        alumno3.setCarnet("20215487");

        examen1.setAlumno(alumno1);
        examen2.setAlumno(alumno2);
        examen3.setAlumno(alumno3);

        Examen[] arregloExamenes = new Examen[3];
        arregloExamenes[0] = examen1;
        arregloExamenes[1] = examen2;
        arregloExamenes[2] = examen3;

        SistemaNotasReporte reporte = new SistemaNotasReporte(arregloExamenes);

        //tipo jpane
        if (tipo == 1) {

            int op;
            do {
                op = nv.getOpcion();
                switch (op) {
                    case 1:
                        nv.leaNota();
                        break;
                    case 2:
                        nv.muestreNotas();
                        break;
                    default:
                }
            } while (op != 5);
        }

//tipo escaner
        if (tipo == 2) {

            Scanner scn = new Scanner(System.in);
            while (true) {
                System.out.println("1. Reporte de exámenes\n2. Reporte de alumnos"
                        + "\n3. Reporte de alumnos con nota inferior a\n4. Reporte exámenes ordenados por");

                int opcionMenu = scn.nextInt();

                switch (opcionMenu) {

                    case 1: {
                        reporte.generarReporteTodosExamenes();

                        break;
                    }
                    case 2: {
                        reporte.generarReporteTodosAlumnos();

                        break;
                    }

                    case 3: {
                        reporte.generarReporteAlumnosConNotaInferiorA(84);

                        break;
                    }

                    case 4: {

                        break;
                    }

                }
            }
        }
    }

    //logica para escaner
//logica para joptionpane
}
