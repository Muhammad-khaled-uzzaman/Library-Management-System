
package project;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionProvider {
    /*
    public static Connection getCon(){
      
        try{
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306//library management system","root","");
              return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
*/
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "library management system";
    private static Integer portnumber  = 3306;
    private static String password = "";
    
    public static Connection getCon(){
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
}
