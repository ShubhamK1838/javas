package Assingment_2;

// 4) Write a JDBC program which demonstrates the use of Callable
// Statement

/*
 * 
 * pricedure :
 *  create procedure registerStudent(in id int , in name  varchar(20), in greade varchar(2))
 *  begin 
 *      insert into student values(id ,name , greade); 
 *      end
 *      /
 */

import java.sql.*;

public class A24 {

    public static void main(String ar[])
            throws Exception {

        Connection con = AConnection.getConnection("javadb");

        CallableStatement call = con.prepareCall("{call registerStudent(?,?,?)}");

        call.setInt(1, 10);
        call.setString(2, "Rajesh");
        call.setString(3, "b");

        call.execute();

        con.close();

        

        return;
    }
}
