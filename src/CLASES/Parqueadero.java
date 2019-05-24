package CLASES;


import java.util.*;

/**
 * 
 */
public class Parqueadero {
    
    public String Nombre;
    public String CallePrincipal;
    public String CalleSecundaria;
    public String Sector;
    public Integer PlazasDisponibles;
    public Double Tarifa;
    public Propietario propietario;
    public EstadoParqueadero estado;
    public ArrayList<PlazaParqueo> plazaParqueo = new ArrayList<PlazaParqueo>();
    
    
    public Parqueadero() {
    }

    public Parqueadero(String Nombre, String CallePrincipal, String CalleSecundaria, String Sector, Integer PlazasDisponibles, Double Tarifa, Propietario propietario, EstadoParqueadero estado) {
        this.Nombre = Nombre;
        this.CallePrincipal = CallePrincipal;
        this.CalleSecundaria = CalleSecundaria;
        this.Sector = Sector;
        this.PlazasDisponibles = PlazasDisponibles;
        this.Tarifa = Tarifa;
        this.propietario = propietario;
        this.estado = estado;
    }

    
    
    
}