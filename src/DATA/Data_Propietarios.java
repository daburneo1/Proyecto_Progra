/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import CLASES.Cliente;
import CLASES.Propietario;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author David
 */
public class Data_Propietarios {
    
    public static ArrayList<Propietario> ImportarPropietarios(){   
        ArrayList<Propietario> ArrayPropietario = new ArrayList<Propietario>();
        File f = new File("propietarios.csv");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                   Propietario objTmpPro = new Propietario(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken());
                   ArrayPropietario.add(objTmpPro);
                }
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayPropietario;
    }
}
