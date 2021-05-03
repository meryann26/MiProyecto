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
public class SistemaNotaControlador {

    //modo 1 es interfaz, modo 2 scanner,
    public static int MODE_INTERFAZ = 2;

    SistemaNotasInterfaz interfaz = new SistemaNotasInterfaz();

    public void iniciar() {

        interfaz.arrancarModoInterfaz(MODE_INTERFAZ);

    }

}
