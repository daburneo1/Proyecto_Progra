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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCallePrincipal() {
        return CallePrincipal;
    }

    public void setCallePrincipal(String CallePrincipal) {
        this.CallePrincipal = CallePrincipal;
    }

    public String getCalleSecundaria() {
        return CalleSecundaria;
    }

    public void setCalleSecundaria(String CalleSecundaria) {
        this.CalleSecundaria = CalleSecundaria;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    public Integer getPlazasDisponibles() {
        return PlazasDisponibles;
    }

    public void setPlazasDisponibles(Integer PlazasDisponibles) {
        this.PlazasDisponibles = PlazasDisponibles;
    }

    public Double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(Double Tarifa) {
        this.Tarifa = Tarifa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public EstadoParqueadero getEstado() {
        return estado;
    }

    public void setEstado(EstadoParqueadero estado) {
        this.estado = estado;
    }

    public ArrayList<PlazaParqueo> getPlazaParqueo() {
        return plazaParqueo;
    }

    public void setPlazaParqueo(ArrayList<PlazaParqueo> plazaParqueo) {
        this.plazaParqueo = plazaParqueo;
    }

    @Override
    public String toString() {
        return "Parqueadero{" + "Nombre=" + Nombre + ", CallePrincipal=" + CallePrincipal + ", CalleSecundaria=" + CalleSecundaria + ", Sector=" + Sector + ", PlazasDisponibles=" + PlazasDisponibles + ", Tarifa=" + Tarifa + ", propietario=" + propietario + ", estado=" + estado + '}';
    }

    
    
    
}