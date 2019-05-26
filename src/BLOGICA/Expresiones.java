/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author David
 */
public class Expresiones {
    public boolean mailValido(String email){
        Pattern pat = Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$");
        Matcher mat = pat.matcher(email);
        
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean NumerosCedula (String celular){
        Pattern pat = Pattern.compile("[0-9]{10}");
        Matcher mat = pat.matcher(celular);
        
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean NumeroCasa (String celular){
        Pattern pat = Pattern.compile("[0-9][-]{6}");
        Matcher mat = pat.matcher(celular);
        
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean NumeroCelular (String celular){
        Pattern pat = Pattern.compile("[0-9]{10}");
        Matcher mat = pat.matcher(celular);
        
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
}
