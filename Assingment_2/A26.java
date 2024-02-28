package Assingment_2;

// 6) Write a JDBC program that will call stored function

/*
DELIMITER //

CREATE FUNCTION addStudent(
    student_id INT,
    student_name VARCHAR(255),
    student_grade VARCHAR(10)
) RETURNS INT
BEGIN
    INSERT INTO student(id, name, grade)
    VALUES (student_id, student_name, student_grade);
    
    RETURN NULL;
END //

DELIMITER ;

 */

import java.sql.*; 


public class A26 {

    public static void mian(String ar[])
   throws Exception 
    {

        Connection con=AConnection.getConnection("javadb"); 



    }
}
