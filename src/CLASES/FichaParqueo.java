package CLASES;


import java.util.*;

/**
 * 
 */
public class FichaParqueo {

    public Date FechaInicio;
    public Date FechaFin;
    public Double ValorPagar;
    public Cliente cliente;
    
    public FichaParqueo() {
    }

    public FichaParqueo(Date FechaInicio, Date FechaFin, Double ValorPagar, Cliente cliente) {
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.ValorPagar = ValorPagar;
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public Double getValorPagar() {
        return ValorPagar;
    }

    public void setValorPagar(Double ValorPagar) {
        this.ValorPagar = ValorPagar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "FichaParqueo{" + "FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", ValorPagar=" + ValorPagar + ", cliente=" + cliente + '}';
    }
    
    

}