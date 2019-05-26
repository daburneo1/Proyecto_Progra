package CLASES;


import java.util.*;

/**
 * 
 */
public class Vehiculo {

    public String Placa;
    public String Tipo;
    public String Cedula;
    
    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Tipo, String Cedula) {
        this.Placa = Placa;
        this.Tipo = Tipo;
        this.Cedula = Cedula;
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

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCedula() {
        return Cedula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Placa=" + Placa + ", Tipo=" + Tipo + ", Cedula=" + Cedula + '}';
    }

    
    
    
    
}