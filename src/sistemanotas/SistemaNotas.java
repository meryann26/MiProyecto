/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanotas;

/**
 *
 * @author Meryan
 */
public class SistemaNotas {

    String[] arregloNotas;
    int indice;
    String ejemplo;

    public SistemaNotas(int cantidadDeEstudiantes) {
        arregloNotas = new String[cantidadDeEstudiantes];
        indice = 0;
    }

    public void agregarNota(String notaEstudiante) {
        try {

            try {
                arregloNotas[indice++] = notaEstudiante;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Demasiados datos para el vector de quices");
                indice--;
            }
        } catch (Exception e) {
            System.out.println("Error más general");
        }
    }

    public int getIndex() {
        return indice;
    }

    public String getNota(int i) {
        return arregloNotas[i];
    }

}
