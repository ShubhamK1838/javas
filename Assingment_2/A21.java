
package Assingment_2;

import java.sql.ResultSet;

import java.sql.Connection;

public class A21 {

    public static void main(String ar[]) {
        try {

            Connection con = AConnection.getConnection("javadb");

            ResultSet data;
            String query = "select * from numbers";

            data = (con.createStatement()).executeQuery(query);

            while (data.next()) {
                for (int i = 1; i <= 2; i++) {
                    System.out.print(data.getString(i) + "\t");
                }
                System.out.println();
            }

            con.close();

        } catch (Exception error) {
            System.out.println(error);
        }

    }

}