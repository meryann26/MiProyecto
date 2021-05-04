/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscapitulo7;

/**
 *
 * @author Meryan
 */
// La clase Carta representa una carta de juego.
public class Carta {

    private final String cara; // cara de la carta ("As", "Dos", ...)
    private final String palo; // palo de la carta ("Corazones", "Diamantes", ...)

    // el constructor de dos argumentos inicializa la cara y el palo de la carta
    public Carta(String caraCarta, String paloCarta) {
        this.cara = caraCarta; // inicializa la cara de la carta
        this.palo = paloCarta; // inicializa el palo de la carta
    }

    // devuelve representación String de Carta
    public String toString() {
        return cara + " de " + palo;
    }
} // fin de la clase Carta
