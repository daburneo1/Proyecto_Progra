package CLASES;


import java.util.*;

/**
 * 
 */
public class Vehiculo {

    public String Placa;
    public String Tipo;
    public Cliente cliente;
    
    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Tipo, Cliente cliente) {
        this.Placa = Placa;
        this.Tipo = Tipo;
        this.cliente = cliente;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Placa=" + Placa + ", Tipo=" + Tipo + ", cliente=" + cliente + '}';
    }
    
    
    
}