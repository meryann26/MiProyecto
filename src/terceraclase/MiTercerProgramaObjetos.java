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
public class MiTercerProgramaObjetos {
    public static void main(String[] args){
        
        MiTercerProgramaObjetos mp = new MiTercerProgramaObjetos();
        
        
        String nombre = "Carlos";
        
        switch(nombre){
            case "Jorge":
                System.out.println(" case Jorge... ");
                System.out.println(" case Jorge... ");
                break;
            case "Carlos":
                System.out.println(" case Carlos... ");
                break;
        }
        
        System.out.println(" adsfds fdafafdfs dsd ");
        
        
        int tiempoEducMedia = 6;
        int tiempoUniversidad = 4;
        int tiempoTrabajando = 10;
        
        int totalTiempo;
        totalTiempo = mp.calcularSuma(tiempoEducMedia,tiempoUniversidad,tiempoTrabajando);
        
        if(totalTiempo>15){
            System.out.println("Ud ya tiene muchos años de experiencia");
        }
        else{
            System.out.println("Ud requiere más exper");
        } 
        
        mp.establecerFormatoEmpresa("Mensaje de prueba...", "Escuela de TICs");
        
        //ARITMETICA
        
        int visitacionPagWeb = 0;
        System.out.println(visitacionPagWeb);
        visitacionPagWeb = 1;
        System.out.println(visitacionPagWeb);
        visitacionPagWeb = 2;
        System.out.println(visitacionPagWeb);
        
        
        visitacionPagWeb = visitacionPagWeb + 1;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb = visitacionPagWeb + 1;
        System.out.println(visitacionPagWeb);
     
        visitacionPagWeb = visitacionPagWeb + 1;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb = visitacionPagWeb + 1;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb = visitacionPagWeb + 2;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb = visitacionPagWeb + 2;
        System.out.println(visitacionPagWeb);
        
        visitacionPagWeb = visitacionPagWeb + 100;
        System.out.println(visitacionPagWeb);
        
        
    }//fin main
    
    public int calcularSuma(int param1, int param2){
        int resultado;
        resultado = param1 + param2; 
        
        return resultado;
    }
    
    public int calcularSuma(int param1, int param2, int param3){
        int resultado;
        resultado = param1 + param2 + param3; 
        
        return resultado;
    }
    
    public void establecerFormatoEmpresa(String textoAimprimir){
        String encabezado = "------ Universidad Latina -------\n";
        String pie =      "\n---------------------------------\n";
        
        String todoMayuscula = (encabezado + textoAimprimir + pie).toUpperCase();
        System.out.println(todoMayuscula);
    }
    
    public void establecerFormatoEmpresa(String textoAimprimir,String nombreDpto){
        String titulo = "------ Universidad Latina -------\n";
        String subtitulo = "------ "+nombreDpto+" -------\n";
        String pie =      "\n---------------------------------\n";
        
        String todoMayuscula = (titulo + subtitulo + textoAimprimir + pie).toUpperCase();
        System.out.println(todoMayuscula);
    }
    
   
}