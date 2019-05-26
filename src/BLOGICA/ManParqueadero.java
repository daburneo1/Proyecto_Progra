/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.Cliente;
import CLASES.EstadoParqueadero;
import CLASES.Parqueadero;
import CLASES.Propietario;
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
public class ManParqueadero {
    
    public Parqueadero RegistrarParqueadero(String Nombre, String CallePrincipal, String CalleSecundaria, String Sector, Integer PlazasDisponibles, Double Tarifa, Propietario propietario, EstadoParqueadero estado){
      Parqueadero ObjParq = new Parqueadero(Nombre, CallePrincipal, CalleSecundaria, Sector, PlazasDisponibles, Tarifa, propietario, estado);
      return ObjParq;
    }
    
    
       public void EscribirRegistros(Parqueadero ObjParq) throws IOException{
        System.out.println(ObjParq.toString());
        File f = new File("parqueadero.csv");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("\r\n" + ObjParq.getNombre() + "," + ObjParq.getCallePrincipal() + "," + ObjParq.getCalleSecundaria()+  "," + ObjParq.getSector()+ ","+ ObjParq.getPlazaParqueo()+","+ ObjParq.getTarifa());
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManParqueadero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
