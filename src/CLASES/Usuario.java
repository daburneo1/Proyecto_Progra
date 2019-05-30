/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author David
 */
public class Usuario {
    public String Cedula;
    public String User;
    public String Pass;

    public Usuario(String Cedula, String User, String Pass) {
        this.Cedula = Cedula;
        this.User = User;
        this.Pass = Pass;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getUser() {
        return User;
    }

    public String getPass() {
        return Pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Cedula=" + Cedula + ", User=" + User + ", Pass=" + Pass + '}';
    }
    
    
}
