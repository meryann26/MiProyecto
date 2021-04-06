/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavaclase;

/**
 *
 * @author Meryan
 */
public class Tester {

    public static void main(String[] args) {
        int contCedula1 = 0; //cantidad de cedulas q inician en 1
        int contCedula2 = 0; //cantidad de cedulas q no inician en 1

        MachoteMatrimonio acta1 = new MachoteMatrimonio();
        acta1.nombre1 = "Oscar";
        acta1.nombre2 = "Andrea";
        acta1.setCedula1("1-1542-0985");
        acta1.setCedula2("2-0988-0147");
        acta1.imprimirTextoConLogo();
        int famosoNumCed = Integer.parseInt(String.valueOf(acta1.getCedula1().charAt(0)));
        if (famosoNumCed == 1) {
            contCedula1++;
        } else {
            contCedula2++;
        }

        MachoteMatrimonio acta2 = new MachoteMatrimonio();
        acta2.nombre1 = "Luis";
        acta2.nombre2 = "Sonia";
        acta2.setCedula1("1-6524-0332");
        acta2.setCedula2("2-0415-0965");
        acta2.imprimirTexto();
        famosoNumCed = Integer.parseInt(String.valueOf(acta2.getCedula1().charAt(0)));
        if (famosoNumCed == 1) {
            contCedula1++;
        } else {
            contCedula2++;
        }

        MachoteMatrimonio acta3 = new MachoteMatrimonio();
        acta3.nombre1 = "Andy";
        acta3.nombre2 = "Grace";
        acta3.setCedula1("1-2454-1342");
        acta3.setCedula2("2-6345-3493");
        acta3.establecerVersion(202104);
        acta3.imprimirTexto();
        famosoNumCed = Integer.parseInt(String.valueOf(acta3.getCedula1().charAt(0)));
        if (famosoNumCed == 1) {
            contCedula1++;
        } else {
            contCedula2++;
        }

        System.out.println("contCedula1 " + contCedula1);
        System.out.println("contCedula2 " + contCedula2);
    }
}
