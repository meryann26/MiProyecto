/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Meryan
 */
public class NotaVista {

    SistemaNotas nota;

    public NotaVista(SistemaNotas notaInstanciada) {
        this.nota = notaInstanciada;
    }

    public void leaNota() {
        String notaDigitada;

        notaDigitada = String.valueOf(JOptionPane.showInputDialog("Nota?"));

        nota.agregarNota(notaDigitada);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < nota.getIndex(); i++) {
            jt.append(nota.getNota(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Reporte de exámenes\n2. Reporte de alumnos"
                    + "\n3. Reporte de alumnos con nota inferior a\n4. Reporte exámenes ordenados por\n5. Salir"));
            if ((r < 1) || (r > 5)) {
                throw new Exception("Número de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
