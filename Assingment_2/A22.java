// ) Write a JDBC program which demonstrates the use of Prepared
// Statementss

package Assingment_2;

import java.sql.*; 


public class A22 {

    public static void main(String ar[])
     throws Exception 
     {
        Connection con=AConnection.getConnection("javadb"); 

        PreparedStatement st=con.prepareStatement("insert into numbers values(?,?)");


        st.setInt(1,7); 
        st.setString(2,"Seven");

        int rows=st.executeUpdate();

        System.out.println(rows+" Affected"); 

        con.close(); 


    }
    
}
