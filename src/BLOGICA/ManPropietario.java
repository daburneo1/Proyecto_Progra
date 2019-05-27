/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.Propietario;

/**
 *
 * @author David
 */
public class ManPropietario {
    
    public Propietario CrearPropietario(String Nombre, String Apellido, String Cedula, String User, String Password){
        Propietario ObjPro = new Propietario(Nombre, Apellido, Cedula, User, Password);
        return ObjPro;
    }
    
    public void ModificarParqueadero() {
        
    }

    public void ConsultarCliente() {
       
    }

    public void ModificarCliente() {
        
    }

    
    
}
