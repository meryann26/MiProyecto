/*
 * Este es el segundo laboratorio de Programacion I
 */
package segundaclase;

/**
 *
 * @author Meryan
 */
public class MiSegundoPrograma {

    public static void main(String[] args) {
        String c3 = "Mery Ann";
        String f4 = "Castro";
        String d7 = "Universidad Latina";
        int b10 = 4444;
        int b12 = 3; //parientes padre
        int d3 = 2; //parientes madre
        
        int e14;
        boolean c15;
        c15 = false;
        float d13 = 10.2f;
        double b5 = 450000;
        char c17 = 'O';
        char c18 = '+';

        e14 = b12 + d3;
        System.out.println(c3 + " " + f4 + "\n" + d7);
        System.out.println("Carne:" + b10);
        System.out.println("Total parientes:" + e14);
        System.out.println("Tiene COVID:" + c15);
        System.out.println("Impuestos:" + d13);
        System.out.println("Salario:" + b5);
        System.out.println("Tipo sangre:" + c17 + c18);

        int b1, c1, d1, e1;
        b1 = 1;
        c1 = 23;
        d1 = 52;
        e1 = 20;
        System.out.println(b1 + c1 + d1 + e1);

        int b2 = 34, c2 = 23, d2 = 88, e2 = 11;
    
        final String d9, d10, d11;
        d9 = "ProgramaciÃ³n II";
        System.out.println(d9);
        d10 = "ProgramaciÃ³n III";
        System.out.println(d10);
        d11 = "ProgramaciÃ³n IV";
        System.out.println(d11);
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        float impuestoMes = 2342.3f;
        System.out.println(impuestoMes);
        
        String mascota = "Maggie";
        System.out.println(mascota.toUpperCase()); //pasa mayuscula
        System.out.println(mascota.contains("gie")); //retorna si el texto existe
        System.out.println(mascota.concat("Quesada")); //concatena
        System.out.println(mascota.endsWith("ana")); //retorna si valor termina ana
        System.out.println(mascota.equals("Maggie")); //retorna si el valor es igual
        System.out.println(mascota.length()); //retorna el numero de caracteres
        System.out.println("Los Ã­ndices:");
        System.out.println(mascota.indexOf("M")); //retorna la posicion de la primera M
        System.out.println(mascota.indexOf("a")); //retorna la posicion de la primera a
        System.out.println(mascota.indexOf("g")); //retorna la posicion de la primera g
    }

}