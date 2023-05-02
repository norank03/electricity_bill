package new_customer;


import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class oldinsert extends connect {
    static Statement ss;
    static String query;
    oldinsert()
            {
            }
    
    oldinsert(int  monthlyreading,int paybill,String complain){
    try
{
    
    
Connection con =connect();
    ss=con.createStatement();
    query="insert into oldcu  values('"+monthlyreading+"','"+paybill+"','"+complain+"')";
    ss.execute(query);
    System.out.println("done");
    
    }
    catch(SQLException ee )
            {
               System.out.println(ee.getMessage()+88888);
               
              
            }

    } 
    
    
    
  
}
