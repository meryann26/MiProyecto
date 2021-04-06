/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenaclase;

import octavaclase.*;

/**
 *
 * @author Meryan
 */
public class TesterMachoteMatrimonio {

    public static void main(String[] args) {
        MachoteMatrimonio acta1 = new MachoteMatrimonio();
        acta1.nombre1 = "Oscar";
        acta1.nombre2 = "Margarita";
        acta1.setCedula1("1-5456-2564");
        acta1.setCedula2("3-5463-7895");
        System.out.println(acta1.toString());

        MachoteMatrimonio acta2 = new MachoteMatrimonio();
        acta2.nombre1 = "Felipe";
        acta2.nombre2 = "Rosa";
        acta2.setCedula1("1-8965-1452");
        acta2.setCedula2("2-6666-8888");
        System.out.println(acta2.toString());

        MachoteMatrimonio acta3 = new MachoteMatrimonio();
        acta3.nombre1 = "Luis";
        acta3.nombre2 = "Luisa";
        acta3.setCedula1("1-8569-8546");
        acta3.setCedula2("2-8795-4585");
        acta3.establecerVersion(202104);
        System.out.println(acta1.toString());
        
        Tiempo1 t = new Tiempo1();
        t.establecerTiempo(6, 14, 25);
        System.out.println(t.aStringUniversal());
    }
}
