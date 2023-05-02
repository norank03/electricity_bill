package new_customer;
/**
 *
 * @author dell
 */
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;




public class connect {
    
    Statement s;
    protected String user="root";
protected String password="";
protected String url="jdbc:mysql://localhost:3306/java1?zeroDateTimeBehavior=CONVERT_TO_NULL";


public Connection connect() throws SQLException
{
   
Connection r=DriverManager.getConnection (url, user, password);
        return r;
}



    
    
}
