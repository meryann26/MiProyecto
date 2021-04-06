/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenaclase;

public class Tiempo1 {

    public  int hora; // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

// establece un nuevo valor de tiempo, usando la hora universal;
// lanza una excepción si la hora, minuto o segundo son inválidos
    public void establecerTiempo(int hora, int minuto, int segundo) {
// valida la hora, el minuto y el segundo
        if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("hora, minuto y/o segundo estaban fuera de rango");
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

// convierte a objeto String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

// convierte a objeto String en formato de hora estándar (H:MM:SS AM o PM)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((this.hora == 0 || hora == 12) ? 12 : hora % 12),minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }
} // fin de la clase Tiempo1
