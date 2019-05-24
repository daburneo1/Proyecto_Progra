package CLASES;


import java.util.*;

/**
 * 
 */
public class Cliente extends Persona {

    public Integer IdCliente;
    public String Correo;
    public ArrayList<Reserva> reserva = new ArrayList<Reserva>(); 
    public FichaParqueo FichaParqueo;
    public Set<Vehiculo> Vehiculo;

     
    public Cliente() {
    }

    public Cliente(Integer IdCliente, String Correo, FichaParqueo FichaParqueo, Set<Vehiculo> Vehiculo, String Nombre, String Apellido, String CI, String User, String Pass) {
        super(Nombre, Apellido, CI, User, Pass);
        this.IdCliente = IdCliente;
        this.Correo = Correo;
        this.FichaParqueo = FichaParqueo;
        this.Vehiculo = Vehiculo;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }

    public FichaParqueo getFichaParqueo() {
        return FichaParqueo;
    }

    public void setFichaParqueo(FichaParqueo FichaParqueo) {
        this.FichaParqueo = FichaParqueo;
    }

    public Set<Vehiculo> getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(Set<Vehiculo> Vehiculo) {
        this.Vehiculo = Vehiculo;
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
        return "Cliente{" + "IdCliente=" + IdCliente + ", Correo=" + Correo + ", reserva=" + reserva + ", FichaParqueo=" + FichaParqueo + ", Vehiculo=" + Vehiculo + '}';
    }
    
    
    
    
    
       

}