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

    public int getIdPropietario() {
        return IdPropietario;
    }

    public void setIdPropietario(int IdPropietario) {
        this.IdPropietario = IdPropietario;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    @Override
    public String toString() {
        return "Propietario{" + "IdPropietario=" + IdPropietario + ", parqueadero=" + parqueadero + '}';
    }

    

}