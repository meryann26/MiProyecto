/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Meryan
 */
public class SistemaNotasVista {

    SistemaNotas sn;
    boolean interGr = true;

    public int mostrarMenu() {
        Scanner s = new Scanner(System.in);
        String msjMenu = "Menú\n1 Agregar examen\n2 Eliminar examen"
                + "\n3 Reporte todos exámenes\n4 Reporte todos alumnos"
                + "\n4 Reporte alumnos con nota inferior a\n5 Reporte exámenes ordenados por";
        int opcionSeleccionada;
        if (interGr) {
            opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(null, msjMenu));
        } else {
            System.out.println(msjMenu);
            opcionSeleccionada = s.nextInt();

        }

        return opcionSeleccionada;
    }

    public void solicitarDatosExamen(Examen ex) {
        String nombreAlumno = "";
        String apellido = "";
        String nombreMateria = "";
        String notaStr = "";
        String ptsTtl = "";
        String ptsObt = "";
        if (interGr) {
            nombreAlumno = JOptionPane.showInputDialog(null, "Favor digite el nombre del alumno");
            ex.getAlumno().setNombre(nombreAlumno);
            apellido = JOptionPane.showInputDialog(null, "Favor digite el apellido del alumno");
            ex.getAlumno().setApellido(apellido);
            nombreMateria = JOptionPane.showInputDialog(null, "Favor digite el nombre de la materia");
            ex.setNombreMateria(nombreMateria);
            notaStr = JOptionPane.showInputDialog(null, "Favor digite la nota");
            ex.setNota(Integer.parseInt(notaStr));
            ptsTtl = JOptionPane.showInputDialog(null, "Favor digite los puntos totales");
            ex.setPuntosTotal(Integer.parseInt(ptsTtl));
            ptsObt = JOptionPane.showInputDialog(null, "Favor digite los puntos obtenidos");
            ex.setPuntosObtenidos(Integer.parseInt(ptsObt));

        } else {
            Scanner s = new Scanner(System.in);
            System.out.println("Favor digite la nota: ");
            ex.setNota(s.nextInt());
            System.out.println("Favor digite los puntos totales: ");
            ex.setPuntosTotal(s.nextInt());
            System.out.println("Favor digite los puntos obtenidos: ");
            ex.setPuntosObtenidos(s.nextInt());
            System.out.println("Favor digite el nombre de la materia: ");
            ex.setNombreMateria(s.next());

        }
    }

    public SistemaNotasVista(SistemaNotas sn) {
        this.sn = sn;
    }

    public void mostrarMensajeInfo(String msj) {
        if (interGr) {
            JOptionPane.showMessageDialog(null, msj);
        } else {
            System.out.println(msj);
        }
    }

}
