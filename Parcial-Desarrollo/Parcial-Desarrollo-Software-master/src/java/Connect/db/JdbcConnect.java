/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Orlando Castilla
 */
public class JdbcConnect {
    
    private final static String USER="root";
    private final static String PASSWORD="estudiante";
    private final static String URL="jdbc:mysql://localhost:3306/Parcial";
    private final static String DRIVER="com.mysql.jdbc.Driver";
  
  
  public static Connection connect() throws ClassNotFoundException, SQLException{
      Class.forName(DRIVER);
      return DriverManager.getConnection(URL, USER, PASSWORD);
  }
    
}
