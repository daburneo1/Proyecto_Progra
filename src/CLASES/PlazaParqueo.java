package CLASES;


import java.util.*;

/**
 * 
 */
public class PlazaParqueo {

    public String Numero;
    public String Estado;
    public Parqueadero parqueadero;

   
    public PlazaParqueo() {
    }

    public PlazaParqueo(String Numero, String Estado, Parqueadero parqueadero) {
        this.Numero = Numero;
        this.Estado = Estado;
        this.parqueadero = parqueadero;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    @Override
    public String toString() {
        return "PlazaParqueo{" + "Numero=" + Numero + ", Estado=" + Estado + ", parqueadero=" + parqueadero + '}';
    }

    
    
}