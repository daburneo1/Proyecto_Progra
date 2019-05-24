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

    public Integer getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(Integer IdReserva) {
        this.IdReserva = IdReserva;
    }

    public Date getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Date HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public Date getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(Date HoraFin) {
        this.HoraFin = HoraFin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "IdReserva=" + IdReserva + ", HoraInicio=" + HoraInicio + ", HoraFin=" + HoraFin + ", Estado=" + Estado + ", cliente=" + cliente + '}';
    }

    

}