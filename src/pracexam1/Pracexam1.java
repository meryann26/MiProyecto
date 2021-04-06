package pracexam1;

import java.util.Scanner;

/**
 *
 * @author JGR
 */
public class Pracexam1 {

    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);
        int edad = 0;
        String nombre = "";
        String genero = "";
        boolean antecedentes = false;
        String sangre = "";
        boolean covid = false;
        String apellido = "";
        while (true) {
            if (nombre.equals("")) {//En caso de que el usuario no haya digitado los datos basicos se muestra un menu sin la opcion 2

                System.out.println("Digite 1 si desea agregar datos basicos"
                        + "\n Digite 3 para desplegar los datos del paciente\n Digite 4 para desplegar la probabilidad"
                        + " de que tenga Covid\nDigite 5 para borrar y reiniciar el Sistema ");
            } else {//en el caso de que si se haya digitado los datos basicos si se muestra la opcion 2
                //asi tenemos un menu dinamico para sacarnos el 100 :)
                System.out.println("Digite 1 si desea agregar datos basicos\nDigite 2 si desea agregar datos medicos"
                        + "\n Digite 3 para desplegar los datos del paciente\n Digite 4 para desplegar la probabilidad"
                        + " de que tenga Covid\nDigite 5 para borrar y reiniciar el Sistema ");

            }//llave del else
            System.out.println("Seleccione alguna de las anteriores opciones:");
            int menu = sca.nextInt();

            switch (menu) {

                case 1: {

                    System.out.println("Digite el nombre del paciente: ");
                    nombre = sca.next();
                    System.out.println("Digite los apellidos: ");
                    apellido = sca.next();
                    System.out.println("Digite la edad del paciente: ");
                    edad = sca.nextInt();
                    System.out.println("Digite el género del paciente: ");
                    genero = sca.next();

                    break;
                }//llave case 1
                case 2: {

                    if (nombre.equals("")) {
                        System.out.println("No ha digitado los datos basicos");
                    } else {
                        System.out.println("El paciente tiene antecedentes de alguna enfermedad? ");
                        antecedentes = sca.nextBoolean();
                        System.out.println("Cual es el tipo de sangre del paciente? ");
                        sangre = sca.next();

                        System.out.println("El paciente es positivo por Covid-19? ");
                        covid = sca.nextBoolean();
                        alertas(edad, antecedentes);
                        alertas(sangre);
                    }

                    break;
                }
                case 3: {

                    System.out.println("El nombre del paciente es: " + nombre);
                    System.out.println("La edad del paciente es: " + edad);
                    System.out.println("El genero del paciente es " + genero);
                    System.out.println("El paciente tuvo antecedentes de enfermedad: " + antecedentes);
                    System.out.println("El tipo de sangre del paciente es: " + sangre);
                    System.out.println("Es positivo por Covid?: " + covid);
                    break;
                }
                case 4: {
                    double probabilidad = 0.9 * edad;
                    System.out.println("La probabilidad de que el paciente enferme de forma grave es: " + probabilidad);

                    break;
                }

                case 5: {
                    nombre = "";
                    genero = "";
                    antecedentes = true;
                    sangre = "";
                    edad = 0;
                    covid = false;
                    break;

                }

            }

        }

    }

    public static void alertas(int edad, boolean antecedentes) {

        if (edad > 60 || antecedentes == true) {
            System.out.println("El paciente es factor de riesgo");

        }

    }

    public static void alertas(String sangre) {
        if (sangre == "O+") {
            System.out.println("El paciente es factor de riesgo");

        }
    }
}
