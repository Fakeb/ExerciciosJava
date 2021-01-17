package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {
    
    private Connection c;

    public Conector() {}
   
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://" + DBConfig.getAddress() + ":" + DBConfig.getPort() + "/" + 
                    DBConfig.getDatabase() + "?useTimeZone=true&serverTimezone=UTC&user=" + DBConfig.getUser() + 
                    "&password=" + DBConfig.getPass());
            System.out.println("Conectado!");
        } catch (Exception e) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public boolean desconectar(){
        try {
            c.close();
            return true;
        } catch(SQLException e)
        {
            return false;
        }
    }
    
    public Connection getConnection(){
        return c;
    }
    
}
