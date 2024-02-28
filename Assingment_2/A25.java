package Assingment_2;
/*
 * 5) Write a JDBC program that will call stored procedure.
 */

 import java.sql.*; 


public class A25 {
    
    public static void main(String ar[])
    throws Exception
    {


        Connection con=AConnection.getConnection("javadb"); 

        CallableStatement call=con.prepareCall("{getStudentName(?)}") ; 


        call.registerOutParameter(1,Types.VARCHAR );

        call.setInt(1, 101); 
        
        System.out.println("The Name Of Student : "+call.getString(1)); 

        


        return ; 
    }
    
}
 