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
    
    
    
}