/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceraclase;

import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class MiTercerPrograma {
    public static void main(String[] args){
        
        String nombre = "Meryan";
        
        switch(nombre){
            case "Meryan":
                System.out.println(" case Meryan... ");
                System.out.println(" case Meryan... ");
                break;
            case "Aracelly":
                System.out.println(" case Aracelly... ");
                break;
        }
        
        System.out.println(" rtyuhg sefrdwer juh ");
        
        
        int tiempoEducMedia = 6;
        int tiempoUniversidad = 2;
        int tiempoTrabajando = 2;
        
        int totalTiempo;
        totalTiempo = calcularSuma(tiempoEducMedia,tiempoUniversidad,tiempoTrabajando);
        
        if(totalTiempo>15){
            System.out.println("Ud tiene pocos aÃƒÂ±os de experiencia");
        }
        else{
            System.out.println("Ud requiere mÃƒÂ¡s exper");
        } 
        
        establecerFormatoEmpresa("Mensaje de prueba","Escuela TICs");
        
        
        //ARITMETICA
        
        int visitacionPagWeb = 0;
        System.out.println(visitacionPagWeb);
        visitacionPagWeb = 1;
        System.out.println(visitacionPagWeb);
        visitacionPagWeb = 2;
        System.out.println(visitacionPagWeb);
        
        
        visitacionPagWeb++;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb++;
        System.out.println(visitacionPagWeb);
     
        visitacionPagWeb += 1;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb += 1;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb += 2;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb += 2;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb += 100;
        System.out.println(visitacionPagWeb);
        
        //Scanner
        
        Scanner sca = new Scanner(System.in);
        int numDigUsuario1,numDigUsuario2;
        
        System.out.println("Digite un primer numero:");
        numDigUsuario1 = sca.nextInt();
        
        System.out.println("Digite un segundo numero:");
        numDigUsuario2 = sca.nextInt();
        
        System.out.println("Resultado:"+(numDigUsuario1+numDigUsuario2));    
   
        // Otro ejemplo de scanner
        
        int numBonito1;
        int numBonito2;
        Scanner scanerHermoso = new Scanner(System.in);
        
        System.out.println("Digite un primer numero");
        
        numBonito1 = scanerHermoso.nextInt();
        
        System.out.println("Digite un segundo numero");
        
        numBonito2 = scanerHermoso.nextInt();
        
        System.out.println("Resultado:" +(numBonito1+numBonito2));
    
  
    }//fin main
    
    public static int calcularSuma(int param1, int param2){
        int resultado;
        resultado = param1 + param2; 
        
        return resultado;
    }
    
    public static int calcularSuma(int param1, int param2, int param3){
        int resultado;
        resultado = param1 + param2 + param3; 
        
        return resultado;
    }
    
    public static void establecerFormatoEmpresa(String textoAimprimir){
        String encabezado = "------ Universidad Latina -------\n";
        String pie =      "\n---------------------------------\n";
        
        String todoMayuscula = (encabezado + textoAimprimir + pie).toUpperCase();
        System.out.println(todoMayuscula);
    }
    
    public static void establecerFormatoEmpresa(String textoAimprimir,String nombreDpto){
        String titulo = "------ Universidad Latina -------\n";
        String subtitulo = "------ "+nombreDpto+" -------\n";
        String pie =      "\n---------------------------------\n";
        
        String todoMayuscula = (titulo + subtitulo + textoAimprimir + pie).toUpperCase();
        System.out.println(todoMayuscula);
    }
}

