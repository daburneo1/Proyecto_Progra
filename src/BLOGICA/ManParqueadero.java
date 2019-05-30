/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.Cliente;
import CLASES.Parqueadero;
import CLASES.Propietario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import DATA.Data_Parqueadero;

/**
 *
 * @author David
 */
public class ManParqueadero {
    
    public Parqueadero RegistrarParqueadero(String Nombre, String CallePrincipal, String CalleSecundaria, String Sector, Integer PlazasDisponibles, Double Tarifa, Propietario propietario, String Estado){
      Parqueadero ObjParq = new Parqueadero(Nombre, CallePrincipal, CalleSecundaria, Sector, PlazasDisponibles, Tarifa, propietario, Estado);
      return ObjParq;
    }
    
    
    
    public void EscribirParqueaderos(Parqueadero ObjParq) throws IOException{
        System.out.println(ObjParq.toString());
        File f = new File("parqueaderos.csv");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("\r\n" + ObjParq.getNombre() + "," + ObjParq.getCallePrincipal() + "," + ObjParq.getCalleSecundaria()+  "," + ObjParq.getSector()+ ","+ ObjParq.getPlazasDisponibles()+","+ ObjParq.getTarifa() + "," + ObjParq.getEstado());
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManParqueadero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Parqueadero> ImportarParqueaderos(ArrayList<Parqueadero> ArrayParqueaderos, String Sector) {
        
        Data_Parqueadero ObjDatPar = new Data_Parqueadero();
        ObjDatPar.ImportarParqueaderos(ArrayParqueaderos, Sector);
        
        return ArrayParqueaderos;
    }

    public void EscribirPropietarios(Propietario ObjPro) throws IOException {
        System.out.println(ObjPro.toString());
        File f = new File("propietarios.csv");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("\r\n" + ObjPro.getNombreParqueadero()+ ","+ ObjPro.getNombre() + "," + ObjPro.getApellido() + "," + ObjPro.getCI() + "," + ObjPro.getUser() + "," + ObjPro.getPass());
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManParqueadero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

