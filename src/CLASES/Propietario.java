package CLASES;


import java.util.*;

/**
 * 
 */
public class Propietario extends Persona {
    
    public int IdPropietario;
    public Parqueadero parqueadero;
    
    public Propietario() {
    }

    public Propietario(int IdPropietario, Parqueadero parqueadero, String Nombre, String Apellido, String CI, String User, String Pass) {
        super(Nombre, Apellido, CI, User, Pass);
        this.IdPropietario = IdPropietario;
        this.parqueadero = parqueadero;
    }

    

}