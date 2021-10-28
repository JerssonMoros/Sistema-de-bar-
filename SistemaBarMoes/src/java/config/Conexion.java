package config;

/**
 *
 * @author Fabian Dario Florez Raigoso
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection con;
    String url = "jdbc:mysql://localhost:3306/sistemabar_moes";
    String user = "root";
    String pass = "";
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url,user,pass);
        } catch(Exception e){
            System.out.println("Exception "+ e.getMessage());
        }
        return con;
    }
}
