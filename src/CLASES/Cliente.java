package CLASES;


import java.util.*;

/**
 * 
 */
public class Cliente extends Persona {

    
    public String Correo; 
    //public FichaParqueo FichaParqueo;
    public Vehiculo Vehiculo;
    public String Celular;

     
    public Cliente() {
    }

    public Cliente(String Nombre, String Apellido, String Celular, String CI, String User, String Pass, Vehiculo Vehiculo, String Correo) {
        super(Nombre, Apellido, CI, User, Pass);
        this.Celular = Celular;
        this.Correo = Correo;
        this.Vehiculo = Vehiculo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setVehiculo(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getCorreo() {
        return Correo;
    }

    public Vehiculo getVehiculo() {
        return Vehiculo;
    }

    public String getCelular() {
        return Celular;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCI() {
        return CI;
    }

    public String getUser() {
        return User;
    }

    public String getPass() {
        return Pass;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre= " + Nombre + " Apellido= " + Apellido + " Cedula= " + CI + " Celular= " + Celular + " Correo=" + Correo + ",  Vehiculo=" + Vehiculo +  '}';
    }

    

    

    
    
   
    
    
    
    
    
       

}