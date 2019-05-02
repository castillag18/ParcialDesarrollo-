/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Demo;
import Connect.db.JdbcConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author Orlando Castilla
 */
public class Demolmpl {
    
     public static void save(Demo demo) throws ClassNotFoundException, SQLException{
        Connection connect = JdbcConnect.connect();
        PreparedStatement pst = connect.prepareStatement("Insert into "
                + "demo values(?,?,?,?)");
        pst.setString(3, demo.getLastName());
        pst.executeUpdate();
     
    }
     
}
