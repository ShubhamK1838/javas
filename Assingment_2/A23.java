// 3)Write a JDBC program which demonstrates the use of Prepared
// Statement to enter 10 records in student table.

/*
 * 
 * database/javadb :
 *  table/student : 
 *      create table student (id int , name varchar(20), grade varchar(2)); 
 */

package Assingment_2;

import java.sql.*;

public class A23 {

    public static void main(String ar[]) throws Exception {

        Connection con = AConnection.getConnection("javadb");

        PreparedStatement prst = con.prepareStatement("insert into student values(? , ? , ? ) ");

        java.util.Scanner scan = new java.util.Scanner(System.in);

        int counter = 0;
        int rows = 0;

        while (counter < 2) {

            prst.setInt(1, scan.nextInt());
            prst.setString(2, scan.next());
            prst.setString(3, scan.next());

            counter++;
            rows += prst.executeUpdate();

        }
        System.out.println(rows + " rows Are affected");

    }
}
