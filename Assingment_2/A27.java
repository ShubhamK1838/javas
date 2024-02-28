package Assingment_2;

import java.sql.*; 

public class A27 {
    
    public static void main(String ar[])
    throws Exception 
    {
        Connection con=AConnection.getConnection("javadb"); 

        Statement smt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        ResultSet data=smt.executeQuery("SELECT * FROM STUDENT ");
        
        // here we  are  displaying first 3 records 
        for(int i=1; i<3; i++ )
        {
            data.absolute(i); 
            for(int j=1; j<=3; j++)
            {
                System.out.print("\t"+ data.getString(j)); 
            } 
            System.out.println(); 
        }

        con.close(); 
        
    }
}
