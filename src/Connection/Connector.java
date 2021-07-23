
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connector {
     public Connection con;
    public void createConnection()
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid_help_desk", "root","abid1294");
        System.out.println("Done");
        } 
        catch(ClassNotFoundException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,  null, ex);
        } 
        catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,  null, ex);
        }
    }
    
}
