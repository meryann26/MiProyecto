/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaclase;

/**
 *
 * @author Meryan
 */
public class SistemaAerolinea {
    Cliente unicoCliente;
    Cliente segundoCliente;
    
    public void iniciar(){
        unicoCliente = new Cliente();
        segundoCliente = new Cliente(); 
        
        solicitarDatosCliente();
        generarReporteClientes();
    }
    
    public void solicitarDatosCliente(){
        unicoCliente.solicitarDatos();
    }
    
    public void generarReporteClientes(){
        String infoCliente = this.unicoCliente.toString();
        System.out.println(infoCliente);
    }
}
