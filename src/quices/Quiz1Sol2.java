/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quices;

/**
 *
 * @author carlosandres.mendez
 */
public class Quiz1Sol2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double monto1 = aguinaldo(853000, 11);
        System.out.println("Juan Perez, monto aguinaldo: " + monto1);

        double monto2 = aguinaldo(570800, 11);
        System.out.println("Maria Vasquez, monto aguinaldo: " + monto2);

        double monto3 = aguinaldo(570800, 11, 2);
        System.out.println("Jorge Gutierrez, monto aguinaldo: " + monto3);
    }

    public static double aguinaldo(double salario, int numMeses) {
        double montoAguinaldoRetornar = 0;

        if (numMeses == 12) {
            montoAguinaldoRetornar = salario;
        } else if (numMeses < 12) {
            montoAguinaldoRetornar = (numMeses / 12) * salario;
        }

        return montoAguinaldoRetornar;
    }

    public static double aguinaldo(double salario, int cantMeses, int cantAmonestaciones) {
        double aguinaldo = 0;

        if (cantAmonestaciones == 0) { //si no tiene amonestaciones (este if se podria omitir) ya que se puede utilizar el otro metodo
            if (cantMeses == 12) {
                aguinaldo = salario; //el monto de salario es el mismo
            } else if (cantMeses < 12) {
                aguinaldo = (cantMeses / 12) * salario;
            }
        } else if (cantAmonestaciones == 1) { //

            if (cantMeses == 12) {
                aguinaldo = salario * 0.70; //el monto de salario es el 70 porciento
            }

            if (cantMeses < 12) {
                aguinaldo = ((cantMeses / 12) * salario) * 0.70; //el 70 porciento de los meses que trabajo
            }

        } else if (cantAmonestaciones >= 2) {
            aguinaldo = 0;
        }
        return aguinaldo;
    }
}
