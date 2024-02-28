package Assingment_2;

import java.sql.Connection ;  
import java.sql.DriverManager; 



public class AConnection {

    static  Connection con; 

    
    public static Connection getConnection(String db) throws Exception 
    {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
        

        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"root", "jadoo"); 
        
        return con; 
    }
    
}
