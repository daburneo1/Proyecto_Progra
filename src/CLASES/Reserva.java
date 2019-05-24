package CLASES;


import java.util.*;

/**
 * 
 */
public class Reserva {

    public Integer IdReserva;
    public Date HoraInicio;
    public Date HoraFin;
    public String Estado;
    public Cliente cliente;
    
    public Reserva() {
    }

    public Reserva(Integer IdReserva, Date HoraInicio, Date HoraFin, String Estado, Cliente cliente) {
        this.IdReserva = IdReserva;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.Estado = Estado;
        this.cliente = cliente;
    }

    

}