package CLASES;


import java.util.*;

/**
 * 
 */
public class Persona {

    public String Nombre;
    public String Apellido;
    public String CI;
    public String User;
    public String Pass;
    
    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String CI, String User, String Pass) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CI = CI;
        this.User = User;
        this.Pass = Pass;
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
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", CI=" + CI + ", User=" + User + ", Pass=" + Pass + '}';
    }

    
    
    

}