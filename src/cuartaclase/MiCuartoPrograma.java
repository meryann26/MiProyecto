/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartaclase;

import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class MiCuartoPrograma {
    public static void main(String[] args){
        
        boolean siTrabajar=false;
        
        if(siTrabajar!=true){
            System.out.println("Nos vamos a la playa!");
        }
        
        int numero = 0;
        
        if(numero != 1){
            System.out.println("El numero tiene q ser menor o mayor q 1");
        }
        
        if(numero<1){
            System.out.println("El numero digitado debe ser mayor o igual cero");
        }
        
        if(numero == -1){
            System.out.println("El programa genero error");
        }
        
        if(-1 != numero){
            System.out.println("El programa funciona correctamente.");
        }
        
        if(numero < -1){
            System.out.println("Numero es menor q -1");
        }
        
        boolean quizOtraSemana=true;
        
        if(!quizOtraSemana){
            System.out.println("Hay que prepararse");
        }
        else{
            System.out.println("Igual hay que estudiar");
        }
        
        
        //PROBLEMA: Si profe dice q hay quiz, y dependiendo si hay internet y luz
        // y no hay terremoto entonces, se debe imprimir un mensaje que informe si hay quiz
        // sino, debe imprimir otro mensaje que informe que no hay quiz.
        
        //Scanner s = new Scanner(System.in);
        
        boolean profeDice = true; //s.nextBoolean();
        boolean internet = true; //s.nextBoolean();
        boolean luz = true; //s.nextBoolean();
        boolean terremoto = true; //s.nextBoolean();
        
        //Primera forma
        if(profeDice==true){
            if(internet==true){
                if(luz==true){
                    if(terremoto==false){
                        System.out.println("SI HAY QUIZ!");
                    }
                    else{
                        System.out.println("NO HAY QUIZ!");
                    }
                }
                else{
                    System.out.println("NO HAY QUIZ!");
                }
            }
            else{
                System.out.println("NO HAY QUIZ!");
            }
        }
        else{
            System.out.println("NO HAY QUIZ!");
        }
        
        //Segunda forma
        String mensaje="NO HAY QUIZ!";
        if(profeDice==true){
            if(internet==true){
                if(luz==true){
                    if(terremoto==false){
                        mensaje="SI HAY QUIZ!";
                    }
                }
            }
        }
        
        System.out.println(mensaje);
        
        //Tercera forma
        mensaje="NO HAY QUIZ!";
        if(profeDice){
            if(internet){
                if(luz){
                    if(!terremoto){
                        mensaje="SI HAY QUIZ!";
                    }
                }
            }
        }
        
        System.out.println(mensaje);

        //Cuarta forma
        mensaje="NO HAY QUIZ!";
        if(internet){
            if(profeDice){
                if(!terremoto){
                    if(luz){
                        mensaje="SI HAY QUIZ!";
                    }
                }
            }
        }
        
        System.out.println(mensaje); 
        
        
        //Quinta forma
        
        if(internet && luz && profeDice && !terremoto){
            System.out.println("SI HAY QUIZ!");
        }
        else{
            System.out.println("NO HAY QUIZ!");
        }
        
        //Sexta forma
        
        mensaje = "NO HAY QUIZ!";
        if(internet && luz && profeDice && !terremoto){
            mensaje = "SI HAY QUIZ!";
        }
        System.out.println(mensaje);
        
        //Setima forma
        
        mensaje = "SI HAY QUIZ!";
        if(!internet || !luz || !profeDice || terremoto){
            mensaje = "NO HAY QUIZ!";
        }
        System.out.println(mensaje); 
        
        //AlCANCE VARIABLES
        
        if(internet){
            int numQuiz=1;
            if(luz){
                System.out.println("El #quiz es " + numQuiz);
            }
        
        }
        
        //System.out.println("El #quiz es " + numQuiz);
        
        
        //ARITMETICA
        int numQuiz = 1;
        
        //aumenta en uno
        numQuiz = numQuiz + 1;
        numQuiz++;
        
        //aumenta en dos en dos
        numQuiz = numQuiz + 2;
        numQuiz += 2;

        numQuiz = numQuiz - 2;
        numQuiz -= 2;
        
        numQuiz = numQuiz * 2;
        numQuiz *= 2; 
        
        numQuiz = numQuiz / 10000;
        numQuiz /= 10000; 
        
        numQuiz = numQuiz % 2;
        numQuiz %= 2;
        
        
        //CICLOS
        
        //primera forma
        
        System.out.println("El numero " + 1);
        System.out.println("El numero " + 2);
        System.out.println("El numero " + 3);
        
        /*
        //segunda forma
        int num = 1;
        System.out.println("El numero " + num);
        num = num + 1;
        System.out.println("El numero " + num);
        num = num + 1;
        System.out.println("El numero " + num);
        
        //tercera forma
        num = 1;
        System.out.println("El numero " + num);
        num++;
        System.out.println("El numero " + num);
        num++;
        System.out.println("El numero " + num);
        */
        
        //Problema: En lugar de imprimir 3, imprima 1000
        
        //primera forma
        for(int num=1; num<=1000 ;num++){
            
            System.out.println("El numero " + num);
        
        }
        
        //segunda forma
        int num=1;
        while(num<=1000){
            System.out.println("El numero " + num);
            
            num++;
        }
        
        //EJEM CALCULADORA
        
        Calculadora miCalcu = new Calculadora();
        Calculadora otraCalcu = new Calculadora();
        Calculadora terceraCalcu = new Calculadora();
        
        int resultado = miCalcu.sumar(2, 3);
        System.out.println(resultado);
    }
    
    public void ejecucionEscanner(){
        //Scanner
        int numBonito1;
        int numBonito2;
        Scanner scanerHermoso = new Scanner(System.in);
        
        System.out.println("Digite un primer numero:");
        
        numBonito1 = scanerHermoso.nextInt();
        
        System.out.println("Digite un segundo numero:");
        
        numBonito2 = scanerHermoso.nextInt();
        
        System.out.println("Resultado:"+(numBonito1+numBonito2));
    }
}