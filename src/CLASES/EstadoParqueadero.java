package CLASES;


import java.util.*;

/**
 * 
 */
public class EstadoParqueadero {
    
    public String Estado;
    public Date Fecha;
    public String Observaciones;
    public Parqueadero parqueadero;
  
    
    public EstadoParqueadero() {
    }

    public EstadoParqueadero(String Estado, Date Fecha, String Observaciones, Parqueadero parqueadero) {
        this.Estado = Estado;
        this.Fecha = Fecha;
        this.Observaciones = Observaciones;
        this.parqueadero = parqueadero;
    }

    
   

}