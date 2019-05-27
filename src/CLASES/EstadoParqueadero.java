package CLASES;


import java.util.*;

/**
 * 
 */
public class EstadoParqueadero {
    
    public String Estado;
    public Date Fecha;
    public String Observaciones;

  
    
    public EstadoParqueadero() {
    }

    public EstadoParqueadero(String Estado, Date Fecha, String Observaciones) {
        this.Estado = Estado;
        this.Fecha = Fecha;
        this.Observaciones = Observaciones;
        
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    

    @Override
    public String toString() {
        return "EstadoParqueadero{" + "Estado=" + Estado + ", Fecha=" + Fecha + ", Observaciones=" + Observaciones + '}';
    }

    
   

}