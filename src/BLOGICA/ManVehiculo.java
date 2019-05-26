/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.Vehiculo;

/**
 *
 * @author David
 */
public class ManVehiculo {



    public Vehiculo RegistrarVehiculo(String Placa, String Tipo, String Cedula) {
        Vehiculo ObjVeh = new Vehiculo(Placa, Tipo, Cedula);
        return ObjVeh;
    }
    
}
