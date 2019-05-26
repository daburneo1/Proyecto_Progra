/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.Cliente;
import CLASES.Vehiculo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class ManCliente {
    
    public void ConsultarParqueadero() {
        
    }

    public Cliente RegistrarCliente(String Nombre, String Apellido, String Celular, String Cedula, String User, String Password, Vehiculo Vehiculo, String Correo) { 
        Cliente ObjCli = new Cliente(Nombre, Apellido, Celular, Cedula, User, Password, Vehiculo, Correo);
        return ObjCli;
    }
    
    
   
    public void CrearReserva() {
        
    }

   
    public void ModificarReserva() {
        
    }

   
    public void CancelarReserva() {
        
    }

    
    public void GenerarFichaParqueo() {
        
    }

   
    public void EliminarCliente() {
    }

    public void EscribirRegistros(Cliente ObjCli) throws IOException{
        System.out.println(ObjCli.toString());
        File f = new File("clientes.csv");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("\r\n" + ObjCli.getNombre() + "," + ObjCli.getApellido() + "," + ObjCli.getCelular() + "," + ObjCli.getCI() + "," + ObjCli.getUser() + "," + ObjCli.getPass() + "," + ObjCli.getVehiculo() + "." + ObjCli.getCorreo());
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    
}
