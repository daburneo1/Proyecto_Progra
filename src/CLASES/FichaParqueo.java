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
    
    

}