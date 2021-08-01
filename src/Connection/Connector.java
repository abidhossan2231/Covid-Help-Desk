
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
        con = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6428124","sql6428124","VCn1UKEt3V");
        //Connection con=DriverManager.getConnection("jdbc:mysql://mysql-41754-0.cloudclusters.net:15462/covid_help_desk","admin","8SAVe8XE");
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
