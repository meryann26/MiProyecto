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

    public SistemaNotas() {
        maxRegistros = 100;
        examenes = new Examen[maxRegistros];
        cont = 0;
    }

    public SistemaNotas(int maxRegistros) {
        examenes = new Examen[maxRegistros];
        cont = 0;
    }

    public boolean eliminiarEx() {
        boolean resultado = false;
        if (cont != 0) {
            cont--;
            examenes[cont - 1] = null;
            resultado = true;
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

    public void mostrarExamenes() {
        for (int i = 0; i < maxRegistros; i++) {
            if (examenes[i] != null) {
                System.out.println(examenes[i].getAlumno().getNombre() + examenes[i].getAlumno().getApellido());
                System.out.println(examenes[i].toString());
            }
        }
    }

    public float promedioNotas() {
        float retorno = 0f;

        return retorno;
    }

    public int getMaxRegistros() {
        return maxRegistros;
    }

    public void setMaxRegistros(int maxRegistros) {
        this.maxRegistros = maxRegistros;
    }

    public Examen[] getExamenes() {
        return examenes;
    }

    public void setExamenes(Examen[] examenes) {
        this.examenes = examenes;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

}
