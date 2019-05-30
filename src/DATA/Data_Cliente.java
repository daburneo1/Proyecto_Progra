/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import CLASES.Cliente;
import CLASES.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author David
 */
public class Data_Cliente {
    
    public static ArrayList<Cliente> ImportarClientes(){   
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        File f = new File("Archivos/clientes.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                    //Cliente objTmpCli = new Cliente(st.nextToken(),st.nextToken(),st.nextToken());
                   // ArrayClientes.add(objTmpCli);
                }
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes;
    } 
    
    public static Usuario ImportarUsuarios(String User, String Pass){   
        Usuario user = new Usuario(null, null, null);
        File f = new File("credenciales.csv");    

        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                System.out.println("credenciales");
                while (st.hasMoreTokens()){
                    Usuario user1 = new Usuario(st.nextToken(), st.nextToken(), st.nextToken());
                    String linea = String.valueOf(user);
                    if(linea.contains(User) && linea.contains(Pass)){ 
                        user = user1;
                        System.out.println("adasdasd");
                        System.out.println(user.toString());
                    }
                    System.out.println(user1.toString());
                }
               
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return user;
    }
}
