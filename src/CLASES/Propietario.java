package CLASES;


import java.util.*;

/**
 * 
 */
public class Propietario extends Persona {
    
    
    public Propietario() {
    }

    public Propietario(String Nombre, String Apellido, String CI, String User, String Pass) {
        super(Nombre, Apellido, CI, User, Pass);
        
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
        return "Propietario{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cedula=" + CI + ", User=" + User + ", Password" + Pass + '}';
    }

    

}