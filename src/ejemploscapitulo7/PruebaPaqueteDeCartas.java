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
public class PruebaPaqueteDeCartas {
    // ejecuta la aplicación

    public static void main(String[] args) {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar(); // coloca las Cartas en orden aleatorio

        // imprime las 52 Cartas en el orden en el que se reparten
        for (int i = 1; i <= 52; i++) {
            // reparte e imprime una Carta
            System.out.printf("%-19s", miPaqueteDeCartas.repartirCarta());

            if (i % 4 == 0) // imprime una nueva línea después de cada cuatro cartas
            {
                System.out.println();
            }
        }
    }
} // fin de la clase PruebaPaqueteDeCartas
