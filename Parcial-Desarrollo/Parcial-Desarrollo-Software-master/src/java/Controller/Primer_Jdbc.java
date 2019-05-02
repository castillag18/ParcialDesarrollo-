/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Demo;
import Controller.Demolmpl;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Orlando Castilla
 */
public class Primer_Jdbc {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Demo demo=new Demo();
       demo.setLastName("Jorge");
       demo.setLastName("Casta");
       demo.setEmail("Casta@gmail.com");
       demo.setLenguaje("Python");
       demo.setHobbie("Leer");
       //System.out.println("pasaste por aqui");
       
       
    }
    
}
