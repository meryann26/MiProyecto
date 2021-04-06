/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undecimaclase;

import decimaclase.*;
import java.util.Scanner;

/**
 *
 * @author Meryan
 */
public class SistemaAerolinea {
    Cliente unicoCliente;
    Cliente segundoCliente;
    Cliente duenoAerolinea;
    DestinoViaje destino1;
    
    Cliente[] clientes = new Cliente[1000];
    int numClientes;
    
    public void iniciar(){
        
        duenoAerolinea = new Cliente("Mario","Perez","1-2323-1122", "CR");

        Scanner escaner = new Scanner(System.in);
        while(true){
            System.out.println("Digite \n1: Ingresar cliente \n2: Configurar Destinos Viaje "
                + "\n3: Generar reporte clientes\n4: Generar reporte destinos viaje");
            int opcion = escaner.nextInt();
            switch(opcion){
                case 1:
                    //unicoCliente = new Cliente();
                    //segundoCliente = new Cliente(); 
                    //solicitar datos
                    //unicoCliente.solicitarDatos();
                    //segundoCliente.solicitarDatos();
                    
                    Cliente cliente = new Cliente();
                    cliente.solicitarDatos();
                    
                    clientes[numClientes] = cliente;
                    numClientes++;
                    
                    break;
                case 2:
                    destino1 = new DestinoViaje();
                    destino1.solicitarDatosDestino();
                    break;
                    
                case 3:
                    //generar reporte clientes
                    //System.out.println(this.unicoCliente.toString());
                    //System.out.println(this.segundoCliente.toString());
                    
                    for(int i=0;i<clientes.length;i++){
                        if(clientes[i]!=null){
                            System.out.println(clientes[i].toString());
                        }
                    }
                    
                    break;
                    
                case 4:
                    //generar reporte destinos
                    System.out.println(this.destino1.toString());
                    break;
            }

        }
    }
    
}
