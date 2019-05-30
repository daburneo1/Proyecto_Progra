/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.Parqueadero;
import CLASES.Propietario;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class ManPropietario {
    
    public Propietario CrearPropietario(String NombreParqueadero, String Nombre, String Apellido, String Cedula, String User, String Password){
        Propietario ObjPro = new Propietario(NombreParqueadero, Nombre, Apellido, Cedula, User, Password);
        return ObjPro;
    }
    
    public void ModificarParqueadero() {
        
    }

    public void ConsultarCliente() {
       
    }

    public void ModificarCliente() {
        
    }
    
   
    public Propietario BuscarPropietario(ArrayList<Propietario> ArrayPropietario, String Nombre){
        
        Propietario ObjAux = new Propietario(null, null, null, null, null, null);
        for(Propietario ObjPro: ArrayPropietario){
            String strCe = ObjPro.getNombreParqueadero().trim();
            if(strCe.equals(Nombre.trim())){
                ObjAux = ObjPro;
            }
        }
        return ObjAux;
    }
    
    
}
