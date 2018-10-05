/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunoces
 */
public class TestaData {
    
    
    public static void main(String[] args){
    Date data = new Date();
    System.out.println("data = " + data);
    
        SimpleDateFormat frm = new SimpleDateFormat("dd/MM/yyyy");
        
        String str = frm.format(data);
        
        System.out.println("Data convertida = " + str);
    
        
         str = "15/06/1998";
         
         
        try {
            data = frm.parse(str);
        } catch (ParseException ex) {
            Logger.getLogger(TestaData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         System.out.println("Data nova em POSIX = " + data);
    
    }
    
    
}
