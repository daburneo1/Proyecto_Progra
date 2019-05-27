/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.EstadoParqueadero;
import CLASES.Parqueadero;
import java.util.Date;

/**
 *
 * @author David
 */
public class ManEstadoParqueadero {
    
    public EstadoParqueadero CambiarEstado(String Estado, Date Fecha, String Observaciones){
        EstadoParqueadero ObjEst = new EstadoParqueadero(Estado, Fecha, Observaciones);
        return ObjEst;
    }

    
    
}
