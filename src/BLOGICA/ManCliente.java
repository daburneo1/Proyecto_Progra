/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.Cliente;
import CLASES.Usuario;
import CLASES.Vehiculo;
import DATA.Data_Cliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
       
        File f = new File("clientes.csv");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("\r\n" + ObjCli.getNombre() + "," + ObjCli.getApellido() + "," + ObjCli.getCelular() + "," + ObjCli.getCI() +  "," + ObjCli.getVehiculo() + "." + ObjCli.getCorreo());
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EscribirCredenciales(Cliente ObjCli) throws IOException{
        
        File f = new File("credenciales.csv");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("\r\n" + ObjCli.getCI() + "," + ObjCli.getUser() + "," + ObjCli.getPass() );
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EscribirVehiculo(Vehiculo ObjVeh) throws IOException{
        
        File f = new File("vehiculos.csv");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("\r\n" + ObjVeh.getCedula() + "," + ObjVeh.getPlaca() + "," + ObjVeh.getTipo());
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario BuscarUsuario(String User, String Pass) {
        ArrayList<Usuario> ArrayUsuarios = new ArrayList<Usuario>();
        Data_Cliente ObjDatCli = new Data_Cliente();
        return ObjDatCli.ImportarUsuarios(User, Pass);  
    }

}
