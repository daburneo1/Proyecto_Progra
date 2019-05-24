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

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    @Override
    public String toString() {
        return "EstadoParqueadero{" + "Estado=" + Estado + ", Fecha=" + Fecha + ", Observaciones=" + Observaciones + ", parqueadero=" + parqueadero + '}';
    }

    
   

}