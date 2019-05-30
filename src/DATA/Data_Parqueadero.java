/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import BLOGICA.ManCliente;
import BLOGICA.ManParqueadero;
import BLOGICA.ManPropietario;
import CLASES.Cliente;
import CLASES.Parqueadero;
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
public class Data_Parqueadero {

    public static ArrayList<Parqueadero> ImportarParqueaderos(ArrayList<Parqueadero> ArrayParqueaderos, String Sector) {
        File f = new File("parqueaderos.csv"); 
        
        ManPropietario ObjManPro = new ManPropietario();
        Data_Propietarios ObjDatPro = new Data_Propietarios();
        ArrayList<Propietario> ArrayPropietario = new ArrayList<Propietario>();
        String aNombre;
        String aCallePrincipal;
        String aCalleSecundaria;
        String aSector;
        int aPlazasDisponibles;
        double aTarifa;
        String aPropietario;
        String aEstado;

        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            
            ArrayPropietario = ObjDatPro.ImportarPropietarios();
            entrada = new Scanner(f);
            
            while (entrada.hasNext()) { 
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                    aNombre = st.nextToken();
                    aCallePrincipal = st.nextToken();
                    aCalleSecundaria = st.nextToken();
                    aSector = st.nextToken();
                    aPlazasDisponibles = Integer.parseInt(st.nextToken());
                    aTarifa = Double.parseDouble(st.nextToken());
                    aEstado = st.nextToken();
                    Parqueadero ObjTmpPar = new Parqueadero(aNombre, aCallePrincipal, aCalleSecundaria, aSector, aPlazasDisponibles, aTarifa, ObjManPro.BuscarPropietario(ArrayPropietario,aNombre),aEstado);
                    String linea = String.valueOf(ObjTmpPar);
                    if(linea.contains(Sector)){
                        ArrayParqueaderos.add(ObjTmpPar);
                    }
                }
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayParqueaderos;
    }    
}
    

