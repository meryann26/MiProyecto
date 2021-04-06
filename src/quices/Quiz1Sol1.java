/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quices;
import java.util.Scanner;

/**
 *
 * @author rodojml
 */
public class Quiz1Sol1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Indique el nombre del empleado: ");
        String empleado = entrada.nextLine();
        System.out.print("\n");
        
        System.out.print("Indique el salario mensual: ");
        double salario = entrada.nextDouble();
        System.out.print("\n");
        
        System.out.print("Indique la cantidad de meses trabajados: ");
        int meses = entrada.nextInt();
        System.out.print("\n");
        
        System.out.print("Indique la cantidad de amonestaciones: ");
        int amonestaciones = entrada.nextInt();
        System.out.print("\n");
        
        if(amonestaciones > 0)
            System.out.print("El salario de" + empleado + " es " + aguinaldoPagar(salario, meses, amonestaciones));
        else
            System.out.print("El salario de" + empleado + " es " + aguinaldoPagar(salario, meses)); 
      
    }
    
    public static double aguinaldoPagar(double x, int y)
    {
        double aguinaldo = 0;
        
        if(y == 12)
            aguinaldo = x; 
        
        if(y < 12)
            aguinaldo = (y / 12) * x; 
       
       return aguinaldo;
    }
    
    public static double aguinaldoPagar(double x, int y, int z)
    {
        double aguinaldo = 0;
                
        if(z >= 2)
            aguinaldo = 0;
        else
        {
            if(z == 1)
            {
                
                if(y == 12)
                {
                    aguinaldo = x * 0.70;
                }     
        
                if(y < 12)
                {
                    aguinaldo = ((y / 12) * x)* 0.70;
                }
  
            }    
          
        }    

       return aguinaldo;

    }
}
